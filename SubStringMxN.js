// "Hello", "ll" -> 2
// "hello", "ello" -> 1
// "hello", "xyz" -> -1

const indexOf = (str, subStr) => {
    let temp = -1;
    for (let index = 0; index < str.length; index++) {
        temp = index;
        let j = 0;
        for (j = 0; j < subStr.length; j++) {
            if (str[index + j] != subStr[j]) {
                break;
            }
        }
        if (j == subStr.length)
            return temp;

    };
    return -1;
};

console.log(indexOf("hello", 'lo'));
console.log(indexOf("hello", 'ello'));
console.log(indexOf("hello", 'xyzsss'));