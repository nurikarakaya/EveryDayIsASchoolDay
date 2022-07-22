// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

function reverse0(str) {
    let reversed = ""
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i]

    }
    return reversed
}

function reverse(str) {
    let reversed = ""
    for (let character of str) {
        reversed = character + reversed
    }
    return reversed

}

function reverse1(str) {
    let arr1 = str.split("");
    arr1.reverse();
    let str_reversed = arr1.join("");
    return str_reversed
}


function reverse2(str) {
    return str.split("").reverse().join("")

}

module.exports = reverse;
