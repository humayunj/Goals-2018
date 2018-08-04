




function range(start,end,step = 1) {
    let r = [start];
    let n = start;
    let i = 1;
    while ( n != end ) {
        n += step;
        r[i++] = n;
    }
    return r;
}


function sum(val) {
    
    let s = 0;
    for (let i = 0; i < val.length; i++) {
        s += val[i];
    }
    return s;
}
console.log(sum(range(1,10,1)));
console.log((range(5,2,-1)));