package inventory.management.dao;

import inventory.management.connection.BankConnection;
import inventory.management.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
//    public ArrayList<User> autenticUser(){
//        con = new BankConnection().getConnection();
//        List<User> user = new ArrayList<User>();
//        sql = "select * from user where id = ? and email = ?";
//        try {
//            pstm = con.prepareStatement(sql);
//            pstm.setString(1, user.getName());
//            pstm.setString(2, user.getEmail());
//            pstm.setString(3, user.getPassword());
//            pstm.execute();
//            pstm.close();
//        } catch (SQLException errInsert) {
//            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario no banco de dados " + errInsert + " SQL: " + sql);
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException closerr) {
//                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao inserir o usuario" + closerr);
//            }
//        }        
//    }
}
