function Save() {

    var id = document.getElementById("id").value;
    var email = $("#email").val();
    var username = $("#username").val();
    var fullname = $("#fullname").val();
    var department = $("#department option:selected").text();
    var position = $("#position option:selected").text();
    var createDate = $(".chosse-date").val();

    var table = document.getElementById("table");

    // tạo row
    var row = table.insertRow(-1);
    row.className = "row2";   // giữ class để CSS

    // tạo các cell
    row.insertCell(0).innerText = id;
    row.insertCell(1).innerText = email;
    row.insertCell(2).innerText = username;
    row.insertCell(3).innerText = fullname;
    row.insertCell(4).innerText = department;
    row.insertCell(5).innerText = position;
    row.insertCell(6).innerText = createDate;

    row.insertCell(7).innerHTML =
        `<button class="button-edit">Edit</button>`;

    row.insertCell(8).innerHTML =
        `<button class="button-delete">Delete</button>`;
}
function Reset() {

    document.getElementById("id").value = "";
    $("#email").val("");
    $("#username").val("");
    $("#fullname").val("");
    $("#department").val("");
    $("#position").val("");
    $(".chosse-date").val("");
}