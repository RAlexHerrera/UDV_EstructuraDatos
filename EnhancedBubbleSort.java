import java.util.List;


public class EnhancedBubbleSort {
    /**
     * Método que implementa una versión mejorada del algoritmo Bubble Sort.
     * Utiliza una bandera (intercambiado) para detectar si la lista ya está ordenada,
     * reduciendo iteraciones innecesarias y mejorando el rendimiento en algunos casos.
     *
     * @param lista Lista de enteros a ordenar.
     */
    public static void ordenar(List<Integer> lista) {
        int n = lista.size();
        boolean intercambiado;
        
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    intercambiado = true;
                }
            }
            
            // Si no hubo intercambios en una iteración, la lista ya está ordenada
            if (!intercambiado) break;
        }
        System.out.println("✅ Lista ordenada con Enhanced Bubble Sort.");
    }
    /**
     * Método que ejecuta la opción de ordenar la lista con Enhanced Bubble Sort.
     * Verifica si la lista tiene datos cargados antes de ordenarla.
     *
     * @param lista Lista de enteros a ordenar.
     */
    public static void opcionEnhancedBubbleSort(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista);
        System.out.println("📊 Lista ordenada: " + lista);
    }
}