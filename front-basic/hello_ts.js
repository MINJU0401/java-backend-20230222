console.log('Hello Typescript!');
//# 변수 //
// let number: number;
// number = 10;
// number = 'string';
var string = 'string';
string = 10;
//# 함수 //
var funtion = function (args) {
    return 'string';
};
//# 객체 //
//* 1. class를 이용 //
var Object1 = /** @class */ (function () {
    function Object1(prop1, prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
    ;
    return Object1;
}());
;
var object1 = { prop1: 'prop1', prop2: 2 };
var object2 = { prop1: 'prop1', prop2: 2 };
var object3 = null; /* 원래라면 null은 넣을 수 없음. null값을 받을 수 있게 지정 */
var object4 = { prop1: 'prop1', prop2: 2, prop3: 'prop3', prop4: 1 };
//* 4. enum(열거형) //
var Fruits;
(function (Fruits) {
    Fruits["APPLE"] = "\uC0AC\uACFC";
    Fruits["BANANA"] = "\uBC14\uB098\uB098";
    Fruits["MELON"] = "\uBA5C\uB860";
})(Fruits || (Fruits = {}));
var fruit = Fruits.APPLE;
console.log(fruit);
