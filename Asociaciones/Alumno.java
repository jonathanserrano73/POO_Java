import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private  long legajo;
    private ArrayList<Nota> notas;
    public Alumno (String nombreCompleto, long legajo){
        this.nombreCompleto=nombreCompleto;
        this.legajo=legajo;
        this.notas=new ArrayList<>();
    }
    public void agragarNota(Nota nota){
        this.notas.add(nota);
    }
    public double Promedio(){
        double suma=0;
        double prom=0;
        for (Nota nota: notas){
            suma+= nota.getNotaExamen();
        }
        if (notas.size()>0){
            prom=suma/ notas.size();
        }
        return prom;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}
