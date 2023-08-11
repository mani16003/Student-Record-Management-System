package studentsrecordmanagementsystem;
import com.itextpdf.text.DocumentException;
import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import static studentsrecordmanagementsystem.myconnection.rs;
import static studentsrecordmanagementsystem.myconnection.stmt;


public class Records extends javax.swing.JFrame {
    public Records() {
        initComponents();
        myconnection.Connect();
        txtId.requestFocus();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlFrame = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlRecordsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        cmbYear = new javax.swing.JComboBox();
        cmbCourse = new javax.swing.JComboBox();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnTranscript = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cmbSpecialization = new javax.swing.JComboBox();
        cmbSem = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUnReg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarAddress = new javax.swing.JTextArea();
        txtUnRoll = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnReset1 = new javax.swing.JButton();
        pnlStudFullRecord = new javax.swing.JPanel();
        scrFullRecords = new javax.swing.JScrollPane();
        txtTranscript = new javax.swing.JTextArea();
        scrTable = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Record Management System");
        setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        setResizable(false);

        pnlFrame.setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 255));
        lblTitle.setText("Students Record Management System");

        pnlRecordsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4), "Records Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Constantia", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        pnlRecordsPanel.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel2.setText("Id No");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel3.setText("DOB");

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel6.setText("Year");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel7.setText("Sem");

        jLabel9.setText("jLabel2");

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel12.setText("Email");

        jLabel18.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel18.setText("Address");

        txtId.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        txtMobile.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        txtDob.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        cmbYear.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cmbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Year...", "1", "2", "3", "4" }));

        cmbCourse.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Course", "B.TECH", "B.A.", "B.SC", "BCA", "BBA", "BBM", "BSC-IT", "MBA", "MCA", "BLIS", "PGDM" }));
        cmbCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnTranscript.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnTranscript.setText("Transcript");
        btnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel20.setText("Specialization");

        cmbSpecialization.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cmbSpecialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CS", "MECH.", "ELEC.", "CIVIL", "IT", "MATH", "ENGLISH", "BIO", "ZOL", "BOT", "CHEM", "PHY", "COMM.", "ECON", "HIS", "CIV", "GEOG" }));

        cmbSem.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cmbSem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII" }));
        cmbSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel8.setText("Course");

        cmbGender.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel10.setText("UN.Reg.No");

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel13.setText("Mobile");

        txtUnReg.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel11.setText("Father's Name");

        txtFname.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel14.setText("Mother's Name");

        txtMname.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        txtarAddress.setColumns(20);
        txtarAddress.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        txtarAddress.setRows(5);
        jScrollPane2.setViewportView(txtarAddress);

        txtUnRoll.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtUnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnRollActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel15.setText("UN.Roll");

        btnReset1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnReset1.setText("Reset");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRecordsPanelLayout = new javax.swing.GroupLayout(pnlRecordsPanel);
        pnlRecordsPanel.setLayout(pnlRecordsPanelLayout);
        pnlRecordsPanelLayout.setHorizontalGroup(
            pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel18))
                        .addGap(81, 81, 81)
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel10)
                    .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6))
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(42, 42, 42)
                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMobile)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnRoll, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addComponent(txtUnReg))
                .addGap(99, 99, 99)
                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jLabel9)
                    .addContainerGap(777, Short.MAX_VALUE)))
        );
        pnlRecordsPanelLayout.setVerticalGroup(
            pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(cmbSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(17, 17, 17)
                                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtUnReg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel18)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                                .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRecordsPanelLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 56, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRecordsPanelLayout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtUnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(pnlRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRecordsPanelLayout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(352, Short.MAX_VALUE)))
        );

        pnlStudFullRecord.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true), "Students Full Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Constantia", 1, 24), new java.awt.Color(0, 51, 204))); // NOI18N
        pnlStudFullRecord.setOpaque(false);

        txtTranscript.setEditable(false);
        txtTranscript.setColumns(20);
        txtTranscript.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        txtTranscript.setRows(5);
        scrFullRecords.setViewportView(txtTranscript);

        javax.swing.GroupLayout pnlStudFullRecordLayout = new javax.swing.GroupLayout(pnlStudFullRecord);
        pnlStudFullRecord.setLayout(pnlStudFullRecordLayout);
        pnlStudFullRecordLayout.setHorizontalGroup(
            pnlStudFullRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFullRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlStudFullRecordLayout.setVerticalGroup(
            pnlStudFullRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFullRecords)
        );

        tblRecords.setFont(new java.awt.Font("Cambria Math", 0, 10)); // NOI18N
        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "F_Name", "M_Name", "DOB", "Gender", "Address", "Course", "Stream", "Year", "Sem", "UN_Registration_No", "UN_Roll_NO", "Mobile", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecords.getTableHeader().setReorderingAllowed(false);
        scrTable.setViewportView(tblRecords);

        btnHome.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFrameLayout = new javax.swing.GroupLayout(pnlFrame);
        pnlFrame.setLayout(pnlFrameLayout);
        pnlFrameLayout.setHorizontalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFrameLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblTitle))
                    .addGroup(pnlFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlRecordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(pnlFrameLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlStudFullRecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addComponent(scrTable)
                .addContainerGap())
        );
        pnlFrameLayout.setVerticalGroup(
            pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFrameLayout.createSequentialGroup()
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlStudFullRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRecordsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrTable, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id,nm,fnm,mnm,dob,gen,add,cs,spc,yr,sem,unreg,unroll,mob,em;
        id=txtId.getText();
        nm=txtName.getText();
        fnm=txtFname.getText();
        mnm=txtMname.getText();
        dob=txtDob.getText();
        gen=(String)cmbGender.getSelectedItem();
        add=txtarAddress.getText();
        cs=(String)cmbCourse.getSelectedItem();
        spc=(String)cmbSpecialization.getSelectedItem();
        yr=(String)cmbYear.getSelectedItem();
        sem=(String)cmbSem.getSelectedItem();
        unreg=txtUnReg.getText();
        unroll=txtUnRoll.getText();
        mob=txtMobile.getText();
        em=txtEmail.getText();
        String sql="update Students_Record SET Name='"+nm+"',F_name='"+fnm+"',M_Name='"+mnm+"',Dob='"+dob+"',Gender='"+gen+"',"
                + "Address='"+add+"',Course='"+cs+"',Specialization='"+spc+"',Year='"+yr+"',Semester='"+sem+"',Un_Reg_No='"+unreg+"',"
                + "Un_Roll_no='"+unroll+"',"+ "Mobile='"+mob+"',Email='"+em+"' where Id='"+id+"'";
        try{
            myconnection.stmt.executeUpdate(sql);
            JOptionPane.showConfirmDialog(null,"Do you want to update ?");
            JOptionPane.showMessageDialog(null, "Record Updated");
            txtId.setText("");
            txtName.setText("");
            txtFname.setText("");
            txtMname.setText("");
            txtDob.setText("");
            txtarAddress.setText("");
            cmbCourse.setSelectedItem(null);
            cmbSpecialization.setSelectedItem(null);
            cmbYear.setSelectedItem(null);
            cmbSem.setSelectedItem(null);
            txtUnReg.setText("");
            txtUnRoll.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtTranscript.setText("");
    
            txtId.requestFocus();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error During Updation"+e);
            txtId.requestFocus();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String id,nm,fnm,mnm,dob,gen,add,cs,spc,yr,sem,unreg,unroll,mob,em;
        id=txtId.getText();
        nm=txtName.getText();
        fnm=txtFname.getText();
        mnm=txtMname.getText();
        dob=txtDob.getText();
        gen=(String)cmbGender.getSelectedItem();
        add=txtarAddress.getText();
        cs=(String)cmbCourse.getSelectedItem();
        spc=(String)cmbSpecialization.getSelectedItem();
        yr=(String)cmbYear.getSelectedItem();
        sem=(String)cmbSem.getSelectedItem();
        unreg=txtUnReg.getText();
        unroll=txtUnRoll.getText();
        mob=txtMobile.getText();
        em=txtEmail.getText();
        String sql="insert into Students_Record values('"+id+"','"+nm+"','"+fnm+"','"+mnm+"','"+dob+"','"+gen+"','"+add+"',"
                + "'"+cs+"','"+spc+"','"+yr+"','"+sem+"','"+unreg+"','"+unroll+"',"
        + "'"+mob+"','"+em+"')";
        try
        {
            myconnection.stmt.executeQuery(sql);
            JOptionPane.showConfirmDialog(null,"Do you want to save ?");
            JOptionPane.showMessageDialog(null,"Record has been saved successfully..");
            txtId.setText("");
            txtName.setText("");
            txtFname.setText("");
            txtMname.setText("");
            txtDob.setText("");
            txtarAddress.setText("");
            cmbCourse.setSelectedItem(null);
            cmbSpecialization.setSelectedItem(null);
            cmbYear.setSelectedItem(null);
            cmbSem.setSelectedItem(null);
            txtUnReg.setText("");
            txtUnRoll.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtTranscript.setText("");
            txtId.requestFocus();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error during insertion"+e);
            txtId.requestFocus();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

       try {
            txtTranscript.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Records.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptActionPerformed
        txtTranscript.append("Student Record Management System\n"
            +"*********************************************\n"
            +"\n ID No :\t" + txtId.getText()
            +"\n \n Name :\t" + txtName.getText()
            +"\n \n Father's Name :  " + txtFname.getText()
            +"\n \n Mother's Name :  " + txtMname.getText()
            +"\n \n DOB :\t" + txtDob.getText()
            +"\n \n Address :\t" + txtarAddress.getText()
            +"\n \n Course :\t" + cmbCourse.getSelectedItem()
            +"\n \n Specialization : " + cmbSpecialization.getSelectedItem()
            +"\n \n Year :\t" + cmbYear.getSelectedItem()
            +"\n \n Semseter :\t" + cmbSem.getSelectedItem()
            +"\n \n UN_Registration No : " + txtUnReg.getText()
            +"\n \n UN_Roll No : " + txtUnRoll.getText()
            +"\n \n Mobile :\t" + txtMobile.getText()
            +"\n \n Email :\t" + txtEmail.getText()
        );
    }//GEN-LAST:event_btnTranscriptActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id,nm,fnm,mnm,dob,gen,add,cs,spc,yr,sem,unreg,unroll,mob,em;
        id=txtId.getText();
        nm=txtName.getText();
        fnm=txtFname.getText();
        mnm=txtMname.getText();
        dob=txtDob.getText();
        gen=(String)cmbGender.getSelectedItem();
        add=txtarAddress.getText();
        cs=(String)cmbCourse.getSelectedItem();
        spc=(String)cmbSpecialization.getSelectedItem();
        yr=(String)cmbYear.getSelectedItem();
        sem=(String)cmbSem.getSelectedItem();
        unreg=txtUnReg.getText();
        unroll=txtUnRoll.getText();
        mob=txtMobile.getText();
        em=txtEmail.getText();
    
        try{
            id=txtId.getText();

            String sql="delete from Students_Record where Id='"+id+"'";

            stmt.executeQuery(sql);

            JOptionPane.showConfirmDialog(null,"Do you want to delete ?");

            JOptionPane.showMessageDialog(null,"Record has been deleted successfully...");
            txtId.setText("");
            txtName.setText("");
            txtFname.setText("");
            txtMname.setText("");
            txtDob.setText("");
            txtarAddress.setText("");
            cmbCourse.setSelectedItem(null);
            cmbSpecialization.setSelectedItem(null);
            cmbYear.setSelectedItem(null);
            cmbSem.setSelectedItem(null);
            txtUnReg.setText("");
            txtUnRoll.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtTranscript.setText("");

            txtId.requestFocus();

        }catch(Exception e)
        {

            JOptionPane.showMessageDialog(null,"Error during deleted.."+e);
            txtId.requestFocus();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
            String id,nm,fnm,mnm,dob,gen,add,cs,spc,yr,sem,unreg,unroll,mob,em;
        id=txtId.getText();
        String sql="select * from Students_Record where Id='"+id+"'";
        try{
            myconnection.rs=myconnection.stmt.executeQuery(sql);
            if(myconnection.rs.next())
            {
                if(myconnection.rs.getString("ID").equals(id))
                {
                    txtId.setText(rs.getString("Id"));
                    txtName.setText(rs.getString("Name"));
                    txtFname.setText(rs.getString("F_Name"));
                    txtMname.setText(rs.getString("M_Name"));
                    txtDob.setText(rs.getString("DOB"));
                    txtarAddress.setText(rs.getString("Address"));
                    cmbCourse.setSelectedItem(rs.getString("Course"));
                    cmbSpecialization.setSelectedItem(rs.getString("Specialization"));
                    cmbYear.setSelectedItem(rs.getString("Year"));
                    cmbSem.setSelectedItem(rs.getString("Semester"));
                    txtUnReg.setText(rs.getString("Un_Reg_No"));
                    txtUnRoll.setText(rs.getString("Un_Roll_No"));
                    txtMobile.setText(rs.getString("Mobile"));
                    txtEmail.setText(rs.getString("Email"));
                    
                    JOptionPane.showMessageDialog(null, "Record Fetched");
                    
                    txtId.requestFocus();
                }
            }
            else
            JOptionPane.showMessageDialog(null,"Id does not exist..");

            txtId.requestFocus();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error"+e);
            txtId.requestFocus();
        }
       DefaultTableModel model=(DefaultTableModel)tblRecords.getModel();
        model.addRow(new Object[]{
        txtId.getText(),
        txtName.getText(),
        txtFname.getText(),
        txtMname.getText(),
        txtDob.getText(),
        cmbGender.getSelectedItem(),
        txtarAddress.getText(),
        cmbCourse.getSelectedItem(),
        cmbSpecialization.getSelectedItem(),
        cmbYear.getSelectedItem(),
        cmbSem.getSelectedItem(),
        txtUnReg.getText(),
        txtUnRoll.getText(),
        txtMobile.getText(),
        txtEmail.getText()
        });
    }//GEN-LAST:event_btnFindActionPerformed

    private void cmbCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCourseActionPerformed

    private void cmbSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSemActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
            txtId.setText("");
            txtName.setText("");
            txtFname.setText("");
            txtMname.setText("");
            txtDob.setText("");
            txtarAddress.setText("");
            cmbCourse.setSelectedItem(null);
            cmbSpecialization.setSelectedItem(null);
            cmbYear.setSelectedItem(null);
            cmbSem.setSelectedItem(null);
            txtUnReg.setText("");
            txtUnRoll.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtTranscript.setText("");
            
            txtId.requestFocus();
    }//GEN-LAST:event_btnReset1ActionPerformed

    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
          this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtUnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnRollActionPerformed

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
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTranscript;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbCourse;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbSem;
    private javax.swing.JComboBox cmbSpecialization;
    private javax.swing.JComboBox cmbYear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFrame;
    private javax.swing.JPanel pnlRecordsPanel;
    private javax.swing.JPanel pnlStudFullRecord;
    private javax.swing.JScrollPane scrFullRecords;
    private javax.swing.JScrollPane scrTable;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMname;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtTranscript;
    private javax.swing.JTextField txtUnReg;
    private javax.swing.JTextField txtUnRoll;
    private javax.swing.JTextArea txtarAddress;
    // End of variables declaration//GEN-END:variables
}
