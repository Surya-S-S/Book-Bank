/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import Books.Book;
import Librarian.librarian;
import Member.User;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Page6 extends javax.swing.JFrame {

        public List<User> users;
	public List<Book> books;
	public librarian l;
        public User usr;
        int k;
    JFrame j;
    /**
     * Creates new form Page3
     */

    public int matchBook(int bookID)
    {
	for(int i=0;i<books.size();i++)
        {
            if(bookID==(books.get(i).id))
		return i;
	}
        return -1;
    }
       
    Page6(List<User> users, List<Book> books, librarian l, User usr, int k) {
        
        this.users=users;
        this.books=books;
        this.l=l;
        this.k=k;  
        this.usr=usr;     
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Books");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 330, 44));

        jButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton1.setText("Add Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 230, 35));

        jButton11.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton11.setText("Back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 435, 230, 35));

        jButton13.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton13.setText("Check Book");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 210, 35));

        jButton14.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton14.setText("Remove Book");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 210, 35));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 220, 35));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 220, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/images/Closeup_Book_530436_1920x1080.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 523));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Page7 p7=new Page7(users,books,l,usr,k);
        p7.setVisible(true);         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int bid = Integer.parseInt(jTextField1.getText());
        int r=matchBook(bid);
        Date bd,cd;
        char reply = 0;
        long millis=System.currentTimeMillis();
        cd=new Date(millis);
	if(r>-1)
	{
            int flag=0;
            if(reply=='y')
	    {
                for(int i=0;i<usr.books_Borrowed.size();i++)
		{
                    if(books.get(r).id==usr.getBook(i))
                    {
                        bd=usr.getDate(i);
			flag=1;
			String s1=new String();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
			String strDate = dateFormat.format(cd);
			s1=dateFormat.format(bd);
			int x=Character.getNumericValue(s1.charAt(5));
			int y=Character.getNumericValue(s1.charAt(6));
			int month1=x*10+y;
                        int a=Character.getNumericValue(s1.charAt(8));
			int b=Character.getNumericValue(s1.charAt(9));
			int date1=a*10+b;
			
			System.out.println(" "+strDate);
			x=Character.getNumericValue(strDate.charAt(5));
                        y=Character.getNumericValue(strDate.charAt(6));
			int month2=x*10+y;
			a=Character.getNumericValue(strDate.charAt(8));
			b=Character.getNumericValue(strDate.charAt(9));
			int date2=a*10+b;
			int n=0;
			if(date1>=date2)
			{
                            n+=date2;
                            n+=30-date1;
                            n+=(month2-month1-1)*30;
			}
			
			JOptionPane.showMessageDialog(j,"You Have returned after "+n +" Days.");
			if(n>15)
			{
                            usr.setFine((n-15)*10);
			}
                    }
		}
                if(flag==1)
		{
                    JOptionPane.showMessageDialog(j,"Book removed Successfully");
                    books.get(r).quantity+=1;
                    if(books.get(r).quantity-1==0)
                    {
                        books.get(r).setStatus("Available");
                    }
                    usr.decrementNBooks(books.get(r).id);
                }
		else
		{
                    JOptionPane.showMessageDialog(j,"Book Not Borrowed");
		}
            }
	}
	else
            JOptionPane.showMessageDialog(j,"Book not found");        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Page4 p4=new Page4(users,books,l,usr,k);
        p4.setVisible(true);        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int bid = Integer.parseInt(jTextField2.getText());
        int r=matchBook(bid);       
        if(r>=0)
	{
            Book b=books.get(r);
            JOptionPane.showMessageDialog(j," Book Details : "+"\n Name        : "+b.name+"\n Author      : "+b.author+"\n Edition     : "+b.edition+"\n Price       : "+b.price+"\n Description : "+b.description+"\n Id          : "+b.id+"\n Rack number : "+b.rack_no+"\n Status      : "+b.status+"\n Quantity	: "+b.quantity+"\n Date        : "+b.d);
	}
	else
	JOptionPane.showMessageDialog(j,"Book not found");            
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}