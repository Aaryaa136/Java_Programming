import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient1 
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is running");


        Socket sobj=new Socket("localhost",2100);        //sends request to server
        System.out.println("Server successfully connected");
    }
}