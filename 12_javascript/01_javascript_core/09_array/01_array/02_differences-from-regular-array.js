/* 02. differences-from-regular-array(일반적인 배열과의 차이점) */

const arr = [
    '홍길동',
    20,
    true,
    null,
    undefined,
    NaN,
    Infinity,
    [],
    {},
    function() {}
];

console.log(arr);

console.log(Object.getOwnPropertyDescriptors([1, 2, 3]));