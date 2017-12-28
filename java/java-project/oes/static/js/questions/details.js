function update() {
    $("#way").val("update");
    $("#detailsForm").submit();
}

function deleteQue() {
    location.href = "delete?way=delete&deleteId=" + $("#deleteId").val();
}
