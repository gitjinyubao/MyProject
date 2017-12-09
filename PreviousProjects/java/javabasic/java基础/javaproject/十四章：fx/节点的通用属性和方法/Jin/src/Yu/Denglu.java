package Yu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
public class Denglu extends Application
{
    public void start(Stage primaryStage)
    {
          Button m=new Button("ok");
          StackPane pane=new StackPane();
          pane.getChildren().add(m);
          Scene s=new Scene(pane,290,345);
          primaryStage.setTitle("Jin");
          primaryStage.setScene(s);
          primaryStage.show();
     }
    public static void main(String[] args)
    {
             Application.launch(args);
     }
}        
