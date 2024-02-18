import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Newstudent extends JFrame implements ActionListener {
    private Container c;
    private  JButton home ,nstd,hfee,dcpln,fmenu,logout;
    private ImageIcon icon,img;
    private JLabel image,headline,headline1,welcome;
    private JPanel panel,panel1,panel3;
    private JLabel title,username,passward,id;
    private JTextField pass,uname,idf;
    private JButton login;

    private Font f1,f2,f3,f4,f5,f6;
   Newstudent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        setTitle("New Student");
        body();
    }

    public void body(){

        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        panel=new JPanel();
        panel.setBounds(0,0,1500,110);
        panel.setBackground(new Color(221,255,255));
        panel.setLayout(null);
        c.add(panel);

        panel1=new JPanel();
        panel1.setBounds(20,130,200,550);
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(null);
        c.add(panel1);




        f1=new Font("Arial",Font.PLAIN,18);
        f2=new Font("Arial",Font.PLAIN,18);
        f3=new Font("Arial",Font.BOLD+Font.ITALIC,32);
        f4=new Font("Arial",Font.ITALIC,34);
        f5=new Font("Arial",Font.ITALIC,34);
        f6=new Font("Arial",Font.PLAIN,30);

        icon=new ImageIcon("Untitled(1).png");
        setIconImage(icon.getImage());
        img=new ImageIcon("gub.png");
        image=new JLabel(img);
        image.setBounds(100,0,100,100);
        panel.add(image);

        headline=new JLabel();
        headline.setText("Green");
        headline.setBounds(240,35,100,30);
        headline.setFont(f3);
        headline.setForeground(new Color(6,161,11));
        panel.add(headline);

        headline1=new JLabel();
        headline1.setText("University of Bangladesh");
        headline1.setBounds(350,35,400,30);
        headline1.setFont(f3);
        headline1.setForeground(new Color(0,204,204));
        panel.add(headline1);


        panel3=new JPanel();
        panel3.setBounds(430,170,500,400);
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(null);
        c.add(panel3);

        title=new JLabel();
        title.setBounds(150,15,220,100);
        title.setText("New Student");
        title.setFont(f6);
        panel3.add(title);


        username=new JLabel();
        username.setBounds(40,90,75,75);
        username.setText("Name");
        username.setFont(f2);
        panel3.add(username);

        id=new JLabel();
        id.setBounds(40,170,75,75);
        id.setText("Id");
        id.setFont(f2);
        panel3.add( id);

        passward=new JLabel();
        passward.setText("Passward");
        passward.setBounds(40,250,100,50);
        passward.setFont(f2);
        panel3.add(passward);

        uname=new JTextField();
        uname.setText("");
        uname.setBounds(150,115,290,35);
        uname.setToolTipText("Enter Your Name");
        uname.setBackground(new Color(255,255,153));
        uname.setFont(f1);
        panel3.add(uname);

        idf=new JTextField();
        idf.setText("");
        idf.setBounds(150,180,290,35);
        idf.setToolTipText("Enter Your Id");
        idf.setBackground(new Color(255,255,153));
        idf.setFont(f1);
        panel3.add(idf);

        pass=new JPasswordField();
        pass.setText("");
        pass.setBounds(150,245,290,35);
        pass.setBackground(new Color(255,255,153));
        pass.setToolTipText("Enter your Passward");
        pass.setFont(f5);
        panel3.add(pass);



        login=new JButton();
        login.setText("Submit");
        login.setBounds(40,330,400,40);
        login.setBackground(new Color(0,153,76));
        login.setForeground(Color.WHITE);
        login.setFont(f2);
        panel3.add(login);



        JButton home =new JButton();
        home.setText("Home Page");
        home.setBounds(15,20,150,30);
        home.setBackground(new Color(0,153,76));
        home.setForeground(Color.WHITE);
        home.setFont(f2);
        panel1.add(home);


        JButton nstd =new JButton();
        nstd.setText("New Student");
        nstd.setBounds(15,80,150,30);
        nstd.setBackground(new Color(0,153,76));
        nstd.setForeground(Color.WHITE);
        nstd.setFont(f2);
        panel1.add(nstd);

        JButton hfee =new JButton();
        hfee.setText("Hostel Fee");
        hfee.setBounds(15,140,150,30);
        hfee.setBackground(new Color(0,153,76));
        hfee.setForeground(Color.WHITE);
        hfee.setFont(f2);
        panel1.add(hfee);

        JButton dcpln =new JButton();
        dcpln.setText("Discipline");
        dcpln.setBounds(15,200,150,30);
        dcpln.setBackground(new Color(0,153,76));
        dcpln.setForeground(Color.WHITE);
        dcpln.setFont(f2);
        panel1.add(dcpln);


        JButton fmenu =new JButton();
        fmenu.setText("Food Menu");
        fmenu.setBounds(15,260,150,30);
        fmenu.setBackground(new Color(0,153,76));
        fmenu.setForeground(Color.WHITE);
        fmenu.setFont(f2);
        panel1.add(fmenu);

        logout=new JButton();
        logout.setText("Log Out");
        logout.setBounds(1200,35,100,30);
        logout.setFont(f2);
        logout.setForeground(Color.WHITE);
        logout.setBackground(new Color(0,153,76));
        panel.add(logout);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Homeframe frame1 =new Homeframe();
                frame1.setVisible(true);
            }
        });
        nstd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Newstudent frame2 =new Newstudent();
                frame2.setVisible(true);
            }
        });
        dcpln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Discipline frame3 =new Discipline();
                frame3.setVisible(true);
            }
        });
        fmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Foodmenu frame4 =new Foodmenu();
                frame4.setVisible(true);
            }
        });
        hfee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hostelfee frame5 =new Hostelfee();
                frame5.setVisible(true);
            }
        });

        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hostelportal frame=new hostelportal();
                frame.setVisible(true);
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name =uname.getText();
                String Id=idf.getText();
                String Amount= pass.getText();
                try {
                    FileWriter file=new FileWriter("E:\\Gubport\\gubport\\Database\\Newstudent.txt",true);
                    file.write(" "+name+"    "+Id+"    "+Amount+"");
                    file.write(System.getProperty("line.separator"));
                    file.close();
                    JOptionPane.showMessageDialog(null,"Added Successfully");
                    setVisible(false);
                    new Hostelfee().setVisible(true);

                }catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(null,"fileException");
                }
            }
        });



    }


    public static void main(String[] args) {
        Newstudent frame2 =new Newstudent();
        frame2.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}