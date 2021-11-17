
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;





public class Result {
    JFrame rr,rr1;
    JLabel  Rii,rn4,Ri,rn,rn1,rn2,rn3,rp,rp1,rp2,rp3,R,rrn,rrn1,
            rrn2,rrn3,rrp,rrp1,rrp2,rrp3,Rr,rrv,r;
    JButton  rs,rs1,rs2,rs3,rb,Rb1,Rb,rrs1,rrs2,rrs3,rrs,rrl,rrb;
    int vote1=0;
    long vote2=0; 
    short vote3=0;
    JTextField jf,jf2,rrv1,rrv2,rrv3;
    Font f,f1;
    Panel rsp1,rsp2,rsp3,lfp1,lfp2,lfp3;
public void LoginFrames(){
    rr=new JFrame("Result");
    rr.setVisible(true);
    rr.setLayout(null);
    rr.setSize(800, 800);
    rr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    rr.getContentPane().setBackground(Color.WHITE);
    rsp1=new Panel();
    rsp1.setBounds(200, 150, 570, 580);
    rsp1.setBackground(Color.pink);
    rsp1.setLayout(null);
    rr.add(rsp1);
    rsp2=new Panel();
    rsp2.setBackground(Color.LIGHT_GRAY);
    rsp2.setBounds(0, 50, 800, 60);
    rr.add(rsp2);
      
    rsp3=new Panel();
    rsp3.setBackground(Color.LIGHT_GRAY);
    rsp3.setLayout(null);
    rsp3.setBounds(30, 0, 150, 800);
    rr.add(rsp3);     
    
        
    f=new Font("Italiac",Font.ITALIC,30);
    R=new JLabel("Caste Vote");
    R.setBounds(100, 50, 100, 30);
    R.setForeground(Color.yellow);
    R.setFont(f); rsp2.add(R);
    Ri=new JLabel("Click on given Symbol name(front the Candidate name) for give ");
    Ri.setBounds(20, 100, 600, 20);
    Ri.setForeground(Color.red);
    rsp1.add(Ri);
    Rii=new JLabel("vote to your Favourite Candidate: Thanks:");
    Rii.setBounds(20, 120, 600, 20);
    Rii.setForeground(Color.red);
    rsp1.add(Rii);
    rn=new JLabel("Candidate Name");
    rn.setBounds(20, 200, 100, 20);
    rsp1.add(rn);
    rp=new JLabel("Organiation");
        rp.setBounds(180, 200, 100, 20);
        rsp1.add(rp);
        rs=new JButton("Symbol");
        rs.setBounds(340, 200, 100, 20);
        rs.setBackground(Color.white);
        rs.setBorder(null);
        rsp1.add(rs);
            
        
        rn1=new JLabel("Mehran ALi");
        rn1.setBounds(20, 250, 100, 20);
        rsp1.add(rn1);
        rp1=new JLabel("Independence");
        rp1.setBounds(180, 250, 100, 20);
        rsp1.add(rp1);
        rs1=new JButton("Red-Rose");
        rs1.setBounds(340, 250, 100, 20);
        rs1.setBackground(Color.white);
        rs1.setBorder(null);
        rs1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  try{if(e.getSource()==rs1){
                      vote1+=1;                      
                  }
                      
      }catch(Exception ea){}
            }
        });
        rsp1.add(rs1);
        
        
        rn2=new JLabel("Asad ALi");
        rn2.setBounds(20, 300, 100, 20);
        rsp1.add(rn2);
        rp2=new JLabel("SES");
        rp2.setBounds(180, 300, 100, 20);
        rsp1.add(rp2);
        rs2=new JButton("Cricket Bat");
        rs2.setBounds(340, 300, 100, 20);
        rs2.setBackground(Color.white);
        rs2.setBorder(null);
        rs2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  try{if(e.getSource()==rs2){
                      vote2+=1;
                      
                  }
          
      }catch(Exception ea){}
            }
        });
        rsp1.add(rs2);
        
        
        rn3=new JLabel("Rameez Ahmed");
        rn3.setBounds(20, 350, 100, 20);
         rsp1.add(rn3);
        rp3=new JLabel("GDSC");
        rp3.setBounds(180, 350, 100, 20);
        rsp1.add(rp3);
        rs3=new JButton("Loin");
        rs3.setBounds(340, 350, 100, 20);
        rs3.setBackground(Color.white);
        rs3.setBorder(null);
        rs3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  try{if(e.getSource()==rs3){
                      vote3+=1;
                  }
          
      }catch(Exception ea){}
            }
        });
        rsp1.add(rs3);
        
        rb=new JButton("Back");
        rb.setBounds(300, 400, 60, 20);
        rb.setBackground(Color.white);
        rb.setBorder(null);
        rb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{if(e.getSource()==rb){
                    DataOutputStream os=null;
                 try{
                     os=new DataOutputStream(new FileOutputStream("Vote.txt"));
                     os.writeInt(vote1);
                     os.writeLong(vote2);
                     os.writeShort(vote3);
                     os.close();
                 }   catch(Exception ea){}
                    MainPage im=new MainPage();
                    im.insideVoter();
                }
                    
                }catch(Exception ea){}
            }
        });
        rsp1.add(rb);
        
        Rb=new JButton("Logout");
        Rb.setBounds(100, 400, 60, 20);
        Rb.setBackground(Color.white);
        Rb.setBorder(null);
        Rb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              try{ if(e.getSource()==Rb){
                  DataOutputStream os=null;
                 try{
                     os=new DataOutputStream(new FileOutputStream("Vote.txt"));
                     os.writeInt(vote1);
                     os.writeLong(vote2);
                     os.writeShort(vote3);
                 os.close();
                 }   
                 catch(Exception ea){}
                  System.exit(0);
              
              }
          
      }catch(Exception ea){}    
            }
        });
        rsp1.add(Rb);
       
   }
    
   public void  Results(){
        rr1=new JFrame("Result");
        rr1.setSize(800, 800);
        rr1.setLayout(null);
        rr1.setVisible(true);
        rr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rr1.getContentPane().setBackground(Color.white);
        lfp1=new Panel();
         lfp1.setBounds(200, 150, 570, 580);
         lfp1.setLayout(null);
         lfp1.setBackground(Color.pink);
         rr1.add(lfp1);
         lfp2=new Panel();
         lfp2.setBackground(Color.LIGHT_GRAY);
         lfp2.setBounds(0, 50, 800, 60);
         rr1.add(lfp2);
      
         lfp3=new Panel();
         lfp3.setBackground(Color.LIGHT_GRAY);
         lfp3.setLayout(null);
         lfp3.setBounds(30, 0, 150, 800);
         rr1.add(lfp3);     
    
         f=new Font("Italiac",Font.BOLD,30);
        r=new JLabel("Result");
        r.setBounds(100, 50, 100, 20);
        r.setForeground(Color.yellow);
        r.setFont(f); lfp2.add(r);
        rrn=new JLabel("Candidate Name");
        rrn.setBounds(20, 200, 100, 20);
        lfp3.add(rrn);
        rrp=new JLabel("Organiation");
        rrp.setBounds(20, 250, 100, 20);
        lfp3.add(rrp);
        rrs=new JButton("Symbol");
        rrs.setBounds(20, 300, 60, 20);
        rrs.setBackground(Color.LIGHT_GRAY);
        rrs.setBorder(null);
       lfp3.add(rrs);
        rrv=new JLabel("Result");
        rrv.setBounds(20, 350, 100, 20);
        rrv.setBackground(Color.white);
        rrv.setBorder(null);
        lfp3.add(rrv);
        
        DataInputStream in=null;
        try{in=new DataInputStream(new FileInputStream("Vote.txt"));
            rrv1=new JTextField();
        rrv1.setText(" "+in.readInt());
        in.close();
        rrv1.setBounds(30, 200, 40, 20);
        rrv1.setBorder(null);
        rrv1.setBackground(Color.pink);
        lfp1.add(rrv1);
        
        rrv2=new JTextField();
        rrv2.setText(" "+in.readLong());
        rrv2.setBounds(190, 200, 40, 20);
        rrv2.setBorder(null);
        rrv2.setBackground(Color.pink);
        lfp1.add(rrv2);
        rrv3=new JTextField();
        rrv3.setText(" "+in.readShort());
        rrv3.setBounds(330, 200, 100, 20);
        rrv3.setBorder(null);
        rrv3.setBackground(Color.pink);
        lfp1.add(rrv3);
       
        }catch(Exception ae){}
       
        
        rrn1=new JLabel("Mehran ALi");
        rrn1.setBounds(30, 50, 100, 20);
        lfp1.add(rrn1);
        rrp1=new JLabel("Independence");
        rrp1.setBounds(30, 100, 100, 20);
        lfp1.add(rrp1);
        rrs1=new JButton("Red-Rose");
        rrs1.setBounds(20, 150, 80, 20);
        rrs1.setBackground(Color.pink);
        rrs1.setBorder(null);
        lfp1.add(rrs1);
        
        
        rrn2=new JLabel("Asad ALi");
        rrn2.setBounds(200, 50, 100, 20);
        lfp1.add(rrn2);
        rrp2=new JLabel("SES");
        rrp2.setBounds(200, 100, 100, 20);
        lfp1.add(rrp2);
        rrs2=new JButton("Cricket Bat");
        rrs2.setBounds(170, 150, 100, 20);
        rrs2.setBackground(Color.pink);
        rrs2.setBorder(null);
        lfp1.add(rrs2);
        
        
        rrn3=new JLabel("Rameez Ahmed");
        rrn3.setBounds(320, 50, 100, 20);
        lfp1.add(rrn3);
        rrp3=new JLabel("GDSC");
        rrp3.setBounds(320, 100, 100, 20);
        lfp1.add(rrp3);
        rrs3=new JButton("Loin");
        rrs3.setBounds(290, 150, 100, 20);
        rrs3.setBackground(Color.pink);
        rrs3.setBorder(null);            
        lfp1.add(rrs3);
         
        rrb=new JButton("Back");
        rrb.setBounds(200, 350, 60, 20);
        rrb.setBackground(Color.white);
        rrb.setBorder(null);
        rrb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{if(e.getSource()==rrb){
                    MainPage mp=new MainPage();
                    mp.InsideAdmin();
                }
                    
                }catch(Exception ea){}
            }
        });
        lfp1.add(rrb);
        
        rrl=new JButton("Logout");
        rrl.setBounds(100, 350, 60, 20);
        rrl.setBackground(Color.white);
        rrl.setBorder(null);
        rrl.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              try{ if(e.getSource()==rrl){
                  System.exit(0);
              
              }
          
      }catch(Exception ea){}    
            }
        });
        lfp1.add(rrl);
   }
    public static void main (String arg[]){
       Result lg=new Result();
   
   
   
}  }
    


