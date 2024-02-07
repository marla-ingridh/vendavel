public class Main {
    public static void main(String[] args) {

      Produto produto1 = new Produto();
      int quantidadeProduto = 5;
      double percentualDesconto = 10;
      double precoProduto =  produto1.calcularPrecoTotal(quantidadeProduto);
      double descontoProduto =  produto1.aplicarDesonto(percentualDesconto);
      double valorTotal = precoProduto - descontoProduto;
      System.out.println( quantidadeProduto + " produtos com " + percentualDesconto + "% de desconto é: "+ valorTotal);


      Servico servico1 = new Servico();
      int quantidadeServico = 5;
      double percentualDesconto1 = 10;
      double precoServico =  servico1.calcularPrecoTotal(quantidadeServico);
      double descontoServico =  servico1.aplicarDesonto(percentualDesconto1);
      double valorTotalServico = precoServico - descontoServico;
      System.out.println( quantidadeProduto + " horas de serviços com " + percentualDesconto + "% de desconto é: "+ valorTotalServico);
    }
}