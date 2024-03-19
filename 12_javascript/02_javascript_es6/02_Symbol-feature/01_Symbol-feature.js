/* Symbol-feature(심볼 특징)) */
let student = {
    name: '홍길동'
};

let id = Symbol('id');  // "id" 심볼 생성
student[id] = 1;

console.log(student);

/* 객체가 가진 프로퍼티 확인 */
console.log(Object.keys(student));
console.log(Object.getOwnPropertyNames(student));

for(let key in student) {
    console.log(key);
}