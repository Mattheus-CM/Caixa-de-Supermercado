package dao;

import connection.ConnectionFactory;
import model.Endereco;

import javax.swing.JOptionPane;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class EnderecoDAO {

    public void cadastrarEndereco(Endereco endereco){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO endereco (Rua, Numero, Bairro, Cidade, Cep) VALUES (?,?,?,?,?)");

            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCidade());
            stmt.setString(5, endereco.getCep());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no cadastro: "+ ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
