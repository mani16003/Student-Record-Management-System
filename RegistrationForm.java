package studentsrecordmanagementsystem;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static studentsrecordmanagementsystem.myconnection.rs;
import static studentsrecordmanagementsystem.myconnection.stmt;

public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
        initComponents();
        myconnection.Connect();
        txtId.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblIdNo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        pswPass = new javax.swing.JPasswordField();
        lblNote = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        cmbBranch = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setResizable(false);

        lblIcon.setIcon(new javax.swing.ImageIcon("G:\\Project\\StudentsRecordManagementSystem\\Images\\treg.png")); // NOI18N

        lblName.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblName.setText("Name");

        txtName.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        lblIdNo.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblIdNo.setText("Id No");

        txtId.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        lblMobile.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblMobile.setText("Mobile");

        txtMobile.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblUsername.setText("Branch");

        lblPassword.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblPassword.setText("Password");

        pswPass.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        lblNote.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        lblNote.setForeground(new java.awt.Color(0, 0, 255));
        lblNote.setText("Note :- Password should be atlest 7 character....");

        btnSave.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        cmbBranch.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cmbBranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Branch....", "Branch 1", "Branch 2", "Branch 3", "Branch 4", "Branch 5" }));

        btnBack.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblBackground.setIcon(new javax.swing.ImageIcon("G:\\Project\\StudentsRecordManagementSystem\\Images\\stdreg.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(610, 610, 610)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblIcon)
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(cmbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblNote, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblName)))
                .addGap(57, 57, 57)
                .addComponent(lblEmail)
                .addGap(47, 47, 47)
                .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lblIdNo))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(lblPassword))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(cmbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(lblUsername))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(lblNote))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(lblMobile))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String id,nm,mob,em,pd,br;
        id=txtId.getText();
        nm=txtName.getText();
        mob=txtMobile.getText();
        em=txtEmail.getText();
        pd=pswPass.getText();
        br=(String)cmbBranch.getSelectedItem();
        String sql="insert into Teacher values('"+id+"','"+nm+"','"+mob+"','"+em+"','"+pd+"','"+br+"')";
        try{
        myconnection.stmt.executeQuery(sql);
        JOptionPane.showMessageDialog(null,"Register Successfully..");
        txtId.setText("");
        txtName.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        pswPass.setText("");
        cmbBranch.setSelectedItem(null);
        txtId.requestFocus();
        
        }catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"Error during insertion..");
        txtId.requestFocus();
        
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String id;
        id=txtId.getText();
        String sql="select * from Teacher where Id='"+id+"'";
        try{
            myconnection.rs=myconnection.stmt.executeQuery(sql);
            if(myconnection.rs.next())
            {
                if(myconnection.rs.getString("Id").equals(id))
                {
                txtName.setText(rs.getString("Name"));
                txtMobile.setText(rs.getString("Mobile"));
                txtEmail.setText(rs.getString("Email"));
                pswPass.setText(rs.getString("Password"));
                //pswPass.setEditable(false);
                cmbBranch.setSelectedItem(rs.getString("Branch"));
                JOptionPane.showMessageDialog(null,"Data Fetched..");
                txtId.requestFocus();
                
                }
                else
                    JOptionPane.showMessageDialog(null,"Invalid Id No");
                txtId.requestFocus();
            }
            else
                JOptionPane.showMessageDialog(null,"Id does not Exist");
                txtId.requestFocus();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+e);
            txtId.requestFocus();
        
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtId.setText("");
        txtName.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        pswPass.setText("");
        cmbBranch.setSelectedItem(null);
        txtId.requestFocus();
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       String id,nm,mob,em,pd,br;
        id=txtId.getText();
        nm=txtName.getText();
        mob=txtMobile.getText();
        em=txtEmail.getText();
        pd=pswPass.getText();
        br=(String)cmbBranch.getSelectedItem();
        
       String sql="delete from Teacher where Id='"+id+"'";
        try {
            stmt.executeQuery(sql);
            JOptionPane.showMessageDialog(null,"Record Deleted...");
            txtId.setText("");
            txtName.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            pswPass.setText("");
            cmbBranch.setSelectedItem(null);
            txtId.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id,nm,mob,em,pd,br;
        id=txtId.getText();
        nm=txtName.getText();
        mob=txtMobile.getText();
        em=txtEmail.getText();
        pd=pswPass.getText();
        br=(String)cmbBranch.getSelectedItem();
        String sql="update Teacher SET Name='"+nm+"',Mobile='"+mob+"',Email='"+em+"',"
                + "Password='"+pd+"',Branch='"+br+"' where Id='"+id+"'";
        
        try{
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Record Updated");
        txtId.setText("");
        txtName.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        pswPass.setText("");
        cmbBranch.setSelectedItem(null);
        txtId.requestFocus();
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Invalid record"+e);
        txtId.requestFocus();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        new Details().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbBranch;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIdNo;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pswPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
