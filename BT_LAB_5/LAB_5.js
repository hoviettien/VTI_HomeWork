var selectedRow = null;

function Save() {
    var id = $("#id").val();
    
    if (checkIdExists(id)) {
        alert("ID này đã tồn tại. Dùng nút Update để cập nhật.");
        return;
    }

    var email = $("#email").val();
    var username = $("#username").val();
    var fullname = $("#fullname").val();
    var department = $("#department option:selected").text();
    var position = $("#position option:selected").text();
    var createDate = $(".chosse-date").val();

    var table = document.getElementById("table");
    var row = table.insertRow(-1);
    row.className = "row2";

    row.insertCell(0).innerText = id;
    row.insertCell(1).innerText = email;
    row.insertCell(2).innerText = username;
    row.insertCell(3).innerText = fullname;
    row.insertCell(4).innerText = department;
    row.insertCell(5).innerText = position;
    row.insertCell(6).innerText = createDate;
    row.insertCell(7).innerHTML = `<button class="button-edit">Edit</button>`;
    row.insertCell(8).innerHTML = `<button class="button-delete">Delete</button>`;

    Reset();
}

function Update() {
    var idUpdate = $("#id").val();

    if (!idUpdate) {
        alert("Nhập ID để tìm user cần cập nhật");
        return;
    }

    var isFound = false;

    $("#table tr").each(function() {
        var rowId = $(this).find("td").eq(0).text();

        if (rowId === idUpdate) {
            $(this).find("td").eq(1).text($("#email").val());
            $(this).find("td").eq(2).text($("#username").val());
            $(this).find("td").eq(3).text($("#fullname").val());
            $(this).find("td").eq(4).text($("#department option:selected").text());
            $(this).find("td").eq(5).text($("#position option:selected").text());
            $(this).find("td").eq(6).text($(".chosse-date").val());

            isFound = true;
        }
    });

    if (isFound) {
        alert("Đã cập nhật thông tin nhân viên ID: " + idUpdate);
        Reset();
    } else {
        alert("Không tìm thấy nhân viên nào có ID = " + idUpdate + " trong bảng");
    }
}

function checkIdExists(id) {
    var exists = false;
    $("#table tr").each(function () {
        if ($(this).find("td").eq(0).text() === id) {
            exists = true;
        }
    });
    return exists;
}

function Reset() {
    selectedRow = null;
    document.getElementById("id").value = "";
    $("#email").val("");
    $("#username").val("");
    $("#fullname").val("");
    $("#department").val("");
    $("#position").val("");
    $(".chosse-date").val("");
}


$(document).on("click", ".button-delete", function () {
    $(this).closest("tr").remove();
});

$(document).on("click", ".button-edit", function () {
    var row = $(this).closest("tr");
    var cells = row.find("td");
    $("#id").val(cells.eq(0).text());
    $("#email").val(cells.eq(1).text());
    $("#username").val(cells.eq(2).text());
    $("#fullname").val(cells.eq(3).text());
    $("#department").val(cells.eq(4).text());
    $("#position").val(cells.eq(5).text());
    $(".chosse-date").val(cells.eq(6).text());

    selectedRow = row;
});