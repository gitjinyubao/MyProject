function update() {
    $("#way").val("update");
    $("#queform").submit();
}

function deleteQue() {
    location.href = "delete?way=delete&deleteId=" + $("#deleteId").val();
}
