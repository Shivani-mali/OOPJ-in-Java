import java.util.*;
public class arithmatic {
int add(int a, int b)
{
return a+b;
}
int sub(int a, int b)
{
return a-b;
}
int multi(int a, int b)
{
return a*b;
}
public static void main(String args[])
{
arithmatic arith = new arithmatic();
Scanner sc = new Scanner(System.in);
System.out.println("enter values");
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println("Addition = "+arith.add( num1, num2)); 
System.out.println("Substraction = "+arith.sub (num1, num2));
System.out.println("Multiplication =" +arith.multi (num1, num2));
}
}
