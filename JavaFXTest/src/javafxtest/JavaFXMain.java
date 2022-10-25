package javafxtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;



public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
        AudioClip audio = new AudioClip(getClass().getResource("audio/and-his-name-is-john-cena-1.mp3").toString());
        
	Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        btn1.setText("Say 'HelloWorld'");
        btn2.setText("'222'");
        btn3.setText("John Cena");
        
        Color myColor = Color.rgb(255, 255, 0); // Create color object (custom color)
        Rectangle rectangle = new Rectangle(100, 100, 100, 500); // Create rectangle object
        
        rectangle.setFill(myColor); // Set background of the rectangle to myColor
        rectangle.setStroke(Color.BLACK); // Set outline to black
        rectangle.setStrokeWidth(3); // Set thickness of outline
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override 
            public void handle(ActionEvent event) {
                System.out.println("222");
            }
        });
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                audio.play();
            }
        });
        
        HBox root = new HBox();
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(rectangle);
        
        
        btn2.setLayoutY(0);
        btn1.setLayoutY(100);
        rectangle.setLayoutY(2);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
