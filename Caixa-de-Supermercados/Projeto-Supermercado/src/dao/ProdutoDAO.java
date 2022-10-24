package dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import model.Produto;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public void create(Produto produto) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO produto (Nome, Preco, Marca, Codigo) VALUES (?,?,?,?)");

            stmt.setString(1, produto.getNome());
            stmt.setBigDecimal(2, produto.getPreco());
            stmt.setString(3, produto.getMarca());
            stmt.setString(4, produto.getCodigo());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Produto> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto(rs.getString("nome"),
                        rs.getString("marca"),
                        rs.getBigDecimal("preco"),
                        rs.getString("codigo"),
                rs.getInt("idProduto"));
                produtos.add(produto);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao exibir na Tabela!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);

        }

        return produtos;

    }

    public List<Produto> search(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Produto WHERE Nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto(rs.getString("nome"),
                        rs.getString("marca"),
                        rs.getBigDecimal("preco"),
                        rs.getString("codigo"),
                rs.getInt("idProduto"));
                produtos.add(produto);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao exibir na Tabela!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);

        }

        return produtos;

    }
    
    public List<Produto> searchProduto(String codigo) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Produto WHERE Codigo LIKE ?");
            stmt.setString(1, codigo + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto(rs.getString("nome"),
                        rs.getString("marca"),
                        rs.getBigDecimal("preco"),
                        rs.getString("codigo"),
                rs.getInt("idProduto"));
                produtos.add(produto);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao exibir na Tabela!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);

        }

        return produtos;

    }

    public void update(Produto p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE Produto SET Nome = ?, Preco = ?, Marca = ?, Codigo = ? WHERE idProduto = ?");
            stmt.setString(1, p.getNome());
            stmt.setBigDecimal(2, p.getPreco());
            stmt.setString(3, p.getMarca());
            stmt.setString(4, p.getCodigo());
            stmt.setInt(5, p.getIdProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Atualização!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Produto p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Produto WHERE idProduto = ?");
            stmt.setInt(1, p.getIdProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Apagado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Apagar!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
