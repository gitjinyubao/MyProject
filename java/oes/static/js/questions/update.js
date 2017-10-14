$(document).ready(function(){
    $(".cancel-but").click(function(){
        $("#way").val("cancel");
        $("#updateQueForm").submit();
    });
});

var urlHeader = "";
function update() {
    var ansRequried = new Array("queTitle","ansA", "ansB", "ansC", "ansD");
    for (var i = 0; i < ansRequried.length; ++i) {
        var answerValue = $("#" + ansRequried[i]).val();
        if (!answerValue) {
            message('Fill in the input!');
            return;
        }

        if (/.*[\u4e00-\u9fa5]+.*$/.test(answerValue)) {
            message('Contains illegal characters');
            return;
        }
    }
    $("#way").val("update");
    $("#updateQueForm").submit();
}

function changeImg(changeImgId) {
    urlHeader = document.getElementById("urlHeader").value;
    var answ = new Array("A", "B", "C", "D");
    var img = document.getElementById(changeImgId);
    var imgSrcNow = img.src;
    var srcUnselected = (urlHeader + "/static/style/images/BTN_Radio_Unselected_16x16.png.png");
    var srcSelected = (urlHeader + "/static/style/images/BTN_Radio_Selected_16x16.png.png");

    var flag = imgSrcNow.indexOf("static/style/images/BTN_Radio_Unselected_16x16.png.png");

    if (flag > 0) {
        img.src = srcSelected;
        document.getElementById("answer").value = changeImgId;
        for (var i = 0; i < answ.length; ++i) {
            if (answ[i] == changeImgId) {
                continue;
            } else {
                document.getElementById(answ[i]).src = (urlHeader + "/static/style/images/BTN_Radio_Unselected_16x16.png.png");
            }
        }
    } else {
        img.src = srcUnselected;
        document.getElementById("answer").value = null;
    }
}

function message(messageStr) {
    var excuteMessage = $("#excuteMessage");
    $("#excuteMessage").html(messageStr);
    $("#excuteMessage").css("display", "block");
    setTimeout(function() {
        $("#excuteMessage").css("display", "none");
    }, 3000);
}