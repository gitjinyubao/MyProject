import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class A extends Application
{
    public void start(Stage primaryStage)
    {
          Button n=new Button("ok");
          StackPane m= new StackPane();
          m.getChildren().add(n);
          Scene s=new Scene(m,67,45);
          primaryStage.setScene(s);
          primaryStage.setTitle("jin");
          primaryStage.show();
    }
}          