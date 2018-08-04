

function print(size) {
    let str = " ";
    let ch = "#";
    for (let i = 0; i < size; i++) {
        for (let n = 0; n < size; n++) {
            if ( ch == " ") ch = "#";
            else ch = " ";
            str += ch;
        }
        str += "\n";
        if ( ch == " ") ch = "#"; else ch = " ";
    }
    console.log(str);
}


print(12);