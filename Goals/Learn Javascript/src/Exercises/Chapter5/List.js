
function listCreate() {
	return { firstNode: undefined, size:0 };
}

function _createNode(val = undefined) {
	return { child: undefined, value: val };
}

function listPushback(list,val) {
	let f = list.firstNode;
	if ( f == undefined ) list.firstNode = _createNode(val);
	else {
		while (f.child != undefined) {
			f = f.child;
		}
		f.child = _createNode(val);
	}

	list.size++;
}


function listGetAt(list,ind) {
	
		let f = list.firstNode;
		for ( let i = 0; i < ind; i++) {
			f =	f.child;
		}
		return f.value;
		
}

let list = listCreate();





listPushback(list,"Hate");
listPushback(list,"Everywhere");


console.log(list.size);
console.log(listGetAt(list,0));
console.log(listGetAt(list,1));