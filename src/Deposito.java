import java.util.Scanner;

public class Deposito {

    Scanner leitura = new Scanner(System.in);
    public double saldo = 0;
    public String compra;
    public double valorCompra;

    public void cartao (double valor){
        System.out.println("Digite o limite do saldo no cartão");
        valor = leitura.nextDouble();
        saldo += valor;
        System.out.println("Saldo atual: " + saldo);

        int opcao = 1;
        while (opcao == 1) {
            System.out.println("Digite a descrição da compra:");
            compra = leitura.next();
            System.out.println("Digite o valor da compra:");
            valorCompra = leitura.nextDouble();
            if (valorCompra < saldo) {
                saldo -= valorCompra;
            } else {
                System.out.println("Você não tem saldo o suficiente para está compra");
            }
            System.out.println("Compra relaizada com sucesso!");
            System.out.println("Seu saldo atual é: " + saldo + "\n" + "Digite 0 para sair ou 1 para continuar");
            opcao = leitura.nextInt();
            if (leitura.nextInt() != 1) {
                System.out.println("Até a proxima compra");
            }
        }
    }
}
