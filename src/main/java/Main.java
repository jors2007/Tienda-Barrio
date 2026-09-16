import com.jors.model.Categoria;
import com.jors.model.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("lapiz", 0.30, Categoria.UTILES, "El lapiz de la marca Big", 30);
        producto.setId(1);
        producto.asignarCodigo();
        String codigoProducto = producto.getCodigo();
        System.out.println(codigoProducto);
        System.out.println(codigoProducto.length());
    }
}