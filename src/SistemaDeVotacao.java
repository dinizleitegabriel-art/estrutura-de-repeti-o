import java.util.Scanner;

public class SistemaDeVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto = 1;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int invalido = 0;
        double total;
        double pc1;
        double pc2;
        double pc3;
        double pc4;

        while (voto != 0) {
            System.out.println(
                    "[1] = Candidato 1\n" +
                            "[2] = Candidato 2\n" +
                            "[3] = Cadidato 3\n" +
                            "[0] = Finalizar votos");
            voto = sc.nextInt();

            if (voto == 0) {
                break;
            }
            if (voto == 1) {
                candidato1++;
            }
            else if (voto == 2) {
                candidato2++;
            }
            else if (voto == 3) {
                candidato3++;
            }
            else if (voto != 0){
                invalido++;
            }
        }
        System.out.println("Candidato 1 = " + candidato1);
        System.out.println("Candidato 2 = " + candidato2);
        System.out.println("Candidato 3 = " + candidato3);
        System.out.println("Invalido = " + invalido);

        total = candidato1 + candidato2 + candidato3 + invalido;

        pc1 = candidato1/total * 100;
        pc2 = candidato2/total * 100;
        pc3 = candidato3/total * 100;
        pc4 = invalido/total * 100;

        System.out.println();
        System.out.println("Total de votos = " + total);
        System.out.println("Porcentagem do candidato 1: " + pc1);
        System.out.println("Porcentagem do candidato 2: " + pc2);
        System.out.println("Porcentagem do candidato 3: " + pc3);
        System.out.println("Porcentage de votos inválidos: " + pc4);

        if (candidato1>candidato2 && candidato1 > candidato3) {
            System.out.println("Vencedor -----> Candidato 1");
        }
        else if (candidato2>candidato1 && candidato2>candidato3) {
            System.out.println("Vencedor -----> Candidato 2");
        }
        else {
            System.out.println("Vencedor -----> Candidato 3");
        }
    }

}