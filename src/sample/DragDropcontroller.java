package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DragDropcontroller {

    @FXML
    private Button button;

    @FXML private double x;
    @FXML private double y;


    @FXML
    public  void initialize(){
        button.setOnMousePressed(event -> {
            x=button.getLayoutX()-event.getSceneX();
            y=button.getLayoutY()-event.getSceneY();
        });

        button.setOnMouseDragged(event -> {
            button.setLayoutX(event.getSceneX()+x);
            button.setLayoutY(event.getSceneY()+y);
        });

    }



}
