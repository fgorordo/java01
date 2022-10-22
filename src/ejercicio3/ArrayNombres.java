package ejercicio3;

public class ArrayNombres {
    public static void main(String[] args) {
        String[] nombres = {"Fernando","Sofia","Luli", "Mapu", "Aurora"};
        String todosLosNombres = "";
        for (String nombre : nombres) {
            todosLosNombres = todosLosNombres += (" " + nombre);
        }

        System.out.println(todosLosNombres);

    }
}
