import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class imprimirFruta{

    private String nomeSolicitante;
    private String nomeFruta;

    imprimirFruta(String nomeSolicitante,String nomeFruta ){
        this.nomeSolicitante = nomeSolicitante;
        this.nomeFruta = nomeFruta;
    }

    public void fechamento(){
        System.out.println("fechamento de fatura");
        System.out.println("nome do solicitante: " +nomeSolicitante);
        System.out.println("Fruta selecionada: " +nomeFruta);
    }

}


public class FeiraLivre2 {

    private ArrayList<String> frutas = new ArrayList<>(Arrays.asList("1. Maçã", "2. Banana", "3. Manga", "4. Uva"));

    public void mostrarLista(){
        for (String fruta: frutas){
            System.out.println(fruta);
        }
    }


}
