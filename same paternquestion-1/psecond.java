import java.util.Scanner;

public class psecond{

public static void main(String [] args){

    Scanner input=new Scanner(System.in);

    //hcf b/w two no
    /* 
int b =input.nextInt();
int a=input.nextInt();
if(a==b){System.out.println("plz enter correct no both are same");}
if(a>b){
    int rem =b;
    b=a;
    a=rem;
}
System.out.println(a +"" +b);
 
    
    while(b%a>0){
       int c;
       c =   b % a ;
       b=a;
       a=c;
    }
    System.out.println(a);
//if(b>a){}
*/


///factrial
/*
int stroe=1;
int n=input.nextInt();
if(n==0 && n<0){System.out.println("wrong input"); return;}
for(int i=n;i>0;i--){
    stroe=stroe*i;
}
System.out.println(stroe);
 */

//sum of  n number
/*
int n=input.nextInt();
int store=n*(n+1)/2;
System.out.println(store);
 */
 //paindrome number
 /* 
 int n=input.nextInt();
 int original = n;

 int rem=0; 
 while(n>0){
int store=n%10;
rem=rem*10 +store;
n=n/10;

 }
 if(rem==original){
    System.out.println("both are same i.e palidrome");
 }
System.out.println(rem);
*/

//lcm of two number
/* 
int a=input.nextInt();
int b=input.nextInt();
int rem=1;
System.out.println(Math.max(a,b));
for(int i=1;i<=Math.min(a,b);i++){
    if(a%i==0 && b%i==0){
         rem=i;
    }
   
}
System.out.println(rem);
int lcm =(a*b/rem);

System.out.println(lcm);
*/

//vowel or constant
/* 
char letter=input.next().trim().charAt(0);

if(letter == 'a'  || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
System.out.println("it is vowel");
}
*/
//perfect number


//This is because factors greater than num/2 cannot exist
/* 
int num= input.nextInt();
int rem=0;
for(int i =1 ; i<=num/2;i++){
    if(num%i ==0){
        rem= rem+ i;
     
    }
}
System.out.println(rem);
if(rem == num){System.out.println("perfect");}

*/

//leap year
//The year is multiple of 400.
//The year is a multiple of 4 and not a multiple of 100.
/* 
int year=input.nextInt();
if((year%4==0 || year%400==0)  && (year % 100 != 0)){
    System.out.println("this is leap");
}
*/


//sum of  digit of number
/* 
int inp=input.nextInt();
int rem =0;
while(inp>0){
   int p=inp%10;
    rem=rem + p;
    inp=inp/10;
    


}
System.out.println(rem);

*/

//Kunal is allowed to go out with his friends only on the even days of a
// given month. Write a program to count the number of days he can go out in the month of August.
/* 
int count=0;
//int aug=input.nextInt();
for(int i=1;i<=30;i++){
    if(i%2==0){
        count=count+1;
    }
}
System.out.println(count);

*/

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) \\
//entered by the user. The list terminates when the user enters a zero.//d
/* 
int num1=1;
int eve=0;
int odd=0;
int neg=0;
while(num1>0 || num1<0){
  num1=input.nextInt();
    if(num1==0){
    break;
   }
   if(num1>0){

  if(num1%2==0){
    eve=eve+num1;
  }else{
    odd=odd+num1;
  }
              }
 else{
    neg=neg+num1;
  }

}

System.out.println("eve:"+eve + "odd:"+odd + "neg:"+neg);

*/


//22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)//done









}



}
