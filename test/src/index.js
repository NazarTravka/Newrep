import $ from 'jquery';
$(function() {

    var touch = $('#nav-toggle');
    var menu = $('nav');


    $(touch).on('click', function(e) {
        e.preventDefault();
        menu.slideToggle();
        $("section").toggleClass("adaptive");
        if($("section").hasClass("adaptive"))
        	$("#nav-toggle").css({"margin-top": "0px"});
        else 
        	$("#nav-toggle").css({"margin-top": "30px"});

    });


    $(window).resize(function() {
        if (window.matchMedia('(min-width: 700px)').matches) 
            menu.attr("style", "display:block");
         else {
        	    if(!$("section").hasClass("adaptive"))
            menu.attr("style", "display:none");
        }
    });


});

import './css/style.less';
import './css/adaptive.less';