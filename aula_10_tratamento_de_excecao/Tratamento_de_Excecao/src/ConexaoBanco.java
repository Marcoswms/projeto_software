import java.sql.*;

public class ConexaoBanco {
    public static void main(String[] args) {

        try {
            conectabanco();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
        }
    }
    public static void conectabanco() throws SQLException { //throws - informará um possível "Erro" dentro do metodo
        String url = "jdbc:mysql://localhost:3306/nomeDoBanco";
        String usuario = "root";
        String senha = "";
        Connection conexao = DriverManager.getConnection(url,usuario,senha);
        System.out.println("Conexão com o banco de dados estabelecida com sucesso!");

        String sql = "INSERT INTO usuario (nome, email, senha) VALUES (?,?,?)";
        PreparedStatement consultaComQuery = conexao.prepareStatement(sql);

        consultaComQuery.setString(1, "Marcos");
        consultaComQuery.setString(2, "teste@teste.com");
        consultaComQuery.setString(3, "senhaAdm123");
        consultaComQuery.executeUpdate();

        consultaComQuery.close();
        conexao.close();
    }
}