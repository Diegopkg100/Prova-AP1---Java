//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE A TEMPERATURA EM FAHRENHEIT");

        double temperaturaF = sc.nextDouble();

        double conta = (temperaturaF - 32) / 1.8;

        System.out.printf("%.2f CELSIUS", conta);




        sc.close();
    }
}