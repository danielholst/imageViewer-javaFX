package sample;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Controller class to handle button actions
 */
public class Controller {

    @FXML
    ImageView imageView;
    private static Image[] images;
    private static Image image1, image2, image3;
    private static int id;

    /** Initialize array of images */
    public static void init() {

        id = 0;
        image1 = new Image("image1.jpg", 800, 600, false, true);
        image2 = new Image("image2.jpg", 800, 400, false, true);
        image3 = new Image("image3.jpg", 800, 400, false, true);
        images = new Image[3];
        images[0] = image1;
        images[1] = image2;
        images[2] = image3;
    }

    @FXML
    /** Button to show next image */
    private void handleNextImage(ActionEvent event) {

        System.out.println("load next image, image size = " + image2.getWidth() + ", " + image2.getHeight());
        if(id == images.length -1) {
            imageView.setImage(images[0]);
            id = 0;
        }
        else {
            imageView.setImage(images[id+1]);
            id = id+1;
        }
    }

    @FXML
    /** Button to show previous image */
    private void handlePrevImage(ActionEvent event) {

        System.out.println("load previous image");
        if(id == 0) {
            imageView.setImage(images[images.length-1]);
            id = images.length - 1;
        }
        else {
            imageView.setImage(images[id - 1]);
            id = id - 1;
        }
    }

    @FXML
    /** Button to rotate image to the right*/
    private void handleRotateRight(ActionEvent event) {

        System.out.println("rotate right, rotation = " + imageView.getRotate());
        imageView.setRotate(imageView.getRotate() + 90);
    }

    @FXML
    /** Button to rotate image to the left*/
    private void handleRotateLeft(ActionEvent event) {

        System.out.println("rotate left, rotation = " + imageView.getRotate());
        imageView.setRotate(imageView.getRotate() - 90);
    }

    @FXML
    /** Button to scale up image */
    private void handleScaleUp(ActionEvent event) {

        System.out.println("scale up, size = " + imageView.getScaleX());
        imageView.setScaleX(imageView.getScaleX() / 0.75);
        imageView.setScaleY(imageView.getScaleY() / 0.75);
    }

    @FXML
    /** Button to scale down image */
    private void handleScaleDown(ActionEvent event) {

        System.out.println("scale down, size = " + imageView.getScaleX());
        imageView.setScaleX(imageView.getScaleX() * 0.75);
        imageView.setScaleY(imageView.getScaleY() * 0.75);
    }
}
