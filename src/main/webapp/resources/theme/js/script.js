$(document).ready(function () {
	langButtonListen();
});

function langButtonListen() {
	 $('input[type="radio"][name="english-french"]').click(function () {
	        if ($("#en").is(':checked')) {
	        	$(this).addClass('on').load('http://localhost:8081/CollegeGradingSystem/login?en');
	     } else {
	    	 $(this).addClass('on').load('http://localhost:8081/CollegeGradingSystem/login?fr_FR');
	     }
	   });
   
    
   

}

	/*$('input[type="radio"][name="english-french"]').click(function () {
	    if ($("#en").is(':checked')) {
	    	$('[lang="en"]').toggle();
	 } else {
		 $('[lang="fr_FR"]').toggle();
	 }
	})
	$(this).addClass('on').load('http://localhost:8081/CollegeGradingSystem/login?en');
window.location = '/home/';
	*
	*/