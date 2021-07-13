package jworkshop;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Code from: http://www.java2s.com/Tutorials/Java/JavaFX/0340__JavaFX_GridPane.htm
public class LoginWindow extends Application {
	
	
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root, 380, 150, Color.WHITE);

    GridPane gridpane = new GridPane();
    
    //Setting up the look and feel
    gridpane.setPadding(new Insets(5));
    gridpane.setHgap(5);
    gridpane.setVgap(5);
    
    ColumnConstraints column1 = new ColumnConstraints(100);
    ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);
    column2.setHgrow(Priority.ALWAYS);
    gridpane.getColumnConstraints().addAll(column1, column2);

    //Initialize the components
    Label fNameLbl = new Label("First Name");
    TextField fNameFld = new TextField();
    Label lNameLbl = new Label("Last Name");
    TextField lNameFld = new TextField();
    Button signButt = new Button("Sign in");

    // First name label, set to 0,0
    GridPane.setHalignment(fNameLbl, HPos.RIGHT);
    gridpane.add(fNameLbl, 0, 0);

    // Last name label, set to 0,1
    GridPane.setHalignment(lNameLbl, HPos.RIGHT);
    gridpane.add(lNameLbl, 0, 1);

    // First name field, set to 1,0
    GridPane.setHalignment(fNameFld, HPos.LEFT);
    gridpane.add(fNameFld, 1, 0);

    // Last name field, set to 1,1
    GridPane.setHalignment(lNameFld, HPos.LEFT);
    gridpane.add(lNameFld, 1, 1);

    // Save button, set to 1,2
    GridPane.setHalignment(signButt, HPos.RIGHT);
    gridpane.add(signButt, 1, 2);

    root.setCenter(gridpane);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
