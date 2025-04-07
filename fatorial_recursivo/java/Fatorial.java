import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA DE FATORIAL (Recursivo)");

        int num = MyIO.readInt("Digite o numero que deseja calcular: ");

        int res = fat(num);

        System.out.printf("%d\n", res);
    }

    static int fat(int n) {
        int resp;
        if(n == 1) {
            resp = 1;
            System.out.printf("%d = ", n);
        } else {
            System.out.printf("%d * ", n);
            resp = n * fat(n-1);
        }
        return resp;
    }
}