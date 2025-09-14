package LW_01;
import java.util.Scanner;



    public class Q3 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter length in centi meters:");
            int cm =scanner.nextInt();
            double in=cm/2.54;
            double ft=(int)in/12;
            in=(int)in%12;

            System.out.println("Length is feet:"+ft +" " +"inches:"+in);


        }
    }

