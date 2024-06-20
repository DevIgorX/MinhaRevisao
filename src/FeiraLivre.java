import java.util.ArrayList;
import java.util.Scanner;


class Fruta {

    private String nomeFruta;

    Fruta(String nomeFruta){
        this.nomeFruta = nomeFruta;
    }

    public String getFruta(){

        return nomeFruta;
    }
}


public class FeiraLivre {

    private ArrayList<Fruta> frutas = new ArrayList<>();

    FeiraLivre(){
        frutas.add(new Fruta("Manga"));
        frutas.add(new Fruta("Laranja"));
        frutas.add(new Fruta("Maçã"));
        frutas.add(new Fruta("Uva"));

    }

    public void mostrarFrutas(){
        System.out.println("Lista de Frutas disponével");
        for (int i = 0; i < frutas.size(); i++){
            System.out.println((i + 1)+ ". " +frutas.get(i).getFruta());
        }
    }


    public void escolherFruta( String nomeSolicitante) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá "+nomeSolicitante + " Selecione uma Fruta que deseja");

         int opcaoescolhida = scanner.nextInt();

         if(opcaoescolhida >= 1 && opcaoescolhida <= frutas.size()){
             Fruta fruta = frutas.get(opcaoescolhida - 1);

             System.out.println("nome do Solicitante: " +nomeSolicitante);
             System.out.println("Fruta escolhida: " +fruta.getFruta());
         }else {
             System.out.println("Opção invalida, tente novamente");

         }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo, por favor, digite o seu nome");
        String nomeSolicitante = scanner.nextLine();

        FeiraLivre minhaFeirinha = new FeiraLivre();
        minhaFeirinha.mostrarFrutas();
        minhaFeirinha.escolherFruta(nomeSolicitante);
    }


}
