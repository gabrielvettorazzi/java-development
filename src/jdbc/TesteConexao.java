package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgres:// localhost";
        final String usuario = "root";
        final String senha = "123456789";


        Connection connection = DriverManager
                .getConnection(url, usuario,senha);
        System.out.println("Conexão efetuada com sucesso");
      connection.close();

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
