
import java.sql.SQLException;
import java.util.ArrayList;

import com.jors.dao.ClienteDAO;
import com.jors.dao.VentaDAO;
import com.jors.model.Cedula;
import com.jors.model.Celular;
import com.jors.model.Cliente;
import com.jors.model.Direccion;
import com.jors.model.Venta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(new Cedula("0999999999"),"Jordy", "Jordy", new Celular("0999999999"), new Direccion("Jaime", "Puig"), new ArrayList<>());
        Venta venta = new Venta(cliente);
        ClienteDAO clienteDAO = new ClienteDAO();
        VentaDAO ventaDAO = new VentaDAO();
        try {
            clienteDAO.insertarCliente(cliente);
            System.out.println("ID asignado al cliente: " + cliente.getId());
            ventaDAO.agregarVenta(venta, cliente);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
