package model.dao;

import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;


public class UsuarioDAO {
    
    public boolean checkLogin(String usuario, String senha){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean check = false;
        
        try {
            
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario = ? and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if (rs.next()){
                
                check = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }
}