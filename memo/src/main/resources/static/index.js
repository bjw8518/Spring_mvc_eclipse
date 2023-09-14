// 메모 추가
// function addMemo() {
//     const memoContainer = document.querySelector(".memo-container");
//     const newMemo = document.createElement("div");
//     newMemo.classList.add("memo");
//     newMemo.innerHTML = `
//         <span class="close-button" onclick="removeMemo(this)">x</span>
//         <p>메모 내용을 여기에 작성하세요.</p>
//     `;
//     memoContainer.appendChild(newMemo);
    
// }
let memo_template;
$(function(){
    let memo_clone = $('.memo').eq(0).clone(true,true);
});

$(document).on('click', '#add_memo', function(event){
    let memo_clone = $('.memo').eq(0).clone(true,true);
    $('.memo-container').append(memo_clone);
});

$(document).on('click', '.description', function(event){
    $(this).atr('contentEditable','true');
    let memo_text = $(this).text();
    if(memo_text != '메모내용을 여기에 작성'){
        $(this).text('');
    }
});

$(document).on('focusout', '.description', function(event){
    $.ajax({
        type: "GET",
        url: "insert_api",
        data : {"jsonStr":memo_text}
        error: function() {
        success: function(data) {
        }
    });
});


$(document).on('click', '.close-button', function(event){
    $(this).parents('.memo').remove();
});

//메모 편집
// function editMemo(element) {
//     // 클릭한 <p> 요소의 내용을 지움
//     element.textContent = '';
//     element.contentEditable = 'true';

//     // 포커스를 주어 편집 가능한 상태로 변경
//     element.focus();

//     // 포커스를 잃었을 때 이벤트 리스너를 사용하여 변경된 내용을 저장
//     element.addEventListener('blur', function () {
//     element.contentEditable = 'false';
	
//         // 내용이 비어 있으면 기본 텍스트 설정
//         if (element.textContent.trim() === '') {
//             element.textContent = '메모 내용을 여기에 작성하세요.';
//         }
//     });
// }


// 메모 삭제
function removeMemo(button) {
    const memo = button.parentElement;
    memo.parentElement.removeChild(memo);
}
