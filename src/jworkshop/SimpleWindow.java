package jworkshop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SimpleWindow extends Application{
	
	 
	   @Override
	   public void start(Stage stage) {
		   
	       //setting the scene
		   Group root = new Group();
	       Scene scene = new Scene(root, 500, 500, Color.BLACK);
	       
	       //setting the stage
	       stage.setTitle("JavaFX Scene Graph Demo");
	       stage.setScene(scene);
	       stage.show();
	   }
	 
	   public static void main(String[] args) {
	       launch(args);
	   }


}
