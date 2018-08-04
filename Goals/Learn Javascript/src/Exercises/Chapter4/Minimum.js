

function Min(...args) {
    let min = args[0];
    for (let i = 0; i < args.length; i++) {
        if ( min > args[i]) min = args[i];
    }
    return min;
}


console.log( Min(50,3,50,1,3,5,0) );