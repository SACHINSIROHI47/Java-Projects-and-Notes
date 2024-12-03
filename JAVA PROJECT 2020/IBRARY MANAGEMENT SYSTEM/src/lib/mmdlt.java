
package lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
import javax.swing.border.*;//border
import java.sql.*;
import javax.imageio.ImageIO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class mmdlt extends JFrame implements ActionListener
{

     JFrame f;
     JPanel p,mp,bd;
 JLabel tag,hidden,m_id,m_name;
 JTextField txtMName;
JComboBox cmbMemberID;
  
    JButton btnCheck,btnDelete,btnClear,btnSearch;
      Statement stmt;
        static JTable table,table1;
    DefaultTableModel model,model1;
      String MIDlist;

         String[] columnNames={"MEMBER_ID", "BOOK_ID", "ISSUE", "B_RETURN", "B_STATUS"} ;
           String[] columnNames1={"NAME","EMAIL_ID","CONTACT","FATHER_NAME"} ;
      mmdlt()
    {

    try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:bb","sa","sqlserver");
	stmt=con.createStatement();
        }
        catch(Exception e4)
        {
            JOptionPane.showMessageDialog(f,e4);
        }
      }

       public void mmbrdlt()throws Exception
    {
        f=new JFrame("Dashboard");
        f.setLayout(null);
        f.setSize(900,700);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        Color f1=new Color(174,174,174);
        f.getContentPane().setBackground(f1);
        p=new JPanel();
        p.setLayout(null);
        Color p1=new Color(229,229,229);
        p.setBackground(p1);
        p.setBounds(50,100,800,500);

        ////////////////////////////////////////////////////////////////////

         BufferedImage ad =ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\mmdlt.png"));
         JLabel bken=new JLabel(new ImageIcon(ad));
         bken.setBounds(20,20,150,240);
         bken.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
         p.add(bken);

        tag=new JLabel("  DELETE MEMBER ID");
          tag.setFont(new Font("Century Schoolbook",Font.BOLD,32));
  // tag.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
      //  tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));

     tag.setBounds(260,30,400,50);
     f.add(tag);

     //////////////////////////////////////////////////////////////////////////

     m_id=new JLabel("Member ID");
        m_id.setFont(new Font("Times new roman",Font.PLAIN,20));
        m_id.setBounds(370,30,150,25);
        p.add(m_id);

    

         try
        {
      ResultSet rs = stmt.executeQuery("select MEMBER_ID from newmember order by MEMBER_ID asc");

            Vector v = new Vector();

            while (rs.next()) {

                MIDlist = rs.getString(1);

                v.add(MIDlist);

            }

        cmbMemberID=new JComboBox(v);
        cmbMemberID.setFont(new Font("Times new roman",Font.PLAIN,18));
        cmbMemberID.setBounds(550,20,220,35);
        p.add(cmbMemberID);

            rs.close();

              cmbMemberID.requestFocus();
              cmbMemberID.setSelectedIndex(-1);
              cmbMemberID.addActionListener(this);
        }//try
catch(Exception tmc)
  {
    JOptionPane.showMessageDialog(f,tmc);
  }

        m_name=new JLabel("Member Name");
        m_name.setFont(new Font("Times new roman",Font.PLAIN,20));
        m_name.setBounds(370,80,150,25);
        p.add(m_name);

        txtMName=new JTextField();
        txtMName.setFont(new Font("Times new roman",Font.PLAIN,18));
        txtMName.setEditable(false);
        txtMName.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
        Color brtn = new Color(220,228,239);
        txtMName.setBackground(brtn);
        txtMName.setBounds(550,70,220,35);
        p.add(txtMName);

        btnClear=new JButton("CLEAR");
        btnClear.setBackground(Color.lightGray);
        btnClear.setFont(new Font("Times new roman",Font.BOLD,12));
        btnClear.setBounds(680,120,80,25);
        btnClear.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnClear.addActionListener(this);
        p.add(btnClear);

         btnSearch=new JButton("SEARCH");
        btnSearch.setBackground(Color.lightGray);
        btnSearch.setFont(new Font("Times new roman",Font.BOLD,12));
        btnSearch.setBounds(550,120,80,25);
        btnSearch.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnSearch.addActionListener(this);
        p.add(btnSearch);

        mp=new JPanel();
        mp.setLayout(null);
       // mp.setLayout(new BorderLayout());
        Color mp1=new Color(216,216,177);
        mp.setBackground(mp1);
        mp.setBounds(10,320,780,100);
        p.add(mp);
        
        JLabel m_det=new JLabel("Member Details");
        m_det.setFont(new Font("Times new roman",Font.PLAIN,14));
        m_det.setBounds(10,5,100,20);
        mp.add(m_det);

        bd=new JPanel();
        bd.setLayout(null);
        bd.setBackground(mp1);
        bd.setBounds(200,160,580,150);
        p.add(bd);

        JLabel b_det=new JLabel("Issued Book Details");
        b_det.setFont(new Font("Times new roman",Font.PLAIN,14));
        b_det.setBounds(10,5,200,20);
        bd.add(b_det);

        btnCheck=new JButton("CHECK");
        btnCheck.setBackground(Color.lightGray);
        btnCheck.setFont(new Font("Times new roman",Font.BOLD,16));
        btnCheck.setBounds(50,440,100,35);
        btnCheck.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnCheck.addActionListener(this);
        p.add(btnCheck);

        btnDelete=new JButton("DELETE");
        btnDelete.setBackground(Color.lightGray);
        btnDelete.setFont(new Font("Times new roman",Font.BOLD,16));
        btnDelete.setBounds(650,440,100,35);
        btnDelete.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnDelete.addActionListener(this);
        p.add(btnDelete);

         hidden = new JLabel("");
          hidden.setFont(new Font("Times new roman",Font.PLAIN,16));
          hidden.setForeground(Color.red);
        hidden.setBounds(200,450,400,20);
        p.add(hidden);

        try
        {
         ResultSet rsz=stmt.executeQuery( "select * from newmember");
                    if(rsz.next())
                   {

                   }
          else
                    {
                JOptionPane.showMessageDialog(f,"No Member record");

                    }
        }
         catch(Exception ee)
        {
            JOptionPane.showMessageDialog(f, ee);
        }


     f.add(p);
      
     f.setVisible(true);


     /////////////////////////////////////////////////////////////////////////
    }

       public void actionPerformed(ActionEvent mm)
    {
            String bid,bidi,bid1,mid,midi,mid1,b_name1,brw,ixu,rtn;
                int bidI,midI;


        //   mid1= cmbMemberID.getSelectedItem().toString(); JOptionPane.showMessageDialog(f,mid1);
           midI=cmbMemberID.getSelectedIndex(); //JOptionPane.showMessageDialog(f,midI);
           midi=Integer.toString(midI); //JOptionPane.showMessageDialog(f,midi);

      if(mm.getSource()==btnClear)
            {
               try
                 {
                      
                       if(midi.equals("-1"))// && bid1.equals(""))
                        {
                         JOptionPane.showMessageDialog(f,"Select Member ID");
                         cmbMemberID.requestFocus();
                         return;
                        }

 else
                          {
                          txtMName.setText("");
                          table.setVisible(false);
                          table.setModel(new DefaultTableModel(null,columnNames) );
                          table.removeAll();
                         // table.setVisible(false);
                          table1.setVisible(false);
                          table1.setModel(new DefaultTableModel(null,columnNames) );
                          table1.removeAll();
                          hidden.setText("");
                       }

               }
                 catch(Exception mi)
                 {
                     JOptionPane.showMessageDialog(f,mi);
                 }

            }//btnClear

       else   if (mm.getSource()==btnSearch)
             {

                       try
                 {
                       if(midi.equals("-1"))// && bid1.equals(""))
                        {
                         JOptionPane.showMessageDialog(f,"Select Member ID");
                         cmbMemberID.requestFocus();
                      //   table.setVisible(false);
                       //  table1.setVisible(false);
                        }

            else
                  {

                           if(txtMName.getText().equals(""))
                           {
                                mid = cmbMemberID.getSelectedItem().toString();
                   ResultSet rso=stmt.executeQuery("select * from newmember where MEMBER_ID='"+mid+"'");
                   if(rso.next())

                  {
           // cmbMemberID.setSelectedItem(rs.getString("MEMBER_ID"));
              txtMName.setText(rso.getString("NAME"));
                  }

                           }
                 // JOptionPane.showMessageDialog(f,"else");
                  model1 = new DefaultTableModel();
                  model1.setColumnIdentifiers(columnNames1);
                  table1 = new JTable();
                  table1.setModel(model1);
                  table1.setFont(new Font("Verdana",Font.PLAIN,10));
                  table1.setBounds(20,30,740,60);
                  table1.setRowHeight(35);
                  table1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
                  table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                  table1.setFillsViewportHeight(true);
                  JScrollPane scroll1 = new JScrollPane(table1);
                  scroll1.setHorizontalScrollBarPolicy(
                  JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                  scroll1.setVerticalScrollBarPolicy(
                  JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                  mp.add(scroll1);
                  mp.add(table1);


                  model = new DefaultTableModel();
                  model.setColumnIdentifiers(columnNames);
                  table = new JTable();
                  table.setModel(model);
                  table.setFont(new Font("Verdana",Font.PLAIN,14));
                  table.setBounds(20,30,535,100);
                  table.setRowHeight(35);
                  table.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
                  table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                  table.setFillsViewportHeight(true);
                  JScrollPane scroll = new JScrollPane(table);
                  scroll.setHorizontalScrollBarPolicy(
                  JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                  scroll.setVerticalScrollBarPolicy(
                  JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                  bd.add(scroll);
                  bd.add(table);

 mid = cmbMemberID.getSelectedItem().toString();
   String NAME="",EMAIL_ID="",CONTACT="",FATHER_NAME="";
                  ResultSet md = stmt.executeQuery("select * from newmember where MEMBER_ID ='"+mid+"'");
                    int j=0;
               while(md.next())
               {

                   //   if(tb.next())
                 // {

               //  table.setVisible(true);
                     //  BORROW_NO=(tb.getString("BORROW_NO"));

                         NAME=(md.getString("NAME"));
                          EMAIL_ID=(md.getString("EMAIL_ID"));
                           CONTACT=(md.getString("CONTACT"));
                            FATHER_NAME=(md.getString("FATHER_NAME"));
                             
                             model1.addRow(new Object[]{NAME,EMAIL_ID,CONTACT,FATHER_NAME});
                             j++;
                 // txtMName.setText((md.getString("NAME")));
               }

                  String MEMBER_ID="",BOOK_ID="",ISSUE="",B_RETURN="",B_STATUS="";
                  //   mid = cmbMemberID.getSelectedItem().toString();
                  ResultSet tb = stmt.executeQuery("select * from b_BRW where MEMBER_ID ='"+mid+"' and B_STATUS ='ISSUED'");
                  int i = 0;
               while(tb.next())
               {

                   //   if(tb.next())
                 // {

                 table.setVisible(true);
                     //  BORROW_NO=(tb.getString("BORROW_NO"));
                        MEMBER_ID=(tb.getString("MEMBER_ID"));
                         BOOK_ID=(tb.getString("BOOK_ID"));
                          ISSUE=(tb.getString("ISSUE"));
                           B_RETURN=(tb.getString("B_RETURN"));
                            B_STATUS=(tb.getString("B_STATUS"));

                             model.addRow(new Object[]{MEMBER_ID,BOOK_ID,ISSUE,B_RETURN,B_STATUS});
                             i++;
                //  }//while
               }
                if(i<1)
               {
                     // table.setVisible(false);
                    table.setModel(new DefaultTableModel(null,columnNames) );
                     JOptionPane.showMessageDialog(null, "No Issued Book record found "+ mid, "Record Table", JOptionPane.ERROR_MESSAGE);
               }
 //JOptionPane.showMessageDialog(f, "Member record found");


                    }//else

                 }//try
                 catch(Exception mi)
                 {
                     JOptionPane.showMessageDialog(f,mi);
                 }
                     //  mid="";
            }//btnMemberID

       else if(mm.getSource()==btnCheck)
       {
            try
                 {

                       if(midi.equals("-1"))// && bid1.equals(""))
                        {
                         JOptionPane.showMessageDialog(f,"Select Member ID");
                         cmbMemberID.requestFocus();
                         return;
                        }

                        else if(txtMName.getText().equals(""))
                          {
                         JOptionPane.showMessageDialog(f,"Click SEARCH button to view member details");
                         cmbMemberID.requestFocus();
                         return;
                          }
 else
                       {
                          mid = cmbMemberID.getSelectedItem().toString();
                    ResultSet rsa=stmt.executeQuery( "select * from b_BRW where MEMBER_ID='"+mid+"' AND B_STATUS='ISSUED' ");
                     if(rsa.next())
                   {

                         hidden.setText("Please return the issued book");
                        return;

                    }
                    else
                    {
                      hidden.setText("Clear Record");

                    }

 }

               }//try
                 catch(Exception mi)
                 {
                     JOptionPane.showMessageDialog(f,mi);
                 }
       }//btnCHECK


            else   if (mm.getSource()==btnDelete)
             {

                       try
                 {
                        if(midi.equals("-1"))// && bid1.equals(""))
                        {
                         JOptionPane.showMessageDialog(f,"Select Member ID");
                         cmbMemberID.requestFocus();
                        }//if txtmemberid
         else if (hidden.getText().equals(""))
            {
             JOptionPane.showMessageDialog(null, "Click CHECK Button to check the member record", "CHECK", JOptionPane.WARNING_MESSAGE);
             btnCheck.requestFocus();
             return;
            }//if txtmemberid
            else
            { mid = cmbMemberID.getSelectedItem().toString();
                if(hidden.getText().equals("Clear Record"))
                {

                     stmt.executeUpdate("delete b_BRW where  MEMBER_ID='"+mid+"'");
                    // JOptionPane.showMessageDialog(f,"Delete");
                    /////////////////////////////////////////////////////
                    //from newmember table
                    stmt.executeUpdate("delete newmember where MEMBER_ID='"+mid+"'");
                   
                    hidden.setText("");

                    JOptionPane.showMessageDialog(f,"Record has been deleted in Member Table");

                   ///Add MEMBER_ID IN Combobox after delete the one member_id
                  
                    cmbMemberID.removeAllItems();
            ResultSet rs = stmt.executeQuery( "select MEMBER_ID from newmember order by MEMBER_ID asc");
                 while(rs.next())
                      // if(rs.next())
                     {
                         cmbMemberID.addItem(rs.getString("MEMBER_ID"));

                     }//if of else
                }
                else
                {
                     JOptionPane.showMessageDialog(f,"Clear your Book Record");
                   return;
                }
                }

                }//try
                catch (Exception e1)
                {
                    JOptionPane.showMessageDialog(f,e1);
                }//catch
                }//btnDlt
                
            }
           



   
    public static void main(String[] args) throws Exception
    {
           mmdlt md=new mmdlt();
        md.mmbrdlt();

    }

}
