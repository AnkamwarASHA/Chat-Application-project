import java.lang.*;
import java.net.*;
import java.io.*;

class Client
{
    public static void main(String arg[])throws Exception
    { 
       System.out.println("Client application is running");
       String s1 =null, s2 =null;
       Socket s = null;
       BufferedReader br = null, brK =null;
       PrintStream ps = null;

    try
     {  
          s = new Socket("localhost",1100);   //host,port
        
        
         brk = new BufferedReader(new InputStreamReader(Sytem.in));
         br = new BufferedReader(new InputStreamReader(s.getInputStream()));
         ps = new PrintStream(s.getOutputStream());
      while(!((s1 = brk.readLine()).equals("gn")))
      {
          ps.println(s1);
          s2 = br.readLine();
          Syatem.out.println("Server says: \n");
          Syatem.out.println("Enter message for server : \n");
        }
    }
    catch(Exception obj)
    {

    }
    finally
    {
        s.close();
        br.close();
        brK.close();
        ps.close();
    }
    catch(Exception obj)
    {

    }
}

}
