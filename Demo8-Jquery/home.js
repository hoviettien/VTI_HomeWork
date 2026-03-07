const Onclick = () => {
    console.log('VTI');
    alert('VTI');
}

// document.getElementById('bt1').innerText
var a= $("#h3id").text();
console.log(a);
var b = $(".h5id").text();
console.log(b);
var c = $("h1").text();
console.log(c);


// event hanlding jquery
$("#bt2").click(function (e) {
    console.log('Button clicked!');
})
