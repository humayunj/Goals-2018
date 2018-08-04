



function deepEqual(a,b) {
	if ( typeof a != 'object' || typeof b != 'object' ) return  false;
	if ( Object.keys(a).length != Object.keys(b).length ){  console.log("Test: Length Mismatch"); return false; }
	for (let i = 0;i < Object.keys(a).length; i++)
	{
		if (Object.keys(a)[i] != Object.keys(b)[i]) {
			console.log("Property of a '"+Object.keys(a)[i]+" mismatch for b"+Object.keys(b)[i]);
			return false;
		}
	}

	return true;
}


let a =  {
	name : "Hate"
}

let b = {
	name : "Everywhere",
}

let c = {
	name : "Everywhere",
	reason: "none"
}

console.log("Test Result a equals b = " + deepEqual(a,b));
console.log("Test Result a equals c = " + deepEqual(a,c));
