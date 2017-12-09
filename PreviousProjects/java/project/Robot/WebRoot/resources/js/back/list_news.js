function deleteBatch(){
	var form=document.getElementById("mainForm");
	form.setAttribute("action", "DeleteBatch.action");
	form.submit();
}