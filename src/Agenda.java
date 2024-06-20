import java.util.ArrayList;
import java.util.Scanner;


 class TipoAgenda {
     private String nomeCompromisso;
     private String dataCompromisso;

     TipoAgenda(String nomeCompromisso ,String dataCompromisso ){
         this.nomeCompromisso = nomeCompromisso;
         this.dataCompromisso = dataCompromisso;
     }

     public String getNomeCompromisso(){
         return nomeCompromisso;
     }
     public String getDataCompromisso(){
         return dataCompromisso;
     }
 }

public class Agenda {

     public ArrayList<TipoAgenda> lista = new ArrayList<>();


     Agenda(){
         lista.add(new TipoAgenda("Prova de Programação Orientada a Objetos","27/06/2024"));
     }

     public void mostrarLista (){
         Scanner scanner = new Scanner(System.in);

         if(lista.isEmpty()){
             System.out.println("Lista está vazia");
             System.out.println("Deseja adicionar um compromisso na sua agenda?");
             String respota = scanner.nextLine();

             if (respota.toLowerCase().trim().equals("sim")){
                 System.out.println("Informe o Nome do evento");
                 String nomeEvento = scanner.nextLine();
                 System.out.println("Informe a data que deseja agendar, exemplo: 01/01/2001");
                 String dataEvento = scanner.nextLine();

                 adicionar(nomeEvento, dataEvento);
             }else {
                 System.out.println("Resposta invalida!");

             }

         }else {
             System.out.println("Eventos na agenda");
             for(TipoAgenda compromisso : lista){
                 System.out.println(compromisso.getNomeCompromisso() +" -- "+ "Data: "+ compromisso.getDataCompromisso());
             }
         }
     }

     public void adicionar(String nomeCompromisso, String dataCompromisso){

         lista.add(new TipoAgenda(nomeCompromisso, dataCompromisso));
         System.out.println("Compromisso registrado!");

     }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda minhaAgenda = new Agenda();


        System.out.println("Seja bem vindo, deseja ver a lista?");
        String resposta1 = scanner.nextLine();

        if(resposta1.toLowerCase().trim().equals("sim")){
            minhaAgenda.mostrarLista();
        }else {
            System.out.println("Resposta invalida!");
        }
        scanner.close();
    }



}



