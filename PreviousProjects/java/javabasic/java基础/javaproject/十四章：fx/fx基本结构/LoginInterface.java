import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class LoginInterface extends Application
{  
    public void start(Stage primaryStage)
   {//Overide the start methhod in the Application class 
           Button bt=new Button("OK");//creat a button
           Scene scene=new Scene(bt,300,390);//creat a scene and place a button in the scene
           primaryStage.setTitle("LoginInterface");//set the stage title
           primaryStage.setScene(scene);//place the scene in the stage
           primaryStage.show();//Display the stage
    }
//The main method is only needed for the IDE with limited
//Javafx support.Not needed for running from the command line.
   public static void main(String[] args)
  {
      Application.launch(args);
   }
}

