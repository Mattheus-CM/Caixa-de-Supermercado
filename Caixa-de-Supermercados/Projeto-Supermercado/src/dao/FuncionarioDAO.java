package dao;

import connection.ConnectionFactory;
import model.Funcionario;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {

    public void cadastrarFuncionario(Funcionario funcionario){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO funcionario " +
                    "VALUES (idFuncionario, Nome, Cargo, CPF, Usuario_idUsuario," +
                    " Endereco_idEndereco)");

            stmt.setInt(1, funcionario.getIdFuncionario());
            stmt.setString(2, funcionario.getNome());
            stmt.setString(3, funcionario.getCargo());
            stmt.setString(4, funcionario.getCpf());
            stmt.setInt(5, funcionario.getUsuario().getIdUsuario());
            stmt.setInt(6, funcionario.getEndereco().getIdEndereco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro no cadastro: "+ ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
