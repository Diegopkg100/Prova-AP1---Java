import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor da base");
        int base = sc.nextInt();
        System.out.println("Digete valor da altura");
        int altura = sc.nextInt();

        int conta = (base * altura) / 2;

        System.out.println(conta);



        sc.close();
    }
}