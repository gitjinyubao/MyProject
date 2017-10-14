var pageSizeMax = "";
var uslHeader = "";
var queIdArray = new Array();

$(document).ready(function(){
    urlHeader = $("#urlHeader").val();
    pageSizeMax = $("#queNumTotal").val();

    for (var i =0; i < pageSizeMax; i++) {
        queIdArray[i] = "";
    }
});

function orderId() {
    value = $("#orderId").val();
    var img = $("#orderIdImg");

    if (value == 0) {
        $("#orderId").val("1");
        $("#orderIdImg").attr("src", (urlHeader + "/static/style/images/ICN_Decrese_10x15.png"));
    } else {
        $("#orderId").val("0");
        $("#orderIdImg").attr("src", (urlHeader + "/static/style/images/ICN_Increase_10x15.png"));
    }

    $("#goPage").submit();
}

function fuzzSearch() {
    var keyWord = $("#keyWord").val();
    location.href = "show?keyWord=" + keyWord;
}

function changePageSize() {
    $("#pageSize").val($("#num").val());
    $("#pageNumber").val("1");
    $("#goPage").submit();
}

function nextOne() {
    $("#pageNumber").val($("#pageSizeNowDown").val());
    $("#goPage").submit();
}

function upOne() {
    $("#pageNumber").val($("#pageSizeNowUp").val());
    $("#goPage").submit();
}

function batchDelete() {
    $("#mainBody").css("opacity", "0.3");
    var dialog = $("#dialog");
    $("#dialog").css("display", "block");
}

function deleteAll() {
    $("#batchDelete").submit();
}

function cancelAll() {
    for (var i = 0; i < pageSizeMax; ++i) {
        changeSrcCall(i);
    }

    unSelectAll("selectAll");

    $("#deleteId").val("");

    $("#batchDelete").submit();
}

function closeDialog() {
    $("#dialog").css("display", "none");
    $("#mainBody").css("opacity", "1.0");
}

function goPageOne() {
    if (isPInt($("#pageNumber").val())) {
        $("#goPage").submit();
        return ;
    } else {
        var excuteMessage = $("#excuteMessage");
        $("#excuteMessage").html('Enter a positive integer!');
        $("#excuteMessage").css("display", "block");
        setTimeout(function() {
            $("#excuteMessage").css("display", "none");
        }, 3000);
        return;
    }
}

function goNumberPage(pageNumber) {
    $("#pageNumber").val(pageNumber);
    $("#goPage").submit();
}

function changeSrc(changeImgId, lengthOne) {
    $("#psn").val(lengthOne);

    if (queIdArray[0] == "" || queIdArray[0] == null) {
        for (var k = 0; k < queIdArray.length; ++k) {
            queIdArray[k] = $("#"+"a"+k).val();
        }  
    }

    var noChosen = new Array(lengthOne);
    var selectAllkind = $("#" + "selectAll");

    if (changeImgId == "selectAll") {
        if ($("#" + "selectAll").attr("src") == (urlHeader + "/static/style/images/ICN_Unselected_15x15.png")) {
            changeSrcCall(changeImgId);
            for (var i= 0; i < lengthOne ; ++i){
                if ($("#" + i).attr("src") == (urlHeader + "/static/style/images/ICN_Unselected_15x15.png")) {
                    var length = noChosen.length;
                    noChosen[i] = i;
                }
            }

            for (var j = 0; j < noChosen.length; ++j) {
                if (noChosen[j] == null) {
                    continue;
                }
                changeSrcCall(noChosen[j]);
            }
        } else {
            unSelectAll("selectAll");
            for(var m = 0; m < lengthOne; ++m) {
                unSelectAll(m);
            }
        }
    } else {
        if ($("#" + "selectAll").attr("src") == (urlHeader + "/static/style/images/ICN_Selected_15x15.png")) {
            $("#" + "selectAll").attr("src", (urlHeader + "/static/style/images/ICN_Unselected_15x15.png"));
        }
        changeSrcCall(changeImgId);
    }

    var flag = true;
    var answerString = "";
    for (var selectedDele = 0; selectedDele < lengthOne; ++selectedDele) {
        var imgSelected = $("#" + selectedDele);

        if ($("#" + selectedDele).attr("src") == (urlHeader + "/static/style/images/ICN_Unselected_15x15.png")) {
            flag = false;
            $("#" + "a"+selectedDele).val("");
        } else {
            $("#" + "a"+selectedDele).val(queIdArray[selectedDele]);

            if(answerString != "") {
                answerString += (", " + "'" + queIdArray[selectedDele] + "'" + " ");
            } else {
                answerString = "'" + queIdArray[selectedDele] + "'" + " ";
             }
        }
    }

    $("#deleteId").val(answerString);

    if (flag) {
        SelectAll("selectAll");
    }
}

function changeSrcCall(changeImgId) {
    var imgSrcNow = $("#" + changeImgId).attr("src");
    var srcUnselected = (urlHeader + "/static/style/images/ICN_Unselected_15x15.png");
    var srcSelected = (urlHeader + "/static/style/images/ICN_Selected_15x15.png");
    var flag = imgSrcNow.indexOf("/static/style/images/ICN_Unselected_15x15.png");

    if (flag > 0) {
        $("#" + changeImgId).attr("src", srcSelected);
    } else {
        $("#" + changeImgId).attr("src", srcUnselected);
    }
}

function unSelectAll(changeImgId) {
    var srcUnselected = (urlHeader + "/static/style/images/ICN_Unselected_15x15.png");
    $("#" + changeImgId).attr("src", srcUnselected);
}

function SelectAll(changeImgId) {
    var srcSelected = (urlHeader + "/static/style/images/ICN_Selected_15x15.png");
    $("#" + changeImgId).attr("src", srcSelected);
}

function createQue() {
    location.href = "save?way=createPage";
}