
function wsrest(){
	var username = $('.username').val();
	var password = $('.password').val();
    $.ajax({
        url: 'loginREST/loginREST/'+username+'/'+password,
        type: 'get',
        dataType: 'json',
        success: function (data) {
            $('#target').html(data);
            alert(JSON.stringify(data));
        },
        error: function () {
        	alert('error');
        }      
    });	
};

function wssoap(){
	var soapbody='<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ws="http://ws/"><soapenv:Header/><soapenv:Body><ws:login><arg0>?1</arg0><arg1>?2</arg1></ws:login></soapenv:Body></soapenv:Envelope>';
	var username = $('.username').val();
	var password = $('.password').val();
	var body=soapbody.replace('?1',username);
	body = body.replace('?2',password);
	
    $.ajax({
        url: 'http://localhost:8080/testWEB/loginWS',
        type: 'post',
        contentType: "text/xml; charset=\"utf-8\"",
        dataType: "xml",
        data: body,
        success: function (xmlResponse) {
            console.log(xmlResponse);
            console.log(xmlResponse.responseText); 
        },
        error: function () {
        	alert('error');
        }      
    });
	
};
