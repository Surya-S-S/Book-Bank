/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import Books.Book;
import Librarian.librarian;
import Member.User;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Page3 extends javax.swing.JFrame {

    public List<User> users;
    public List<Book> books;
    public librarian l;
    public User usr;
    public int k;   
    JFrame j;
    /**
     * Creates new form Page3
     */

    Page3(List<User> users, List<Book> books,librarian l,User usr,int k) {

        this.users=users;
        this.books=books;
        this.l=l;
        this.k=k;  
        this.usr=usr;
        initComponents();
    }

    public int matchBook(int bookID)
    {
	for(int i=0;i<books.size();i++)
        {
            if(bookID==(books.get(i).id))
		return i;
	}
        return -1;
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
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Library User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 45, 330, 44));

        jButton1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton1.setText("Borrow Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 144, 200, 35));

        jButton11.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton11.setText("Inbox");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 366, 230, 35));

        jButton12.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton12.setText("Update Details");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 313, 230, 35));

        jButton13.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton13.setText("Check Membership");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 230, 35));

        jButton14.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton14.setText("Return Book");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 198, 200, 35));

        jButton15.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jButton15.setText("Logout");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 419, 230, 35));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, 212, 35));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 199, 212, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/images/wp2297966.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 520));

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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Page13 p13=new Page13(users,books,l,usr,k);
        p13.setVisible(true);        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        //usr=users.get(k);
        JOptionPane.showMessageDialog(j,"\n User Details : "+"\n Name                 : "+usr.name+"\n Address              : "+usr.addr+"\n Type                 : "+usr.type+"\n Phone Number         : "+usr.phone_no+"\n Member ID            : "+usr.mem_id+"\n Trust Value          : "+usr.trust_value+"\n Max Book Limit       : "+usr.max_book_limit+"\n No of books Borrowed : "+usr.nbooks_issued+"\n Fine                 : "+usr.fine+"\n Date of enroll       : "+usr.d);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Page12 p12=new Page12(users,books,l,usr,k);
        p12.setVisible(true);         
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Page2 p2=new Page2(users,books,l,usr,k);
        p2.setVisible(true);        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int bid = Integer.parseInt(jTextField1.getText());
        usr=users.get(k);
        char reply='y';
        int r=matchBook(bid);
        if(r>=0)
	{           
            if(reply=='y')
            {
                if(!(usr.nbooks_issued==usr.max_book_limit))
                {
                    if(books.get(r).quantity>0)
                    {
                        Book b=books.get(r);
                        JOptionPane.showMessageDialog(j," Book Details : "+"\n Name        : "+b.name+"\n Author      : "+b.author+"\n Edition     : "+b.edition+"\n Price       : "+b.price+"\n Description : "+b.description+"\n Id          : "+b.id+"\n Rack number : "+b.rack_no+"\n Status      : "+b.status+"\n Quantity	: "+b.quantity+"\n Date        : "+b.d+"\n Book Boorowed");
                        books.get(r).quantity-=1;
			if(books.get(r).quantity==0)
			{
                            books.get(r).setStatus("Unavailable");
			}
                    }
                    usr.incrementNBooks(books.get(r).id);
		}
            }
        }
        else            
        JOptionPane.showMessageDialog(j,"Book not found");                          
        users.set(k,usr);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int bid = Integer.parseInt(jTextField2.getText());
        usr=users.get(k);
        int r=matchBook(bid);        
        char reply='y';int flag=0;       
        if(r>=0)
	{           
            if(reply=='y')
            {
								for(int i=0;i<usr.books_Borrowed.size();i++)
								{
									if(books.get(r).id==usr.getBook(i))
									{
										flag=1;
									}
								}
								if(flag==1)
								{
									Book b=books.get(r);                        
                                                                        JOptionPane.showMessageDialog(j," Book Details : "+"\n Name        : "+b.name+"\n Author      : "+b.author+"\n Edition     : "+b.edition+"\n Price       : "+b.price+"\n Description : "+b.description+"\n Id          : "+b.id+"\n Rack number : "+b.rack_no+"\n Status      : "+b.status+"\n Quantity	: "+b.quantity+"\n Date        : "+b.d+"Book Returned");
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
        users.set(k,usr);        
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(Page3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
