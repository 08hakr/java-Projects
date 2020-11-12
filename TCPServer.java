import java.io.*;  
import java.net.*;  
public class TCPServer {  
public static void main(String[] args){  
    ServerSocket ss;
    Socket s;
    String in_str;
    DataInputStream dis;
    DataOutputStream dos;
    BufferedReader br;
    String out_str;
    try{
    ss=new ServerSocket(6666);
    s=ss.accept();
    in_str="empty";
    while(in_str!="exit"){    
    dis=new DataInputStream(s.getInputStream());
    in_str=(String)dis.readUTF();
    System.out.println("Client Message : "+in_str);
    
    
    dos=new  DataOutputStream(s.getOutputStream());
    br=new BufferedReader(new InputStreamReader(System.in));
    out_str=br.readLine();   
    dos.writeUTF(out_str);
   
    }
    ss.close();}
    catch(Exception e){}
  


/*try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println("message= "+str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
*/}  
}
