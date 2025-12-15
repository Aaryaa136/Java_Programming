import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

class Layout implements ActionListener 
{
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JLabel ClientLabel, ChatLabel;
    PrintStream pobj;

    public Layout(String title, int width, int height) throws IOException 
    {
        fobj = new JFrame(title);
        fobj.setSize(width, height);

        ClientLabel = new JLabel("Message:");
        ClientLabel.setBounds(30, 40, 100, 30);

        tobj = new JTextField();
        tobj.setBounds(130, 40, 200, 30);

        bobj = new JButton("SEND");
        bobj.setBounds(130, 90, 100, 40);

        ChatLabel = new JLabel("");
        ChatLabel.setBounds(30, 150, 300, 30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(ClientLabel);
        fobj.add(ChatLabel);

        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bobj.addActionListener(this);

        Socket sobj = new Socket("localhost", 2300);
        ChatLabel.setText("Connected to server");

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        pobj = new PrintStream(sobj.getOutputStream());

        String str1;

        while ((str1 = bobj1.readLine()) != null) 
        {
            ChatLabel.setText("Server says: " + str1);
        }
    }

    public void actionPerformed(ActionEvent aobj) 
    {
        String str1 = tobj.getText();
        pobj.println(str1);
        ChatLabel.setText("Message sent to server: " + str1);
    }
}

class ClientFrame 
{
    public static void main(String A[]) throws IOException 
    {
        Layout lobj = new Layout("Client", 400, 300);
    }
}
