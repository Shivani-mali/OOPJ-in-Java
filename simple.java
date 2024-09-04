import java.util.*;
public class simple {
    
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int multi(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        simple o = new simple(); // Corrected the typo here
        Scanner sc = new Scanner(System.in); // Removed the duplicate Scanner object
        
        System.out.println("Enter a:");
        int n1 = sc.nextInt();
        
        System.out.println("Enter b:");
        int n2 = sc.nextInt();
        
        System.out.println("Addition is: " + o.add(n1, n2));
        System.out.println("Subtraction is: " + o.sub(n1, n2)); // Corrected the typo here
        System.out.println("Multiplication is: " + o.multi(n1, n2));
    }
}


