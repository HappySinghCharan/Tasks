//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.net.*;
public class Myclient {
    public static void main(String[] args) {
          try{
              Socket s=new Socket("localhost",6666);
              DataOutputStream dout=new DataOutputStream(s.getOutputStream());
              dout.writeUTF("Hi server");
              dout.flush();
              dout.close();
              s.close();
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
    }
}