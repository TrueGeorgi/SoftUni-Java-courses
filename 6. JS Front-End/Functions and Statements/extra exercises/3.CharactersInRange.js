function asciiCharactersBetween (char1, char2) {
let char1num = char1.charCodeAt(0);
let char2num = char2.charCodeAt(0);
let output = [];

    function getMiddleChars (num1, num2) {
        for(let i = num1 + 1; i < num2; i++) {
            output.push(String.fromCharCode(i));
        }

        console.log(output.join(" "));
    }

    if(char1num < char2num) {
        getMiddleChars(char1num, char2num);
    } else {
        getMiddleChars(char2num, char1num);
    }
}

asciiCharactersBetween('C', '#');