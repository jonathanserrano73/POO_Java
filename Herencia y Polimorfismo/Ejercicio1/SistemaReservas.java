public class SistemaReservas {
    public static void main(String[] args) {
        VueloRegular vueloRegular1= new VueloRegular(123,"Paris","Cancun", "25-11-2024",100,150);
        VueloCharter vueloCharter1= new VueloCharter(124,"Buenos Aires","Paris","21-11-2024",5000);

        Reservas reservas=new Reservas();

        reservas.agregarVuelos(vueloRegular1);
        reservas.agregarVuelos(vueloCharter1);

        reservas.aplicarPromociones();
        System.out.println("\nInformacion de los vuelos");
        reservas.mostrarInformacionVuelos();

        double precioTotal= reservas.calcularTotalReservas();
        System.out.println("\nPrecio total de las reservas: "+precioTotal);


    }
}
