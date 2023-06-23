function removeCheck() {

    if (confirm("정말 삭제하시겠습니까??") == true) {
        document.removefrm.submit();
    } else {
        return false;

    }

}
document.getElementById("searchBtn").onclick = function () {
		  
		let searchType = document.getElementsByName("searchType")[0].value;
		let keyword =  document.getElementsByName("keyword")[0].value;
		
		location.href = "/board/listPageSearch?num=1" + "&searchType=" + searchType + "&keyword=" + keyword;
	};