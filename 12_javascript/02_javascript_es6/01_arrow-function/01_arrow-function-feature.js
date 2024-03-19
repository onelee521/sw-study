/* 01. arrow-function-feature(화살표 함수 특징) */

/* 1. 화살표 함수는 자체적으로 this를 가지지 않는다.(화살표 함수를 호출한 객체의 의미가 아니다.) */
/* 객체의 메소드 안에서 동일한 객체의 프로퍼티를 대상으로 콜백 함수를 적용할 때 사용할 수 있다. */
let theater = {
    store: "강남점",
    titles: ["파묘", "Dune2", "웡카", "가여운 것들", "포켓몬스터"],

    showMovieList() {
        console.log(this.store);

        /* forEach: Array에서 제공하는 메소드로 배열의 요소별로 돌아가면 콜백 함수를 실행하는 함수 */
        this.titles.forEach(
            title => console.log(this.store + ": " + title)     // 반드시 화살표 함수를 사용해야하는 경우도 있다.
        );

        // this.titles.forEach(
        //     function (title) {
        //         console.log(this.store + ": " + title);
        //     }
        // );
    }
}

theater.showMovieList();

/* 2. 화살표 함수는 new와 함께 호출할 수 없다. */
/* 생성자 함수로 쓰지 않는 일반 함수는 화살표 함수로 만든다.(객체 생성 X) */
const arrayFunc = () => {};

const normalFunc = function () {

};

// new arrayFunc();        // 에러 발생
new normalFunc();

/* 3. 화살표 함수는 arguments를 지원하지 않는다. */
let test = function () {
    // console.log(arguments);
    const arrowFunc = () => console.log(arguments);
    arrowFunc(10, 20);
}

test(1, 2, 3, 4, 5);

const arrowFunc2 = () => console.log(arguments);
let test2 = function () {
    // console.log(arguments);

    arrowFunc(10, 20);
}

test(arrowFunc2);
