package URL��ȡ��ҳ����;

import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
  
public class S{  
  
    /** 
     * ���ȴ�����ȡ�ַ����������������Ҫ���Ƶ��ļ��� 
     * ����������������������� 
     * �ӻ������н��ַ�������д�뵽ҪĿ���ļ��С� 
     * @throws IOException  
     */  
    public static void main(String[] args) throws IOException {  
        FileReader fr = new FileReader("a.txt");  
        FileWriter fw = new FileWriter("b.txt");  
        BufferedReader bufr = new BufferedReader(fr);  
        BufferedWriter bufw = new BufferedWriter(fw);  
        //һ��һ�еČ���  
        String line = null;  
        while((line = bufr.readLine()) != null){  
            bufw.write(line);  
            bufw.newLine();  
            bufw.flush();  
        }  
    /*  һ���ֹ�һ���ֹ��Č��� 
        int ch = 0; 
        while((ch = bufr.read())!=-1){ 
            bufw.write(ch); 
        }*/  
        bufr.close();  
        bufw.close();  
    }  
}  
