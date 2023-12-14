public class Placa {

//Placa pois se escreve algo nela
    //public = palavra Reservada
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        //Aqui  usuario escrevera algo que sera escrito na pçaca
        System.out.print("Por favor, escreva algo Para ser colocado na placa: ");

        //Aqui irar ler oque o usuario dogitou e salvar em uma variavel
        String entradaUsuario = scanner.nextLine();
        //Imprimi oque o usuario escreveu
        System.out.println("Você escreveu: " + entradaUsuario);

    }
