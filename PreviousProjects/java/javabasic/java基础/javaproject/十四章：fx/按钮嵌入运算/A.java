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
  private Button Add = new Button("��");
  private Button Subtract = new Button("��");
  public void start(Stage primaryStage) {
    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    
    gridPane.add(new Label("��ֵ1:"), 0, 0);
    gridPane.add(n1, 1, 0);
    gridPane.add(new Label("��ֵ2:"), 0, 1);
    gridPane.add(n2, 1, 1);
      
    gridPane.add(new Label("�ͣ�"), 0,2);
    gridPane.add(r1, 1, 2);
    gridPane.add(new Label("�"), 0, 3);
    gridPane.add(r2, 1, 3);
    gridPane.add(Add, 1, 4);
    gridPane.add(Subtract, 0, 4);

    //��������
    gridPane.setAlignment(Pos.CENTER);
    n1.setAlignment(Pos.BOTTOM_RIGHT);
    n2.setAlignment(Pos.BOTTOM_RIGHT);
    r1.setAlignment(Pos.BOTTOM_RIGHT);
    r2.setAlignment(Pos.BOTTOM_RIGHT);
    r1.setEditable(false);
    r2.setEditable(false);
    
    // �����¼�
    Add.setOnAction(e -> qiuhe());
  // �����¼�
    Subtract.setOnAction(e -> qiucha());

    // ��������������̨��
    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("��ֵ����"); 
    primaryStage.setScene(scene); //���ó�������̨��
    primaryStage.show(); // ��ʾ��̨
  }
  private void qiuhe() {
    // ��ȡ��ֵ
    double a =Double.parseDouble(n1.getText());
    double b = Double.parseDouble(n2.getText());
    double r =  (a+b);
    r1.setText(String.format("%.2f",
      r));
  }
     private void qiucha() {
    // ��ȡ��ֵ
    double a =Double.parseDouble(n1.getText());
    double b = Double.parseDouble(n2.getText());
    double r =  (a-b);
    r2.setText(String.format("%.2f",
      r));
  }
     
  
}