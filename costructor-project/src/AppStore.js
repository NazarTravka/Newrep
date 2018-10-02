import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)

const store= new Vuex.Store({
	state:{
		pickedPic:'',
		picIsPicked:false,
		picImgName:'',

		pickedFrame:'',
		frameIsPicked:false,
		frameImgName:'',

		picTitle:'',
        picSignature:'',
        picDate:'',
        picFont:'ariston',
        
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
        ],
        pickedFingerprints:[],
        total__amount:0
	},

  getters:{
  	getPickedPic(state){
  		return state.pickedPic
  	},
  	getPicIsPicked(state){
  		return state.picIsPicked
  	},
  	getPicImgName(state){
  		return state.picImgName
  	},


  	getPickedFrame(state){
  		return state.pickedFrame
  	},
  	getFrameIsPicked(state){
  		return state.frameIsPicked
  	},
  	getFrameImgName(state){
  		return state.frameImgName
  	},


    getPicTitle(state){
  		return state.picTitle
  	},
  	getPicSignature(state){
  		return state.picSignature
  	},
  	getPicDate(state){
  		return state.picDate
  	},
  	getPicFont(state){
  		return state.picFont
  	},


  	getFieldsStatus(state){
  		return state.fieldsStatus
  	},

  	 getPickedFingerprints(state){
  		return state.pickedFingerprints
  	
    },
    getTotal__amount(state){
  		return state.total__amount
  	
    }
 },
	mutations:{
      set(state,{type,item}){
      	if(type=='pickedPic')
      	state[type]=item

        if(type=='picIsPicked')
      	state[type]=item

        if(type=='picImgName')
      	state[type]=item


      if(type=='pickedFrame')
      	state[type]=item

      if(type=='frameIsPicked')
      	state[type]=item

      if(type=='frameImgName')
      	state[type]=item


      if(type=='picTitle')
      	state[type]=item

      if(type=='picSignature')
      	state[type]=item

      if(type=='picDate')
      	state[type]=item

      if(type=='picFont')
      	state[type]=item


      if(type=='fieldsStatus')
      	state[type]=item

       if(type=='pickedFingerprints')
      	state[type]=item
      
      if(type=='total__amount')
      	state[type]=item
      }
	},
	actions:{
		setPickedPic({commit},pic){
			commit('set', {type: 'pickedPic', item:pic})  
		},
		setpicIsPicked({commit},isPic){
			commit('set', {type: 'picIsPicked', item:isPic})  
		},
		setpicImgName({commit},pic_img){
			commit('set', {type: 'picImgName', item:pic_img})  
		},


		setPickedFrame({commit},frame){
			commit('set', {type: 'pickedFrame', item:frame})
		},
        setFrameIsPicked({commit},isframe){
			commit('set', {type: 'frameIsPicked', item:isframe})
		},
		 setFrameImgName({commit},frame_img){
			commit('set', {type: 'frameImgName', item:frame_img})
		},


       setPicTitle({commit},title){
			commit('set', {type: 'picTitle', item:title})
		},
		 setPicSignature({commit},signature){
			commit('set', {type: 'picSignature', item:signature})
		},
        setPicDate({commit},date){
			commit('set', {type: 'picDate', item:date})
		},
        setPicFont({commit},font){
			commit('set', {type: 'picFont', item:font})
		},


        setFieldsStatus({commit},fields){
			commit('set', {type: 'fieldsStatus', item:fields})
		},

        setPickedFingerprints({commit},fingerprints){
			commit('set', {type: 'pickedFingerprints', item:fingerprints})
		},
        setTotal__amount({commit},amount){
			commit('set', {type: 'total__amount', item:amount})
		}


		
       
       
                          
	}
})

export default store;
