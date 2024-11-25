import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Plato> platos=new ArrayList<Plato>();

        System.out.println("Indique la cantidad de platos: ");
        int cantidadPlatos=sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <cantidadPlatos ; i++) {
            System.out.println("Plato N°"+(i+1));
            System.out.println("Indique el nombre del plato: ");
            String nombrePlato=sc.nextLine();
            System.out.println("Indique el precio: ");
            double precio=sc.nextDouble();
            System.out.println("Es bebida?");
            boolean esBebida=sc.nextBoolean();
            sc.nextLine();
            Plato plato=new Plato(nombrePlato, precio, esBebida);

            if (esBebida!=true){
                System.out.println("Cuantos ingredientes tiene el plato?");
                int cantidadIngredientes=sc.nextInt();
                sc.nextLine();

                for (int j = 0; j <cantidadIngredientes ; j++) {
                    System.out.println("Indique el nombre del ingrediente");
                    String nombre = sc.nextLine();
                    System.out.println("Indique la cantidad: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Indique la unidad de medida del ingrediente: ");
                    String unidadDeMedida = sc.nextLine();
                    sc.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombre, cantidad, unidadDeMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }
            platos.add(plato);

        }
        System.out.println("---------MENÚ---------");
        for (Plato plato:platos) {

            System.out.println(plato.getNombrePlato());
            System.out.println("Precio: "+plato.getPrecio());
            if (!plato.isEsBebida()){
                System.out.println("Ingredientes");
                System.out.printf("%-20s %-10s %-20s%n","Nombre","Cantidad","Unidad de Medida");
                for (Ingrediente ingrediente:plato.getIngredientes()) {
                    System.out.printf("%-20s %-10s %-20s%n",
                            ingrediente.getNombre(),
                            ingrediente.getCantidad(),
                            ingrediente.getUnidadDeMedida());
                }
            }
            System.out.println("------------------------------");
        }


    }
}
