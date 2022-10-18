package dao;

import connection.ConnectionFactory;
import model.Endereco;

import javax.swing.JOptionPane;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO {

    public void create(Endereco endereco){

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
    
    public List<Endereco> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Endereco> enderecos = new ArrayList<>();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Endereco");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Endereco endereco = new Endereco(
                        rs.getString("Rua"),
                        rs.getString("Numero"),
                        rs.getString("Bairro"),
                        rs.getString("Cidade"),
                        rs.getString("CEP"),
                rs.getInt("idEndereco"));
                enderecos.add(endereco);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao exibir na Tabela!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);

        }

        return enderecos;

    }

    public void update(Endereco endereco) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE Endereco SET Rua = ?, Numero = ?, Bairro = ?, Cidade = ?, CEP = ? WHERE idEndereco = ?");
            
            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCidade());
            stmt.setString(5, endereco.getCep());
            stmt.setInt(6, endereco.getIdEndereco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Atualização!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
