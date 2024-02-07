public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario = 50;

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesonto(double percetualDesconto){
        return precoUnitario -= precoUnitario * (percetualDesconto / 100.0);
    }

}
