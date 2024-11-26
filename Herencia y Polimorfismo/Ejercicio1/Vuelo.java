public abstract class Vuelo  {
    protected int numeroVuelo;
    protected String origen;
    protected  String destino;
    protected String fecha;
    public Vuelo(int numeroVuelo, String origen, String destino, String fecha){
        this.numeroVuelo=numeroVuelo;
        this.origen=origen;
        this.destino=destino;
        this.fecha=fecha;
    }

    public abstract double calcularPrecio();


    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
