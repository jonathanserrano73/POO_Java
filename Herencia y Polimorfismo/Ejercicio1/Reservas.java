import java.util.ArrayList;

public class Reservas {
    private ArrayList<Vuelo> vuelos;
    public Reservas(){
        vuelos=new ArrayList<>();
    }
    public void agregarVuelos(Vuelo vuelo){
        vuelos.add(vuelo);
    }
    public double calcularTotalReservas(){
        double total=0;
        for(Vuelo vuelo:vuelos){
            total+=vuelo.calcularPrecio();
        }
        return total;
    }
    public void aplicarPromociones(){
        for (Vuelo vuelo: vuelos){
            if (vuelo instanceof  Promocionable){
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }
    public void mostrarInformacionVuelos(){
        for (Vuelo vuelo:vuelos){
            System.out.println("Numero de vuelo: "+vuelo.getNumeroVuelo()+
                    "\nOrigen"+vuelo.getOrigen()+
                    "\nDestino"+vuelo.getDestino()+
                    "\nFecha"+vuelo.getFecha()+
                    "\nPrecio: "+vuelo.calcularPrecio());
        }
    }
}
