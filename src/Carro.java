public class Carro {
    private int consumo;
    private int qdtTanque;


    public Carro(int consumo){
        this.consumo = consumo;
        this.qdtTanque = 0;
    }

    public void adicionarGasolina(int quantidade){
        this.qdtTanque += quantidade;
    }

    public int obterGasolina(){
        return qdtTanque;
    }

    public void andar(int km){
        int calculo = obterGasolina() - (km / this.consumo);
        adicionarGasolina(calculo);

    }

    public static void main(String[] args) {

        Carro meuCarro = new Carro(10);
        meuCarro.adicionarGasolina(30);
        System.out.println(meuCarro.obterGasolina() + " Litros no tanque");
        meuCarro.andar(200);
        System.out.println(meuCarro.obterGasolina());

    }


}
