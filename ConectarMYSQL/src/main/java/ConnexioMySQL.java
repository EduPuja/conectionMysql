import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexioMySQL
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://192.168.2.138/koobing_app";
        String usuario = "guillem";
        String contrasena = "";


        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión establecida con éxito");

            // Aquí puedes realizar tus operaciones de base de datos

            conexion.close();
            System.out.println("Conexión cerrada");
        } catch (SQLException ex)
        {
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
        }
    }
}
