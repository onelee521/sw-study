/* 01. array-distruncturing-assignment-basic-syntax() */

let nameArr = ["Gildong", "hong"];
// let firstName = nameArr[0];
// let lastName = nameArr[1];

let [firstName, lastName] = nameArr;

console.log(firstName, lastName);

// let [firstName2, lastName2] = 'Saimdang Shin'.split(' ');
let [firstName2, lastName2] = 'Saimdang Shin'.match(/[a-z]+/gi);

console.log(firstName2, lastName2);

let [firstName3, , lastName3] = ['firstName', 'middleName', 'lastName']