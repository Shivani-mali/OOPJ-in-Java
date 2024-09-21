public class test {
public void stringoperations()
{
String greeting ="Hello, world";
System.out.println("Length of string:" +greeting.length());
System.out.println("Uppercase: "+greeting.toUpperCase());
System.out.println("String Contains' World:"+greeting.contains("World"));
System.out.println("Replaced String:"+greeting.replace("World", "java"));
}
public void mathoperations()
{
double num1, num2;
num1 = 25.6;
num2 = 4.9;
System.out.println("Power:"+Math.pow(num1, num2));
System.out.println("Squreroot:"+Math.sqrt(num1));
System.out.println("Maximun number: "+Math.max(num1, num2));
System.out.println("Minimum number:"+Math.min(num1,num2));
}
public static void main(String args[])
{
test t = new test();
t.stringoperations();
t.mathoperations();
}    
}
