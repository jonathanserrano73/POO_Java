import java.util.ArrayList;

public class Plato {
    private String nombrePlato;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente>  ingredientes;

    public Plato (String nombrePlato, double precio, boolean esBebida){
        this.nombrePlato=nombrePlato;
        this.precio=precio;
        this.esBebida=esBebida;
        this.ingredientes=new ArrayList<>();
    }
    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
