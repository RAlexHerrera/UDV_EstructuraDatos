import java.util.List;
import java.util.ArrayList;


public class MergeSort {
        /**
     * Método que implementa el algoritmo de ordenamiento Merge Sort.
     * Divide recursivamente la lista en mitades y luego las combina en orden.
     *
     * @param lista Lista de enteros a ordenar.
     */
    public static void ordenar(List<Integer> lista) {
        // Caso base: si la lista tiene menos de 2 elementos, ya está ordenada
        if (lista.size() < 2) {
            return; // Caso base: lista con un solo elemento ya está ordenada
        }
        
        // Dividir la lista en dos mitades
        int mitad = lista.size() / 2;
        List<Integer> izquierda = new ArrayList<>(lista.subList(0, mitad));
        List<Integer> derecha = new ArrayList<>(lista.subList(mitad, lista.size()));

        // Llamadas recursivas para ordenar cada mitad
        ordenar(izquierda);
        ordenar(derecha);
        // Fusionar las mitades ordenadas
        merge(lista, izquierda, derecha);
    }
    /**
     * Método que fusiona dos listas ordenadas en una única lista ordenada.
     *
     * @param lista     Lista original en la que se guardará el resultado.
     * @param izquierda Lista ordenada con la primera mitad de elementos.
     * @param derecha   Lista ordenada con la segunda mitad de elementos.
     */
    private static void merge(List<Integer> lista, List<Integer> izquierda, List<Integer> derecha) {
        int i = 0, j = 0, k = 0;

        // Mezclar las dos listas ordenadas
        while (i < izquierda.size() && j < derecha.size()) {
            if (izquierda.get(i) < derecha.get(j)) {
                lista.set(k++, izquierda.get(i++));
            } else {
                lista.set(k++, derecha.get(j++));
            }
        }

        // Si quedan elementos en la lista izquierda
        while (i < izquierda.size()) {
            lista.set(k++, izquierda.get(i++));
        }

        // Si quedan elementos en la lista derecha
        while (j < derecha.size()) {
            lista.set(k++, derecha.get(j++));
        }
    }

    public static void opcionMergeSort(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista);
        System.out.println("✅ Lista ordenada con Merge Sort.");
        System.out.println("📊 Lista ordenada: " + lista);
    }
}