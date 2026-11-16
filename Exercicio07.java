import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome completo do aluno " + (i + 1) + ":");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);
    }

    public static String gerarIniciais(String nomeCompleto) {
        String[] palavras = nomeCompleto.trim().split("\\s+");

        String iniciais = "";

        for (int i = 0; i < palavras.length; i++) {
            iniciais += palavras[i].charAt(0);

            if (i < palavras.length - 1) {
                iniciais += ".";
            }
        }

        return iniciais.toUpperCase();
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            String iniciais = gerarIniciais(nomes[i]);

            System.out.println(
                    (i + 1) + ". " + nomes[i] + " (" + iniciais + ")"
            );
        }
    }
}