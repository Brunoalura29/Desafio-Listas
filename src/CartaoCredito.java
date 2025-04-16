import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double saldo;
    List<Compra> compras;
    private double valorCompra;

    public CartaoCredito(double saldo, String compra, double valorCompra) {
        this.saldo = saldo;
        this.valorCompra = valorCompra;
    }


    public double getSaldo() {
        return saldo;
    }


    public double getValorCompra() {
        return valorCompra;
    }

}
