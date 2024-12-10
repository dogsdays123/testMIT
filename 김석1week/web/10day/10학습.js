let test = document.querySelector(".test1");
test.onclick = function(){
    let newWin = window.open("../9day/9.html", "test", "width=500, height=400");
    if(newWin == null){
        alert("팝업이 차단되어 있습니다. 차단을 해제해 주세요.")
    }
}
//window.open()을 통해 새로운 팝업을 연다.

let test2 = document.querySelector(".test2");
test2.onclick = function(){
    location.replace("https://www.google.com");
}
//location 함수를 사용한다. 페이지의 콘솔에 location을 치면 여러가지 기능들이 보인다.
//그 중 하나로 replace를 사용해서 해당 페이지에 접근한다. 이 때, 뒤로가기는 불가하다.

let test3 = document.querySelector(".test3");
test3.onclick = function(){
    test3.textContent = `${screen.availWidth}, ${screen.availHeight}, ${screen.width}, ${screen.height}`;
}
//화면의 너비를 알 수 있다. (screen.변수) 를 설정하면 된다.

let box = document.querySelector(".box");
box.addEventListener("click", change);
box.textContent = "체인지";
box.style.backgroundColor = "green";
//원하는 클래스 혹은 아이디에 스타일 적용
//addEventListener을 통해 반복이벤트 가능

let newItem = document.createElement("li");
//원하는 요소를 만들어 냄 (위치는 나중에 지정해줘야 함)

let subject = document.querySelector("#subject");
let newText = document.createTextNode(subject.value);

burgerCard[i].childNodes[0].textContent.trim()
//버거카드의 첫번째 자식의 텍스트 가져오기
burgerCard[i].querySelector(".eachPrice").textContent
//버거카드의 .eachPrice 클래스가 가지고있는 텍스트 가져오기

eval(`${str}Full[${j}] = menuFull[${i}];`);
//eval을 사용하면 그 자체로 문자형 게산식으로 바꿔줌