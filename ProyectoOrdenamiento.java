import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ProyectoOrdenamiento {
    //Lista global para almacenar los datos
    public static List<Integer> listaDatos = new ArrayList<>();

    public static void mostrarInformacion() {
        // Datos fijos del proyecto
        String universidad = "Universidad Da Vinci de Guatemala";
        String curso = "Estructura de Datos";
        String docente = "Ing. Brandon Chitay";
        String estudiante = "Rodrigo Alexander Herrera Solares";
        String carne = "202102603";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Listas de tareas completadas y pendientes
        List<String> puntosHechos = new ArrayList<>();
        List<String> puntosFaltantes = new ArrayList<>();

        // Se inicia el proyecto con el Punto 1 completado
        puntosHechos.add("1. Información del Desarrollador");
        puntosHechos.add("2. Menú Principal");
        puntosHechos.add("3. Carga de Datos desde un CSV");
        puntosHechos.add("4. Algoritmo de Ordenamiento - Bubble Sort");
        puntosHechos.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
        puntosHechos.add("6. Algoritmo de Ordenamiento - Quick Sort");
        puntosHechos.add("7. Algoritmo de Ordenamiento - Selection Sort");
        puntosHechos.add("8. Algoritmo de Ordenamiento - Merge Sort");
        puntosHechos.add("9. Algoritmo de Búsqueda - Binary Search");
        puntosHechos.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente + "\n");
        System.out.println("Nombre del estudiante: " + estudiante + ", Carne: "  + carne + "\n");

        // Mostrar tareas completadas
        System.out.println("PUNTOS HECHOS:");
        for (String punto : puntosHechos) {
            System.out.println("✅ " + punto);
        }

        // Mostrar tareas pendientes
        System.out.println("\nPUNTOS FALTANTES:");
        for (String punto : puntosFaltantes) {
            System.out.println("❌ " + punto);
        }

        System.out.println("========================================");

        // Esperar a que el usuario presione Enter antes de continuar
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine(); // Captura la entrada del usuario

        // Llamar al menú principal
        mostrarMenu(scanner);
    }

    public static void mostrarMenu(Scanner scanner) {
        int opcion;
        do {
            // Mostrar opciones
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Cargar datos desde un archivo CSV");
            System.out.println("2. Ordenar datos usando Bubble Sort");
            System.out.println("3. Ordenar datos usando Enhanced Bubble Sort");
            System.out.println("4. Ordenar datos usando Quick Sort");
            System.out.println("5. Ordenar datos usando Selection Sort");
            System.out.println("6. Ordenar datos usando Merge Sort");
            System.out.println("7. Buscar un número con Binary Search");
            System.out.println("8. Mostrar datos cargados");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");

            // Leer opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            // Ejecutar la acción correspondiente a la opcion ingresada
            switch (opcion) {
                case 1:
                    CargarDatosCSV.opcionCargarDatos();
                    break;
                case 2:
                    BubbleSort.opcionBubbleSort(listaDatos);
                    break;
                case 3:
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos);
                    break;
                case 4:
                    QuickSort.opcionQuickSort(listaDatos);
                    break;
                case 5:
                    SelectionSort.opcionSelectionSort(listaDatos);
                    break;
                case 6:
                    MergeSort.opcionMergeSort(listaDatos);
                    break;
                case 7:
                    BinarySearch.opcionBinarySearch(listaDatos);
                    break;
                case 8:
                    mostrarDatos();
                    break;
                case 9:
                    System.out.println("⚠️ Gracias, vuelva pronto.");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 9);
    }

    public static void mostrarDatos() {
        if (listaDatos.isEmpty()) {
            System.out.println("⚠️ No hay datos cargados.");
        } else {
            System.out.println("📊 Datos almacenados: " + listaDatos);
        }
    }

    public static void main(String[] args) {
        mostrarInformacion(); // Llamamos a la función para ejecutarla
    }
}