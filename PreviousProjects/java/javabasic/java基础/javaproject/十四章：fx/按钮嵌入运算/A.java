import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class A extends Application {
  private TextField n1 = new TextField();
  private TextField n2 = new TextField();
  private TextField r1 = new TextField();
  private TextField r2 = new TextField();
  private Button Add = new Button("和");
  private Button Subtract = new Button("差");
  public void start(Stage primaryStage) {
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    
    gridPane.add(new Label("数值1:"), 0, 0);
    gridPane.add(n1, 1, 0);
    gridPane.add(new Label("数值2:"), 0, 1);
    gridPane.add(n2, 1, 1);
      
    gridPane.add(new Label("和："), 0,2);
    gridPane.add(r1, 1, 2);
    gridPane.add(new Label("差："), 0, 3);
    gridPane.add(r2, 1, 3);
    gridPane.add(Add, 1, 4);
    gridPane.add(Subtract, 0, 4);

    //设置属性
    gridPane.setAlignment(Pos.CENTER);
    n1.setAlignment(Pos.BOTTOM_RIGHT);
    n2.setAlignment(Pos.BOTTOM_RIGHT);
    r1.setAlignment(Pos.BOTTOM_RIGHT);
    r2.setAlignment(Pos.BOTTOM_RIGHT);
    r1.setEditable(false);
    r2.setEditable(false);
    
    // 处理事件
    Add.setOnAction(e -> qiuhe());
  // 处理事件
    Subtract.setOnAction(e -> qiucha());

    // 创建场景放在舞台中
    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("数值计算"); 
    primaryStage.setScene(scene); //设置场景到舞台中
    primaryStage.show(); // 显示舞台
  }
  private void qiuhe() {
    // 获取数值
    double a =Double.parseDouble(n1.getText());
    double b = Double.parseDouble(n2.getText());
    double r =  (a+b);
    r1.setText(String.format("%.2f",
      r));
  }
     private void qiucha() {
    // 获取数值
    double a =Double.parseDouble(n1.getText());
    double b = Double.parseDouble(n2.getText());
    double r =  (a-b);
    r2.setText(String.format("%.2f",
      r));
  }
     
  
}