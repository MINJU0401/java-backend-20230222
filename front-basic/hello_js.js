console.log('Hello Javascript!');

// 한줄 주석
/* 부분 주석 */

//# 변수 선언 방법 //
//* 1. 변수의 타입이 존재하지 않음
var variable_name;
var variable_name = '변수 값';   /* 세미콜론이 없어도 되지만 작성하자 */
console.log(variable_name.trim());
variable_name = 10;
// console.log(variable_name.trim());  /* 타입이 존재하지 않기 때문에 실수할 가능성도 높음.  */ 

//* 2. 변수 선언 키워드
//*    var, let, const
var variable_name;               /* 동일한 변수명으로 선언하여도 선언이 됨 */
if (10 == 10) {
    var variable_name2 = '변수';
}
console.log(variable_name2);

let let_variable_1;
// let let_variable_1;
if (10 == 10) {
    let let_variable_2 = '블럭 변수';
}
// console.log(let_variable_2);

const const_variable_1 = '상수';
// const_variable_1 = '변경 상수';

//* 3. 데이터의 타입 
//*    문자열 string : '', ""
let stringVariable1 = '문자열';
let stringVariable2 = "문자열";
console.log(typeof(stringVariable1, stringVariable2));  /* 변수의 타입을 확인할 때 사용하는 typeof */
//* 숫자 number : 정수, 실수
let numberVariable1 = 10;
let numberVariable2 = 1.5;
console.log(typeof(numberVariable1, numberVariable2));  /* 정수 실수 관계없이 타입은 number */
//* 논리 boolean : true, false
let booleanVariable = true;
console.log(typeof(booleanVariable));
//* null
let nullVariable = null;
console.log(typeof(nullVariable));                      /* 타입이 object로 출력되지만 null 임 */
//* 배열 : [] 대괄호로 표현
let arrayVariable = [1, 'A', false];                    /* Javascript에서는 다른 타입의 데이터들로도 배열을 생성할 수 있다 */
arrayVariable[0];
//* 객체 : {} 중괄호로 표현                              
let objectVariable = {                                  /* 이 구조(중괄호, key, value가 있는 형태)를 JSON 이라고 함 */
    "key": "value",                                     /* Javascript의 장점. (Java에 비해) 객체를 다루기 매우 편리함 */
    "name": "John",
    "age": 20,
    "object" : {
        "key1" : 1
    }
};

//# 연산자 
//* 1. 나눗셈 연산자 //
let number1 = 10 / 3;
console.log(number1);
//* 2. 제곱 연산자 (**) //
let number2 = 10 ** 3;
console.log(number2);
//* 3. 비교연산 ==, ===
let numberValue10 = 10;
let stringValue10 = '10';
console.log(numberValue10 == stringValue10);            /* true 가 출력됨. 타입과 관계없이 연산 */
console.log(numberValue10 === stringValue10);           /* false 가 출력됨. 타입까지 비교하여 연산 */

//# if 조건
let tmpValue = null;
if (tmpValue) console.log('true');
else console.log('false');
//* Java에서 참조변수의 값이 없는 것은 null 로 표현. Javascript 도 마찬가지. 

//# class(제어자는 존재하지 않음) //
class Human {                       /* Javascript에서 생성자(constructor)는 중요하지 않음. 객체를 class없이 만들 수 있기 때문 */
    name;
    age;
    address;
    constructor(name) {
        this.name = name;
    }
}

let humanObject = new Human('John', 30, '부산');
console.log(humanObject.name);

//# 비구조화 할당 //
// const { name, age, address } = humanObject;
let { name, ...others } = humanObject;
console.log(name);
console.log(others);

name = 'Michael';
humanObject = { ...humanObject, name };
//  { name, age, address, name }
console.log(humanObject);

const tmpArray = [1, 'A', true];
const [number, ...otherArray] = tmpArray;
console.log(number);
console.log(otherArray);

//# 함수 //
function function1(arg1, arg2) {

}

function1(1, 2);

const function2 = (arg1, arg2) => {

}
function2(1, 2);
