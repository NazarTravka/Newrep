import $ from 'jquery';
$(function () {
	var touch=$('#nav-toggle');
	var menu=$('nav');
	$(touch).on('click',function (e) {
		e.preventDefault();
		menu.slideToggle();
   $("section").toggleClass("adaptive");
	});

});

import './css/style.less';
import './css/adaptive.less';