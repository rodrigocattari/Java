import java.util.Scanner;

public class EstruturaRepeticaoFor {
    public static void main(String[] args) {
        Scanner leitoScanner = new Scanner(System.in);

        String nomeProduto;
        Float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        for(int i = 0; i < 40; i++ ){
            System.out.println("Digite o nome do produto");
            nomeProduto = leitoScanner.nextLine();

            System.out.println("Digite o preço de custo do produto");
            precoCusto = leitoScanner.nextFloat();

            System.out.println("Digite o preco de venda do produto");
            precoVenda = leitoScanner.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if(precoCusto == precoVenda){
                System.out.println("Houve empate entre o preço de custo e de venda");
            }else{
                if(precoCusto > precoVenda){
                    System.out.println("Houve prejuizo");
                }else{
                    System.out.println("Houve Lucro");
                }

            }
            System.out.println(nomeProduto + ", preco de custo = "+ precoCusto + ", preco de venda = "+ precoVenda);
        }
        System.out.println("O media de custo é de: "+(totalCusto));
        System.out.println("O media de venda é de: "+(totalVenda));
    }
}
