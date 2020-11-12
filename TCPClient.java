import java.io.*;
import java.net.*;
public class TCPClient{
    public static void main(String args[]){
    DataOutputStream dos;
    Socket soc;
    String in_str;
    BufferedReader br;
    String out_str;
    DataInputStream dis;
try{
  soc=new Socket("127.0.0.1",6666);
  in_str="empty";
  
while(in_str!="exit"){
        dos=new      DataOutputStream(soc.getOutputStream());
        br=new BufferedReader(new InputStreamReader(System.in));
        out_str=br.readLine();
        dos.writeUTF(out_str);
  
    dis=new DataInputStream(soc.getInputStream());
    in_str=(String)dis.readUTF();
    System.out.println("Server Message: "+in_str);
    
  }
  
  soc.close();}
  catch(Exception e){}
 
  
  
  
  
  /*  Socket soc=new Socket("127.0.0.1",6666);
    
    DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
    dout.writeUTF("hii Server");
    dout.flush();
    dout.close();
    soc.close();   
   */ }
 }


