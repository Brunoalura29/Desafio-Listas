import java.util.*;

public class Deposito {

    Scanner leitura = new Scanner(System.in);
    public double saldo = 0;
    public String compra;
    public double valorCompra;
    List<Compra> compras = new ArrayList<>();

    public void cartao(double valor) {
        System.out.println("\nDigite o limite do saldo no cartão:");
        valor = leitura.nextDouble();
        saldo += valor;

        System.out.println("\nSaldo atual: R$ " + saldo);

        int opcao = 1;
        while (opcao == 1) {
            System.out.println("\nDigite a descrição da compra:");
            compra = leitura.next();

            System.out.println("Digite o valor da compra:");
            valorCompra = leitura.nextDouble();

            if (valorCompra < saldo) {
                saldo -= valorCompra;
                System.out.println("\n********************");
                System.out.println("Compra realizada com sucesso!");
                System.out.println("********************\n");
                compras.add(new Compra(compra, valorCompra));
            } else {
                System.out.println("\nVocê não tem saldo suficiente para esta compra.\n");
            }

            System.out.println("Seu saldo atual é: R$ " + saldo);
            System.out.println("Digite 0 para sair ou 1 para continuar:");
            opcao = leitura.nextInt();

            if (opcao != 1) {
                System.out.println("\nAté a próxima compra!\n");
            }
        }

        System.out.println("********************");
        System.out.println("Compras realizadas:\n");

        for (Compra c : compras) {
            System.out.println(c.nome + " - R$ " + c.valor);
        }

        System.out.println("\n********************\n");
    }
    static class Compra {
        String nome;
        double valor;

        Compra(String nome, double valor) {
            this.nome = nome;
            this.valor = valor;
        }
    }
}