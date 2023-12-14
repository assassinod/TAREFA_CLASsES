import java.util.Scanner;

public class Placa {
    private String letra;
    private int numero;

    // Construtor da classe Placa
    public Placa(String letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }

    // Getter para letra
    public String getLetra() {
        return letra;
    }

    // Setter para letra
    public void setLetra(String novaLetra) {
        this.letra = novaLetra;
    }

    // Getter para numero
    public int getNumero() {
        return numero;
    }

    // Setter para numero
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    // Método para obter a representação da placa
    public String obterPlaca() {
        return letra + "-" + numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a entrada para a placa
        System.out.print("Por favor, escreva a letra da placa: ");
        String letraPlaca = scanner.nextLine();

        System.out.print("Agora, escreva o número da placa: ");
        int numeroPlaca = scanner.nextInt();

        // Criar uma instância da classe Placa
        Placa placa = new Placa(letraPlaca, numeroPlaca);

        // Imprimir a representação da placa
        System.out.println("Você escreveu: " + placa.obterPlaca());
    }
}
