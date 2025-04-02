import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PESO");
        double peso = sc.nextDouble();
        System.out.println("altura em metros");
        double altura = sc.nextDouble();

        double conta = peso/ Math.pow(altura, 2);

        System.out.printf("%.2f IMC", conta);



        sc.close();
    }
}