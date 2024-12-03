let headd = document.querySelector('#headd');
// #headd라는 아이디를 let이라는 함수로 불러옴

headd.style.color = 'red';
// 이와같이 자바언어와 비슷하게 설정함

alert("테스트123");
// 알림 창을 만듦 (확인)

let reply = confirm("testtext의 내용입니다.");
// 알림 창인데, (확인, 취소)
// 참고로 let이 들어간 것들은 바로 실행이 됨.

let name = prompt("이름을 입력하세요", "아무개");
var name = prompt("이름을 입력하세요");
// let으로 적힌 것은 기본값을 지정(아무개)
// var로 적힌 것은 기본값을 지정하지 않음

document.write();
// wirte안에 있는 문자를 출력해줌. 다른 변수와 함께 사용 가능
document.write("<b></big>" + name + "</big></b>님, 환영합니다.");
// 이와같이 사용 가능

console.log();
// write와 같이 안에 문자를 개발자 콘솔에 출력해줌

let now = new Date();
let display = now.toLocaleTimeString();
document.write(display);
// new Date();를 통해 현재 시간을 가져옴
// now.toLocaleTimeString();으로 변수 가져옴

\\   \'   \"   \b   \n   \t '
// 문자열 특수기호

document.write(`현재시간은 ${display} 입니다.`);
// `를 사용해서 문자열 리터럴 어쩌구 할 수 있음 ${변수} 작성

=== / !==
// 특이하게 생긴 이것들은 연산과 타입연산을 동시에 수행한다.
// 예를 들어서 3 === '3'은 정수 3과 문자열 '3'을 계산한 식으로
// 값은 3으로 같지만, typeof가 다르기 때문에 false를 반환한다.


const test = function () {
    let contentDiv = document.querySelector(".content");
    contentDiv.textContent = "텍스트 변경";
}

document.addEventListener("DOMContentLoaded", function () {
    let testStart = document.querySelector(".testStart");
    testStart.addEventListener("click", test);
})
// test 함수를 불러오는 함수
// testStart class를 클릭했을 때, 함수를 불러옴

let nums = [1, 2, 3];
let chars = ['a', 'b', 'c', 'd']
let numchar = nums.concat(chars);
let charnum = chars.concat(nums);
// 배열 추가

let element = document.getElementById("container"); //id불러오기
let element = document.querySelector(".container"); //class불러오기
element.style.gridTemplateColumns = `repeat(${colNum}, 1fr)`; //스타일추가
let newDiv = document.createElement("div"); //div생성
newDiv.classList.add("smallbox2"); //생성한 div 클래스리스트에 해당 클래스 추가
element.appendChild(newDiv); //element의 자식으로 새로운 div(newdiv)를 추가

let rang = nums.push(4, 5); // 배열의 맨 뒤에 추가
let rang2 = chars.unshift('x'); //배열의 맨 앞에 추가
//배열을 추가함 추가한 배열은 각각 nums와 chars에 새로운 배열로 저장됨
//rang 과 rang2는 배열의 길이를 표현함

let rang = nums.pop(); // 배열의 맨 뒤에 제거
let rang2 = chars.shift(); //배열의 맨 앞에 제거

let rang = nums.splice(2); //배열의 (0시작) 2번째부터 끝까지 삭제
let rang2 = nums.splice(1, 1); //배열의 1번째부터 1번째까지 삭제
let rang3 = nums.splice(1, 0, "three"); //배열의 1번째부터 0개 삭제하고 해당 자리에three 추가

let rang = nums.slice(2); //2부터 끝까지 자른다. 이 때, 잘라진 내용물이 새로운 배열로 추가된다.
let rang2 = nums.slice(2, 4); // 2~4 배열을 잘라낸다. (slice는 기존 배열에 영향을 주지 않는다.)
//기존 배열의 내용을 꺼내서 새로운 배열을 만드는데 사용된다. 