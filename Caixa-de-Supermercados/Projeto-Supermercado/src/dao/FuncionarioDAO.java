package dao;

import connection.ConnectionFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

public class FuncionarioDAO {

    public void create(Funcionario funcionario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO funcionario (Nome, Cargo, CPF, Usuario, Senha, Endereco_idEndereco) VALUES (?,?,?,?,?,?)");

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getCpf());
            stmt.setString(4, funcionario.getUsuario());
            stmt.setString(5, funcionario.getSenha());
            stmt.setInt(6, funcionario.getEndereco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no cadastro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean checkLogin(String user, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {

            stmt = (PreparedStatement) con.prepareStatement("Select * from funcionario f where f.usuario = ? and f.senha = ?");

            stmt.setString(1, user);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na checagem: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

        return check;
    }

    public boolean checkGerente(String user) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {

            stmt = (PreparedStatement) con.prepareStatement("Select cargo, usuario from funcionario f where usuario = ?");
            
            stmt.setString(1, user);

            rs = stmt.executeQuery();

            if (rs.next()) {
                String cargo = rs.getString("cargo");
                if (cargo.equals("Gerente")){
                    check = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na checagem: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

        return check;
    }

    public List<Funcionario> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario funcionario = new Funcionario(
                        rs.getString("Nome"),
                        rs.getString("Cargo"),
                        rs.getString("Cpf"),
                        rs.getString("Usuario"),
                        rs.getString("Senha"),
                        rs.getInt("Endereco_idEndereco"),
                        rs.getInt("idFuncionario"));
                funcionarios.add(funcionario);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao exibir na Tabela!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);

        }

        return funcionarios;

    }

    public List<Funcionario> search(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Funcionario WHERE Nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario funcionario = new Funcionario(
                        rs.getString("Nome"),
                        rs.getString("Cargo"),
                        rs.getString("Cpf"),
                        rs.getString("Usuario"),
                        rs.getString("Senha"),
                        rs.getInt("idEndereco"));
                funcionarios.add(funcionario);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao exibir na Tabela!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);

        }

        return funcionarios;

    }

    public void update(Funcionario funcionario) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE Funcionario SET Nome = ?, "
                    + "Cargo = ?, CPF = ?, Usuario = ?, Senha = ?, Endereco_idEndereco = ? WHERE idFuncionario = ?");

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getCpf());
            stmt.setString(4, funcionario.getUsuario());
            stmt.setString(5, funcionario.getSenha());
            stmt.setInt(6, funcionario.getEndereco());
            stmt.setInt(7, funcionario.getIdFuncionario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Atualização!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Funcionario funcionario) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Produto WHERE idProduto = ?");
            stmt.setInt(1, funcionario.getIdFuncionario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Apagado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Apagar!" + ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
