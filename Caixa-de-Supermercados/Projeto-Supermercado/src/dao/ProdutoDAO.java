package dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import model.Produto;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

public class ProdutoDAO {

    public void cadastrarProduto(Produto produto){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO produto (Nome, Marca, Preco) VALUES (?,?,?)");

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getMarca());
            stmt.setBigDecimal(2, produto.getPreco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no cadastro: "+ ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
