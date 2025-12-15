import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

class Layout implements ActionListener 
{
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JLabel ServerLabel, ChatLabel;
    PrintStream pobj;

    public Layout(String title, int width, int height) throws IOException 
    {
        fobj = new JFrame(title);
        fobj.setSize(width, height);

        ServerLabel = new JLabel("Message:");
        ServerLabel.setBounds(30, 40, 100, 30);

        tobj = new JTextField();
        tobj.setBounds(130, 40, 200, 30);

        bobj = new JButton("SEND");
        bobj.setBounds(130, 90, 100, 40);

        ChatLabel = new JLabel("");
        ChatLabel.setBounds(30, 150, 300, 30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(ServerLabel);
        fobj.add(ChatLabel);

        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bobj.addActionListener(this);

        ServerSocket ssobj = new ServerSocket(2300);
        ChatLabel.setText("Server is waiting at port 2300");

        Socket sobj = ssobj.accept();
        ChatLabel.setText("Client connected");

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        pobj = new PrintStream(sobj.getOutputStream());

        String str1;

        while ((str1 = bobj1.readLine()) != null)
        {
            ChatLabel.setText("Client says: " + str1);
        }
    }

    public void actionPerformed(ActionEvent aobj) 
    {
        String str1 = tobj.getText();
        pobj.println(str1);
        ChatLabel.setText("Message sent to client: " + str1);
    }
}

class ServerFrame {
    public static void main(String A[]) throws IOException 
    {
        Layout lobj = new Layout("Server", 400, 300);
    }
}
