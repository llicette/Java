import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100;
        double weight, height, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Weight: ");
        weight = input.nextDouble();

        System.out.print("Height: ");
        height = input.nextDouble();

        bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

        System.out.println("BMI " + bmi);
        if(bmi < 18.5) {
            System.out.println("-");
        } else if(bmi < 25) {
            System.out.println("=");
        } else if(bmi < 30) {
            System.out.println("+");
        } else {
            System.out.println("++");
        }
    }
}