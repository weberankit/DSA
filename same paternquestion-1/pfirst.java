import java.util.Scanner;

public class pfirst{
     public static void main(String[] args){

    System.out.println("ff");

      Scanner input=new Scanner(System.in);
       


///print even or odd no
/* 
     int enter=input.nextInt();
     
     if(enter%2==0 && enter>0){
          System.out.println("this is even no");
     }else if(enter>0){
          System.out.print("it is odd");
     }

*/

//two largest no
/* 
int num1=input.nextInt();
int num2=input.nextInt();
int rem;
if(num1>num2){
rem=num1;
}else{
     rem=num2;
}
System.out.println(rem);
*/
//fibnnoaci

/* 
int a=0;
int b=1;

int count=0;
int in=input.nextInt();
System.out.print(a +""+ b);
while(count<in){
   int rem=b;
   b=a+b;
   a=rem;
   count++;
    System.out.print(b);
}

*/
///Palindrome or not.
/*
String str=input.next();
char store;
String check="";
for(int i=str.length()-1;i>=0;i--){
  store=str.charAt(i);
  check+=store;


}
System.out.println(check);
if(check.equals(str)){
System.out.println("palidreme");
}else{
     System.out.println("nothing");
}


 */



//Armstrong number b/w two no
/* 
int num1=input.nextInt();
int num2=input.nextInt();
int rem;
while(num1<num2){
     int temp=num1;//do not efect outer loop
     rem=0;//reset to be 0
  while(temp>0){
     int first=temp % 10;
     first=first*first*first;
      rem =rem +first;
      temp=temp/10;
      
  } 
  if(rem==num1){System.out.println("this is armstrong no"+rem);}
 num1=num1+1;

}*/

String str=input.next();
char store;
String check="";
for(int i=str.length()-1;i>=0;i--){
  store=str.charAt(i);
  check+=store;


}
System.out.println(check);

     }



}
