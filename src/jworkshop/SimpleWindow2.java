package jworkshop;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class SimpleWindow2 extends Application {
 
   @Override
   public void start(Stage stage) {
	   
	   //set up a scene, create a root add it to the scene
       Group root = new Group();
       Scene scene = new Scene(root, 500, 500, Color.BLACK);
 
       //set up a leaf node, add to the root
       Rectangle r = new Rectangle(25,25,250,250);
       r.setFill(Color.BLUE);
       root.getChildren().add(r);
 
       //set up the stage
       stage.setTitle("JavaFX Scene Graph Demo");
       stage.setScene(scene);
       stage.show();
   }
 
   public static void main(String[] args) {
       launch(args);
   }
}