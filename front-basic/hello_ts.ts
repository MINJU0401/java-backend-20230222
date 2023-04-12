console.log('Hello Typescript!');

//# 변수 //
let number: number;
number = 10;
// number = 'string';
let string = 'string';
string = 10;

//# 함수 //
const funtion = (args: number): string => {
    return 'string';
}

//# 객체 //
//* 1. class를 이용 //
class Object1 {
    prop1: string;
    prop2: number;

    constructor(prop1: string, prop2: number) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    };
};

const object1: Object1 = { prop1: 'prop1', prop2: 2 };

//* 2. type 키워드 사용 (typescript에서만 사용)
type Object2 = {
    prop1: string,
    prop2: number
}
const object2: Object2 = { prop1: 'prop1', prop2: 2 };

//* 3. interface 활용 (JavaScript에서는 못씀) 
interface Object3 {
    prop1: string;
    prop2: number;
    func1?: (arg1: number) => string;           /* ? : 필수요소에서 해제시킴 */
}
const object3 : Object3 | null = null;     /* 원래라면 null은 넣을 수 없음. null값을 받을 수 있게 지정 */

interface Object4 {
    prop3: string;
    prop4: number;
}                                           /* typescript에서는 타입을 서로 합칠 수 있음 */
const object4: Object3 & Object4 = { prop1: 'prop1', prop2: 2, prop3: 'prop3', prop4: 1 }