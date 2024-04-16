public class Viagem {

    public String nomeViajante;

    Viagem(String nomeViajante){
        this.nomeViajante = nomeViajante;
    }

    public String  opcoesDestino(int opcao){

        String destino = "";
        switch (opcao) {
            case 1 :
                destino = "Rio de Janeiro";
                break;
            case 2 :
                destino = "Goiânia";
              break;
            case 3 :
                destino = "São Paulo";
                break;
            case 4 :
                destino = "Bahia";
                break;
            default:
                destino = "Destino desconhecido";
                break;
        };
        return destino;
    }

    public String imprimirSelecionada(int idRegiao){

       return (idRegiao >= 1 && idRegiao <=4) ? "Destino escolhido: " +opcoesDestino(idRegiao) : "Destino não encontrado" ;
    }

    public static void main(String[] args) {

        Viagem eu = new Viagem("Tauam Igor");

        System.out.println(eu.imprimirSelecionada(3));

    }

}
