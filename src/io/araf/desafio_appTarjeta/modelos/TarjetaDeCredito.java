package io.araf.desafio_appTarjeta.modelos;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public boolean comprar(Compra compra) {
        if (this.saldo >= compra.getValor() ){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Su saldo actual es: " + this.saldo;
    }
}
