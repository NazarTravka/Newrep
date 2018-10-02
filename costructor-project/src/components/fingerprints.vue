<template>
    <div class="cb-item">
                            <p class="cb-item__title">
                                Цвет отпечатков
                            </p>
                            <p class="cb-item__text">
                                наконец, подберите самые подходящие цвета красок, с помощью которых вы и оставите на
                                картине свой след на память!<br>
                                <strong>Обратите внимание: более 2-х цветов увеличат стоимость</strong>
                            </p>

                            <div class="cb-item-marks" @click="onFigerprintsClick()">
                                <div class="cb-item-mark">
                                    <input id="mark0" type="checkbox">
                                    <label for="mark0" title="BahamaBlue"></label>
                                    <img src="./img/marks/BahamaBlue.jpg" alt="BahamaBlue" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark1" type="checkbox">
                                    <label for="mark1" title="BambooLeaves"></label>
                                    <img src="./img/marks/BambooLeaves.jpg" alt="BambooLeaves" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark2" type="checkbox">
                                    <label for="mark2" title="LilacPosies"></label>
                                    <img src="./img/marks/LilacPosies.jpg" alt="LilacPosies" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark3" type="checkbox">
                                    <label for="mark3" title="PearTart"></label>
                                    <img src="./img/marks/PearTart.jpg" alt="PearTart" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark4" type="checkbox">
                                    <label for="mark4" title="RhubarbStalk"></label>
                                    <img src="./img/marks/RhubarbStalk.jpg" alt="RhubarbStalk" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark5" type="checkbox">
                                    <label for="mark5" title="Tangelo"></label>
                                    <img src="./img/marks/Tangelo.jpg" alt="Tangelo" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark6" type="checkbox">
                                    <label for="mark6" title="CottageIvy"></label>
                                    <img src="./img/marks/CottageIvy.jpg" alt="CottageIvy" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark7" type="checkbox">
                                    <label for="mark7" title="PearTart"></label>
                                    <img src="./img/marks/PearTart.jpg" alt="PearTart" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark8" type="checkbox">
                                    <label for="mark8" title="BahamaBlue"></label>
                                    <img src="./img/marks/BahamaBlue.jpg" alt="BahamaBlue" width="136" height="136">
                                </div>
                                <div class="cb-item-mark">
                                    <input id="mark9" type="checkbox">
                                    <label for="mark9" title="PottersClay"></label>
                                    <img src="./img/marks/PottersClay.jpg" alt="PottersClay" width="136" height="136">
                                </div>
                            </div>
                        </div>
</template>


<script>
export default {
name:'images',
    data: function () {
                return{
                   pickedFingerprints:[],
                   picIsPicked:false,
                   picImgName:''
                   
                }
              },
              methods:{
                onFigerprintsClick:function () {
             
             const inputs= document.querySelectorAll('.cb-item-mark input');
             const labels= document.querySelectorAll('.cb-item-mark label');
            // const imgs= document.querySelectorAll('.cb-item-mark img');
             const  nextBtn=document.querySelector('.cb-next');
                   
                            this.pickedFingerprints=[];
                            inputs.forEach(input=>{
                            if(input.checked){
                             labels.forEach(label=>{
                             if(input.id==label.getAttribute('for'))
                             this.pickedFingerprints.push(label.getAttribute('title'));
                             
                             })
                           }
                        })
                           
                            this.$store.dispatch('setPickedFingerprints',this.pickedFingerprints)
                            if(this.pickedFingerprints.length>0)
                             nextBtn.style.opacity ='1'
                             else
                             nextBtn.style.opacity ='0.7'

                             if(this.pickedFingerprints.length>2){
                             this.$store.dispatch('setTotal__amount',760)
                             }
                             else
                             this.$store.dispatch('setTotal__amount',750)
                           }    
                        


                            }
              
}
</script>
