package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField user;
    @FXML
    public PasswordField pass;

    @FXML
    public Label alert;

    @FXML
    public Button register;



    @FXML
    public void regClick(){
        if (user.getText().isEmpty() || pass.getText().isEmpty()){
            alert.setVisible(true);
        }else{
            if (!user.getText().isEmpty() && !pass.getText().isEmpty()){
                user.setVisible(false);
                pass.setVisible(false);
            }


        }
    }

    public  void initialize(){

    }
}
