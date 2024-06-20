public class BombaCombustivel {

    private String tipoCombustivel;
    private int valorLitro;
    private int quantidadeCombustivel;


    public BombaCombustivel (String tipoCombustivel,int valorLitro ){
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = 0;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public  int getQuantidadeCombustivel(){
        return quantidadeCombustivel;
    }
    public int getValorLitro(){
        return valorLitro;
    }

    public void abastecerPorValor(int valor){
        this.quantidadeCombustivel += valor / this.valorLitro;

        System.out.println("A quantidade de litros que foi colocado no veículo é de: " +getQuantidadeCombustivel());
    }

    public void abastecerPorLitro( int litro){
        int valor = this.valorLitro * litro;
        System.out.println("Valor a pagar: "+this.getValorLitro());
    }

    public void alterarValor( int valor){
        this.valorLitro = valor;
        System.out.println("Valor do litro Alterado para: " +this.getValorLitro());
    }
    public void alterarCombustivel( String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        System.out.println("Tipo do combustivel alterado para: " + this.getTipoCombustivel());

    }

    public void alterarQuantidadeCombustivel (int novaQuantidade){
        this.quantidadeCombustivel = novaQuantidade;
        System.out.println("quantidade alterada para: " +this.getQuantidadeCombustivel());
    }


    public static void main(String[] args) {
        BombaCombustivel meuVeiculo = new BombaCombustivel("Gasolina", 5);

        meuVeiculo.abastecerPorValor(20);
        meuVeiculo.abastecerPorLitro(4);
        meuVeiculo.alterarValor(7);
        meuVeiculo.alterarCombustivel("Diesel");
        meuVeiculo.alterarQuantidadeCombustivel(2);



    }



}
