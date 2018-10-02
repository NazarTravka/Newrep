<template >
                            <div class="cb-item">
                            <p class="cb-item__title">
                                Выберите изображение
                            </p>
                            <p class="cb-item__text">
                                для начала выберите основу, саму картину, на которую вы и гости вашего праздника будете
                                наносить отпечатки пальцев с пожеланиями
                            </p>
                            <div class="cb-item-pics">

                                <div class="cb-item-pic" @click="onPicClick()">
                                     <input id="pic1"  type="checkbox">
                                    <label for="pic1" title="Картинка №1"></label>
                                    <img src="./img/pics/01.jpg" alt="Картинка №1" title="Картинка №1" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic2"  type="checkbox">
                                    <label for="pic2" title="Картинка №2"></label>
                                    <img src="./img/pics/02.jpg" alt="Картинка №2" title="Картинка №2" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic3"  type="checkbox">
                                    <label for="pic3" title="Картинка №3"></label>
                                    <img src="./img/pics/03.jpg" alt="Картинка №3" title="Картинка №3" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic4"  type="checkbox">
                                    <label for="pic4" title="Картинка №4"></label>
                                    <img src="./img/pics/04.jpg" alt="Картинка №4" title="Картинка №4" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic5"  type="checkbox">
                                    <label for="pic5" title="Картинка №5"></label>
                                    <img src="./img/pics/05.jpg" alt="Картинка №5" title="Картинка №5" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic6"  type="checkbox">
                                    <label for="pic6" title="Картинка №6"></label>
                                    <img src="./img/pics/06.jpg" alt="Картинка №6" title="Картинка №6" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic7"  type="checkbox">
                                    <label for="pic7" title="Картинка №7"></label>
                                    <img src="./img/pics/07.jpg" alt="Картинка №7" title="Картинка №7" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic" @click="onPicClick()">
                                    <input id="pic8"  type="checkbox">
                                    <label for="pic8" title="Картинка №8"></label>
                                    <img src="./img/pics/08.jpg" alt="Картинка №8" title="Картинка №8" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic9"  type="checkbox">
                                    <label for="pic9" title="Картинка №9"></label>
                                    <img src="./img/pics/09.jpg" alt="Картинка №9" title="Картинка №9" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic" @click="onPicClick()">
                                    <input id="pic10"  type="checkbox">
                                    <label for="pic10" title="Картинка №10"></label>
                                    <img src="./img/pics/10.jpg" alt="Картинка №10" title="Картинка №10" width="176"
                                         height="215">
                                </div>
                                <div class="cb-item-pic"  @click="onPicClick()">
                                    <input id="pic11"  type="checkbox">
                                    <label for="pic11" title="Картинка №11"></label>
                                    <img src="./img/pics/11.jpg" alt="Картинка №11" title="Картинка №11" width="176"
                                         height="215">
                                </div>
                            </div>

                        
                      
</template>


<script>
export default {
name:'images',
    data: function () {
                return{
                   pickedPic:'',
                   picIsPicked:false,
                   imgPicName:''
                   
                }
              },
              methods:{
                onPicClick:function () {
             
             const inputpics= document.querySelectorAll('.cb-item-pic input');
             const labels= document.querySelectorAll('.cb-item-pic label');
             const imgs= document.querySelectorAll('.cb-item-pic img');
             const  nextBtn=document.querySelector('.cb-next');
                    inputpics.forEach(pic=>{
                            if(pic.checked){
                            labels.forEach(label=>{
                                if(pic.id==label.getAttribute('for')){ 
                                 imgs.forEach(img=>{
                                   if(label.getAttribute('title')==img.getAttribute('title'))
                                      this.imgPicName= img.getAttribute('src');
                                   

                                 })
                                  label.classList.add("active-pic");
                                  pic.checked=false;
                                 this.pickedPic=label.getAttribute('title')
                                 this.picIsPicked=true;
                                 this.$store.dispatch('setPickedPic',this.pickedPic)
                                 this.$store.dispatch('setpicIsPicked',this.picIsPicked)
                                 this.$store.dispatch('setpicImgName',this.imgPicName)
                                 nextBtn.style.opacity ='1'
                                }
                            
                            else{
                                
                                label.classList.remove("active-pic");
                            }
                            })
                           
                           }    
                        })


                            }
              }
}
</script>
