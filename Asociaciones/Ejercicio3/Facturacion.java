import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Facturacion {
    private static String[][] articulos= {
            {"101", "Leche", "25"},
            {"102", "Gaseosa", "30"},
            {"103", "Fideos", "15"},
            {"104", "Arroz", "28"},
            {"105", "Vino", "120"},
            {"106", "Manteca", "20"},
            {"107", "Lavandina", "18"},
            {"108", "Detergente", "46"},
            {"109", "Jabón en Polvo", "96"},
            {"110", "Galletas", "60"}
    };
    ArrayList<DetalleFactura> detalleFacturas=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Factura factura= new Factura();

        System.out.println("Indique la fecha de emisión de la Factura");
        String fechaFactura=sc.nextLine();
        factura.setFechaFactura(fechaFactura);

        int numeroFactura;
       while (true){
           System.out.println("Ingrese el numero de Factura");
           if (sc.hasNextInt()){
               numeroFactura= sc.nextInt();
               sc.nextLine();
               if (numeroFactura>0){
                   break;
               }else {
                   System.out.println("El numero de factura debe ser mayor a cero");
               }
           }else{
               System.out.println(("El numero de factura debe ser un numero entero. Intentelo nuevamente: "));
           }
       }
       factura.setNumeroFactura(numeroFactura);

       String cliente;
       while(true) {
           System.out.println("Ingrese el nombre del cliente");
           cliente = sc.nextLine();
           if (!cliente.isEmpty()) {
               break;
           }else {
               System.out.println("El nombre del cliente esta vacio");
           }
       }
       factura.setCliente(cliente);
       while (true){
           System.out.println("Indique el codigo del articulo");
           String codigoArticulo=sc.nextLine();
           String nombreArticulo="";
           double precioUnitario=0.0;
           int cantidad=0;
           double descuentoItem=0.0;
           double subTotal=0.0;
           boolean codigoValido=false;
           for (int i = 0; i < articulos.length ; i++) {
               if (Objects.equals(codigoArticulo, articulos[i][0])){
                   codigoArticulo=articulos[i][0];
                   nombreArticulo=articulos[i][1];
                   precioUnitario=Double.parseDouble(articulos[i][2]);
                   System.out.println("Indique la cantidad de este articulo");
                   cantidad=sc.nextInt();
                   sc.nextLine();
                   codigoValido=true;
                   break;

               }
           }
           if (codigoValido){
               if (cantidad>5){
                   double descuento=0.10;
                   descuentoItem=precioUnitario*cantidad*descuento;
               }
               subTotal=(precioUnitario*cantidad)-descuentoItem;

               DetalleFactura detalleFactura= new DetalleFactura(codigoArticulo, nombreArticulo, precioUnitario,cantidad,descuentoItem,subTotal);
               factura.agregarDetallesFactura(detalleFactura);
               System.out.println("Desea agregar otro articulo? (Si/No)");
               String respuesta=sc.nextLine().toLowerCase();
               if (respuesta.equals("no")){
                   break;
               }
           } else {
               System.out.println("El codigo ingresado no existe, intente nuevamente");

           }
       }
        System.out.println("-------FACTURA---------");
        System.out.println("Fecha: "+ factura.getFechaFactura());
        System.out.println("Numero: "+factura.getNumeroFactura());
        System.out.println("Cliente: "+factura.getCliente());
        System.out.printf("%-15s %-20s %-10s %-20s %-12s %-15s%n", "Codigo Articulo", "Nombre Articulo", "Cantidad",
                "Precio Unitario", "Descuento", "Subtotal");
        for (DetalleFactura detalleFactura: factura.getDetalleFacturas()){
            System.out.printf("%-15s %-20s %-10d %-20.2f %-12.2f %-15.2f%n",
                    detalleFactura.getCodigoArticulo(),
                    detalleFactura.getNombreArticulo(),
                    detalleFactura.getCantidad(),
                    detalleFactura.getPrecioUnitario(),
                    detalleFactura.getDescuentoItem(),
                    detalleFactura.getSubTotal());
        }
        factura.calcularMontoTotal();
        System.out.printf("%n%80s %.2f%n", "Total:  ", factura.getTotalCalculadoFactura());

    }

}
