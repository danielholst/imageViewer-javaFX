package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    ImageView imageView;

    @FXML
    private void handleRotateRight(ActionEvent event) {
        // Button was clicked, do something...
        System.out.println("rotate right, rotation = " + imageView.getRotate());

        imageView.setRotate(imageView.getRotate() + 90);
    }

    @FXML
    private void handleRotateLeft(ActionEvent event) {
        // Button was clicked, do something...
        System.out.println("rotate left, rotation = " + imageView.getRotate());
        imageView.setRotate(imageView.getRotate() - 90);
    }

    @FXML
    private void handleScaleUp(ActionEvent event) {
        // Button was clicked, do something...
        System.out.println("scale up, size = " + imageView.getScaleX());
        imageView.setScaleX(imageView.getScaleX() / 0.75);
        imageView.setScaleY(imageView.getScaleY() / 0.75);

    }

    @FXML
    private void handleScaleDown(ActionEvent event) {
        // Button was clicked, do something...
        System.out.println("scale down, size = " + imageView.getScaleX());
        imageView.setScaleX(imageView.getScaleX() * 0.75);
        imageView.setScaleY(imageView.getScaleY() * 0.75);
    }

}
