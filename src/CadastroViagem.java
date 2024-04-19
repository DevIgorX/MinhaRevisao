//A Classe Viagem não possui um modificador de acesso, tornando-a package-private por padrão
//portanto, ela só pode ser acessada por outras classes dentro do mesmo pacote.

//já a classe Cadastro é public, o que significa que ela pode ser acessada por qualquer classe, independentemente do pacote ao qual pertence.

//Em Java, quando uma classe é pública, o nome do arquivo Java que contém essa classe deve corresponder ao nome da classe pública.

import java.util.Scanner;
 class Viagem {

    private String nomeviajante;
    private String destino;

    Viagem(String nomeviajante, String destino){
        this.nomeviajante = nomeviajante;
        this.destino = destino;
    }

    public void detalhesDaViagem(){
        System.out.println("Destalhes da viagem");
        System.out.println("Nome do viajante: " +nomeviajante);
        System.out.println("Destino escolhido: " +destino);
    }


}

public class CadastroViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja Bem-vindo Sistema de Viagem, por favor! digite o seu nome");
        String nomeviajante = scanner.nextLine();

        System.out.println("Olha "+nomeviajante + " Temos esses destinos");
        System.out.println("1. Estados Unidos");
        System.out.println("2. Europa");
        System.out.println("3. toquio");
        System.out.println("4. Paris");
        System.out.println("5. Brasil");


        System.out.println("Selecione o destino que deseja");

        int opcaoescolhida = scanner.nextInt();

        String destino;

        switch (opcaoescolhida) {
            case 1 :
                destino = "Estados Unidos";
                break;
            case 2 :
                destino = "Europa";
                break;
            case 3 :
                destino = "Toquio";
                break;
            case 4 :
                destino = "Paris";
                break;
            case 5 :
                destino = "Brasil";
                break;
            default:
                System.out.println("Opção invalida, tente novamente!");
                destino = "Destino Não identificado!";
        }

        Viagem viagem = new Viagem(nomeviajante, destino);

        viagem.detalhesDaViagem();

        scanner.close();


    }
}







