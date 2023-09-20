
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Arrays;


public class array{

public static void main(String[] args){
 Scanner input=new Scanner(System.in);


 /* 
 ///this printing array
 //this is not js where you can direcctly acces array yoju hav to use for loop or framwork package i think so
int [] arr1=new int [5];
arr1[0]=23;
arr1[1]=44;
arr1[2]=55;
arr1[3]=99;
arr1[4]=99;

System.out.println(arr1[0]);
System.out.print("nfsd");


for(int i=0;i<arr1.length;i++){
    arr1[i]=input.nextInt();
}
//System.out.println(arr1);

for(int i=0; i<arr1.length;i++){
    System.out.println(arr1[i]);
    System.out.print("dine");
}
*/

/* 
//tostring
String [] arr=new String[5];
arr[0]="bahi";
arr[1]="bahe";
arr[2]="bahee";
arr[3]="bahi";
arr[4]="bahi";
System.out.println(arr[0]);

for(int i=0;i<arr.length;i++){
    arr[i]=input.next();
}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
System.out.println(Arrays.toString(arr));







String[] str = new String[4];
for (int i = 0; i < str.length; i++) {
    str[i] = input.next();
}

System.out.println(Arrays.toString(str));

// modify
str[1] = "kunal";

System.out.println(Arrays.toString(str));




int [] aman=new int[5];
aman[0]=9;
System.out.print(aman[0]);

*/

// multidimensional array 


//int [][] multi=new int [3][];


/* 
int[][] multi = {
    {4, 5, 6},
    {6, 7, 6},
    {8, 76, 5}
};

for (int i = 0; i < multi.length; i++) {
    System.out.println(Arrays.toString(multi[i]));
}
*/

/* 

ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            int val = input.nextInt();
            list.add(val);
     
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

       System.out.println(list);



int [][] arr = new int[3][3];
System.out.println(arr);

for(int row =0 ; row < arr.length ; row++){
    for(int col= 0 ;col<arr[row].length;col++){
       arr[row][col] = input.nextInt();
    }
}

for(int row =0 ; row < arr.length ; row++){
    for(int col= 0 ;col<arr[row].length;col++){
       System.out.print(arr[row][col] + " ");
    }
    System.out.println();
}
*/

 /* 
ArrayList<ArrayList<Integer>> list =new ArrayList<>();
for(int i=0;i<3;i++){
    list.add(new ArrayList<>());
}


  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        list.get(i).add(input.nextInt());
    }
}

System.out.println(list);

*/
////question begin---

//swap
 
//int [] array={1,2,3,44,56,55};
int [] array ={8,7777,77,777};
/*swap(array , 0 ,4);

*/
reverse(array);
//System.out.println(reverse(array));
System.out.println(Arrays.toString(array));
//System.out.println(Arrays.toString(array));
//int [] array={25,30000,4,550000,444}; 
//maxno(array);
//System.out.println(maxRangeno(array, 1, 3));
//int [] array={2,44000,66,1,333,444,554,22344434};
//System.out.println(secondmax(array));
String [] namme={"dwdq","ankit","singh","kingh"};
reverseString(namme);
System.out.println(Arrays.toString(namme));
for(int i=0;i<namme.length;i++){
    System.out.print(namme[i]);
}

}






















static void maxno(int [] array ){
   int max=array[0];
for(int i=0;i<array.length;i++){
    if(max<array[i]){
        max=array[i];
    }
    
    

}
  System.out.println(max);

}



///find btween ranges max no
static int maxRangeno(int[] array , int start , int end){
int rem = array[start];
if(start>end){

};

for(int i=start;i<=end;i++){
  if(rem<array[i]){
    rem=array[i];
  }


}

//System.out.println(rem);
return rem;
}





static  int secondmax(int[] array){
int max=array[0];
int prevmax=0;
for(int i=0;i<array.length;i++){
    if(max<array[i]){
      prevmax=max;
        max=array[i];
    }
}

return  prevmax;

}


static void swap(int[] array , int index1 , int index2){
    
   int rem = array[index1];
   array[index1] = array[index2];
   array[index2] = rem;
   System.out.print(array[index1] +"" + array[index2]);


}


static int[] reverse(int[] array ){
 
int start =0;
int end = array.length-1;
while(start<end){
    swap(array , start ,end);
    start++;
    end--;
}


//System.out.print(array);
return array;
}

static void stringswap(String[] array,int ind1, int ind2){
  
String rem = array[ind2];
array[ind2]=array[ind1];
array[ind1]=rem;

}

static String[]reverseString(String[] array){

int strt=0;
int end=array.length-1;
while(strt<end){
    stringswap(array, strt, end);
    strt++;
    end--;
}
return array;
}






}





