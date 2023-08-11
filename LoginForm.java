package studentsrecordmanagementsystem;
import javax.swing.*;
import java.awt.*;
import static studentsrecordmanagementsystem.myconnection.rs;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        myconnection.Connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoginPanel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        pswPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCencel = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faculty Login");
        setResizable(false);

        lblLoginPanel.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        lblLoginPanel.setText("LOGIN PANEL");

        lblUsername.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblUsername.setText("Admin");

        lblPass.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        lblPass.setText("Password");

        btnLogin.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setOpaque(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setOpaque(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCencel.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnCencel.setText("Cancel");
        btnCencel.setOpaque(false);
        btnCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCencelActionPerformed(evt);
            }
        });

        lblBackground.setIcon(new javax.swing.ImageIcon("G:\\Project\\StudentsRecordManagementSystem\\Images\\stdreg4.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(btnCencel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPass)
                    .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblUsername))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnCencel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String id,pd;
        id=txtUname.getText();
        pd=pswPass.getText();
        String sql="select * from facultySignup where username='"+id+"'";
        try{
            myconnection.rs=myconnection.stmt.executeQuery(sql);
            if(myconnection.rs.next())
            {
                if(myconnection.rs.getString("Password").equals(pd))
                {
                
                JOptionPane.showMessageDialog(null,"Login Success");
                this.setVisible(false);
                new Student_Window().setVisible(true);
                   
                     }
                else
                    JOptionPane.showMessageDialog(null,"Invalid Password");
                pswPass.setText("");
                txtUname.requestFocus();
            }
            else
                JOptionPane.showMessageDialog(null,"Id does not Exist");
                txtUname.requestFocus();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+e);
            txtUname.requestFocus();
        
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       txtUname.setText("");
       pswPass.setText("");
       txtUname.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCencelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCencelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCencel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLoginPanel;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pswPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
