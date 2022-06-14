/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.management.dao;

import inventory.management.connection.BankConnection;
import inventory.management.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoProductImp {
    Connection con;
    PreparedStatement pstm;
    String sql;
    public void saveProduct(Product product){
        con = new BankConnection().getConnection();
        sql = "insert into product (name, description, price) values (?,?,?)";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, product.getName());
            pstm.setString(2, product.getDescription());
            pstm.setDouble(3, product.getPrice());
            pstm.execute();
            pstm.close();
        } catch (SQLException errInsert) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto no banco de dados " + errInsert + " SQL: " + sql);
        } finally {
            try {
                con.close();
            } catch (SQLException closerr) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao inserir o produto" + closerr);
            }
        }        
    }

public List<Product> getProduct() {
       con = new BankConnection().getConnection();
        ResultSet rs = null;
        List<Product> products = new ArrayList<Product>();
        String query = "SELECT * FROM product";
        try {
            pstm = con.prepareStatement(query);
            rs = pstm.executeQuery();
            if (rs.first()) {
                do {
                    Product product = new Product();
                    product.setId(rs.getInt("id"));
                    product.setName(rs.getString("name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setDescription(rs.getString("description"));
                    product.setTheAmount(rs.getInt("theAmount"));
                    product.setTotal(rs.getDouble("total"));
                    
                    products.add(product);
                } while (rs.next());
            }
            pstm.close();
        } catch (SQLException buscarerr) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produtos no banco " + buscarerr);
        } finally {
            try {
                con.close();
            } catch (SQLException closerr) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao buscar produto" + closerr);
            }

        }
        return products;
    } 

    public void updateBuyProduct(Product product) {       
        List<Product> products = new ArrayList<Product>();
        products = getProduct();
        int cont = 0;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getName().equals(product.getName())){
                cont = i;
                break;
            }
        }
         con = new BankConnection().getConnection();
        String sqlatu = "update product set theAmount=?,price=?, total=? where name=?";
        try {
            pstm = con.prepareStatement(sqlatu);           
            pstm.setInt(1, products.get(cont).getTheAmount() + product.getTheAmount());
            pstm.setDouble(2, product.getPrice());
            pstm.setDouble(3, products.get(cont).getTotal() - (product.getPrice()*product.getTheAmount()));
            pstm.setString(4, product.getName());
            pstm.execute();
            pstm.close();
        } catch (SQLException atuerr) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto no banco de dados " + atuerr + " SQL: " + sqlatu);
        } finally {
            try {
                con.close();
            } catch (SQLException closerr) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao atualiza produto" + closerr);
            }

        }
    }
    
    public void updateSellProduct(Product product) {       
        List<Product> products = new ArrayList<Product>();
        products = getProduct();
        int cont = 0;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getName().equals(product.getName())){
                cont = i;
                break;
            }
        }
         con = new BankConnection().getConnection();
        String sqlatu = "update product set theAmount=?,price=?, total=? where name=?";
        try {
            pstm = con.prepareStatement(sqlatu);           
            pstm.setInt(1, products.get(cont).getTheAmount() - product.getTheAmount());
            pstm.setDouble(2, product.getPrice());
            pstm.setDouble(3, products.get(cont).getTotal() + (product.getPrice()*product.getTheAmount()));
            pstm.setString(4, product.getName());
            pstm.execute();
            pstm.close();
        } catch (SQLException atuerr) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto no banco de dados " + atuerr + " SQL: " + sqlatu);
        } finally {
            try {
                con.close();
            } catch (SQLException closerr) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar o banco ao atualiza produto" + closerr);
            }

        }
    }
}
