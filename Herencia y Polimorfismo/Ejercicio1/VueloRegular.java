public class VueloRegular extends Vuelo implements Promocionable{
    private int numeroAsientos;
    private double precioBase;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBase){
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos=numeroAsientos;
        this.precioBase=precioBase;
    }
    @Override
    public double calcularPrecio() {
        return (double) (precioBase*numeroAsientos);
    }

    @Override
    public void aplicarPromocion() {
        double descuentp=0.2;
        double precioConDescuento=calcularPrecio()*(1-descuentp);
        System.out.println("Precio con descuento del VUELO REGULAR: "+precioConDescuento);
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
