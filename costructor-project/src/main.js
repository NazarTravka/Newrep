import Vue from 'vue'
import Vuex from 'vuex'
import $ from 'jquery'
import images from './components/images.vue'
import frames from './components/frames.vue'
import details from './components/ditails.vue'
import fingerprints from './components/fingerprints.vue'
import store from './AppStore.js'

new Vue({
	el:'.container_12',
	components:{
		images:images,
		frames:frames,
		ditails:details,
		fingerprints:fingerprints
	},
    store:store,
	data:{
		currentStep:'images',

		fieldsStatus:[
		{
        input:'',
        status:false
        },
        {
        input:'',
        status:false
        },
        {
        input:'',
         status:false
         }
		    ]   
	},
computed:{
	pickedPic:function(){
		return this.$store.getters.getPickedPic
	},
    picIsPicked:function(){
	return this.$store.getters.getPicIsPicked
  },
    picImgName:function(){
	return this.$store.getters.getPicImgName
  },

  pickedFrame:function(){
		return this.$store.getters.getPickedFrame
	},
    frameIsPicked:function(){
	return this.$store.getters.getFrameIsPicked
  },
    frameImgName:function(){
	return this.$store.getters.getFrameImgName
  },

    picTitle:function(){
		return this.$store.getters.getPicTitle
	},
    picSignature:function(){
	return this.$store.getters.getPicSignature
  },
    picDate:function(){
	return this.$store.getters.getPicDate
  },
    picFont:function(){
	return this.$store.getters.getPicFont
  },
  pickedFingerprints:function(){
	return this.$store.getters.getPickedFingerprints
  },
   total__amount:function(){
	return this.$store.getters.getTotal__amount
  }
}
,
	methods: {
		nextBtn: function () {

			const  nextBtn=document.querySelector('.cb-next');
			const  steps= document.querySelectorAll('.cb-step')


			switch (this.currentStep) {
            case 'images':
            if(this.picIsPicked && this.pickedPic!==''){
            this.currentStep='frames';
             nextBtn.style.opacity ='0.7';
            }
            else alert("Select one picture");
             break;

            case 'frames':
            if(this.frameIsPicked && this.pickedFrame!==''){
             this.currentStep='ditails';
              
          }
          else alert("Select one frame");
              break;
            case 'ditails':
            this.fieldsStatus[0].input=this.picTitle;
            this.fieldsStatus[1].input=this.picSignature;
            this.fieldsStatus[2].input=this.picDate;
            if(this.validateForm()){
             this.currentStep='fingerprints';
             nextBtn.style.opacity ='0.7';
         }
         else 
         	this.$store.dispatch('setFieldsStatus',this.fieldsStatus)
              break;



              case 'fingerprints':
              if(this.pickedFingerprints.length>0){
                 
               this.sendResults()
              }
              	
              else
                console.log("Select at least one fingerprint")

              break;


           }
          },
            validateForm: function() {
            let isValid = true;
            this.fieldsStatus.forEach(field => {
               if (field.input == '') {
                field.status = true
                isValid = false
               }
            })
            return isValid;
            },

            sendResults:function() {

           document.getElementById('pickedPic').innerHTML=this.pickedPic
           document.getElementById('pickedFrame').innerHTML=this.pickedFrame
           document.getElementById('picSignature').innerHTML=this.picSignature
           document.getElementById('picTitle').innerHTML=this.picTitle
           document.getElementById('picDate').innerHTML=this.picDate
           document.getElementById('picFont').innerHTML=this.picFont
           document.getElementById('pickedFingerprints').innerHTML=this.pickedFingerprints

             $.ajax({
              url: 'https://jsonplaceholder.typicode.com/posts', 
              type:     "POST", 
              dataType: "html", 
               data: $("#results_form").serialize(),  
                success: function(response) { 
        	           alert("Order has been sent to Cart")
        	           },
    	        error: function(response) {
                      alert('Error has ocurred');
    	      }
      	});
     }

   }	
})


