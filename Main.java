package tp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Listadetareas lista = new Listadetareas ();

        int opcion;
        System.out.println("Bienvenido al sistema de tareas");
        do {
            System.out.println("\nMENÚ");
            System.out.println("1.Agregar tarea");
            System.out.println("2.Mostrar tareas");
            System.out.println("3.Marcar tarea como completada");
            System.out.println("4.Salir");
            System.out.print("Elegir opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();

                    Tarea nueva = new Tarea(titulo, descripcion);
                    lista.agregarTarea(nueva);

                    System.out.println("Tarea agregada.");
                    break;

                case 2:
                    System.out.println("\nLista de tareas:");
                    lista.mostrarTodas();
                    break;

                case 3:
                    System.out.print("Índice de la tarea a completar: ");
                    int indice = sc.nextInt();

                    lista.marcarCompletada(indice);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
