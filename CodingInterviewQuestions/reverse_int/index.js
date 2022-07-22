// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9

function reverseInt1(n) {
    let str = n.toString()
    // convert integer into a string

    if (n >= 0) { // if it is a positive integer, reverse the string

        return parseInt(str.split("").reverse().join(""))
        //splitting into an array, then reverse the array, and the join it as a string

    } else { // if it is a negative number

        return parseInt("-" + str.split("").splice(1, str.length).reverse().join(""))
        // split string into an array, then to remove - sign by splicing it from index 1, then reverse, then join as a string,
        // lastly add - sign as a char, then parse into an integer

    }
}

function reverseInt(n) {
    return parseInt(n.split("").reverse().join("")) * Math.sign(n)
    // answer from the lecture
    // my code had code duplication but
    // this code prevents code duplication
 
}

console.log(reverseInt(10))
module.exports = reverseInt;
