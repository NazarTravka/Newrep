<template>
     <div class="cb-item">
                            <p class="cb-item__title">
                                Заголовок
                            </p>
                            <p class="cb-item__text">
                                персонализируйте ваше "Дерево пожеланий"; вверху и внизу картины есть специальные поля,
                                которые можно заполнить по вашему усмотрению: вписать имена виновников торжества, или
                                особые пожелания, добавить дату, или логотип компании, если речь идет о корпоративном
                                подарке.
                            </p>
                            <div class="cb-item__line">
                                <input id="pic-title" v-model="picTitle" @keyup="onTitleChange()" :class="{'not-valid':fieldsStatus[0].status}" placeholder="Наша Свадьба" maxlength="22" type="text">
                                <span>Заголовок картины</span>

                            </div>
                            <div class="cb-item__line">
                                <input id="pic-name"  v-model="picSignature" @keyup="onSignatureChange()" :class="{'not-valid':fieldsStatus[1].status}" placeholder="Анастасия и Константин" maxlength="36" type="text">
                                <span>Подпись</span>
                            </div>
                            <div class="cb-item__line">
                                <input id="pic-date"  v-model="picDate" @keyup="onDateChange()" :class="{'not-valid':fieldsStatus[2].status}" placeholder="29 июля 2015" maxlength="26" type="text">
                                <span>Дата события</span>
                            </div>
                            <div class="cb-item__line--btns">
                                    <span id="ariston" class="btn-font btn-font--active" @click="onFontClick('ariston')" >
                                        Ariston
                                    </span>
                                <span id="davinci" class="btn-font" @click="onFontClick('davinci')">
                                        DaVinci
                                    </span>
                                <span id="brody" class="btn-font" @click="onFontClick('brody')">
                                        Brody
                                    </span>
                            </div>
                        </div>
</template>


<script>
export default {
name:'details',
    data: function () {
                return{
                  
                 picTitle:'',
                 picSignature:'',
                 picDate:'',
                 picFont:'' 
                }

              },

            computed:{
            fieldsStatus:function(){
        return this.$store.getters.getFieldsStatus
         }
            }
              ,
              methods:{
                 onTitleChange:  function(){
                 this.fieldsStatus[0].status=false;
                  this.$store.dispatch('setPicTitle',this.picTitle)
                 },
                 onSignatureChange:  function(){
                 this.fieldsStatus[1].status=false;
                  this.$store.dispatch('setPicSignature',this.picSignature)
                 },
                 onDateChange:  function(){
                 this.fieldsStatus[2].status=false;
                 this.$store.dispatch('setPicDate',this.picDate)
                 },

                  onFontClick:  function(font){
                const fontBtns=document.querySelectorAll('.btn-font');
                      fontBtns.forEach(fontBtn=>{
                             if(fontBtn.id==font){
                             fontBtn.classList.add("btn-font--active");
                             this.picFont=font;
                             this.$store.dispatch('setPicFont',this.picFont)
                             }
                             else
                             fontBtn.classList.remove("btn-font--active");
                             
                      })

                 }
              }
}
</script>