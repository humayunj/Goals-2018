function countBs(str) {
    let n = 0;
    for (let i = 0; i < str.length;i++) {
        if ( str[i] == "B" ) n++;
    }
    return n;
}


function countChar(str,char) {
    let n = 0;
    for (let i = 0; i < str.length;i++) {
        if ( str[i] == char ) n++;
    }
    return n;
}


console.log(countBs("BeanCounting"));
console.log(countChar("BeanCounting","i"));
