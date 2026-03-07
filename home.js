
function logMessage() {
    var name = 'Ho Viet Tien';
    var className = 'class 26A';
    var school = 'VTI';
    var person1 = {
        id: 1,
        name: 'Ho Viet Tien',
        className: 'class 26A',
        school: 'VTI',
        age: 22,
        showinfor: function () {
            console.log('ID: ' + this.id);
            console.log('My name is: ' + this.name);
            console.log('class: ' + this.className);
            console.log('school: ' + this.school);
            console.log('age: ' + this.age);
        }
    };

    person1.showinfor();
    console.log('My name is: ' + name);
    console.log('class: ' + className);
    console.log('school: ' + school);
    console.log('My name is: ' + person1.name + ', class: ' + person1.className + ', school: ' + person1.school + ', age: ' + person1.age);
}

function sumResults(a, b) {
    var sum = a + b;
    return sum;
}
var sum = sumResults(5, 10);
console.log('The sum of 5 and 10 is: ' + sum);

var numbers = [1, 2, 3, 4, 5];  
console.log('Phần tử đầu tiên: ' + numbers[0]);
console.log('Phần tử thứ hai: ' + numbers[1]);
console.log('Phần tử thứ ba: ' + numbers[2]);
console.log('Phần tử thứ tư: ' + numbers[3]);
console.log('Phần tử thứ năm: ' + numbers[4]);

console.log('Mảng ban đầu: ' + numbers);

numbers.push(6);
console.log('Mảng sau khi thêm phần tử 6: ' + numbers);

numbers.pop();
console.log('Mảng sau khi xóa phần tử cuối cùng: ' + numbers);

numbers.splice(2, 1);
console.log('Mảng sau khi xóa phần tử thứ 3: ' + numbers);  

const handleClick = () => {
    console.log('Button clicked!');
}


// DOM
console.log('----------------------DOM----------------------');
var a = document.getElementById('h3id').innerText;
console.log(a);

var b = document.getElementsByClassName('h5id')[0].innerText;
console.log(b);
