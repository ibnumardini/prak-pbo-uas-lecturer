/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas.view;

import javax.swing.table.DefaultTableModel;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import uas.pkg.Lecturer;
import uas.utils.Database;

/**
 *
 * @author ibnumardini
 */
public class LecturerFrame extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form LecturerFrame
     */
    public LecturerFrame() {
        initComponents();

        model = (DefaultTableModel) tblLecturers.getModel();
        
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JPanel();
        lNip = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lGender = new javax.swing.JLabel();
        lMajor = new javax.swing.JLabel();
        iNip = new javax.swing.JTextField();
        iName = new javax.swing.JTextField();
        iGenderMale = new javax.swing.JRadioButton();
        iGenderFemale = new javax.swing.JRadioButton();
        iMajor = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        tblLecturers = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(0, 48, 73));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("APLIKASI MANAJEMEN DOSEN");

        jLabel2.setForeground(new java.awt.Color(244, 244, 244));
        jLabel2.setText("Muhammad Fatkurozi");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );

        input.setBackground(new java.awt.Color(244, 244, 244));

        lNip.setText("NIP");

        lName.setText("Nama");

        lGender.setText("Jenis Kelamin");

        lMajor.setText("Program Studi");

        iGender.add(iGenderMale);
        iGenderMale.setSelected(true);
        iGenderMale.setText("Laki-laki");
        iGenderMale.setActionCommand("Laki-Laki");

        iGender.add(iGenderFemale);
        iGenderFemale.setText("Perempuan");
        iGenderFemale.setActionCommand("Perempuan");

        iMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatika", "Sistem Informasi" }));

        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnShow.setText("Tampil");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputLayout = new javax.swing.GroupLayout(input);
        input.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputLayout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow))
                    .addGroup(inputLayout.createSequentialGroup()
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lGender)
                            .addComponent(lName)
                            .addComponent(lNip)
                            .addComponent(lMajor))
                        .addGap(24, 24, 24)
                        .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(iNip, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(iName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(iGenderMale, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(iGenderFemale, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        inputLayout.setVerticalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNip)
                    .addComponent(iNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lGender)
                    .addComponent(iGenderMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iGenderFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMajor)
                    .addComponent(iMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow)
                    .addComponent(btnSave))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tblLecturers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIP", "Nama", "Jenis Kelamin", "Program Studi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setViewportView(tblLecturers);
        if (tblLecturers.getColumnModel().getColumnCount() > 0) {
            tblLecturers.getColumnModel().getColumn(0).setResizable(false);
            tblLecturers.getColumnModel().getColumn(1).setResizable(false);
            tblLecturers.getColumnModel().getColumn(2).setResizable(false);
            tblLecturers.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(0, 48, 73));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UAS PRAKTIKUM BASIS DATA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(388, 388, 388))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String nip = iNip.getText();
        String name = iName.getText();
        String gender = iGender.getSelection().getActionCommand();
        String major = iMajor.getSelectedItem().toString();

        if (nip.isBlank() || name.isBlank() || gender.isBlank() || major.isBlank()) {
            JOptionPane.showMessageDialog(null, "Gagal menambah data, ada yang kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Lecturer person = new Lecturer(nip, name, gender, major);

            Connection link = Database.getConnection();

            String query = "INSERT INTO lecturers(nip, name, gender, major) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = link.prepareStatement(query);

            statement.setString(1, person.getNip());
            statement.setString(2, person.getName());
            statement.setString(3, person.getGender());
            statement.setString(4, person.getMajor());

            statement.execute();

            iNip.setText("");
            iName.setText("");
            iGender.clearSelection();
            iGenderMale.setSelected(true);
            iMajor.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Berhasil menambah data!");
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);

            JOptionPane.showMessageDialog(null, "Gagal menambah data!, " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        loadData();
    }//GEN-LAST:event_btnShowActionPerformed

    private void loadData() {
        model.setRowCount(0);

        try {
            Connection link = Database.getConnection();

            Statement statement = link.createStatement();

            String query = "SELECT nip, name, gender, major FROM lecturers";

            ResultSet chunk = statement.executeQuery(query);

            while (chunk.next()) {
                String nip = chunk.getString("nip");
                String name = chunk.getString("name");
                String gender = chunk.getString("gender");
                String major = chunk.getString("major");

                Lecturer person = new Lecturer(nip, name, gender, major);

                Object[] data = {
                    person.getNip(),
                    person.getEtiquetteName(),
                    person.getGender(),
                    person.getMajor()
                };

                model.addRow(data);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShow;
    private javax.swing.JPanel header;
    private javax.swing.ButtonGroup iGender;
    private javax.swing.JRadioButton iGenderFemale;
    private javax.swing.JRadioButton iGenderMale;
    private javax.swing.JComboBox<String> iMajor;
    private javax.swing.JTextField iName;
    private javax.swing.JTextField iNip;
    private javax.swing.JPanel input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lGender;
    private javax.swing.JLabel lMajor;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lNip;
    private javax.swing.JScrollPane table;
    private javax.swing.JTable tblLecturers;
    // End of variables declaration//GEN-END:variables
}
