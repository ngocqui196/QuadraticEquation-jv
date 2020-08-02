import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
         double a = sc.nextDouble();
         System.out.println("Nhập số b: ");
         double b = sc.nextDouble();
         System.out.println("Nhập số c: ");
         double c = sc.nextDouble();
         QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
         if (quadraticEquation.getDiscriminant() > 0.0) {
             System.out.println("Phương trình có nghiệm là: " + quadraticEquation.getRoot1() + "và");
             System.out.println(quadraticEquation.getRoot2());
         }else if (quadraticEquation.getDiscriminant() == 0.0) {
             System.out.println("Phương trình có nghiệm kép: " + (-quadraticEquation.getB()/(2*quadraticEquation.getA())));
         }
         else {
             System.out.println("Phuiowng trình vô nghiệm");
         }

    }
}
