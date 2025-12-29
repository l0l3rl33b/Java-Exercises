package Projects;
/* Clase basica de aprendizaje de ingreso de datos con el paquete Scanner y uso de SET y GET */
import java.util.Scanner;

public class BasicQuestions {
    
    private String name;

    public BasicQuestions(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void pedirMostrarNombre(String nombre){
        setName(nombre);
        System.out.println("El nombre ingresado es: " + getName() );
    }
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            String nombrePedido = scan.nextLine();

            BasicQuestions bq = new BasicQuestions();
            bq.pedirMostrarNombre(nombrePedido);
        }
    }
}
