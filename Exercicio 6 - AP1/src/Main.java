import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor A");
        int a = sc.nextInt();
        System.out.println("Valor B");
        int b = sc.nextInt();
        System.out.println("Valor C");
        int c = sc.nextInt();

        int delta = (int) Math.pow(b, 2) - (4 * a * c);


        System.out.println(delta);
        sc.close();
    }
}