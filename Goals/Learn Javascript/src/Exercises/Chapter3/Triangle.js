
let str = "";
for ( let i = 1; i <= 7; i++) {
    str = "";
    for (let n = 1; n <= i; n++) {
        str += "#";
    }
    console.log(str);
    str = "";
}