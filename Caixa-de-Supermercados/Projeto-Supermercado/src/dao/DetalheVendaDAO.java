package dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.DetalheVenda;

public class DetalheVendaDAO {

    public void create(DetalheVenda detalheVenda){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO DetalheVenda "
                    + "(PrecoTotal, Data, Funcionario_idFuncionario)"
                    + " VALUES (?,?,?)");

            stmt.setBigDecimal(1, detalheVenda.getPrecoTotal());
            stmt.setString(2, detalheVenda.getDataDaCompra());
            stmt.setInt(3, detalheVenda.getFuncionario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Compra Finalizada!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no cadastro: "+ ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}