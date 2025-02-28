import java.util.List;

public class QuickSort {
    /**
     * Método que implementa el algoritmo de ordenamiento Quick Sort.
     * Divide la lista en dos partes basadas en un pivote y ordena recursivamente.
     *
     * @param lista  Lista de enteros a ordenar.
     * @param inicio Índice inicial del segmento de la lista a ordenar.
     * @param fin    Índice final del segmento de la lista a ordenar.
     */
    public static void ordenar(List<Integer> lista, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(lista, inicio, fin);
            ordenar(lista, inicio, indicePivote - 1);
            ordenar(lista, indicePivote + 1, fin);
        }
    }
    /**
     * Método que particiona la lista alrededor de un pivote.
     * Todos los elementos menores que el pivote quedan a su izquierda,
     * y los mayores a su derecha.
     *
     * @param lista  Lista de enteros a particionar.
     * @param inicio Índice inicial del segmento de la lista.
     * @param fin    Índice final del segmento de la lista.
     * @return Índice final del pivote después de la partición.
     */
    private static int particion(List<Integer> lista, int inicio, int fin) {
        int pivote = lista.get(fin); // Elegimos el último elemento como pivote
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (lista.get(j) < pivote) {
                i++;
                // Intercambiar lista[i] y lista[j]
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        // Intercambiar el pivote con lista[i+1] para colocarlo en su posición final
        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(fin));
        lista.set(fin, temp);

        return i + 1; // Retornamos la posición del pivote
    }
    /**
     * Método que ejecuta la opción de ordenar la lista con Quick Sort.
     * Verifica si la lista tiene datos antes de ordenarla.
     *
     * @param lista Lista de enteros a ordenar.
     */
    public static void opcionQuickSort(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("❌ No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista, 0, lista.size() - 1);
        System.out.println("✅ Lista ordenada con Quick Sort.");
        System.out.println("📊 Lista ordenada: " + lista);
    }
}
