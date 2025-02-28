import java.util.List;

public class BinarySearch {
    /**
     * Método que implementa la búsqueda binaria sobre una lista ordenada.
     * Compara el valor buscado con el elemento medio y ajusta los límites
     * del rango de búsqueda de forma iterativa hasta encontrar el objetivo o
     * descartar su presencia en la lista.
     *
     * @param lista    Lista de enteros ordenada en la que se buscará el objetivo.
     * @param objetivo Número a buscar en la lista.
     * @return Índice del número si se encuentra, o -1 si no está presente.
     */
    public static int buscar(List<Integer> lista, int objetivo) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2; // Calcula el índice medio
            
            // Si encontramos el elemento
            if (lista.get(medio) == objetivo) {
                return medio; // Devuelve el índice del elemento
            }
            
            // Si el objetivo es mayor que el elemento medio
            if (lista.get(medio) < objetivo) {
                inicio = medio + 1;
            } 
            // Si el objetivo es menor que el elemento medio
            else {
                fin = medio - 1;
            }
        }
        
        return -1; // Si el elemento no está presente en la lista
    }
    /**
     * Método que solicita al usuario un número y busca su posición en la lista usando búsqueda binaria.
     * 
     * @param lista Lista de enteros ordenada en la que se realizará la búsqueda.
     */
    public static void opcionBinarySearch(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        
        System.out.print("Ingrese el número que desea buscar: ");
        int objetivo = new java.util.Scanner(System.in).nextInt();
        
        int resultado = buscar(lista, objetivo);
        
        if (resultado == -1) {
            System.out.println("❌ El número no está en la lista.");
        } else {
            System.out.println("✅ El número " + objetivo + " se encuentra en el índice: " + resultado);
        }
    }
}
