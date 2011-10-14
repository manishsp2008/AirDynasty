$(document).ready(function() {
	$('#example').dataTable( {
		"bJQueryUI": true,
		"sPaginationType": "full_numbers",
                "bAutoWidth" : true,
                "bLengthChange" : true,
                "bPaginate" : true,
                "bStateSave" : true,
                "sScrollX": "100%",
		"bScrollCollapse": true

	} );
        
        $('#fancyClock').tzineClock();
        
        $("#viewEIR").onclick(function(){
            
          window.location = "http://www.google.co.in"  
            
            
        });
            
            
            
            
        
} );

