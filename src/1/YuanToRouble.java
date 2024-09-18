import java.util.Scanner;

public class YuanToRouble {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan, digit, second_digit;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Yuan: ");
        yuan = input.nextInt();
        digit = yuan % 10;
        second_digit = yuan % 100;

        roubles = ROUBLES_PER_YUAN * yuan;

        System.out.println("Roubles: " + roubles);

        if((second_digit - digit) == 10 || digit == 0 || digit >= 5) {
            System.out.print(yuan + " китайских юаней");
        } else if(digit == 2 || digit == 3 || digit == 4) {
            System.out.print(yuan + " китайских юаня");
        } else {
            System.out.print(yuan + " китайский юань");
        }
    }
}