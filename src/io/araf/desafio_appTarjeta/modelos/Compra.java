package io.araf.desafio_appTarjeta.modelos;

public class Compra implements Comparable<Compra>{
    String descripcion;
    double valor;

    public Compra(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return """
                %s : $%-15.2f""". formatted(descripcion, valor);
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.valor));
    }
}
