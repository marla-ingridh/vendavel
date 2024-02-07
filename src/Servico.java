public class Servico implements Vendavel{
    private String descricao;
    private double precoHora = 100;

    @Override
    public double calcularPrecoTotal(int quantidade){
        return precoHora * quantidade;
    }

    @Override
    public double aplicarDesonto(double percentualDesconto){
       return precoHora -= precoHora * (percentualDesconto/100.0);
    }

}
