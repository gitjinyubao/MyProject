var urlHeader = "";

function getUrlHeader() {
    urlHeader = $("#mainBody").val();
}

function create() {
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
    $("#way").val("create");
    $("#creQueForm").submit();
}

function cancel() {
    $("#way").val("cancel");
    $("#creQueForm").submit();
}

function changeImg(changeImgId) {
    var answersArray = new Array("A", "B", "C", "D");
    urlHeader = $("#urlHeader").val();
    var imgSrcNow = $("#" + changeImgId).attr("src");
    var srcUnselected = (urlHeader + "/static/style/images/BTN_Radio_Unselected_16x16.png.png");
    var srcSelected = (urlHeader + "/static/style/images/BTN_Radio_Selected_16x16.png.png");

    var flag = imgSrcNow.indexOf("static/style/images/BTN_Radio_Unselected_16x16.png.png");
    if (flag > 0) {
        $("#" + changeImgId).attr("src", srcSelected);
        $("#answerNow").val(changeImgId);
        for (var i = 0; i < answersArray.length; ++i) {
            if (answersArray[i] == changeImgId) {
                continue;
            } else {
                $("#" + answersArray[i]).attr("src", (urlHeader + "/static/style/images/BTN_Radio_Unselected_16x16.png.png"));
            }
        }
    } else {
        $("#" + changeImgId).attr("src", srcUnselected);
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