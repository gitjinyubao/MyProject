import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
public class A extends Application
{
     public void start(Stage primaryStage)
     {
           StackPane p=new StackPane();
           p.getChildren().add(new Button("yes"));
           Scene n=new Scene(p,700,50);
           primaryStage.setTitle("Jin");
           primaryStage.setScene(n);
           primaryStage.show();
           Stage stage=new Stage();
           StackPane l=new StackPane();
           l.getChildren().add(new Button("Ok"));
           Scene m=new Scene(l,78,590);
           stage.setTitle("Yu");
           stage.setScene(m);
           stage.show();
      }
      public static void main(String[] args)
      {
              Application.launch(args);
      }
}
           