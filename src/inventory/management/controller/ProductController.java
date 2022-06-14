
package inventory.management.controller;

import inventory.management.dao.DaoProductImp;
import inventory.management.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductController {
    DaoProductImp daoProduct = new DaoProductImp();
    
    public void actionProductCadControll(Product product){
        if(!product.getName().equals("") && !product.getDescription().equals("") && product.getPrice() > 0){
                      
            daoProduct.saveProduct(product);
            JOptionPane.showMessageDialog(null, "Produto Salvo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente");
        }
    }
    
    public List<Product> actionGetProduct(){
        DaoProductImp daoProduct = new DaoProductImp();
        List<Product> products = new ArrayList<Product>();
        products = daoProduct.getProduct();
        return products;
    }
    
    public void actionUpdateBuyProduct(Product product){
        if(product.getTheAmount() > 0 && product.getPrice() > 0){
                      
            daoProduct.updateBuyProduct(product);
            JOptionPane.showMessageDialog(null, "Compra realizada com sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente");
        }
    }
    
        public void actionUpdateSellProduct(Product product){
        if(product.getTheAmount() > 0 && product.getPrice() > 0){
                      
            daoProduct.updateSellProduct(product);
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente");
        }
    }
}
