package conexao;
            
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public Connection getConexao() {

        try {
            Connection conn = DriverManager.getConnection(
<<<<<<< HEAD
<<<<<<< HEAD
                    "jdbc:mysql://localhost/uc11_atv1?useSSL=false&serverTimezone=UTC", // linha de conexao
=======
                    "jdbc:mysql://localhost/uc11_atv1", // linha de conexao
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
                    "jdbc:mysql://localhost/uc11_atv1", // linha de conexao
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
                    "root", // usuario do mysql
                    "123"// senha do mysql
            );
            return conn;

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }

    }

}
