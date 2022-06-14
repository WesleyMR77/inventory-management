package inventory.management.controller;

import inventory.management.dao.DaoUserImp;
import inventory.management.model.User;
import inventory.management.view.FrmMenu;
import javax.swing.JOptionPane;

public class UserController {
    DaoUserImp daoUser = new DaoUserImp();
    
    public void actionUserCadControll(User user, String passwordConfirm){
        if(!user.getName().equals("") && !user.getEmail().equals("") && !user.getPassword().equals("") && user.getPassword().equals(passwordConfirm)){
                      
            daoUser.saveUser(user);
            JOptionPane.showMessageDialog(null, "Usuario Salvo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente");
        }
    }
    
    public void actionAutenticacitonUser(User user){
        boolean autentication = daoUser.autenticUser(user);
        if(autentication){
            new FrmMenu().setVisible(true); 
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto");
        }
    
    }
}
