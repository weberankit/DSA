console.log("joker")

function main(){
 let array=[-44,-4,-2,-1,1,2,3,4,5,6,7,8,9,10,11,44,45,46]
 let target=  11
 const getIndex =Sortedbinary(array,target)   
 console.log(getIndex)
}

function Sortedbinary(arr,tar){
    let start=0
    let end=arr.length-1
    while(start<=end){ //0 10  6<10
        console.log(start,end,"start,end")
  console.log((start+end)/2)
    let middle=Math.floor( (start+end)/2) //index-5--13  8
   console.log(middle,"middle")
    if(tar>arr[middle]){///44 > 13 
        start=middle+1 //6
    }else if(tar<arr[middle]){
        end=middle-1
    }else{
        return middle //8
    }


    }
    return "element not found"

}
main()