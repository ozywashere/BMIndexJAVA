import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello From JAVA");

        Scanner input= new Scanner(System.in);
        double height, weight, bmi;

        System.out.print("Enter your height in inches: ");
        height = input.nextDouble();

        System.out.print("Enter your weight in pounds: ");
        weight = input.nextDouble();

        bmi = (weight ) / (height * height);
        System.out.printf("Your BMI is : "+ bmi);
        if(bmi < 18.5)
            System.out.printf("\nYou are underweight");
        else if(bmi < 25)
            System.out.printf("\nYou are normal");
        else if(bmi < 30)
            System.out.printf("\nYou are overweight");
        else
            System.out.printf("\nYou are obese");


    }
}