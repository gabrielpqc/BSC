var canvas;
var c;
var imgDir = 'teste.jpg';

function main(){
	canvas = document.getElementById("mainCanvas");
	c = canvas.getContext('2d');

	// Mouse click event
	canvas.addEventListener('mousedown', function(evt){
	var mousePos = getMousePos(canvas, evt);
	console.log('x:' + mousePos.x, ' y:' + mousePos.y);
	},false);

	var img = new Image();
	img.src = imgDir;
	c.drawImage(img, 0, 0);

}

// Detect Mouse positions
function  getMousePos(canvas, evt){
	var rect = canvas.getBoundingClientRect();
	return { 
		x: evt.clientX - rect.left,
		y: evt.clientY - rect.top
	};
}

