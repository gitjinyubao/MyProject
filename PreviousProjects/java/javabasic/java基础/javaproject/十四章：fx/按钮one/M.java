import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
public class M extends Application
{
    public void start(Stage primaryStage)
    {
           StackPane p=new StackPane();
           p.getChildren().add(new Button("yes"));
           Scene s=new Scene(p,800,800);
           primaryStage.setTitle("jin yu bao");
           primaryStage.setScene(s);
           primaryStage.show();
     }
    public static void main(String[] args)
    {
         Application.launch(args);
     }
}