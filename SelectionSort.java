import java.util.List;


public class SelectionSort {
    /**
     * Método que implementa el algoritmo de ordenamiento Selection Sort.
     * Encuentra el elemento mínimo en cada iteración y lo intercambia 
     * con el primer elemento no ordenado de la lista.
     *
     * @param lista Lista de enteros a ordenar.
     */
    public static void ordenar(List<Integer> lista) {
        int n = lista.size();
        // Recorremos la lista para encontrar el mínimo en cada iteración
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i; // Suponemos que el primer elemento es el mínimo

            // Buscamos el menor elemento en el resto de la lista
            for (int j = i + 1; j < n; j++) {
                if (lista.get(j) < lista.get(indiceMinimo)) {
                    indiceMinimo = j; // Actualizamos el índice del mínimo
                }
            }
            // Intercambiar el mínimo encontrado con el primer elemento no ordenado
            int temp = lista.get(i);
            lista.set(i, lista.get(indiceMinimo));
            lista.set(indiceMinimo, temp);
        }
        System.out.println("✅ Lista ordenada con Selection Sort.");
    }

    public static void opcionSelectionSort(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista);
        System.out.println("📊 Lista ordenada: " + lista);
    }
}
