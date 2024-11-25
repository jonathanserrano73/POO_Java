import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Alumno> alumnos= new ArrayList<>();

        System.out.println("Cuantos alumnos hay?");
        int cantidadAlumnos=sc.nextInt();
        sc.nextLine();


        for (int i = 0; i <cantidadAlumnos ; i++) {
            System.out.println("Alumno N°"+(i+1));
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre=sc.nextLine();
            System.out.println("Ingrese el legajo del alumno");
            long legajo=sc.nextLong();
            sc.nextLine();

            Alumno alumno= new Alumno(nombre, legajo);

            System.out.println("Cuantas Notas tiene el alumno?");
            int cantidadNotas=sc.nextInt();
            sc.nextLine();

            if (cantidadNotas<1){
                System.out.println("El alumno debe tener por lo menos una nota");
                continue;
            }
            for (int j = 0; j <cantidadNotas ; j++) {
                System.out.println("Ingrese el nombre de la catedra: ");
                String catedra=sc.nextLine();
                System.out.println("Ingrese la nota: ");
                double notaExamen=sc.nextDouble();
                sc.nextLine();

                Nota nota= new Nota(catedra, notaExamen);
                alumno.agragarNota(nota);

            }
            alumnos.add(alumno);
        }
        System.out.println("Informacion de los alumnos");
        for (Alumno alumno:alumnos) {
            System.out.println("\nAlumno: "+alumno.getNombreCompleto());
            System.out.println("Legajo: "+alumno.getLegajo());
            System.out.println("Promedio: "+alumno.Promedio());
            for (Nota nota: alumno.getNotas()) {
                System.out.println("Catedra: "+nota.getCatedra()+"  Nota: "+nota.getNotaExamen());
            }
        }
    }
}
