

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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



public class MainPage implements ActionListener {
    JFrame jf,j,vf,fb,fc,iaf,ivf,fu,fcc,Fcl;
    JLabel l4,rl3,lr3,fls,cc,ce,cp,ifv,cpp,cee,ffu,ff,ft,ffl,tfl,ifa,lc,lc1,lc2,lc3,lc4,lc5,lc6,lcp,lcp1,
            lcd,lcd1,lct,lct1,vtt,vtt1,lcs1,lcs2,lcs3,lcs,c,nc,idc,idv,ec,mc,uc,pcc,cac,sc,Lcg,cLv,nicv,vid,
           ncv,mce,mcn,mcun,mcpn,mcan;
    JButton vla1,b1,b2,b3,ja,ja1,kb3,kb4,kb5,lb6,vr,vl,gv,vlo,ac,ar,al,vp,vla,cb,cb1,lb0,fub,fub1,cbr,cbb,fvlb,fvLb;
    JTextField tf,ncf,idcf,idvf,ecf,mcf,ucf,adc,cacp,sc1,nicvf,vidf,
           ncvf,mcef,mcnf,mcunf,mcanf;
    JPasswordField jp,jp1,cpcc,mcpnf;
    Graphics g;
    Font  iff,f1,f,vff,fa,faa,cf,ifvf;
    Panel p,p1,p2,bp1,bp2,bp3,ap1,ap2,ap3,vp1,vp2,vp3,cp1,cp2,cp3,up1,up2,up3,iap1,iap2,iap3,ivp1,ivp2,ivp3,cap1,cap2,cap3;
    JRadioButton Lcrb,Lcrb1;
    ButtonGroup Lbg;
    JComboBox jtcb,jtcb1;
     public void Interfaces(){
         jf=new JFrame("Interface");
         jf.setSize(800,800);
         jf.setLayout(null);
         jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.getContentPane().setBackground(Color.WHITE);
         p2=new Panel();
         p2.setBounds(200, 150, 570, 580);
         p2.setBackground(Color.pink);
         jf.add(p2);
         p=new Panel();
         p.setBackground(Color.LIGHT_GRAY);
         p.setBounds(0, 50, 800, 60);
         jf.add(p);
      
         p1=new Panel();
         p1.setBackground(Color.LIGHT_GRAY);
         p1.setLayout(null);
         p1.setBounds(30, 0, 150, 800);
         jf.add(p1);     
    
         l4=new JLabel("GO----VOTE");
         l4.setForeground(Color.yellow);
         f=new Font("Italiac",Font.BOLD,40);
         l4.setBounds(50, 50, 200, 40);
         l4.setFont(f);   p.add(l4);
    
         b1=new JButton( "Admin");
         b1.setBorder(null);
         b1.setForeground(Color.black);
         b1.setBackground(Color.WHITE);
         b1.addActionListener(this);
         b1.setBounds(30, 180, 70, 30);
         p1.add(b1);
         b1.setVisible(true);
         b3=new JButton("Voter");
         b3.setBounds(30, 240, 70, 30);
         b3.setBorder(null);
         b3.setForeground(Color.black);
         b3.setBackground(Color.WHITE);
         b3.setVisible(true);
         p1.add(b3);
         b2=new JButton("Contect");
         b2.setBounds(30, 300,70, 30);
         b2.setForeground(Color.black);
         b2.setBackground(Color.WHITE);
         b2.setBorder(null);
         p1.add(b2);
         lb0=new JButton("Updates");
         lb0.setBounds(30, 360, 70, 30);
         lb0.setForeground(Color.black);
         lb0.setBackground(Color.WHITE);
         lb0.setBorder(null);
         p1.add(lb0);
         lb0.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         if(e.getSource()==lb0){
         Update();}}});
         lb6=new JButton("Logout");
         lb6.setBounds(30, 420, 70, 30);
         lb6.setForeground(Color.black);
         lb6.setBackground(Color.WHITE);
         lb6.setBorder(null);
         p1.add(lb6);
         lb6.addActionListener(new ActionListener(){
         @Override 
         public void actionPerformed(ActionEvent e){
         try{
         if(e.getSource()==lb6){
         jf.setVisible(false);
         Logout();
         System.exit(0);    }
         }catch(Exception ae){}}     });
         b3.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{
         if(e.getSource()==b3){
         jf.setVisible(false);
         Voter();}}catch(Exception ea){}}});
         b2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         if(e.getSource()==b2){
         jf.setVisible(false);
         Contect();}}  });}
         public void Logout(){
         jf.setVisible(false);}
     
           public void Backup(){
           fb=new JFrame("Surity");
           fb.setVisible(true);
           fb.setLayout(null);
           fb.setSize(800,800);
           fb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           fb.getContentPane().setBackground(Color.white);
           
           
         bp1=new Panel();
         bp1.setBounds(200, 150, 570, 580);
         bp1.setBackground(Color.pink);
         fb.add(bp1);
         bp2=new Panel();
         bp2.setBackground(Color.LIGHT_GRAY);
         bp2.setBounds(0, 50, 800, 60);
         fb.add(bp2);
      
         bp3=new Panel();
         bp3.setBackground(Color.LIGHT_GRAY);
         bp3.setLayout(null);
         bp3.setBounds(30, 0, 150, 800);
         fb.add(bp3);
         rl3=new JLabel("You Are Registered");
           rl3.setBounds(100, 50, 300, 40);
           rl3.setForeground(Color.yellow);
           Font f5=new Font("Italic",Font.BOLD,30);
           rl3.setFont(f5);
           bp1.add(rl3);  
         kb3=new JButton("Login");
           kb3.setBounds(50, 150, 100, 20);
           kb3.setForeground(Color.black);
           kb3.setBackground(Color.pink);
           kb3.setBorder(null);
           kb4=new JButton("Main Menu");
           kb4.setBounds(150,150, 100, 20);
           kb4.setForeground(Color.black);
           kb4.setBackground(Color.pink);
           kb4.setBorder(null);
           kb5=new JButton("Logout");
           kb5.setBounds(270, 150, 100, 20);
           kb5.setForeground(Color.black);
           kb5.setBackground(Color.pink);
           kb5.setBorder(null);
           bp3.add(kb3);
           bp3.add(kb4);
           bp3.add(kb5);
           kb5.addActionListener(new ActionListener() {
           public void actionPerformed( ActionEvent e){
           try{
           if(e.getSource()==kb5){
           System.exit(0);
           }
           }catch(Exception ea){}} });
           kb4.addActionListener(new ActionListener() {
           public void actionPerformed( ActionEvent e){
           try{ if(e.getSource()==kb4){
           fb.setVisible(false);
           Interfaces();}
           }catch(Exception ea){}}});
           kb3.addActionListener(new ActionListener() {
           public void actionPerformed( ActionEvent e){
           try{ if(e.getSource()==kb3){
           fb.setVisible(false);
          ResultA tvl=new ResultA();
           tvl.Login();}
           }catch(Exception ea){}}}); }
    public void Admin(){
         j=new JFrame("Admin");
         j.setSize(800,800);
         j.setLayout(null);
         j.setVisible(true);
         j.getContentPane().setBackground(Color.white);
         ap1=new Panel();
         ap1.setBounds(200, 150, 570, 580);
         ap1.setBackground(Color.pink);
         j.add(ap1);
     
         ap2=new Panel();
         ap2.setBackground(Color.LIGHT_GRAY    );
         ap2.setBounds(0, 50, 800, 60);
         j.add(ap2);
         ap3=new Panel();
         ap3.setBackground(Color.LIGHT_GRAY);
         ap3.setBounds(30, 0, 150, 800);
         ap3.setLayout(null);
         j.add(ap3);     
     
         fls=new JLabel("Admin");
         fls.setBounds(50, 100, 150, 30);
         fa=new Font("Serif",Font.BOLD,40);
         fls.setFont(fa);
         fls.setForeground(Color.yellow);
         ap2.add(fls);
         ja =new JButton("Login");
         ja.setBounds(20, 250, 100, 30);
         ja.setForeground(Color.black);
         ja.setBackground(Color.white);
         ja.setBorder(null);
         ja.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
         try{
         if(e.getSource()==ja){
         ResultA t=new ResultA();
         t.Login();}
         }catch(Exception ae){} }
         });
         ap3.add(ja); 
         ja1 =new JButton("Registration");
         ja1.setBounds(20, 200, 100, 30);
         ja1.setForeground(Color.black);
         ja1.setBackground(Color.white);
         ja1.setBorder(null);
         ja1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{if(e.getSource()==ja1){
         ResultA t=new ResultA();
         t.Loginse();}
         }catch(Exception ea){}}  });
         ap3.add(ja1);}
       public void Voter(){
         vf=new JFrame("Voter");
         vf.setVisible(true);
         vf.setLayout(null);
         vf.setSize(800,800);
         vf.getContentPane().setBackground(Color.white);
         vf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         vp1=new Panel();
         vp1.setBounds(200, 150, 570, 580);
         vp1.setBackground(Color.pink);
         vf.add(vp1);
         vp2=new Panel();
         vp2.setBackground(Color.LIGHT_GRAY);
         vp2.setBounds(0, 50, 800, 60);
         vf.add(vp2);
      
        vp3=new Panel();
         vp3.setBackground(Color.LIGHT_GRAY);
         vp3.setLayout(null);
         vp3.setBounds(30, 0, 150, 800);
         vf.add(vp3);
         
         lr3=new JLabel("Voter");
         lr3.setBounds(230, 100, 100, 40);
         lr3.setForeground(Color.yellow);
         faa=new Font("Serif",Font.BOLD,40);
         lr3.setFont(faa);
         vp2.add(lr3);
         vr=new JButton("Registration");
         vr.setForeground(Color.black);
         vr.setBounds(30, 170, 80, 30);
         vr.setBackground(Color.WHITE);
         vr.setBorder(null);
         vr.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{
         if(e.getSource()==vr){
         ResultA ttt=new ResultA();
         ttt.RegisterV();}
         }catch(Exception ae){}}});
         vp3.add(vr);
         vl=new JButton("Login");
         vl.setBounds(30, 230, 80, 30);
         vl.setForeground(Color.black);
         vl.setBackground(Color.WHITE);
         vl.setBorder(null);
         vl.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{
         if(e.getSource()==vl){
         ResultA Ra=new ResultA();
         Ra.LoginV();
         }}catch(Exception ea){}     }});
         vp3.add(vl);}
       //.....................................................//
       //.......................Contect........................//
    public void Contect(){
        fc=new JFrame("Contact");
        fc.setVisible(true);
        fc.setLayout(null);
        fc.setSize(800,800);
        fc.getContentPane().setBackground(Color.white);
        fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp1=new Panel();
        cp1.setBounds(200, 150, 570, 580);
        cp1.setBackground(Color.pink);
        fc.add(cp1);
        cp2=new Panel();
        cp2.setBackground(Color.LIGHT_GRAY);
        cp2.setBounds(0, 50, 800, 60);
        fc.add(cp2);
      
        cp3=new Panel();
        cp3.setBackground(Color.LIGHT_GRAY);
        cp3.setLayout(null);
        cp3.setBounds(30, 0, 150, 800);
        fc.add(cp3);
         
        cc=new JLabel("Contact us");
        cc.setBounds(100, 130, 200, 50);
        cf=new Font("Serif",Font.BOLD,40);
        cc.setFont(cf);
        cc.setForeground(Color.yellow);
        cp2.add(cc);
        Font cf1=new Font("Serif",Font.BOLD,20);
        ce=new JLabel("By Email:");
        ce.setBounds(10, 170, 120, 30);
        ce.setFont(cf1);
        ce.setForeground(Color.BLACK);
        cp3.add(ce);
        cee=new JLabel("admin.onlinevoting@gmail.com");
        cee.setBounds(30, 20, 350, 30);
        cee.setFont(cf1);
        cp1.setLayout(null);
        cee.setForeground(Color.BLACK);
        cp1.add(cee);
        ce=new JLabel("By Mobile Phone:");
        ce.setBounds(2, 240, 300, 30);
        ce.setForeground(Color.black);
        ce.setFont(cf1);
        cp3.add(ce);
        cpp=new JLabel("03323498326");
        cpp.setBounds(30, 90, 300, 30);
        cpp.setFont(cf1);
        cpp.setForeground(Color.black);
        cp1.add(cpp);
        ff=new JLabel("by Twiter:");
        ff.setBounds(10, 310, 100, 30);
        ff.setForeground(Color.black);
        ff.setFont(cf1);
        cp3.add(ff);
        ffl=new JLabel("@twiter.onlinevotingsystem");
        ffl.setBounds(30, 160, 350, 30);
        ffl.setForeground(Color.black);
        ffl.setFont(cf1);
        cp1.add(ffl);
        ft=new JLabel("by Post:");
        ft.setBounds(10, 380, 100, 30);
        ft.setFont(cf1);
        ft.setForeground(Color.black);
        cp3.add(ft);
        tfl=new JLabel("MUET jamshoro sindh pakistan");
        tfl.setBounds(30, 230, 300, 20);
        tfl.setForeground(Color.BLACK);
        tfl.setFont(cf1);
        cp1.add(tfl);
        cb=new JButton("Back");
        cb.setBounds(50, 420, 80, 30);
        cb.setBorder(null);
        cb.setBackground(Color.white);
        cb.setForeground(Color.black);
        cb.setFont(cf1);
        cb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{
        if(e.getSource()==cb){
        Interfaces();  }
        }catch(Exception ea){}
        }});
        cp1.add(cb);
        cb1=new JButton("Logout");
        cb1.setBounds(250, 420, 80, 30);
        cb1.setBorder(null);
        cb1.setBackground(Color.white);
        cb1.setForeground(Color.black);
        cb1.setFont(cf1);
        cb1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{
        if(e.getSource()==cb1){
        System.exit(0);  }
        } catch(Exception ea){}} }) ; 
        cp1.add(cb1);}
   //........................................................//
   //........................Admin...........................//
    public void InsideAdmin(){
         iaf=new JFrame("Admin");
         iaf.setVisible(true);
         iaf.setLayout(null);
         iaf.setSize(800,800);
         iaf.getContentPane().setBackground(Color.white);
         iaf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         iap1=new Panel();
         iap1.setBounds(200, 150, 570, 580);
         iap1.setBackground(Color.pink);
         iaf.add(iap1);
         iap2=new Panel();
         iap2.setBackground(Color.LIGHT_GRAY);
        iap2.setBounds(0, 50, 800, 60);
        iaf.add(iap2);
      
        iap3=new Panel();
        iap3.setBackground(Color.LIGHT_GRAY);
        iap1.setLayout(null);
        iap3.setBounds(30, 0, 150, 800);
        iaf.add(iap3);

         ifa=new JLabel("Admin");
         ifa.setBounds(100, 20, 150, 30);
         iff=new Font("Serif",Font.BOLD,40);
         ifa.setFont(iff);
         ifa.setForeground(Color.yellow);
         iap2.add(ifa);
                
         
         
         ac =new JButton("Manage Candidate");
         ac.setBounds(10, 200, 120, 20);
         ac.setForeground(Color.black);
         ac.setBackground(Color.WHITE);
         ac.setBorder(null);
         ac.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{
         Candidate();
         }catch(Exception ae){} }   });
         iap3.add(ac);
         ar =new JButton("View Results");
         ar.setBounds(10, 250, 120, 20);
         ar.setForeground(Color.black);
         ar.setBackground(Color.WHITE);
         ar.setBorder(null);
         ar.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{
         if(e.getSource()==ar){
         Result Rs=new Result();
         Rs.Results(); }
         }catch(Exception ae){}  }       });
         iap3.add(ar);
         al =new JButton("logout");
         al.setBounds(10, 350, 120, 20);
         al.setForeground(Color.black);
         al.setBackground(Color.WHITE);
         al.setBorder(null);
         iap3.setLayout(null);
         al.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{ 
         if(e.getSource()==al){
         System.exit(0);
         iaf.setVisible(false);}
         }catch(Exception ae){}}});
         iap3.add(al);
         final JButton al1 =new JButton("Main Page");
         al1.setBounds(10, 300, 120, 20);
         al1.setForeground(Color.black);
         al1.setBackground(Color.WHITE);
         al1.setBorder(null);
         //iap3.setLayout(null);
         al1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         try{ 
         if(e.getSource()==al1){
        Interfaces();
         iaf.setVisible(false);}
         }catch(Exception ae){}}});
         iap3.add(al1);
             
    
    
    }
           //...............................................................//
           //.............................Voter.............................//
    public void insideVoter(){
        ivf=new JFrame("voter");
        ivf.setVisible(true);
        ivf.setLayout(null);
        ivf.setSize(800,800);
        ivf.getContentPane().setBackground(Color.white);
        ivf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          ivp1=new Panel();
        ivp1.setBounds(200, 150, 570, 580);
        ivp1.setBackground(Color.pink);
        ivp1.setLayout(null);
        ivf.add(ivp1);
        ivp2=new Panel();
        ivp2.setBackground(Color.LIGHT_GRAY);
        ivp2.setBounds(0, 50, 800, 60);
        ivf.add(ivp2);
      
        ivp3=new Panel();
        ivp3.setBackground(Color.LIGHT_GRAY);
        ivp3.setLayout(null);
        ivp3.setBounds(30, 0, 150, 800);
        ivf.add(ivp3);
        
        
        ifv=new JLabel("Voter");
        ifv.setBounds(100, 10, 150, 30);
        ifvf=new Font("Serif",Font.BOLD,40);
        ifv.setFont(ifvf);
        ifv.setForeground(Color.yellow);
        ivp2.add(ifv);
        gv=new JButton("Give Vote");
        gv.setBounds(10, 200, 80, 20);
        gv.setForeground(Color.black);
        gv.setBackground(Color.WHITE);
        gv.setBorder(null);
        gv.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{ if(e.getSource()==gv){
        Result lf=new Result();
        lf.LoginFrames();}
        }catch(Exception ae){} }});
        ivp3.add(gv);
        vp=new JButton("Update profile");
        vp.setBounds(10, 250, 80, 20);
        vp.setForeground(Color.black);
        vp.setBackground(Color.white);
        vp.setBorder(null);
        vp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{}catch(Exception ae){}}});
        ivp3.add(vp);
        vla=new JButton("Logout");
        vla.setBounds(10, 350, 80, 20);
        vla.setForeground(Color.black);
        vla.setBackground(Color.WHITE);
        vla.setBorder(null);
        vla.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{if(e.getSource()==vla){
        System.exit(0);}
        }catch(Exception ae){}}});
        ivp3.add(vla);
        vla1=new JButton("Main Menu");
        vla1.setBounds(10, 300, 80, 20);
        vla1.setForeground(Color.black);
        vla1.setBackground(Color.WHITE);
        vla1.setBorder(null);
        vla1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{if(e.getSource()==vla1){
        Interfaces();}
        }catch(Exception ae){}}});
        ivp3.add(vla1); }
         
         //......................................................//
         //..................UPdates.............................//
     public void Update(){
        fu=new JFrame("Updates");
        fu.setVisible(true);
        fu.setLayout(null);
        fu.setSize(800,800);
        fu.getContentPane().setBackground(Color.white);
        fu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        up1=new Panel();
        up1.setBounds(200, 150, 570, 580);
        up1.setBackground(Color.pink);
        fu.add(up1);
        up2=new Panel();
        up2.setBackground(Color.LIGHT_GRAY);
        up2.setBounds(0, 50, 800, 60);
        fu.add(up2);
      
        up3=new Panel();
        up3.setBackground(Color.LIGHT_GRAY);
        up1.setLayout(null);
        up3.setBounds(30, 0, 150, 800);
        fu.add(up3);

        lcs=new JLabel("!!!Updates About new Election!!!");
        lcs.setBounds(100, 20, 500, 30);
        lcs.setForeground(Color.yellow);
        Font f=new Font("Italiac",Font.BOLD,30);
        lcs.setFont(f); up2.add(lcs);
        lc=new JLabel("Candidates");
        lc.setBounds(50, 100, 200, 30);
        lc.setForeground(Color.black);
        lc.setFont(f); up1.add(lc);
        lc1 =new JLabel("Mehran Ali");
        lc1.setBounds(30, 140, 80, 20);
        lc1.setForeground(Color.black);
        up1.add(lc1);
        lcs1 =new JLabel("Pen");
        lcs1.setBounds(100, 140, 50, 20);
        lcs1.setForeground(Color.black);
        up1.add(lcs1);
        lc2 =new JLabel("Independence");
        lc2.setBounds(200, 140, 100, 20);
        lc2.setForeground(Color.black);
        up1.add(lc2);
        lc3 =new JLabel("Asad Ali");
        lc3.setBounds(30, 170, 80, 20);
        lc3.setForeground(Color.black);
        up1.add(lc3);
        lcs2 =new JLabel("Ink pot");
        lcs2.setBounds(100, 170, 50, 20);
        lcs2.setForeground(Color.black);
        up1.add(lcs2);
        lc4 =new JLabel("TLP");
        lc4.setBounds(200, 170, 100, 20);
        lc4.setForeground(Color.black);
        up1.add(lc4);
        lc5 =new JLabel("Rameez Ahmed");
        lc5.setBounds(30, 200, 80, 20);
        lc5.setForeground(Color.black);
        up1.add(lc5);
        lcs3 =new JLabel("Ball");
        lcs3.setBounds(100, 200, 50, 20);
        lcs3.setForeground(Color.black);
        up1.add(lcs3);
        lc6 =new JLabel("GDC");
        lc6.setBounds(200, 200, 100, 20);
        lc6.setForeground(Color.black);
        up1.add(lc6);
        lcp=new JLabel("Palce of Election");
        lcp.setBounds(320, 100, 300, 30);
        lcp.setForeground(Color.black);
        lcp.setFont(f); up1.add(lcp);
        lcp1=new JLabel("MUET Jamshoro, Sindh Pakistan");
        lcp1.setBounds(350, 170, 300, 20);
        lcp1.setBackground(Color.black);
        up1.add(lcp1);
        lcd=new JLabel("Date of Votting");
        lcd.setBounds(50, 250, 300, 40);
        lcd.setForeground(Color.black);
        lcd.setFont(f); up1.add(lcd);
        lcd1=new JLabel("15/November/2021");
        lcd1.setBounds(50, 300, 300, 20);
        lcd1.setBackground(Color.blue);
        up1.add(lcd1);
        lct=new JLabel("Time of Votting");
        lct.setBounds(320, 250, 300, 40);
        lct.setForeground(Color.black);
        lct.setFont(f); up1.add(lct);
        lct1=new JLabel("8:00 am to 5:00 pm");
        lct1.setBounds(350, 300, 300, 20);
        lct1.setBackground(Color.blue);
        up1.add(lct1);
        fub=new JButton("Back");
        fub.setBounds(100, 380, 100, 30);
        fub.setBorder(null);
        fub.setBackground(Color.white);
        fub.setForeground(Color.black);
        up1.add(fub);
        fub.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e){
        try{if(e.getSource()==fub){
        Interfaces();
        } }catch(Exception ae){} }});
        fub1=new JButton("Logout");
        fub1.setBounds(300, 380, 100, 30);
        fub1.setBorder(null);
        fub1.setBackground(Color.white);
        fub1.setForeground(Color.black);
        up1.add(fub1);
        fub1.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e){
        try{if(e.getSource()==fub1){
        System.exit(0); }
        }catch(Exception ae){}}
        });}
     //...................................................//
     //...................Candidate......................//
    public void  Candidate(){
        Fcl=new JFrame("Registration Form");
        Fcl.setVisible(true);
        Fcl.setLayout(null);
        Fcl.setSize(800,800);
        Fcl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fcl.getContentPane().setBackground(Color.white);
          cap1=new Panel();
        cap1.setBounds(200, 150, 570, 580);
        cap1.setBackground(Color.pink);
        Fcl.add(cap1);
        cap2=new Panel();
        cap2.setBackground(Color.LIGHT_GRAY);
        cap2.setBounds(0, 50, 800, 60);
        Fcl.add(cap2);
      
        cap3=new Panel();
        cap3.setBackground(Color.LIGHT_GRAY);
        cap1.setLayout(null);
        cap3.setBounds(30, 0, 150, 800);
        Fcl.add(cap3);
        cLv=new JLabel("REGISTRATION FORM");
        cLv.setBounds(50, 50, 400, 40);
        Font fo=new Font("Serief",Font.BOLD,30);
        cLv.setFont(fo);
        cap2.add(cLv); 
        nicv=new JLabel("CNI-C Number:");
        nicv.setBounds(50, 100, 100, 30);
        cap1.add(nicv);
        nicvf=new JTextField();
        nicvf.setBounds(200, 100, 200, 20);
        cap1.add(nicvf);
        vid=new JLabel("Voter id:");
        vid.setBounds(50, 150, 100, 30);
        cap1.add(vid);
        vidf=new JTextField();
        vidf.setBounds(200, 150, 200, 20);
        cap1.add(vidf);
        ncv=new JLabel("NAME:");
        ncv.setBounds(50, 200, 100, 30);
        cap1.add(ncv);
        ncvf=new JTextField();
        ncvf.setBounds(200, 200, 200, 20);
        cap1.add(ncvf);
        mce=new JLabel("Email:");
        mce.setBounds(50, 250, 100, 30);
        cap1.add(mce);
        mcef=new JTextField();
        mcef.setBounds(200, 250, 200, 20);
        cap1.add(mcef);
        mcn=new JLabel("Mobile Phone:");
        mcn.setBounds(50, 300, 100, 30);
       cap1.add(mcn);
        mcnf=new JTextField();
        mcnf.setBounds(200, 300, 200, 20);
        cap1.add(mcnf);
        mcun=new JLabel("User Name:");
        mcun.setBounds(50, 350, 100, 30);
        cap1.add(mcun);
        mcunf=new JTextField();
        mcunf.setBounds(200, 350, 200, 20);
        cap1.add(mcunf);
    
        mcpn=new JLabel("Password:");
        mcpn.setBounds(50, 400, 100, 30);
        cap1.add(mcpn);
        mcpnf=new JPasswordField();
        mcpnf.setBounds(200, 400, 200, 20);
        cap1.add(mcpnf);
        mcan=new JLabel("Adress:");
        mcan.setBounds(50, 450, 100, 30);
        cap1.add(mcan);
        mcanf=new JTextField();
        mcanf.setBounds(200, 450, 200, 20);
        cap1.add(mcanf);
        fvlb=new JButton("Register");
        fvlb.setForeground(Color.black);
        fvlb.setBackground(Color.white);
        fvlb.setBorder(null);
        fvlb.setBounds(100, 500, 80, 20);
        fvlb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        try {if(e.getSource()==fvlb){
        int a= JOptionPane.showConfirmDialog(Fcl, "Are you Sure?");
        if(a==JOptionPane.YES_OPTION){
            FileWriter fw=null;
            try{
                fw=new FileWriter("amaar.txt");
                fw.write(nicvf.getText()+"\n");
                fw.write(vidf.getText()+"\n");
                fw.write(ncvf.getText()+"\n");
                fw.write(mcef.getText()+"\n");
                fw.write(mcnf.getText()+"\n");
                fw.write(mcunf.getText()+"\n");
                fw.write(mcpnf.getText()+"\n");
                fw.write(mcanf.getText()+"\n");
                fw.close();
            }catch(Exception are){}
           
        JOptionPane.showMessageDialog(Fcl, "Your Candidate is Registered");
        int aa= JOptionPane.showConfirmDialog(Fcl,"Do you Want to Add another Candidate?");
        if(aa==JOptionPane.YES_OPTION){
            Candidate();
        } else if(aa==JOptionPane.NO_OPTION){
                    InsideAdmin();         
                    }
        else{  System.exit(0); 
       }
        
        }
        }} catch (Exception ea) {
        }} });
        cap1.add(fvlb);
       fvLb=new JButton("Re-set");
       fvLb.setForeground(Color.black);
       fvLb.setBackground(Color.white);
       fvLb.setBorder(null);
       fvLb.setBounds(200, 500, 80, 20);
       cap1.add(fvLb);
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
       mcanf.setText("");
       }}catch(Exception ea){}
       }});}
   
    public static void main(String arg[]){
       MainPage MP=new MainPage();
       MP.Interfaces();}
    public void actionPerformed(ActionEvent e) {
       try{
       if(e.getSource()==b1){
       jf.setVisible(false);
       Admin();}}
       catch(Exception ea){}}}    
    

