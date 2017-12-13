package sample;

import javafx.animation.ScaleTransition;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class SliderController implements EventHandler {

    @FXML
    private ImageView pic1;
    @FXML
    private ImageView pic2;
    @FXML
    private ImageView pic3;
    @FXML
    private ImageView viewpic;

    @FXML
    private ImageView upPic;
    @FXML
    private ImageView downPic;
    @FXML
    private ImageView vUpPics;
    @FXML
    private ImageView vDownPics;


    @Override
    public void handle(Event event) {

        if (event.getSource().equals(pic1)){
            if (upPic==pic2 || upPic==pic3){
                downPic=upPic;

            }
            viewpic.setImage(pic1.getImage());
            upPic=pic1;
            vUpPics=viewpic;
        }

        if (event.getSource().equals(pic2)){
            if (upPic==pic1 || upPic==pic3){
                downPic=upPic;

            }
            viewpic.setImage(pic2.getImage());
            upPic=pic2;
            vUpPics=viewpic;
        }

        if (event.getSource().equals(pic3)){
            if (upPic==pic1 || upPic==pic2){
                downPic=upPic;

            }
            viewpic.setImage(pic3.getImage());
            upPic=pic3;
            vUpPics=viewpic;
        }


        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(1000),upPic);
        scaleTransition.setByX(0.3);
        scaleTransition.setByY(0.3);
        scaleTransition.play();


        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.millis(1000),downPic);
        scaleTransition2.setByX(-0.3);
        scaleTransition2.setByY(-0.3);
        scaleTransition2.play();

        ScaleTransition scaleTransition3 = new ScaleTransition(Duration.millis(1000),vUpPics);
        scaleTransition3.setByX(0.2);
        scaleTransition3.setByY(0.2);
        scaleTransition3.play();

//        ScaleTransition scaleTransition4 = new ScaleTransition(Duration.millis(1000),vDownPics);
//        scaleTransition4.setByX(-0.2);
//        scaleTransition4.setByY(-0.2);
//        scaleTransition4.play();

        }



    public void initialize(){
        pic1.setOnMouseClicked(this);
        pic2.setOnMouseClicked(this);
        pic3.setOnMouseClicked(this);

    }



    //set on mouse click, set on mouse drag
}
