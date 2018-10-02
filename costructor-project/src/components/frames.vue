
<template>
     <div class="cb-item">
                            <p class="cb-item__title">
                                Рама
                            </p>
                            <p class="cb-item__text">
                                подберите раму, которая подойдет случаю и впишется в интерьер, ведь вы же не просто
                                оставляете "пальчики", а создаете предмет декора для дома и офиса:
                            </p>
                            <div class="cb-item-borders">

                                <div class="cb-item-border" @click="onFrameClick()">
                                <input id="frame1"  type="checkbox">
                                    <label for="frame1" title="Багетная №1"></label>
                                    <img src="./img/borders/rama-01.png" alt="Багетная №1" title="Багетная №1"
                                         width="120" height="150">

                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame2"  type="checkbox">
                                    <label for="frame2" title="Багетная №2"></label>
                                    <img src="./img/borders/rama-02.png" alt="Багетная №2" title="Багетная №2"
                                         width="120" height="150">

                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame3"  type="checkbox">
                                    <label for="frame3" title="Багетная №3"></label>
                                    <img src="./img/borders/rama-03.png" alt="Багетная №3" title="Багетная №3"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                           :href="require('./img/borders/prev.03.jpg')" title="Багетная №3"
                                                            rel="gal-2"></a><a
                                        class="cb-item-border__prev fancybox gallery" :href="require('./img/borders/prev.03.1.jpg')"
                                        title="Багетная №3" rel="gal-2"></a><a
                                        class="cb-item-border__prev fancybox gallery" :href="require('./img/borders/prev.03.2.jpg')"
                                        title="Багетная №3" rel="gal-2"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame4"  type="checkbox">
                                    <label for="frame4" title="Багетная №4"></label>
                                    <img src="./img/borders/rama-04.png" alt="Багетная №4" title="Багетная №4"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.04.jpg')" title="Багетная №4"
                                                            rel="gal-3"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame5"  type="checkbox">
                                    <label for="frame5" title="Багетная №5"></label>
                                    <img src="./img/borders/rama-05.png" alt="Багетная №5" title="Багетная №5"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.05.jpg')" title="Багетная №5"
                                                            rel="gal-4"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame6"  type="checkbox">
                                    <label for="frame6" title="Багетная №6"></label>
                                    <img src="./img/borders/rama-06.png" alt="Багетная №6" title="Багетная №6"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.06.jpg')" title="Багетная №6"
                                                            rel="gal-5"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame7"  type="checkbox">
                                    <label for="frame7" title="Багетная №7"></label>
                                    <img src="./img/borders/rama-07.png" alt="Багетная №7" title="Багетная №7"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.07.jpg')" title="Багетная №7"
                                                            rel="gal-6"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame8"  type="checkbox">
                                    <label for="frame8" title="Багетная №8"></label>
                                    <img src="./img/borders/rama-08.png" alt="Багетная №8" title="Багетная №8"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.08.jpg')" title="Багетная №8"
                                                            rel="gal-7"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame9"  type="checkbox">
                                    <label for="frame9" title="Багетная №9"></label>
                                    <img src="./img/borders/rama-09.png" alt="Багетная №9" title="Багетная №9"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.09.jpg')" title="Багетная №9"
                                                            rel="gal-8"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame10"  type="checkbox">
                                    <label for="frame10" title="Багетная №10"></label>
                                    <img src="./img/borders/rama-10.png" alt="Багетная №10" title="Багетная №10"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                           :href="require('./img/borders/prev.10.jpg')" title="Багетная №10"
                                                            rel="gal-9"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame11"  type="checkbox">
                                    <label for="frame11" title="Багетная №11"></label>
                                    <img src="./img/borders/rama-11.png" alt="Багетная №11" title="Багетная №11"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                           :href="require('./img/borders/prev.11.jpg')" title="Багетная №11"
                                                            rel="gal-10"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame12"  type="checkbox">
                                    <label for="frame12" title="Багетная №12"></label>
                                    <img src="./img/borders/rama-12.png" alt="Багетная №12" title="Багетная №12"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.12.jpg')" title="Багетная №12"
                                                            rel="gal-11"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame13"  type="checkbox">
                                    <label for="frame13" title="Багетная №13"></label>
                                    <img src="./img/borders/rama-13.png" alt="Багетная №13" title="Багетная №13"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.13.jpg')" title="Багетная №13"
                                                            rel="gal-12"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame14"  type="checkbox">
                                    <label for="frame14" title="Багетная №14"></label>
                                    <img src="./img/borders/rama-14.png" alt="Багетная №14" title="Багетная №14"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                            :href="require('./img/borders/prev.14.jpg')" title="Багетная №14"
                                                            rel="gal-13"></a>
                                </div>
                                <div class="cb-item-border" @click="onFrameClick()">
                                 <input id="frame15"  type="checkbox">
                                    <label for="frame15" title="Багетная №15"></label>
                                    <img src="./img/borders/rama-15.png" alt="Багетная №15" title="Багетная №15"
                                         width="120" height="150">
                                    <a class="cb-item-border__prev fancybox gallery"
                                                           :href="require('./img/borders/prev.15.jpg')" title="Багетная №15"
                                                            rel="gal-14"></a>
                                </div>
                            </div>
                        </div>
</template>

<script>


export default {
name:'frames',
data: function () {
                return{
                   pickedFrame:'',
                   frameIsPicked:false,
                   frameImgName:''
                }
              },
              methods:{
                onFrameClick:function () {
             
             const inputs= document.querySelectorAll('.cb-item-border input');
             const labels= document.querySelectorAll('.cb-item-border label');
             const imgs= document.querySelectorAll('.cb-item-border img');
             const  nextBtn=document.querySelector('.cb-next');
                    inputs.forEach(input=>{
                            if(input.checked){
                            labels.forEach(label=>{
                                if(input.id==label.getAttribute('for')){ 
                                 imgs.forEach(img=>{
                                   if(label.getAttribute('title')==img.getAttribute('title')){
                                      this.frameImgName= img.getAttribute('src');
                                     
                                   }

                                 })
                                  label.classList.add("active-pic");
                                  input.checked=false;
                                 this.pickedFrame=label.getAttribute('title')
                                 this.frameIsPicked=true;
                                 this.$store.dispatch('setPickedFrame',this.pickedFrame)
                                 this.$store.dispatch('setFrameIsPicked',this.frameIsPicked)
                                 this.$store.dispatch('setFrameImgName',this.frameImgName)
                                this.$store.dispatch('setTotal__amount',750)
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