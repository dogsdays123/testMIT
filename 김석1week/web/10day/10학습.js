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
