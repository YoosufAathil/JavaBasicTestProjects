import java.util.Scanner;

public class Day2ex01 {
    public static void main(String[] args) {
       //  System.out.println("Hello");
       //  System.out.println("Aathil");
        int total;

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1=input.nextInt();

        System.out.println("Enter the second number: ");
        int num2=input.nextInt();

        total=num1+num2;

        System.out.println("Total :"+total);
    }
}
