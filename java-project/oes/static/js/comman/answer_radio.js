var answer = document.getElementById("answerNow").value;
var urlHeader = document.getElementById("urlHeader").value;

if (answer) {
    var selectedVedio = document.getElementById(answer);
    selectedVedio.src = (urlHeader + "/static/style/images/BTN_Radio_Selected_16x16.png.png");
}