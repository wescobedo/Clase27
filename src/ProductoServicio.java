import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

    ArrayList<Producto> listaProductos = new ArrayList<>();

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ProductoServicio() {

    }


    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }

    public void agregarProducto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crear Producto");
        System.out.print("Ingrese nombre articulo: ");
        String articulo = scanner.nextLine();
        System.out.print("Ingresa precio: ");
        String precio = scanner.nextLine();
        System.out.print("Ingresa descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingresa código: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingresa talla: ");
        String talla = scanner.nextLine();
        System.out.print("Ingresa marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingresa color: ");
        String color = scanner.nextLine();

        Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
        listaProductos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
