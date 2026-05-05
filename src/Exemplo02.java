import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, contador;

        System.out.println("Início do intervalo: ");
        inicio = sc.nextInt();
        System.out.println("Fim do intervalo: ");
        fim = sc.nextInt();
        contador = inicio;

        while (contador <= fim) {
            System.out.println(contador + "  ");
            contador = contador + 1;

        }

    }
}
