import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends Exportador {

        @Override
        public void exportar(ArrayList<Producto> listaProductos) {
            try {
                FileWriter writer = new FileWriter("productos.txt");
                for (Producto producto : listaProductos) {
                    writer.write(producto.toString() + "\n");
                }
                writer.close();
                System.out.println("Datos exportados correctamente.");
            } catch (IOException e) {
                System.out.println("Error al exportar los datos: " + e.getMessage());
            }
        }
    }




