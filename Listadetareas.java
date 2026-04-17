package tp;
import java.util.ArrayList;
public class Listadetareas {
    private ArrayList<Tarea> tareas;

    public Listadetareas() {
        tareas = new ArrayList<>();
    }


    public void agregarTarea(Tarea t) {
        tareas.add(t);
    }

    public void marcarCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).setCompletada(true);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void mostrarTodas() {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.print(i + ": ");
            tareas.get(i).mostrar();
        }
    }
}
