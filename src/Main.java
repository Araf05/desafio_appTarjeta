import io.araf.desafio_appTarjeta.modelos.Compra;
import io.araf.desafio_appTarjeta.modelos.TarjetaDeCredito;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double limite = 0;
        String descripcion = "";
        double valor = 0;

        System.out.println("Ingrese el limite de su tarjeta: ");
        limite = teclado.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Escriba la descripción de su compra: ");
            descripcion = teclado.next();
            System.out.println("Escriba el valor de la compra: ");
            valor = teclado.nextDouble();
            Compra compra = new Compra(descripcion, valor);

            if (tarjeta.comprar(compra)) {
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                opcion = 0;
            }

            System.out.println("Escriba 0 para salir o 1 para continuar comprando: ");
            opcion = teclado.nextInt();
        }
        System.out.println("*************************");
        System.out.println("\nCOMPRAS REALIZADAS\n");
        Collections.sort(tarjeta.getListaDeCompras());
        for(Object item : tarjeta.getListaDeCompras()) {
            System.out.println(item);
        }
        System.out.println("\n*************************");
        System.out.println("\nSu saldo actual es: $" + tarjeta.getSaldo());
    }
}