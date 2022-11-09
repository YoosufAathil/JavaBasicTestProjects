import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = input.nextInt();
        System.out.println("Enetred Number: "+number);

        System.out.println("Enter a float Number: ");
        float myFloat = input.nextFloat();
        System.out.println("entered float number: "+myFloat);

        System.out.println("Enetr a text");
        String mytext = input.next();
        System.out.println("Entered text :" + mytext);

    }

    }

