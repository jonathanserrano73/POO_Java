public class VueloCharter extends Vuelo implements Promocionable{
    private int precioTotal;
    public VueloCharter (int numeroVuelo, String origen, String destino, String fecha,int precioTotal){
        super(numeroVuelo,origen,destino,fecha);
        this.precioTotal=precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        double descuento=0.15;
        double precioConDescuento=calcularPrecio()*(1-descuento);
        System.out.println("Precio con descuento para VUELO CHARTER:  "+precioConDescuento);
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
}
