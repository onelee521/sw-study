/* 01. spread-syntax(스프레드 문법, 전개 문법) */

let arr = [10, 30, 20];
console.log(...arr);

console.log(`가장 큰 값: ${Math.max(10, 30, 20)}`);
console.log(`가장 큰 값: ${Math.max(...arr)}`);

let arr1 = [10, 30, 20];
let arr2 = [100, 300, 200];

// 배열을 결합(concat)해서 하나의 배열로 만듦
console.log([...arr1, ...arr2]);
console.log([10, ...arr, -1, ...arr2, 2]);

console.log(...arr1, ...arr2);
console.log(`두 배열 중에 가장 큰 값: ${Math.max(...arr1, ...arr2)}`);

/* 문자열일 때 */
let str = "JavaScript";
console.log(...str);
console.log([...str]);
console.log(Array.from(str));