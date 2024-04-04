//ch-linear search
//question ---1

//even no digit
const arry=[134,334,555,33,44,55,5,4]

let count=0
function findEvenDigit(){
  for(let i=0;i<arry.length;i++){
     if(even(arry[i])){
      count++
     }
  }
  return count
}

function even(n){

 // if n is -V
 if(n<0){
    n=n*-1
 }
 if(n==0){
  return 
 }
  /*
  let count=0
while (n>0) {
  
  count++; 
    n = Math.floor( n/10) ;
  console.log(n,"m")
 
}
if(count%2==0){
  return count
}
console.log(count)*/
//2nd way
let count = Math.floor(Math.log10(n)+1)
//console.log(count)
if(count%2==0){
  return count
}


}
console.log(findEvenDigit())







//search on 2d-array
/*
const arry=[[2,3,44],[33,4,1,22,33],[22,44,555,443]]
const target=443
function twoD(){
  for(let i=0;i<arry.length;i++){
    for(let j=0;j<arry[i].length;j++){
      if(arry[i][j]===target)
      return j
    }
  }
}

console.log(twoD())
const ans=twoD()
console.log(ans)



*/














/////max no in array
/*
let arry=[1,99,2,3,4,5]
function max(){


let max=arry[0]
for(let i=0;i<arry.length;i++){
  if(arry[i]>max){
    max=arry[i]
    //final =max
    console.log(max)
  }

}
return max
}

console.log(max())
let ans=max()
console.log(ans)

/*
let string='aman'
let target='p'
function stringCharfind(){
    for(let i=0;i<string.length;i++){
      if(target=== string[i]){
        console.log(i)
        return i
      }
    }
    return "not found"
}

const ans=stringCharfind()
console.log(ans)

*/