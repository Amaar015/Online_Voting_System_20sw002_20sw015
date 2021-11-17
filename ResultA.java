
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;




public class ResultA implements ActionListener  {
    
    
     JButton  jb,lb1,jb1,lb3,lb4,lb5,fvlb,fvLb,ks3,ks4,ks5,Fvlb,Fvlb1,ssp;
    JFrame jf,jfl,fb,Fcl,fbs,fcL;
    JLabel jls,jl,jl1,jl2,jl3,jl8,jl5,jl6,jl7,jl0,ja,l1,l2,l3,nicv,vid,ncv,mcv,jll9,fcll,fcll1,fcll2,jll0,
            mce,mcn,mcun,mcpn,mcan,cLv,rls,clv,mcul,mcpl,vidl,nicl,jll,jll1,jll2,jll3,jll4,jll5,jll6,jll7;
    JComboBox jtb;
    Font f,fv;
    JTextField jt3,jft, jt1,jft7,t1,t2,t3,nicvf,vidf,ncvf,mcvf, mcef,mcnf,mcunf,mcpnf,mcanf,mculf,vidlf,niclf;
    JRadioButton jcb,jcb1;
    ButtonGroup bg;
    JComboBox jt2;
    JPasswordField jp,p3,mcplf;
    Panel pf,pf1,pf2,lt,rt,ut,dt,dl,ul,rl,ll,Pv,Pvl,Pvd,Pvr,Pvu,lbs,ubs,pvvs,rbs,dbs,Pvc,Pvcl,Pvcd,Pvcu,Pvcr,
            lop1,lop2,lop3,lgp1,lgp2,lgp3,rvp1,rvp2,rvp3,lvp1,lvp2,lvp3,sp1,sp2,sp3;
    public void  Loginse(){
    jf=new JFrame("Registration Form");
    jf.setVisible(true);
    jf.setLayout(null);
    jf.setSize(800,800);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.getContentPane().setBackground(Color.WHITE);
    lop1=new Panel();
    lop1.setBounds(200, 150, 570, 580);
    lop1.setBackground(Color.pink);
    lop1.setLayout(null);
    jf.add(lop1);
    lop2=new Panel();
    lop2.setBackground(Color.LIGHT_GRAY);
    lop2.setBounds(0, 50, 800, 60);
    jf.add(lop2);
      
    lop3=new Panel();
    lop3.setBackground(Color.LIGHT_GRAY);
    lop3.setLayout(null);
    lop3.setBounds(30, 0, 150, 800);
    jf.add(lop3);      
    jls=new JLabel("REGISTRATION FORM");
    jls.setBounds(100, 10, 300, 30);
    jls.setBackground(Color.yellow);
    Font fo=new Font("Serief",Font.BOLD,30);
    jls.setFont(fo);
    lop2.add(jls); 
    
    jl=new JLabel("NAME:");
    jl.setBounds(20, 40, 100, 20);
    lop1.add(jl);
     jll=new JLabel();
     jll.setForeground(Color.red);
    jll.setBounds(150, 60, 300, 10);
    lop1.add(jll);
    
    jft=new JTextField();
    jft.setBounds(150, 40, 200, 20);
    lop1.add(jft);
    jft.addKeyListener(new KeyAdapter() {
    public void keyPressed(KeyEvent ke) {
    String value = jft.getText();
    int l = value.length();
    if (ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z') {
    jft.setEditable(true);
    jll.setText("");
     } else {
     jft.setEditable(false);
     jll.setText("* Enter only Alphabetic Keys(a-z)");
     }  }});     
    jl1=new JLabel("GENDER:");
    jl1.setBounds(20, 100, 100, 20);
    lop1.add(jl1);
    jcb=new JRadioButton("Male");
    jcb.setBounds(150, 100, 50, 20);
    jcb.setBorder(null);
    jcb.setBackground(Color.pink);
    jcb.setBorder(null);
    bg=new ButtonGroup();
    bg.add(jcb);
    lop1.add(jcb);
    jcb1=new JRadioButton("Female");
    jcb1.setBounds(220, 100, 80, 20);
    jcb1.setBorder(null);
    jcb1.setBackground(Color.pink);
    jcb1.setBorder(null);
    bg.add(jcb1);
    lop1.add(jcb1);
    jl2=new JLabel("National Identity No:");
    jl2.setBounds(20, 140, 150, 20);
    lop1.add(jl2);
    jt1=new JTextField(13);
    jt1.setBounds(150, 140, 200, 20);
    lop1.add(jt1);
    jl8=new JLabel();
    jl8.setBounds(150, 160, 300, 20);
    jl8.setForeground(Color.red);
    lop1.add(jl8);
    jt1.addKeyListener(new KeyAdapter() {
    public void keyPressed(KeyEvent ke) {
    String value = jt1.getText();
    int l = value.length();
    if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
    jt1.setEditable(true);
    jl8.setText("");
    } else {
    jt1.setEditable(false);
    jl8.setText("* Enter only Numeric Keys(0-9)");        }
    }});     
     jl3=new JLabel("PASSWORD:");
     jl3.setBounds(20, 200, 100, 20);
     lop1.add(jl3);
     jp=new JPasswordField();
     jp.getText();
     jp.setBounds(150, 200, 200, 20);
     lop1.add(jp);
     String str[]={"--Select-City--","Hyderabad","Karachi","Jamshoro","Nawabshah","Matiari","Sukhur","Larkana","Shikarpoor"};
     jl5=new JLabel("CITY:");
     jl5.setBounds(20, 260, 100, 20);
     lop1.add(jl5);
     jt2=new JComboBox(str);
     jt2.setBounds(150, 260, 200, 20);
     lop1.add(jt2);
     String str1[]={"--Select-Province--","Punjab","KPK","Balochistan","Sindh","Gilgit"};
     
     jl0=new JLabel("Province");
     jl0.setBounds(20, 320, 100, 20);
     lop1.add(jl0);
     jtb=new JComboBox(str1);
     jtb.setBounds(150, 320, 200, 20);
     lop1.add(jtb);
     jl6=new JLabel("EMAIL:");
     jl6.setBounds(20, 360, 100, 20);
     lop1.add(jl6);
     jt3=new JTextField();
     jt3.setBounds(150, 360, 200, 20);
     lop1.add(jt3);
     jl7=new JLabel("Mobile Number");
     jl7.setBounds(20, 440, 200, 20);
     lop1.add(jl7);
     jft7=new JTextField();
     jft7.setBounds(150, 440, 200, 20);
     lop1.add(jft7);
     jll1=new JLabel();
     jll1.setBounds(150, 460, 300, 20);
     jll1.setForeground(Color.red);
     lop1.add(jll1);
     jft7.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ke) {
     String value = jft7.getText();
     int l = value.length();
     if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
     jft7.setEditable(true);
     jll1.setText("");
     } else {
     jft7.setEditable(false);
     jll1.setText("* Enter only Numeric Keys(0-9)");  }}});
 
     jb=new JButton("REGISTER");
     jb.setBounds(50,500 , 100, 20);
     jb.setBackground(Color.WHITE);
     jb.addActionListener(this);
     lop1.add(jb);
     jb1=new JButton("RE-SET");
     jb1.setBounds(200, 500, 100, 20);
     jb1.setBackground(Color.WHITE);
     lop1.add(jb1);
     jb1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
     try{
     if(e.getSource()==jb1){
     jb.setText("REGISTER");
     jft.setText("");
     jt1.setText("");
     jp.setText("");
     jt3.setText("");
     jft7.setText("");}}
     catch(Exception ae){}} });}
      
    
    
    public void Login(){
    jfl=new JFrame("Login");
    jfl.setSize(800,800);
    jfl.setVisible(true);
    jfl.setLayout(null);
    jfl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfl.getContentPane().setBackground(Color.white);
    lgp1=new Panel();
    lgp1.setBounds(200, 150, 570, 580);
    lgp1.setBackground(Color.pink);
    lgp1.setLayout(null);
    jfl.add(lgp1);
    lgp2=new Panel();
    lgp2.setBackground(Color.LIGHT_GRAY);
    lgp2.setBounds(0, 50, 800, 60);
    jfl.add(lgp2);
      
    lgp3=new Panel();
    lgp3.setBackground(Color.LIGHT_GRAY);
    lgp3.setLayout(null);
    lgp3.setBounds(30, 0, 150, 800);
    jfl.add(lgp3);      
    
    
    
    l1=new JLabel("User name");
    l1.setBounds(50, 50, 100, 30);
    lgp1.add(l1);
    t1=new JTextField();
    t1.setBounds(200, 50, 200, 20);
    lgp1.add(t1);
    JLabel jl=new JLabel("Login");
    Font fff=new Font("Italiac",Font.BOLD,30);
    jl.setFont(fff);
    jl.setBounds(100, 10, 100, 30);
    jl.setForeground(Color.yellow);
    lgp2.add(jl);
    l2=new JLabel("National Identity:");
    l2.setBounds(50, 100, 100, 30);
    lgp1.add(l2);
    t2=new JTextField();
    t2.setBounds(200, 100, 200, 20);
    lgp1.add(t2);
    l3=new JLabel("Password:");
    l3.setBounds(50, 150, 100, 30);
    lgp1.add(l3);
    p3=new JPasswordField();
    p3.setBounds(200, 150, 200, 20);
    lgp1.add(p3);
    lb1=new JButton("Login");
    lb1.setBounds(150, 250, 100, 30);
    lb1.setForeground(Color.black);
    lb1.setBackground(Color.white);
    lb1.setBorder(null);
    lgp1.add(lb1); 
    lb1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    try{
    if(e.getSource()==lb1){
     String name=t1.getText();
     String nic=t2.getText();
     String Pass=String.valueOf(p3.getPassword());
     if(name.equals(jft.getText()) && Pass.equals(jp.getText())&& nic.equals(jt1.getText())){
     JOptionPane.showMessageDialog(null, "Login Successful");
     MainPage im=new MainPage();
     im.InsideAdmin();}
     else{
     JOptionPane.showMessageDialog(null, "Login Error");}
      }}catch(Exception ar){System.out.println(ar); } } });}
        
  public void actionPerformed(ActionEvent e){
      try{
     if(e.getSource()==jb){
          FileWriter fw=null;
            try{
                fw=new FileWriter("amaar.txt");
                fw.write(jft.getText()+"\n");
                fw.write(jt1.getText()+"\n");
                fw.write(jp.getText()+"\n");
                fw.write(jft7.getText()+"\n");
                fw.write(jt3.getText()+"\n");
                fw.close();
            }catch(Exception are){}
            
     JOptionPane.showMessageDialog(Fcl, "Your are Registered");
        int aa= JOptionPane.showConfirmDialog(Fcl,"Do you Want to Login?");
        if(aa==JOptionPane.YES_OPTION){
           Login();
        } else if(aa==JOptionPane.NO_OPTION){
        System.exit(0);
        }
    //Login();}}    
     }}catch(Exception ea){}}
     
  
  
  
   public void RegisterV(){
     Fcl=new JFrame("Registration Form");
     Fcl.setVisible(true);
     Fcl.setLayout(null);
     Fcl.setSize(800,800);
     Fcl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Fcl.getContentPane().setBackground(Color.white);
      rvp1=new Panel();
    rvp1.setBounds(200, 150, 570, 580);
    rvp1.setBackground(Color.pink);
    rvp1.setLayout(null);
    Fcl.add(rvp1);
    rvp2=new Panel();
    rvp2.setBackground(Color.LIGHT_GRAY);
    rvp2.setBounds(0, 50, 800, 60);
    Fcl.add(rvp2);
      
    rvp3=new Panel();
    rvp3.setBackground(Color.LIGHT_GRAY);
    rvp3.setLayout(null);
    rvp3.setBounds(30, 0, 150, 800);
    Fcl.add(rvp3);
     cLv=new JLabel("REGISTRATION FORM");
     cLv.setBounds(30, 20, 300, 40);
     cLv.setForeground(Color.yellow);
     Font fo=new Font("Serief",Font.BOLD,30);
     cLv.setFont(fo);
     rvp2.add(cLv); 
          
    
     
     nicv=new JLabel("CNI-C Number:");
     nicv.setBounds(50, 100, 100, 30);
     rvp1.add(nicv);
     nicvf=new JTextField();
     nicvf.setBounds(200, 100, 200, 20);
     rvp1.add(nicvf);
     jll3=new JLabel();
     jll3.setBounds(200, 125, 200, 20);
     jll3.setForeground(Color.red);
     rvp1.add(jll3);
     nicvf.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ke) {
     String value = nicvf.getText();
     int l = value.length();
     if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
     nicvf.setEditable(true);
     jll3.setText("");
     } else {
     nicvf.setEditable(false);
     jll3.setText("* Enter only Numeric Keys(0-9)");
     }
     } });     
    
     vid=new JLabel("Voter id:");
     vid.setBounds(50, 150, 100, 30);
     rvp1.add(vid);
     vidf=new JTextField();
     vidf.setBounds(200, 150, 200, 20);
     rvp1.add(vidf);
     jll4=new JLabel();
     jll4.setBounds(200, 170, 200, 20);
     jll4.setForeground(Color.red);
     rvp1.add(jll4);
     vidf.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ke) {
     String value = vidf.getText();
     int l = value.length();
     if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
     vidf.setEditable(true);
     jll4.setText("");
     } else {
     vidf.setEditable(false);
     jll4.setText("* Enter only Numeric Keys(0-9)");}} });     
     ncv=new JLabel("NAME:");
     ncv.setBounds(50, 200, 100, 30);
     rvp1.add(ncv);
     ncvf=new JTextField();
     ncvf.setBounds(200, 200, 200, 20);
     rvp1.add(ncvf);
     jll5=new JLabel();
     jll5.setBounds(200, 225, 200, 20);
     jll5.setForeground(Color.red);
     rvp1.add(jll5);
     ncvf.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ke) {
     String value = ncvf.getText();
     int l = value.length();
     if (ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z') {
     ncvf.setEditable(true);
     jll5.setText("");
     } else {
     ncvf.setEditable(false);
     jll5.setText("* Enter only Alphabetic Keys(a-z)");
     }} });     
     mce=new JLabel("Email:");
     mce.setBounds(50, 250, 100, 30);
     rvp1.add(mce);
     mcef=new JTextField();
     mcef.setBounds(200, 250, 200, 20);
     rvp1.add(mcef);
     mcn=new JLabel("Mobile Phone:");
     mcn.setBounds(50, 300, 100, 30);
     rvp1.add(mcn);
     mcnf=new JTextField();
     mcnf.setBounds(200, 300, 200, 20);
     rvp1.add(mcnf);
     jll6=new JLabel();
     jll6.setBounds(200, 325, 200, 20);
     jll6.setForeground(Color.red);
    rvp1.add(jll6);
     mcnf.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ke) {
     String value = mcnf.getText();
     int l = value.length();
     if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
     mcnf.setEditable(true);
     jll6.setText("");
     } else {
     mcnf.setEditable(false);
    jll6.setText("* Enter only Numeric Keys(0-9)");
    }}});     
    
     mcun=new JLabel("User Name:");
     mcun.setBounds(50, 350, 100, 30);
     rvp1.add(mcun);
     mcunf=new JTextField();
     mcunf.setBounds(200, 350, 200, 20);
     rvp1.add(mcunf);
     jll7=new JLabel();
     jll7.setBounds(200, 220, 200, 20);
     jll7.setForeground(Color.red);
     rvp1.add(jll7);
     mcunf.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ke) {
     String value = mcunf.getText();
     int l = value.length();
     if (ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z') {
     mcunf.setEditable(true);
     jll7.setText("");
     } else {
     mcunf.setEditable(false);
     jll7.setText("* Enter only ALpabetic Keys(a-z)");
     }} });     
     mcpn=new JLabel("Password:");
     mcpn.setBounds(50, 400, 100, 30);
     rvp1.add(mcpn);
     mcpnf=new JPasswordField();
     mcpnf.setBounds(200, 400, 200, 20);
     rvp1.add(mcpnf);
    
     mcan=new JLabel("Adress:");
     mcan.setBounds(50, 450, 100, 30);
     rvp1.add(mcan);
     mcanf=new JTextField();
     mcanf.setBounds(200, 450, 200, 20);
     rvp1.add(mcanf);
     jll0=new JLabel();
     jll0.setBounds(200, 220, 200, 20);
     jll0.setForeground(Color.red);
     rvp1.add(jll0);
     mcanf.addKeyListener(new KeyAdapter() {
     public void keyPressed(KeyEvent ke) {
     String value = mcanf.getText();
     int l = value.length();
     if (ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z') {
     mcanf.setEditable(true);
     jll0.setText("");
     } else {
     mcanf.setEditable(false);
     jll0.setText("* Enter only ALpabetic Keys(a-z)");
     }} });     
     fvlb=new JButton("Register");
     fvlb.setForeground(Color.black);
     fvlb.setBackground(Color.white);
     fvlb.setBorder(null);
     fvlb.setBounds(100, 500, 80, 20);
     fvlb.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e) {
     try {if(e.getSource()==fvlb){
         JOptionPane.showMessageDialog(Fcl, "You are Registered !");
     SurityV();  }} catch (Exception ea) {}}    });
     rvp1.add(fvlb);
     fvLb=new JButton("Re-set");
     fvLb.setForeground(Color.black);
     fvLb.setBackground(Color.white);
     fvLb.setBorder(null);
     fvLb.setBounds(200, 500, 80, 20);
     rvp1.add(fvLb);
     fvLb.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
     try{
     if(e.getSource()==fvLb){
     nicvf.setText("");
     vidf.setText("");
     ncvf.setText("");
     mcef.setText("");
     mcnf.setText("");
     mcunf.setText("");
     mcpnf.setText("");
     mcanf.setText(""); }}catch(Exception ea){}}});}
   //******************
   //******************
   //*****************
    public void LoginV(){
        fcL=new JFrame("Voter Login");
        fcL.setSize(800,800);
        fcL.setVisible(true);
        fcL.setLayout(null);
        fcL.getContentPane().setBackground(Color.white);
        fcL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        lvp1=new Panel();
    lvp1.setBounds(200, 150, 570, 580);
    lvp1.setBackground(Color.pink);
    lvp1.setLayout(null);
    fcL.add(lvp1);
    lvp2=new Panel();
    lvp2.setBackground(Color.LIGHT_GRAY);
    lvp2.setBounds(0, 50, 800, 60);
    fcL.add(lvp2);
      
    lvp3=new Panel();
    lvp3.setBackground(Color.LIGHT_GRAY);
    lvp3.setLayout(null);
    lvp3.setBounds(30, 0, 150, 800);
    fcL.add(lvp3);      
    
    JLabel jl3=new JLabel("Login");
       jl3.setBounds(50, 10, 100, 30);
       jl3.setForeground(Color.yellow);
       Font fr=new Font("italiac",Font.BOLD,30);
       jl3.setFont(fr);
       lvp2.add(jl3);
        mcul=new JLabel("User name");
        mcul.setBounds(50, 60, 100, 30);
        lvp1.add(mcul);
        mculf=new JTextField();
        mculf.setBounds(200, 60, 200, 20);
        lvp1.add(mculf);
        fcll=new JLabel();
        fcll.setBounds(200, 220, 100, 20);
        fcll.setForeground(Color.red);
        lvp1.add(fcll);
        mculf.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) {
        String value = mculf.getText();
        int l = value.length();
        if (ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z') {
        mculf.setEditable(true);
        fcll.setText("");
        } else {
        mcunf.setEditable(false);
        fcll.setText("* Enter only Alphabetic Keys(a-z)");}}});     
        mcpl=new JLabel("Password:");
        mcpl.setBounds(50, 110, 100, 30);
        lvp1.add(mcpl);
        mcplf=new JPasswordField();
        mcplf.setBounds(200, 110, 200, 20);
        lvp1.add(mcplf);
        vidl=new JLabel("CNI-C Number:");
        vidl.setBounds(50, 160, 100, 30);
        lvp1.add(vidl);
        vidlf=new JTextField();
        vidlf.setBounds(200, 160, 200, 20);
        lvp1.add(vidlf);
        fcll1=new JLabel();
        fcll1.setBounds(200, 220, 100, 20);
        fcll1.setForeground(Color.red);
        lvp1.add(fcll1);
        ssp=new JButton("Login");
     ssp.setBounds(150,300 , 100, 30);
     ssp.setBackground(Color.WHITE);
    ssp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
                if (e.getSource()==ssp){
                    MainPage ima=new MainPage();
                    ima.insideVoter();
                }
                
            }catch(Exception ae){}
        }
    });
     lvp1.add(ssp);
        vidlf.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) {
        String value = vidlf.getText();
        int l = value.length();
        if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
        vidlf.setEditable(true);
        fcll1.setText("");
        } else {
        vidlf.setEditable(false);
        fcll1.setText("* Enter only Numeric Keys(0-9)");
        }}});     
        nicl=new JLabel("Voter id:");
        nicl.setBounds(50, 210, 100, 30);
        lvp1.add(nicl);
        niclf=new JTextField(8);
        niclf.setBounds(200, 210, 200, 20);
        lvp1.add(niclf);
        jl8=new JLabel();
        fcll2.setBounds(200, 220, 100, 20);
        fcll2.setForeground(Color.red);
        lvp1.add(fcll2);
        jt1.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) {
        String value = niclf.getText();
        int l = value.length();
        if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
        niclf.setEditable(true);
        fcll2.setText("");
        } else {
        niclf.setEditable(false);
        fcll2.setText("* Enter only Numeric Keys(0-9)");}} });     
            
    }
    
    //**************************
    //**************************
    //**************************
   public void SurityV(){
        fbs=new JFrame("Surity");
        fbs.setVisible(true);
        fbs.setLayout(null);
        fbs.setSize(800,800);
        fbs.getContentPane().setBackground(Color.white);
        fbs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         sp1=new Panel();
         sp1.setBounds(200, 150, 570, 580);
         sp1.setLayout(null);
         sp1.setBackground(Color.pink);
         fbs.add(sp1);
         sp2=new Panel();
         sp2.setBackground(Color.LIGHT_GRAY);
         sp2.setBounds(0, 50, 800, 60);
         fbs.add(sp2);
      
         sp3=new Panel();
         sp3.setBackground(Color.LIGHT_GRAY);
         sp3.setLayout(null);
         sp3.setBounds(30, 0, 150, 800);
         fbs.add(sp3);
        rls=new JLabel("You Are Registered");
        rls.setBounds(100, 50, 300, 30);
        rls.setForeground(Color.yellow);
        Font f5=new Font("Italic",Font.BOLD,30);
        rls.setFont(f5);
        sp2.add(rls);
        ks3=new JButton("Login");
        ks3.setBounds(10, 200, 80, 20);
        ks3.setForeground(Color.black);
        ks3.setBackground(Color.WHITE);
        ks3.setBorder(null);
        ks4=new JButton("Main Menu");
        ks4.setBounds(10,250, 100, 20);
        ks4.setForeground(Color.black);
        ks4.setBackground(Color.white);
        ks4.setBorder(null);
        ks5=new JButton("Logout");
        ks5.setBounds(10, 300, 100, 20);
        ks5.setForeground(Color.black);
        ks5.setBackground(Color.WHITE);
        ks5.setBorder(null);
        sp3.add(ks3);
        sp3.add(ks4);
        sp3.add(ks5);
        ks5.addActionListener(new ActionListener() {
        public void actionPerformed( ActionEvent e){
        try{   if(e.getSource()==ks5){
        System.exit(0); }
        }catch(Exception ea){}}});
        ks4.addActionListener(new ActionListener() {
        public void actionPerformed( ActionEvent e){
        try{ if(e.getSource()==ks4){
        fbs.setVisible(false);
        MainPage iv=new MainPage();    
        iv.Interfaces();}
        }catch(Exception ea){}}});
        ks3.addActionListener(new ActionListener() {
        public void actionPerformed( ActionEvent e){
        try{ if(e.getSource()==ks3){
        fbs.setVisible(false);
        LoginV();   }
        }catch(Exception ea){}}});}
    public static void main(String arg[]){
        ResultA RAA =  new ResultA();  }}
