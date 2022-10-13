package dao;

import connection.ConnectionFactory;
import model.Usuario;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO usuario (Usuario, Senha) VALUES (?,?)");

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no cadastro: "+ ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
