console.log(`Hello, World!`);
//window.alert(`My name is Monkey d. Luffy! I want to be the Pirate King!`);
// document.getElementById("name").textContent = "Monkey d. Luffy";
// document.getElementById("luffy").textContent = " future Pirate King!";
// document.getElementById("bounty").textContent = " Bounty 3,000,000 berries!";
// document.getElementById("occupation").textContent = " captain of the Straw Hat Pirates!";
// document.getElementById("age").textContent = "age : 19";
// document.getElementById("devil-fruits").textContent = "hito hito no mi model : sun god nika ";

// let Ispirateking = true;
// let isThegoat = true;
// if (Ispirateking && isThegoat) {
// console.log(`truth nuke `) 
// }
let  ans = "yes";
document.getElementById("qustion").textContent = "is luffy the goat ?"; 

document.getElementById("submit").onclick =getanswer();  


function getanswer(){
ans = document.getElementById("answer").value;
if(ans.toLowerCase() == "yes"){
    document.getElementById("result").textContent = "good answer nephew";

}
else if (ans.toLowerCase() != "yes") {
    document.getElementById("result").textContent = "Bad answe nephew";
}


}




// let name = "Monkey d. Luffy"; 
// let bounty = "3,000,000 berries";
// let gmail = "luffy@gmail.com";
// let gmailslice = gmail.slice();
