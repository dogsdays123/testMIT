let box = document.querySelector(".box");
box.addEventListener("click", change);

function change() {
    console.log(box.style.borderRadius);
    if (box.style.borderRadius === "") {
        box.textContent = "체인지";
        box.style.backgroundColor = "green";
        box.style.borderRadius = "50%";
    }
    else {
        box.textContent = "";
        box.style.backgroundColor = "";
        box.style.borderRadius = "";
    }
}

function newReig(){
    let newItem = document.createElement("li");
    let subject = document.querySelector("#subject");
    let newText = document.createTextNode(subject.value);
    
    newItem.style.color = "white";
    newItem.appendChild(newText);

    let itemList = document.querySelector("#itemList");
    itemList.appendChild(newItem);

    subject.value = "";
}

document.addEventListener("DOMContentLoaded", function(){
    let button = document.querySelector("button");
    button.addEventListener("click", function(event){
        event.preventDefault();
        newReig();
    })
})

document.addEventListener("DOMContentLoaded", function(){
    let checkbox = document.querySelector("#agree");
    let proceed = document.querySelector("#proceed");
    checkbox.addEventListener('change', function(){
        if(this.checked){
            proceed.classList.remove('disable');
            proceed.classList.add('enable');
            proceed.disable = false;
            console.log(proceed.classList);
        }
        else{
            proceed.classList.add('disable');
            proceed.classList.remove('enable');
            proceed.disable = true;
        }
    })
})