import java.util.List;

public class BubbleSort {
    /**
     * Método que implementa el algoritmo de ordenamiento Bubble Sort.
     * Recorre la lista varias veces y realiza intercambios de elementos adyacentes
     * si están en el orden incorrecto, hasta que la lista esté ordenada.
     *
     * @param lista Lista de enteros a ordenar.
     */
    public static void ordenar(List<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) { // Recorre la lista n-1 veces
            for (int j = 0; j < n - i - 1; j++) { // Comparación entre elementos adyacentes
                if (lista.get(j) > lista.get(j + 1)) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        System.out.println("✅ Lista ordenada con Bubble Sort.");
    }

    public static void opcionBubbleSort(List<Integer> lista) {
        /**
         * Método que ejecuta la opción de ordenar la lista con Bubble Sort.
         * Primero verifica si la lista tiene datos cargados, y si es así, la ordena.
         *
         * @param lista Lista de enteros a ordenar.
         */
        if (lista.isEmpty()) {
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista);
        System.out.println("📊 Lista ordenada: " + lista);
    }
}
