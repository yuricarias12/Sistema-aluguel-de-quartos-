import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Aluguel [] vetor = new Aluguel[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = ler.nextInt();

        for (int cont = 0; cont < n; cont++) {
            System.out.println();
            System.out.printf("Aluguel #%d: \n", cont + 1);
            System.out.print("Nome: ");
            ler.nextLine();
            String nome = ler.nextLine();
            System.out.print("Email: ");
            String email = ler.next();
            System.out.print("Número do quarto: ");
            int numeroQuarto = ler.nextInt();

            vetor[numeroQuarto] = new Aluguel(nome, email);

        }

        System.out.println();
        System.out.println("Quartos Ocupados: ");
        for (int cont = 0; cont < 10; cont++) {
            if (vetor[cont] != null) {
                System.out.println(cont + ": " + vetor[cont]);
            }
        }



        ler.close();
    }
}
