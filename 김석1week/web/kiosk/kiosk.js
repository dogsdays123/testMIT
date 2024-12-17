//html query
let subMenu = document.querySelectorAll(".subMenu");
let subMenuOnClick = document.querySelectorAll(".animated-button");
let menuClose = document.querySelector(".menuClose");
let burger = document.querySelector(".burger");
let drink = document.querySelector(".drink");
let set = document.querySelector(".set");
let side = document.querySelector(".side");
let priced = document.querySelector(".price");
let choiseMenu = document.querySelector('.choiseMenu');
let card2 = document.querySelector('.card2');
let downbarMenu = document.querySelector('.downbarMenuContainer');
// let menuContainers = document.querySelectorAll(".menuContainer");
let cardOrigin = document.querySelector('.highMenu');
let card4 = document.querySelector('.card4');

let menuFull = [];

//배열
let burgerCard = [
    {
        name: '풀드비프 와퍼',
        price: 5500,
        index: 0
    },
    {
        name: '스파이시 와퍼',
        price: 6000,
        index: 0
    },
    {
        name: '두툼버거',
        price: 4500,
        index: 0
    },
    {
        name: '몬스터 와퍼',
        price: 5000,
        index: 0
    }
];
let drinkCard = [
    {
        name: '사이다',
        price: 1500,
        index: 0
    },
    {
        name: '코카콜라',
        price: 1500,
        index: 0
    },
    {
        name: '모닝에이드 오렌지',
        price: 2000,
        index: 0
    },
    {
        name: '핫초코',
        price: 1000,
        index: 0
    }
];
let setCard = [
    {
        name: '몬스터 주니어',
        price: 8000,
        index: 0
    },
    {
        name: '더블비프불고기버거',
        price: 11000,
        index: 0
    },
    {
        name: '비프불고기버거',
        price: 8500,
        index: 0
    },
    {
        name: '통새우와퍼주니어',
        price: 9000,
        index: 0
    }
];
let sideCard = [
    {
        name: '어니언링',
        price: 2000,
        index: 0
    },
    {
        name: '치킨너겟[8조각]',
        price: 3000,
        index: 0
    },
    {
        name: '치즈스틱',
        price: 2000,
        index: 0
    },
    {
        name: '프렌치프라이',
        price: 3000,
        index: 0
    }
];

//html요소 배열
let burgerFull = [];
let drinkFull = [];
let setFull = [];
let sideFull = [];
let allIndex = 0;


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
                imgFool = clonedItem.querySelector('.checkbox-tile');
                imgFool.style.backgroundImage = `url(imgs/${encodeURIComponent(arr[j].name)}.png)`;
                // imgFool.style.backgroundImage = `url(imgs/${str}${j}.png)`;
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
    for (let i = 0; i < subMenuOnClick.length; i++) {
        subMenuOnClick[i].onclick = function () {
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

    document.addEventListener("DOMContentLoaded", function () {
        //각 매개변수를 통해 필요한 요소들을 가져온다.
        //버튼을 생성한다.
        function createButtons(liElement, index, callArray) {
            //이미지 넣기
            const backImg = document.createElement('div');
            const buttonDiv = document.createElement('div');
            const plusButton = document.createElement('i');
            const minusButton = document.createElement('i');
            backImg.classList.add('imgs');
            buttonDiv.classList.add('cloneButtons');
            plusButton.classList.add('fa-solid', 'fa-plus');
            minusButton.classList.add('fa-solid', 'fa-minus');
            backImg.style.backgroundImage = `url(imgs/${encodeURIComponent(callArray[index].name)}.png)`;

            //더하기 버튼을 만든다.
            const addButton = document.createElement('button');
            addButton.classList.add('addButton');
            addButton.appendChild(plusButton);

            //빼기 버튼을 만든다.
            const removeButton = document.createElement('button');
            removeButton.classList.add('removeButton');
            removeButton.appendChild(minusButton);

            //li요소 자식위치에 버튼들을 추가한다.
            liElement.appendChild(backImg);
            liElement.appendChild(buttonDiv);
            buttonDiv.appendChild(addButton);
            buttonDiv.appendChild(removeButton);

            //더하기 버튼을 클릭 시.
            addButton.onclick = function () {
                callArray[index].index++;
                allPrice += callArray[index].price;
                allIndex++;
                liElement.textContent = `${callArray[index].name} ${callArray[index].index}개`;
                liElement.appendChild(backImg);
                liElement.appendChild(buttonDiv);
                buttonDiv.appendChild(addButton);
                buttonDiv.appendChild(removeButton);
                priced.textContent = `${allPrice} 원`;
                choiseMenu.textContent = `${allIndex}개 선택되었습니다.`;
            };

            //빼기 버튼을 클릭 시.
            removeButton.onclick = function () {
                callArray[index].index--;

                if (callArray[index].index > 0) {
                    liElement.textContent = `${callArray[index].name} ${callArray[index].index}개`;
                    liElement.appendChild(backImg);
                    liElement.appendChild(buttonDiv);
                    buttonDiv.appendChild(addButton);
                    buttonDiv.appendChild(removeButton);
                }
                else {
                    liElement.remove();
                }
                allPrice -= callArray[index].price;
                allIndex--;
                priced.textContent = `${allPrice} 원`;
                choiseMenu.textContent = `${allIndex}개 선택되었습니다.`;
            };
        }

        for (let i = 0; i < burgerCall.length; i++) {
            burgerFull[i].addEventListener('click', function () {
                burgerCall[i].index++;
                allIndex++;
                priced.textContent = `${allPrice += burgerCall[i].price} 원`;
                if ((burgerCall[i].index == 1)) {
                    //계산서에 요소 넣기
                    priceText[i] = document.querySelector('.downbarMenuContainer .buyMenu').appendChild(document.createElement('div'));
                    priceText[i].classList.add('buy');
                    //계산서에 숫자 넣기
                    priceText[i].textContent = `${burgerCall[i].name} ${burgerCall[i].index}개`
                    //계산서에 버튼 넣기
                    createButtons(priceText[i], i, burgerCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${burgerCall[i].name} ${burgerCall[i].index}개`;
                }
                //총갯수 적기
                choiseMenu.textContent = `${allIndex}개 선택되었습니다.`;
            })
        }
        for (let i = 0; i < drinkCall.length; i++) {
            drinkFull[i].addEventListener('click', function () {
                drinkCall[i].index++;
                allIndex++;
                priced.textContent = `${allPrice += drinkCall[i].price} 원`;
                if ((drinkCall[i].index == 1)) {
                    priceText[i] = document.querySelector('.downbarMenuContainer .buyMenu').appendChild(document.createElement('div'));
                    priceText[i].classList.add('buy');
                    priceText[i].textContent = `${drinkCall[i].name} ${drinkCall[i].index}개`
                    createButtons(priceText[i], i, drinkCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${drinkCall[i].name} ${drinkCall[i].index}개`
                }
                choiseMenu.textContent = `${allIndex}개 선택되었습니다.`;
            })
        }
        for (let i = 0; i < setCall.length; i++) {
            setFull[i].addEventListener('click', function () {
                setCall[i].index++;
                allIndex++;
                priced.textContent = `${allPrice += setCall[i].price} 원`;
                if ((setCall[i].index == 1)) {
                    priceText[i] = document.querySelector('.downbarMenuContainer .buyMenu').appendChild(document.createElement('div'));
                    priceText[i].classList.add('buy');
                    priceText[i].textContent = `${setCall[i].name} ${setCall[i].index}개`
                    createButtons(priceText[i], i, setCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${setCall[i].name} ${setCall[i].index}개`
                }
                choiseMenu.textContent = `${allIndex}개 선택되었습니다.`;
            })
        }
        for (let i = 0; i < sideCall.length; i++) {
            sideFull[i].addEventListener('click', function () {
                sideCall[i].index++;
                allIndex++;
                priced.textContent = `${allPrice += sideCall[i].price} 원`;
                if ((sideCall[i].index == 1)) {
                    priceText[i] = document.querySelector('.downbarMenuContainer .buyMenu').appendChild(document.createElement('div'));
                    priceText[i].classList.add('buy');
                    priceText[i].textContent = `${sideCall[i].name} ${sideCall[i].index}개`
                    createButtons(priceText[i], i, sideCall);
                }
                else {
                    priceText[i].firstChild.textContent = `${sideCall[i].name} ${sideCall[i].index}개`
                }
                choiseMenu.textContent = `${allIndex}개 선택되었습니다.`;
            })
        }
    })

    document.addEventListener("DOMContentLoaded", function () {
        document.addEventListener("click", function (e) {
            console.log(e.target);
            let downbarAll = card2.querySelectorAll('*');
            //off
            if ((downbarMenu.classList.contains('enable')) && (e.target == downbarAll)) {
                downbarMenu.classList.remove('enable');
                downbarMenu.classList.add('disable');
                card4.classList.remove('card4');
                card4.classList.add('card4Dis');
            }
            else if ((Array.from(downbarAll).some(item => item === e.target)) && (downbarMenu.classList.contains('enable'))) {
                downbarMenu.classList.remove('enable');
                downbarMenu.classList.add('disable');
                card4.classList.remove('card4');
                card4.classList.add('card4Dis');
            }
            //on
            else if ((Array.from(downbarAll).some(item => item === e.target)) && (downbarMenu.classList.contains('disable'))) {
                downbarMenu.classList.remove('disable');
                downbarMenu.classList.add('enable');
                card4.classList.add('card4');
                card4.classList.remove('card4Dis');
            }
        })
    })
}

count();
