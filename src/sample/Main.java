package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {


//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Sample");
//        primaryStage.setScene(new Scene(root, 600, 400, Color.CORAL));
//        primaryStage.show();
//    }

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("layout/slider.fxml"));
//        primaryStage.setTitle("Slideshow");
//        primaryStage.setScene(new Scene(root, 600, 400, Color.CORAL));
//        primaryStage.show();
//
//    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("layout/dice.fxml"));
        primaryStage.setTitle("Dice Animation");
        primaryStage.setScene(new Scene(root, 600, 400, Color.CORAL));
        primaryStage.show();

    }

//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("dragdrop.fxml"));
//        primaryStage.setTitle("Drag&Drop");
//        primaryStage.setScene(new Scene(root, 600, 400, Color.CORAL));
//        primaryStage.show();
//
//    }




    public static void main(String[] args) {
        launch(args);
    }
}
