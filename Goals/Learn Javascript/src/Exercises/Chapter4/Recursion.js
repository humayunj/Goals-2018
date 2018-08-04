

function IsEven(n) {
    if ( n == 0) return true;
    else if ( n == 1) return false;
    return IsEven(n - 2);
}

console.log(IsEven(50));
console.log(IsEven(75));
console.log(IsEven(-1));