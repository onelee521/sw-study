/* 01. object-distructuring-assingnment-basic-syntax(객체 구조분해 할당 기본 문법) */

let pants = {
    productName: '배기팬츠',
    color: '검정색',
    price: 30000,

    getInfo() {
        console.log(this.productName, '굿');
    }
}

// let productName = pants.productName;
// let color = pants.color;
// let price = pants.price;

// let {productName, color, price} = pants;
let {color, productName, price, getInfo} = pants;  // Vue에서 필요한 객체를 하나씩 담음

console.log(productName, color, price);

console.log(getInfo);
pants.getInfo();

/* 객체 구조부해 할당으로 꺼낸 변수 대신 다른 걸 쓰고 싶다면.. */
let {color: co, price: pr, productName: pn} = pants;
console.log(co, pr, pn);