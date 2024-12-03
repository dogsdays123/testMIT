let headd = document.querySelector('#headd');
headd.onclick = function () {
    if (headd.style.color == "red") {
        headd.style.color = "black";
    }
    else { headd.style.color = "red"; alert("테스트123"); }
}

let testtext = document.querySelector('.testtext');
testtext.onclick = function () {
    // let reply = confirm("testtext의 내용입니다.");
    // var name = prompt("이름입력");
    // document.write("<b></big>" + name + "</big></b>님, 환영합니다.");
    let now = new Date();
    let display = now.toLocaleTimeString();
    document.write(`현재시간은 ${display} 입니다.`);
}

let testtext2 = document.querySelector(".testtext2");
testtext2.onclick = function () {
    let numberOne = parseInt(prompt("50 미만의 숫자를 입력하세요."));
    let numberTwo = parseInt(prompt("50 미만의 숫자를 입력하세요."));
    if (numberOne < 10 || numberTwo < 10) {
        alert("둘 중 하나는 10 미만")
    }
    else { alert("둘 다 10 이상") }
}

let testtext3 = document.querySelector(".testtext3");
testtext3.onclick = function () {
    let session = prompt("관심 세션을 선택. 1-마케팅, 2-개발, 3-디자인");

    switch (session) {
        case "1": document.write("<p>마케팅 세션은 <strong>201호</strong>에서 진행됩니다.")
            break;
        case "2": document.write("<p>개발 세션은 <strong>202호</strong>에서 진행됩니다.")
            break;
        case "3": document.write("<p>디자인 세션은 <strong>203호</strong>에서 진행됩니다.")
            break;
        default: alert("잘못 입력했습니다.");
    }
}

// let testtext4 = document.querySelector(".testtext4");
// testtext4.onclick = function () {
//     let memNum = parseInt(prompt("입장객의 숫자를 적어주세요."));
//     let colNum = parseInt(prompt("한 줄에 몇명씩 앉을지 적어주세요."));
//     if (memNum <= colNum) {
//         rowNum = 1;
//     }
//     else {
//         rowNum = parseInt(memNum / colNum) + 1;
//     }
//     document.write(`줄은 총 ${rowNum}줄 입니다.`);
// }

// let doub = document.querySelector(".doub");
// function boxTrain() {
//     document.write("<div class=\"container\">");
//     for (let i = 2; i <= 9; i++) {
//         document.write(`<div class=\"boxes\">`);
//         document.write(`<h3>${i}단</h3>`);
//         for (let j = 1; j <= 9; j++) {
//             document.write(`${i} * ${j} = ${i * j} <br>`);
//         }
//         document.write("</div>");
//     }
//     document.write("</div>");
// }

const testStar = function () {
    let size = 20;
    let num = 1;
    document.write("<div class=\"container\">");
    document.write(`<div class=\"boxes\">`);

    for (let i = 0; i < (size / 2) + 1; i++) {
        let str2 = "";
        for (let j = 0; j < num; j++) {
            str2 += "*";
        }
        document.writeln(str2 + `<br>`);
        num += 2;
    }
    for (let k = 0; k < parseInt(size / 8) + 1; k++) {
        let str3 = "";
        for (let j = 0; j < (size / 4) + 1; j++) {
            str3 += "*";
        }
        document.writeln(str3 + `<br>`);
    }
    document.write("</div>");
    document.write("</div>");
}

const seatTest = function () {
    let memNum = parseInt(prompt("전체 사람 수"));
    let colNum = parseInt(prompt("한 줄에 몇명씩?"));
    let rowNum = 0;
    let element = document.querySelector(".container");
    if (memNum === colNum) { rowNum = 1; }
    else {
        if ((memNum % colNum) == 0) { rowNum = parseInt(memNum / colNum); }
        else { rowNum = parseInt(memNum / colNum) + 1; }
    }
    element.style.gridTemplateColumns = `repeat(${colNum}, 1fr)`;

    for (let i = 0; i < rowNum; i++) {
        if (i == rowNum - 1) {
            for (let j = 0; j < memNum - parseInt(colNum * (rowNum - 1)); j++) {
                let newDiv = document.createElement("div");
                newDiv.classList.add("smallbox2");
                element.appendChild(newDiv);
                newDiv.textContent = "좌석z ";
            }
        }
        else {
            for (let j = 0; j < colNum; j++) {
                let newDiv = document.createElement("div");
                newDiv.classList.add("smallbox");
                element.appendChild(newDiv);
                newDiv.textContent = "좌석 ";
            }
        }
    }
}

const arrayTest = function () {
    let nums = [1, 2, 3];
    let chars = ['a', 'b', 'c', 'd']
    let numchar = nums.concat(chars);
    let charnum = chars.concat(nums);
    console.log(numchar + "/" + charnum);

    let rang = nums.push(4, 5);
    let rang2 = chars.unshift('x');
    console.log(`length: ${rang} / ${nums}`);
}

const timeTest = function (hole) {
    let now = new Date();
    let birthday = [(hole.substring(0, 4)), (hole.substring(4, 6)), (hole.substring(6, 8))];
    let firstDay = new Date(`${birthday[0]}-${birthday[1]}-${birthday[2]}`);
    let times = [1000, 60, 60, 24, 365];
    let diffTime = Math.trunc(now.getTime() - firstDay.getTime());
    let old = diffTime;
    for (let i = 0; i < times.length; i++) {
        old = old / times[i];  // 매번 변환된 값을 result에 저장
    }
    console.log(Math.floor(old));
}

timeTest(prompt("생년월일 8자리를 적어주세요.(-, 공백 없이)"));