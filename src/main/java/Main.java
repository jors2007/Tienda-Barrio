import com.jors.model.Categoria;
import com.jors.model.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("lapiz", 0.30, Categoria.UTILES, "El lapiz de la marca Big", 30);
        producto.setId(1);
        producto.asignarCodigo();
        System.out.println(producto.getCodigo()); 
    }
}