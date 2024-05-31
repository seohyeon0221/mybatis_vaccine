function check() {
    var jumin = document.getElementsByName("jumin")[0].value.trim();
    var v_code = document.getElementsByName("v_code")[0].value;
    var host_code = document.querySelector('input[name="host_code"]:checked');
    var resv_date = document.getElementsByName("resv_date")[0].value.trim();
    var resv_time = document.getElementsByName("resv_time")[0].value.trim();

    if (jumin === '' || v_code === 'none' || !host_code || resv_date === '' || resv_time === '') {
        alert("모든 칸을 입력해주세요.");
        return false;
    }
    return true;
}

function res() {
    alert("처음부터 다시 입력합니다");
    document.querySelector("form").reset();
}

window.onload = function() {
    var saveButton = document.querySelector('input[type="submit"]');
    if (saveButton) {
        saveButton.onclick = function() {
            return check();
        };
    }
};