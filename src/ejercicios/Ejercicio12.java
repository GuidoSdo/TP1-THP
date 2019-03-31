package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String fechaDeCompra;
        String nombreDelComprador;
        String producoSolicitado;
        float precioProducto;
        int cantidadSolicitada;
        double totalAPagar;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese fecha de compra, con el formato YYYYMMDD");
        fechaDeCompra = scan.next();

        System.out.println("Nombre del comprador");
        nombreDelComprador = scan.next();

        System.out.println("Nombre del producto a comprar");
        producoSolicitado = scan.next();

        System.out.println("Cantidad a comprar");
        cantidadSolicitada = scan.nextInt();

        System.out.println("Precio del producto");
        precioProducto = scan.nextFloat();

        totalAPagar = precioProducto * cantidadSolicitada;
        scan.close();

        System.out.println("Fecha de Compra: " + fechaDeCompra);
        System.out.println("Nombre del Comprador: " + nombreDelComprador);
        System.out.println("Producto solicitado: " + producoSolicitado);
        System.out.println("Cantidad solicitada: " + cantidadSolicitada);
        System.out.println("Precio Unitario: $" + precioProducto);
        System.out.println("Total a Pagar: %" + totalAPagar);


    }
}
