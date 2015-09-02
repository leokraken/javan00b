var user = 'guest';
var password = 'guest;'
var client = Stomp.client("ws://localhost:61614/stomp");
var destination = '/topic/broadcast';
 
function onconnect() {
	client.subscribe(destination, function(message) { });
}
 
function onerror() {}

function sendMessage(){
	var mensaje = $('#box').val();
    if (mensaje) {
        client.send(destination, {foo: 1}, mensaje);
        $('#box').val("");
    }	
}

client.connect(user, password, onconnect, onerror);


//Extra
function enter(){
	if(window.event.keyCode == 13){
        sendMessage();
    }
}



function enter (event) {
    if (event.which == 13 || event.keyCode == 13) {
        //code to execute here
    	sendMessage();
        return false;
    }
    return true;
};

