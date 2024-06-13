
import java.util.Scanner;

public class Menu {

    private ProductoServicio productoServicio;
    private Exportador exportador;
    private Scanner scanner;

    public Menu() {
        this.productoServicio = new ProductoServicio();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        String op;
    do
        {
            System.out.println("=============");
            System.out.println("1 Listar Producto");
            System.out.println("2 Agregar Producto");
            System.out.println("3 Exportar Datos");
            System.out.println("4 Salir");
            System.out.println("=============");
            System.out.println("Ingrese una opción:");
            op = scanner.nextLine();

            if (op.equals("1")) {
                productoServicio.listarProductos();
            } else if (op.equals("2")) {
                productoServicio.agregarProducto();
            } else if (op.equals("3")) {

                Exportador exportador = new ExportadorTxt();
                exportador.exportar(productoServicio.getListaProductos());


            } else if( !op.equals("4")){
                System.out.println("Debes elegir una opción correcta");
            }

        } while (!op.equals("4"));
        System.out.println("Adiocito");

    }
    }

