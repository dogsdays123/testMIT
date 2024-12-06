let test = document.querySelector(".test1");
test.onclick = function () {
    let newWin = window.open("../9day/9.html", "test", "width=500, height=400");
    if (newWin == null) {
        alert("팝업이 차단되어 있습니다. 차단을 해제해 주세요.")
    }
}

let test2 = document.querySelector(".test2");
test2.onclick = function () {
    location.replace("https://www.google.com");
}

let test3 = document.querySelector(".test3");
test3.onclick = function () {
    let size = [screen.availWidth, screen.availHeight, 400, 500];
    let left = (size[0] - size[2]) / 2;
    let top = (size[1] - size[3]) / 2;
    let opt = `left=${left}, top${top}, width=${size[2]}, height=${size[3]}`;
    console.log(size);
    window.open('../9day/9.html', "test", opt);
}