package LW_01;
import java.util.Scanner;

    public class Q5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the radius of the outer circle:");
            double ro = scanner.nextDouble();

            System.out.println("Enter the radius of the inner circle:");
            double ri = scanner.nextDouble();

            circle outerCircle = new circle(ro);
            circle innerCircle = new circle(ri);

            double outerCircleArea = outerCircle.computeArea();
            double innerCircleArea = innerCircle.computeArea();
            double shadeArea = outerCircleArea - innerCircleArea;

            System.out.println("Shaded Area:" + shadeArea);
        }
    }

