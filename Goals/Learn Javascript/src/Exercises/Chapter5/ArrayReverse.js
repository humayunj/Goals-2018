function reverseArray(array) {
    let arr = [];//Object.create(array);
    for (let i = 0; i < array.length;i++) {
        arr[ (array.length - 1) -  i ] = array[i];
    }
    return arr;
}
function reverseArrayInPlace(array,places) {
    let a = reverseArray(array);
    for (let i = 0; i <a.length ;i++) {
        array[ i ] = a[i];
    }
}

let a = [10,20,30,40];
reverseArrayInPlace(a);
console.log(a);
console.log(reverseArray(a));