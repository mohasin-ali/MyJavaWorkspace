<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   Hello Zoho world
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script> 
   <script type='text/javascript'>
   $(function(){
	  alert($('title').html());
   })
   function callServlet(){
   $.ajax({ 
	    url: "http://127.0.0.1:8082/testServlet",  
	    dataType: "json",
	    type: 'POST',
	    data: {jsondata : JSON.stringify(jsonObj)},

	     contentType: 'application/json',
	        mimeType: 'application/json',
	        success: function(data) { 

	            alert('success call');
	        },
	    error: function(jqXHR, textStatus, errorThrown) {
	        alert("error occurred");
	    } 
	});
   }
   </script>
</body>
</html>