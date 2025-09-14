package LW_01;
import java.util.Scanner;

    public class Q1 {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter an odd length word:");
            String word =scanner.next();
            int x=word.length();
            int y=(x+1)/2;
            System.out.println(word.substring(y-1,y));
        }
    }


