import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        int l,b,area;
        Scanner rectScanner = new Scanner(System.in);
        System.out.println("Emter the value of l and b:");
        l =rectScanner.nextInt();
        b = rectScanner.nextInt();
        area = l*b;
        System.out.println("Area of rectangle is:"+area);
        

    }
}
