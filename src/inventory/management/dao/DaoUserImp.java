package inventory.management.dao;

import inventory.management.connection.BankConnection;
import inventory.management.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoUserImp {
    Connection con;
    PreparedStatement pstm;
    String sql;
    public void saveUser(User user){
        con = new BankConnection().getConnection();
        sql = "insert into user (name, email, password) values (?,?,?)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, user.getName());
            pstm.setString(2, user.getEmail());
            pstm.setString(3, user.getPassword());
            pstm.execute();
            pstm.close();
        } catch (SQLException errInsert) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario no banco de dados " + errInsert + " SQL: " + sql);
        } finally {
            try {
                con.close();
            } catch (SQLException closerr) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao inserir o usuario" + closerr);
            }
        }        
    }
    
    public boolean autenticUser(User user){
        con = new BankConnection().getConnection();
        sql = "select * from user where email = ? and password = ?";
        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, user.getEmail());
            pstm.setString(2, user.getPassword());
            ResultSet rs = pstm.executeQuery();
            
            if(rs.first()){
                pstm.close();
                return true;
            }
        } catch (SQLException errInsert) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuario no banco de dados " + errInsert + " SQL: " + sql);
        } finally {
            try {
                con.close();
            } catch (SQLException closerr) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao buscar o usuario" + closerr);
            }
        }  
        return false;
    }
}
