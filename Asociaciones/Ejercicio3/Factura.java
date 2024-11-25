import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detalleFacturas= new ArrayList<>();


    public void agregarDetallesFactura(DetalleFactura detalleFactura){
        this.detalleFacturas.add(detalleFactura);
    }
    public void calcularMontoTotal(){
        double total=0.0;
        for (DetalleFactura detalleFactura: detalleFacturas){
            total += detalleFactura.getSubTotal();
        }
        this.totalCalculadoFactura=total;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public void setDetalleFacturas(ArrayList<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }
}
