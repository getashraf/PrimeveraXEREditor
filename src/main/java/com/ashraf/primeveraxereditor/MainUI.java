package com.ashraf.primeveraxereditor;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Relation;
import net.sf.mpxj.Task;
import net.sf.mpxj.primavera.PrimaveraXERFileReader;

public class MainUI extends javax.swing.JFrame {

    private String xFileName = "";

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Primevera XER Editor");
        setName("Primevera XER Editor"); // NOI18N

        jLabel1.setText("File Name:");

        jButton1.setText("Open File");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save Log");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Activity ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setText("Activity Name:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setText("Activity Type:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setText("WBS:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setText("Start Date:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setText("Finish Date:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setText("Unique ID:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addGap(13, 13, 13))
        );

        jButton3.setText("Show LOE Task");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jButton5.setText("Remove LOE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Reset");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(197, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // File Open Button click event
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            jTextField1.setText(selectedFile.getAbsolutePath());
            xFileName = selectedFile.getAbsolutePath();

            if (!xFileName.isEmpty()) {
                try {
                    XERDataTableModel model = new XERDataTableModel(PopulateTable(selectedFile.getAbsolutePath()));
                    jTable1.setModel(model);

                    TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
                    jTable1.setRowSorter(sorter);
                    List<RowSorter.SortKey> sortKeys = new ArrayList<>();

                    //int columnIndexToSort = 1;
                    //sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
                    int columnIndexWBS = 2;
                    sortKeys.add(new RowSorter.SortKey(columnIndexWBS, SortOrder.ASCENDING));

                    int columnIndexForStart = 4;
                    sortKeys.add(new RowSorter.SortKey(columnIndexForStart, SortOrder.ASCENDING));

                    int columnIndexForEnd = 5;
                    sortKeys.add(new RowSorter.SortKey(columnIndexForEnd, SortOrder.ASCENDING));

                    sorter.setSortKeys(sortKeys);
                    sorter.sort();

                    //table.setAutoCreateRowSorter(false);
                } catch (MPXJException ex) {
                    Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Save Log Button click event
        if (!xFileName.isEmpty()) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setSelectedFile(new File("LOE_Log.txt"));
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                LogFileWriter(file.getAbsolutePath());
                JOptionPane.showMessageDialog(this, "File Saved as: " + file.getAbsolutePath());
            } else {
                //JOptionPane.showMessageDialog(this, "Save command canceled");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Exit Button click event
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Show LOE Button click event
        String filterText = "LOE";
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(filterText, 3));

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Reset Button click event
        if (!xFileName.isEmpty()) {
            try {
                XERDataTableModel model = new XERDataTableModel(PopulateTable(xFileName));
                jTable1.setModel(model);

                TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
                jTable1.setRowSorter(sorter);
                List<RowSorter.SortKey> sortKeys = new ArrayList<>();

                //int columnIndexToSort = 1;
                //sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
                int columnIndexWBS = 2;
                sortKeys.add(new RowSorter.SortKey(columnIndexWBS, SortOrder.ASCENDING));

                int columnIndexForStart = 4;
                sortKeys.add(new RowSorter.SortKey(columnIndexForStart, SortOrder.ASCENDING));

                int columnIndexForEnd = 5;
                sortKeys.add(new RowSorter.SortKey(columnIndexForEnd, SortOrder.ASCENDING));

                sorter.setSortKeys(sortKeys);
                sorter.sort();

                //table.setAutoCreateRowSorter(false);
            } catch (MPXJException ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Table cell click event
        if (!xFileName.isEmpty()) {
            JTable table = (JTable) evt.getSource();
            XERDataTableModel model = (XERDataTableModel) jTable1.getModel();

            int viewRow = table.getSelectedRow();
            int modelRow = table.convertRowIndexToModel(viewRow);
            //int viewColumn = table.getSelectedColumn();
            //int modelColumn = table.convertColumnIndexToModel(viewColumn);
            // Object cell = model.getValueAt(modelRow, 0);

            if (model.getValueAt(modelRow, 0) != null) {
                try {
                    PopulateDetails(model.getValueAt(modelRow, 0).toString());
                } catch (MPXJException ex) {
                    Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Remove LOE button click event
        if (!xFileName.isEmpty()) {

            try {
                XERDataTableModel model = new XERDataTableModel(RemoveLOE(xFileName));

                jTable1.setModel(model);
                TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
                jTable1.setRowSorter(sorter);
                List<RowSorter.SortKey> sortKeys = new ArrayList<>();

                //int columnIndexToSort = 1;
                //sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
                int columnIndexWBS = 2;
                sortKeys.add(new RowSorter.SortKey(columnIndexWBS, SortOrder.ASCENDING));

                int columnIndexForStart = 4;
                sortKeys.add(new RowSorter.SortKey(columnIndexForStart, SortOrder.ASCENDING));

                int columnIndexForEnd = 5;
                sortKeys.add(new RowSorter.SortKey(columnIndexForEnd, SortOrder.ASCENDING));

                sorter.setSortKeys(sortKeys);
                sorter.sort();

            } catch (MPXJException ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // Arrow Up and Down Key event
        if (!xFileName.isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
                JTable table = (JTable) evt.getSource();
                XERDataTableModel model = (XERDataTableModel) jTable1.getModel();

                int viewRow = table.getSelectedRow();
                int modelRow = table.convertRowIndexToModel(viewRow);

                if (model.getValueAt(modelRow, 0) != null) {
                    try {
                        PopulateDetails(model.getValueAt(modelRow, 0).toString());
                    } catch (MPXJException ex) {
                        Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    /*
    * Return DataModel with available field value to
    * populate jTable interface
     */
    private List<XERDataModel> PopulateTable(String fileName) throws MPXJException {
        PrimaveraXERFileReader reader = new PrimaveraXERFileReader();
        //reader.setWbsIsFullPath(false);
        ProjectFile file = reader.read(fileName);
        List<XERDataModel> xerDataModel = new ArrayList<>();

        for (Task task : file.getTasks()) {
            if (!task.getSummary()) {
                List<Relation> predecessors = task.getPredecessors();
                List<Relation> successors = task.getSuccessors();

                String preName = "";
                String sucName = "";

                if (predecessors != null && predecessors.isEmpty() == false) {
                    int i = 0;
                    for (Relation relation : predecessors) {
                        if (i > 0) {
                            preName = preName.concat(", ");
                        }
                        preName = preName.concat(relation.getSourceTask().getPredecessors().get(i).getTargetTask().getName());
                        i++;
                    }
                }

                if (successors != null && successors.isEmpty() == false) {
                    int i = 0;
                    for (Relation relation : successors) {
                        if (i > 0) {
                            sucName = sucName.concat(", ");
                        }
                        sucName = sucName.concat(relation.getSourceTask().getSuccessors().get(i).getTargetTask().getName());
                        i++;
                    }
                }

                XERDataModel sData = new XERDataModel(task.getUniqueID().toString(), task.getActivityID(), task.getWBS(), task.getName(),
                        task.getStart(), task.getFinish(), preName, sucName);
                xerDataModel.add(sData);

            } else {
                XERDataModel nData = new XERDataModel(task.getUniqueID().toString(), task.getActivityID(), task.getWBS(), task.getName(), null, null, null, null);
                xerDataModel.add(nData);
            }
        }

        return xerDataModel;

    }

    /*
    * Populates details pane with data fields
     */
    private void PopulateDetails(String uniqueID) throws MPXJException {
        PrimaveraXERFileReader reader = new PrimaveraXERFileReader();
        if (!xFileName.isEmpty()) {
            ProjectFile file = reader.read(xFileName);

            Task sTask = file.getTaskByUniqueID(Integer.parseInt(uniqueID));

            if (!sTask.getSummary()) {
                jLabel11.setText(sTask.getUniqueID().toString());
                jLabel12.setText(sTask.getActivityID());
                jLabel13.setText(sTask.getName());
                jLabel14.setText(sTask.getType().toString());
                jLabel15.setText(sTask.getWBS());
                jLabel16.setText(sTask.getStart().toString());
                jLabel17.setText(sTask.getFinish().toString());

            } else {
                jLabel11.setText(sTask.getUniqueID().toString());
                jLabel12.setText(sTask.getActivityID());
                jLabel13.setText(sTask.getName());
                jLabel14.setText(sTask.getType().toString());
                jLabel15.setText(sTask.getWBS());
                jLabel16.setText("");
                jLabel17.setText("");
            }
        }

    }

    /*
    * Removes LOE tasks from DataModel and
    * Populates existing data table
     */
    private List<XERDataModel> RemoveLOE(String fileName) throws MPXJException {
        PrimaveraXERFileReader reader = new PrimaveraXERFileReader();
        ProjectFile file = reader.read(fileName);
        List<XERDataModel> xerDataModel = new ArrayList<>();

        for (Task task : file.getTasks()) {
            if (!task.getSummary() && !task.getName().contains("LOE")) {
                List<Relation> predecessors = task.getPredecessors();
                List<Relation> successors = task.getSuccessors();

                String preName = "";
                String sucName = "";

                if (predecessors != null && predecessors.isEmpty() == false) {
                    int i = 0;
                    for (Relation relation : predecessors) {
                        if (i > 0 && !preName.isEmpty()) {
                            preName = preName.concat(", ");
                        }

                        if (!relation.getSourceTask().getPredecessors().get(i).getTargetTask().getName().contains("LOE")) {
                            preName = preName.concat(relation.getSourceTask().getPredecessors().get(i).getTargetTask().getName());
                        }
                        i++;
                    }
                }

                if (successors != null && successors.isEmpty() == false) {
                    int i = 0;
                    for (Relation relation : successors) {
                        if (i > 0 && !sucName.isEmpty()) {
                            sucName = sucName.concat(", ");
                        }
                        if (!relation.getSourceTask().getSuccessors().get(i).getTargetTask().getName().contains("LOE")) {
                            sucName = sucName.concat(relation.getSourceTask().getSuccessors().get(i).getTargetTask().getName());
                        }
                        i++;
                    }
                }

                XERDataModel sData = new XERDataModel(task.getUniqueID().toString(), task.getActivityID(), task.getWBS(), task.getName(),
                        task.getStart(), task.getFinish(), preName, sucName);
                xerDataModel.add(sData);

            } else if (!task.getSummary() && task.getName().contains("LOE")) {
                //Do Nothing

            } else {
                XERDataModel nData = new XERDataModel(task.getUniqueID().toString(), task.getActivityID(), task.getWBS(), task.getName(), null, null, null, null);
                xerDataModel.add(nData);
            }
        }

        return xerDataModel;

    }

    /*
    * Log file writer for available tasks with LOE
    * also shows connection to other tasks from LOE
     */
    private void LogFileWriter(String pathName) {
        //pathName = "/home/ashraf/test.txt";
        FileWriter myWriter = null;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sDate = new SimpleDateFormat("dd.MMM.yyyy");
        //System.out.println(dateOnly.format(cal.getTime()));

        try {
            myWriter = new FileWriter(pathName);

            if (!xFileName.isEmpty()) {
                try {
                    XERDataTableModel model = new XERDataTableModel(PopulateTable(xFileName));
                    //myWriter.write("Unique ID" + System.lineSeparator());

                    myWriter.write("LOE task Description:\n\n");
                    String formatStr = "%-8s %-12s %-15s %-20s %-20s %-20s %-20s%n";
                    myWriter.write(String.format(formatStr, "UniqueID", "ActivityID", "Name", "Start Date", "End Date", "Predecessor", "Successor"));
                    myWriter.write("=".repeat(115) + "\n");

                    List<XERDataModel> xerDataModel;

                    xerDataModel = PopulateTable(xFileName);

                    for (int i = 0; i < xerDataModel.size(); i++) {
                        if (xerDataModel.get(i).taskName.contains("LOE")) {
                            myWriter.write(String.format(formatStr, xerDataModel.get(i).getUniqueID(), xerDataModel.get(i).getActivityID(),
                                    xerDataModel.get(i).getTaskName(), sDate.format(xerDataModel.get(i).getStartDate()),
                                    sDate.format(xerDataModel.get(i).getEndDate()), xerDataModel.get(i).getPredecessor(), xerDataModel.get(i).getSuccessor()));
                        }
                    }

                    myWriter.write("\n\nRemoved LOE task connection:\n\n");
                    myWriter.write(String.format(formatStr, "UniqueID", "ActivityID", "Name", "Start Date", "End Date", "Predecessor", "Successor"));
                    myWriter.write("=".repeat(115) + "\n");

                    for (int i = 0; i < xerDataModel.size(); i++) {
                        if (xerDataModel.get(i).successor != null) {
                            if (xerDataModel.get(i).successor.contains("LOE") || xerDataModel.get(i).predecessor.contains("LOE")) {
                                myWriter.write(String.format(formatStr, xerDataModel.get(i).getUniqueID(), xerDataModel.get(i).getActivityID(),
                                        xerDataModel.get(i).getTaskName(), sDate.format(xerDataModel.get(i).getStartDate()),
                                        sDate.format(xerDataModel.get(i).getEndDate()), xerDataModel.get(i).getPredecessor(), xerDataModel.get(i).getSuccessor()));
                            }
                        }
                    }

                    myWriter.close();
                } catch (MPXJException ex) {
                    Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                myWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
