/* This program illustrate the differences 
between int and double
Call this file Example3.java
 */
class Example3{
public static void main(String args[])
{
int v ;          //this  declares  an int variable 
double x;  //this  declares  a floating-point variable
v=10;      //assigns  v the value of 10
v = 10.0  // assigns x value 10.0
System.out.println("Original value of v : "+""+v);
System.out.println("Original value of v : "+""+x);
System.out.println();  //print a blank line

//now divide both by 4
 v = v/4;
x =x/4;
System.out.println("v after division :"+ +v);
System.out.println("x after division :"+ +x); 
}
}