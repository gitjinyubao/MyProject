var urlHeader = "";

function keyLogin() {
    if (event.keyCode == 13) {
        login();
    }
}

function change(kindIn, kindIm) {
    var kindImg = document.getElementById(kindIm);
    var kindInput = document.getElementById(kindIn).value;

    if (kindInput) {
        kindImg.style.visibility = "hidden";
    }

}

function changeSrc() {
    urlHeader = document.getElementById("urlHeader").value;
    var img = document.getElementById("changeImg");
    var imgSrcNow = img.src;
    var remberMe = document.getElementById("remberMe");
    var srcUnselected = urlHeader + "/static/style/images/ICN_Unselected_15x15.png";
    var srcSelected = urlHeader + "/static/style/images/ICN_Selected_15x15.png";
    var flag = imgSrcNow.indexOf("static/style/images/ICN_Unselected_15x15.png");

    if (flag > 0) {
        img.src = srcSelected;
        img.style.backgroundColor = "#2E4358";
        remberMe.value = "remberMe";
    } else {
        img.src = srcUnselected;
        img.style.backgroundColor = "#FFFFFF";
        remberMe.value = "no";
    }

}

function login() {
    var logForm = document.getElementById("loginForm");
    var password = document.getElementById("password").value;
    var userName = document.getElementById("userName").value;
    var usererr = document.getElementById("usererr");
    var passerr = document.getElementById("passerr");
    var flag = true;
    var errorMes = "";
    var errorInLine = document.getElementById("errorInLine");

    if (userName == null || userName == "") {
        errorMes = "Username is required!";
        usererr.style.visibility = "visible";
        flag = false;
    } else {
        usererr.style.visibility = "hidden";
    }

    if (password == null || password == "") {
        errorMes = "Password is required!";
        passerr.style.visibility = "visible";
        flag = false;
    } else {
        passerr.style.visibility = "hidden";
    }

    if (!password && !userName) {
        errorMes = "userName and Password is required!";
        flag = false;
    }

    if (!flag) {
        errorInLine.innerHTML = errorMes;
        errorInLine.style.visibility = "visible";
    }

    if (flag) {
        console.log("true")
        logForm.submit();
    } 
}