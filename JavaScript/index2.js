// Data types in java
// 1. number
var nub1 = 45;
var nub2 = 10;
var nub3 = 45;
// console.log(nub1,nub2,nub3);
// console.log(nub1+nub2+nub3);


// 2. String
var str1 = "Hello javascript";
var str2 = "i am sukhu";
// console.log(str1, str2);

// 3. Objects
var mark = {
    ram: 20,
    sham: 30,
    mohan: 50
}
// console.log(marks);

// 4 undefined

// 5 null

// 6 Symbol

// Assignment opertaor
var a = 10;
var b = 10;
// console.log(a += b);
// console.log(a -= b);
// console.log(a *= b);
// console.log(a /= b);
// console.log(a == b);


var arr = [10, 20, 30, 40, 50];
arr[1] = 60;
arr[4] = 'Sukhu';


// function

function isEven(nub) {
    if (nub % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

var c = isEven(17);
// console.log(c)


// switch statement

/* var day = 6;

switch (day){
    case 1:
    console.log("monday");
    break;
    case 2:
    console.log("tuesday");
    break;
    case 3:
    console.log("wednesday");
    break;
    case 4:
    console.log("thursday");
    break;
    case 5:
    console.log("friday");
    break;
    case 6:
    console.log("saturday");
    break;
    case 7:
    console.log("sunday");
    break;
    default :
    console.log("invalid output");
     break;

}
   */


// if else ladder

/* var marks1 = 55;

if(marks1 > 95){
    console.log("Grade A");
}else
    if(marks1 > 85){
        console.log("Grade B");
    }
else
    if(marks1 > 65){
        console.log("Grade C");
    }
else
    if(marks1 >= 33){
        console.log("Grade E");
    }
    else
        {
        console.log("FAIL LOOSER");
    }
*/

//with function function 
var arr2 = [1, 2, 3, 4, 5];

arr2.forEach(function (element) {
    //console.log(element);
})


// with for loop

for (var i = 0; i < arr2.length; i++) {
    // console.log(arr2[i]);
}

// with while loop

let j = 0;
while (j < arr2.length) {
   // console.log(arr2[j]);
    j++;

}

//Methods in array

     let myarr = ['sukhu', 'fan' , 34 , 'mohan', 8 ];
    //  console.log(myarr.length);
    //  myarr.pop();     // delete at end
    //  myarr.push('simran');    // add at end
    //  myarr.shift();    //delete from start
    //  myarr.unshift('Harry');   // add at start

    //  console.log(myarr);

    //methods in string

    let str = "Hello my name is sukhpreet";
    // console.log(str.length);
    // console.log(str.slice(0,3));
    // let d = str.replace("Hello", "Sir");
    // console.log(d);


    let mydate = new Date();
    // console.log(mydate);