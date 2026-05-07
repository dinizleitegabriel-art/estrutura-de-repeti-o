import java.util.Scanner;

public class ExercicioRLaço02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, contador = 0;
        int result, resposta=1;

        while (resposta == 1) {
            System.out.println("Digite um valor: ");
            valor = sc.nextInt();

            contador = 0;
            while (contador <= 10) {
                result = valor * contador;
                System.out.println(valor + "x" + contador + "=" + result);
                contador++;
            }
            System.out.println("Digite 1 para nova tabuabda ou 0 para finalizar");
            resposta = sc.nextInt();
        }
    }
}