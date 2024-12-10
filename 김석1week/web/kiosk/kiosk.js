//html query
let subMenu = document.querySelectorAll(".subMenu");
let menuClose = document.querySelector(".menuClose");
let burger = document.querySelector(".burger");
let drink = document.querySelector(".drink");
let set = document.querySelector(".set");
let side = document.querySelector(".side");
let priced = document.querySelector(".price");
let choiseMenu = document.querySelector('.choiseMenu');
let downbarContainer = document.querySelector('.downbarContainer');
let downbarMenu = document.querySelector('.downbarMenuContainer');
// let menuContainers = document.querySelectorAll(".menuContainer");
let cardOrigin = document.querySelector('.highMenu');

let menuFull = [];

//배열
let burgerCard = [
    {
        name: 'fat_burger',
        price: 150,
        index: 0
    },
    {
        name: 'holy_burger',
        price: 300,
        index: 0
    },
    {
        name: 'good_burger',
        price: 450,
        index: 0
    },
    {
        name: 'da_burger',
        price: 100,
        index: 0
    }
];
let drinkCard = [
    {
        name: 'fat_drink',
        price: 150,
        index: 0
    },
    {
        name: 'holy_drink',
        price: 300,
        index: 0
    },
    {
        name: 'good_drink',
        price: 450,
        index: 0
    },
    {
        name: 'da_drink',
        price: 100,
        index: 0
    }
];
let setCard = [
    {
        name: 'fat_set',
        price: 150,
        index: 0
    },
    {
        name: 'holy_set',
        price: 300,
        index: 0
    },
    {
        name: 'good_set',
        price: 450,
        index: 0
    },
    {
        name: 'da_set',
        price: 100,
        index: 0
    }
];
let sideCard = [
    {
        name: 'fat_side',
        price: 150,
        index: 0
    },
    {
        name: 'holy_side',
        price: 300,
        index: 0
    },
    {
        name: 'good_side',
        price: 450,
        index: 0
    },
    {
        name: 'da_side',
        price: 100,
        index: 0
    }
];

//html요소 배열
let burgerFull = [];
let drinkFull = [];
let setFull = [];
let sideFull = [];


function copyCloneB() {
    function cloneMainMenu(i) {
        // 기존 메뉴 항목을 가져옵니다
        // 해당 요소를 복사 (deep copy)
        const clonedMenu = cardOrigin.querySelector(".menuContainer").cloneNode(true);
        const innerCard = clonedMenu.querySelector('.burger');

        // 클래스와 이름과 가격을 수정
        clonedMenu.classList.toggle('burgerFull');
        innerCard.classList.toggle('burger');
        switch (i) {
            case 0:
                innerCard.classList.toggle('drink');
                clonedMenu.classList.toggle('drinkFull');
                break;
            case 1:
                innerCard.classList.toggle('set');
                clonedMenu.classList.toggle('setFull');
                break;
            case 2:
                innerCard.classList.toggle('side');
                clonedMenu.classList.toggle('sideFull');
                break;
        }

        // 복사된 요소를 화면에 추가
        cardOrigin.appendChild(clonedMenu);
        menuFull[i + 1] = innerCard;
    }

    function cloneSubMenu(i) {
        switch (i) {
            case 0:
                cloning(burgerCard, 'burger');
                break;
            case 1:
                cloning(drinkCard, 'drink');
                break;
            case 2:
                cloning(setCard, 'set');
                break;
            case 3:
                cloning(sideCard, 'side');
                break;
        }

        function cloning(arr, str) {
            const parentContainerItem = document.querySelector(`.${str}Full`);
            for (let j = 0; j < arr.length; j++) {
                const clonedItem = menuFull[i].cloneNode(true);
                clonedItem.querySelector('.checkbox-label').textContent = eval(`${str}Card[${j}].name;`);
                clonedItem.querySelector('.eachPrice').textContent = eval(`${str}Card[${j}].price;`);
                eval(`${str}Full[${j}] = clonedItem;`);
                parentContainerItem.appendChild(clonedItem);
            }
        }
    }
    // 배열 크기만큼 복사
    document.addEventListener('DOMContentLoaded', function () {
        menuFull[0] = cardOrigin.querySelector('.burgerFull .burger');
        for (let i = 0; i < 3; i++) {
            cloneMainMenu(i);
        }
        for (let i = 0; i < 4; i++) {
            cloneSubMenu(i);
            menuFull[i].remove();
        }
    })
}

copyCloneB();


//서브메뉴
document.addEventListener("DOMContentLoaded", function () {
    let menuContainers = document.querySelectorAll(".menuContainer");
    for (let i = 0; i < subMenu.length; i++) {
        subMenu[i].onclick = function () {
            if (menuContainers[i].style.display == 'grid') {
                for (let k = 0; k < menuContainers.length; k++) {
                    menuContainers[k].style.display = 'none';
                }
            }
            //서브메뉴 아이콘 클릭 시, 스타일 요소를 추가한다.
            else {
                menuContainers[i].style.display = 'grid';
                for (let j = 0; j < menuContainers.length; j++) {
                    if (i !== j) { menuContainers[j].style.display = 'none'; }
                }
            }
        }
    }
})

//계산
function count() {
    //나중에 엑셀같은 것과 연동해서 배열을 지정함
    let burgerCall = [];
    let drinkCall = [];
    let setCall = [];
    let sideCall = [];
    let priceText = [];
    let allPrice = 0;

    //메뉴별로 Call로 불러와서 배열에 각 상징을 추가해서 저장한다.
    //나는 name, price, index 3가지를 상징했다.
    for (let i = 0; i < burgerCard.length; i++) {
        burgerCall[i] = {
            name: burgerCard[i].name,
            price: parseInt(burgerCard[i].price),
            index: burgerCard[i].index
        };
    }
    for (let i = 0; i < drinkCard.length; i++) {
        drinkCall[i] = {
            name: drinkCard[i].name,
            price: parseInt(drinkCard[i].price),
            index: drinkCard[i].index
        };
    }
    for (let i = 0; i < setCard.length; i++) {
        setCall[i] = {
            name: setCard[i].name,
            price: parseInt(setCard[i].price),
            index: setCard[i].index
        };
    }
    for (let i = 0; i < sideCard.length; i++) {
        sideCall[i] = {
            name: sideCard[i].name,
            price: parseInt(sideCard[i].price),
            index: sideCard[i].index
        };
    }

    //버튼을 생성한다.
    document.addEventListener("DOMContentLoaded", function () {
        //각 매개변수를 통해 필요한 요소들을 가져온다.
        function createButtons(liElement, index, callArray) {
            //더하기 버튼을 만든다.
            const addButton = document.createElement('button');
            addButton.textContent = 'Add';
            addButton.classList.add('addButton', 'dontDist');

            //빼기 버튼을 만든다.
            const removeButton = document.createElement('button');
            removeButton.textContent = 'Remove';
            removeButton.classList.add('removeButton', 'dontDist');

            //li요소 자식위치에 버튼들을 추가한다.
            liElement.appendChild(addButton);
            liElement.appendChild(removeButton);

            //더하기 버튼을 클릭 시.
            addButton.onclick = function () {
                callArray[index].index++;
                allPrice += callArray[index].price;
                liElement.textContent = `${callArray[index].name} ${callArray[index].index}개`;
                liElement.appendChild(addButton);
                liElement.appendChild(removeButton);
                priced.textContent = `${allPrice}`;
            };

            //빼기 버튼을 클릭 시.
            removeButton.onclick = function () {
                callArray[index].index--;

                if (callArray[index].index > 0) {
                    liElement.textContent = `${callArray[index].name} ${callArray[index].index}개`;
                    liElement.appendChild(addButton);
                    liElement.appendChild(removeButton);
                }
                else {
                    liElement.remove();
                }
                allPrice -= callArray[index].price;
                priced.textContent = `${allPrice}`;
            };
        }

        for (let i = 0; i < burgerCall.length; i++) {
            burgerFull[i].querySelector('.animated-button').onclick = function () {
                burgerCall[i].index++;
                priced.textContent = `${allPrice += burgerCall[i].price}`;
                if ((burgerCall[i].index == 1)) {
                    priceText[i] = document.querySelector('.downbarMenuContainer ul').appendChild(document.createElement('li'));
                    priceText[i].classList.add('dontDist');
                    priceText[i].textContent = `${burgerCall[i].name} ${burgerCall[i].index}개`
                    createButtons(priceText[i], i, burgerCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${burgerCall[i].name} ${burgerCall[i].index}개`
                }
            }
        }
        for (let i = 0; i < drinkCall.length; i++) {
            drinkFull[i].onclick = function () {
                drinkCall[i].index++;
                priced.textContent = `${allPrice += drinkCall[i].price}`;
                if ((drinkCall[i].index == 1)) {
                    priceText[i] = document.querySelector('.downbarMenuContainer ul').appendChild(document.createElement('li'));
                    priceText[i].classList.add('dontDist');
                    priceText[i].textContent = `${drinkCall[i].name} ${drinkCall[i].index}개`
                    createButtons(priceText[i], i, drinkCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${drinkCall[i].name} ${drinkCall[i].index}개`
                }
            }
        }
        for (let i = 0; i < setCall.length; i++) {
            setFull[i].onclick = function () {
                setCall[i].index++;
                priced.textContent = `${allPrice += setCall[i].price}`;
                if ((setCall[i].index == 1)) {
                    priceText[i] = document.querySelector('.downbarMenuContainer ul').appendChild(document.createElement('li'));
                    priceText[i].classList.add('dontDist');
                    priceText[i].textContent = `${setCall[i].name} ${setCall[i].index}개`
                    createButtons(priceText[i], i, setCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${setCall[i].name} ${setCall[i].index}개`
                }
            }
        }
        for (let i = 0; i < sideCall.length; i++) {
            sideFull[i].onclick = function () {
                sideCall[i].index++;
                priced.textContent = `${allPrice += sideCall[i].price}`;
                if ((sideCall[i].index == 1)) {
                    priceText[i] = document.querySelector('.downbarMenuContainer ul').appendChild(document.createElement('li'));
                    priceText[i].classList.add('dontDist');
                    priceText[i].textContent = `${sideCall[i].name} ${sideCall[i].index}개`
                    createButtons(priceText[i], i, sideCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${sideCall[i].name} ${sideCall[i].index}개`
                }
            }
        }
    })

    document.addEventListener("DOMContentLoaded", function () {
        addEventListener("click", function (e) {
            console.log(priceText);
            let dontDist = this.document.querySelectorAll('.dontDist');
            //off
            if ((e.target != downbarMenu) && (downbarMenu.classList.contains('enable')) && !Array.from(dontDist).some(item => item === e.target)) {
                downbarMenu.classList.remove('enable');
                downbarMenu.classList.add('disable');
            }
            //on
            else if ((e.target == choiseMenu) && (downbarMenu.classList.contains('disable'))) {
                downbarMenu.classList.remove('disable');
                downbarMenu.classList.add('enable');
            }
        })
    })
}

count();
