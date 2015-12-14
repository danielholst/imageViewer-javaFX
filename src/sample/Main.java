package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Image viewer");
        primaryStage.setScene(new Scene(root, 1200, 1000));

        //Image image = new Image("@image.jpg"); //, 800, 600, false, true);

        //ImageView imageView = null;
        //imageView.setImage(image);

        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
