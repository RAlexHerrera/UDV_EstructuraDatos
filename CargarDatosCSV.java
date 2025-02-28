import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class CargarDatosCSV {
    /**
     * Método para cargar datos numéricos desde un archivo CSV.
     * Cada línea del archivo debe contener un número entero.
     *
     * @param archivo Ruta del archivo CSV.
     * @return Lista de enteros con los datos cargados.
     */
    public static List<Integer> cargarDesdeCSV(String archivo) {
        List<Integer> lista = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    lista.add(Integer.parseInt(linea.trim())); // Convertir y agregar a la lista
                } catch (NumberFormatException e) {
                    System.out.println("❌ Error al procesar el número: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
        
        return lista;
    }
    /**
     * Método para solicitar al usuario la ruta de un archivo CSV y cargar sus datos.
     * Se almacena la lista de números en la variable global de ProyectoOrdenamiento.
     */
    public static void opcionCargarDatos() {
        System.out.print("Ingrese la ruta del archivo CSV: ");
        String archivo = new java.util.Scanner(System.in).nextLine();
        
        ProyectoOrdenamiento.listaDatos.clear();  // Limpiar la lista global antes de cargar nuevos datos
        List<Integer> datosCargados = cargarDesdeCSV(archivo);
        
        if (datosCargados.isEmpty()) {
            System.out.println("❌ No se cargaron datos del archivo.");
        } else {
            ProyectoOrdenamiento.listaDatos.addAll(datosCargados);
            System.out.println("✅ Datos cargados correctamente.");
            System.out.println("📊 Datos cargados: " + ProyectoOrdenamiento.listaDatos);
        }
    }
}
