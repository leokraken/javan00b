
var user = 'guest';
var password = 'guest;'
var client = Stomp.client("ws://localhost:61614/stomp");
var destination = '/topic/broadcast';
 
function onconnect() {
	client.subscribe(destination, function(message) {
	var box = '<div class="well well-sm">'+message.body+'</div>';
			//$('#chat').append(box);
			humane.log(message.body);
      });
}
 
function onerror() {
}

function sendMessage(){
	var mensaje = $('#textbox').val();
    if (text) {
        client.send(destination, {foo: 1}, mensaje);
        $('#textbox').val("");
    }
	
}

client.connect(user, password, onconnect, onerror);
