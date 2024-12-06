let subMenu = document.querySelectorAll(".subMenu");
let menuContainers = document.querySelectorAll(".menuContainer");
let menuClose = document.querySelector(".menuClose");
let burger = document.querySelector(".burger");
let drink = document.querySelector(".drink");
let set = document.querySelector(".set");
let side = document.querySelector(".side");
let burgerCard = document.querySelectorAll(".burger .card");
let drinkCard = document.querySelectorAll(".drink .card");
let setCard = document.querySelectorAll(".set .card");
let sideCard = document.querySelectorAll(".side .card");
let price = document.querySelector(".price");
let choiseMenu = document.querySelector('choiseMenu');

for (let i = 0; i < subMenu.length; i++) {
    subMenu[i].onclick = function () {
        menuContainers[i].style.display = 'grid';
        menuClose.style.display = 'block';
        for (let j = 0; j < menuContainers.length; j++) {
            if (i !== j) { menuContainers[j].style.display = 'none'; }
        }
        menuClose.addEventListener('click', function () {
            console.log("닫기");
            for (let k = 0; k < menuContainers.length; k++) {
                menuContainers[k].style.display = 'none';
            }
            menuClose.style.display = 'none';
        })
    }
}

function count() {
    //나중에 엑셀같은 것과 연동해서 배열을 지정함
    let burgerCall = [];
    let drinkCall = [];
    let setCall = [];
    let sideCall = [];
    let burgerArr = new Array();
    let drinkArr = new Array();
    let setArr = new Array();
    let sideArr = new Array();
    let allPrice = 0;

        //burgerCard 기준으로 길이배열을 지정했음
    for (let i = 0; i < burgerCard.length; i++) {
        burgerCall[i] = {
            name: burgerCard[i].childNodes[0].textContent.trim(),
            price: parseInt(burgerCard[i].querySelector(".eachPrice").textContent)
        };
        drinkCall[i] = {
            name: drinkCard[i].childNodes[0].textContent.trim(),
            price: parseInt(drinkCard[i].querySelector(".eachPrice").textContent)
        };
        setCall[i] = {
            name: setCard[i].childNodes[0].textContent.trim(),
            price: parseInt(setCard[i].querySelector(".eachPrice").textContent)
        };
        sideCall[i] = {
            name: sideCard[i].childNodes[0].textContent.trim(),
            price: parseInt(sideCard[i].querySelector(".eachPrice").textContent)
        };
    }
    console.log(JSON.stringify(burgerCall));

    for (let i = 0; i < burgerCall.length; i++) {
        burgerCard[i].onclick = function () {
            price.textContent = `${allPrice += burgerCall[i]}`;
            burgerArr.push(`${burgerCard[i].textContent}`);
            }
        }
    for (let i = 0; i < drinkCall.length; i++) {
        drinkCard[i].onclick = function () {
            price.textContent = `${allPrice += drinkCall[i]}`;
            drinkArr.push(`${drinkCard[i].textContent}`);
        }
    }
    for (let i = 0; i < setCall.length; i++) {
        setCard[i].onclick = function () {
            price.textContent = `${allPrice += setCall[i]}`;
            setArr.push(`${setCard[i].textContent}`);
        }
    }
    for (let i = 0; i < sideCall.length; i++) {
        sideCard[i].onclick = function () {
            price.textContent = `${allPrice += sideCall[i]}`;
            sideArr.push(`${sideCard[i].textContent}`);
        }
    }
}

count();