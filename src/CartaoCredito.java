import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double saldo;
    private String compra;
    private double valorCompra;

    public CartaoCredito(double saldo, String compra, double valorCompra, List<Deposito.Compra> compras) {
        this.saldo = saldo;
        this.compra = compra;
        this.valorCompra = valorCompra;
        this.compras = compras;
    }

    List<Deposito.Compra> compras;

    public double getSaldo() {
        return saldo;
    }

    public String getCompra() {
        return compra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public List<Deposito.Compra> getCompras() {
        return compras;
    }
}
