import javax.swing.ImageIcon;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class ReservationFrame extends javax.swing.JFrame {

   public ReservationFrame() {
        initComponents();
        
        setTitle("Restaurant Reservation System");
        // limits the user from modifying the gui
        setResizable(false);
        setLocationRelativeTo(null);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ImageIcon image = new ImageIcon(getClass().getResource("icon.png"));
        setIconImage(image.getImage());
        
        // I imported JCalendar plugin for a better date selection
        Calendar minDate = Calendar.getInstance();
        minDate.set(2024, Calendar.JANUARY, 1);
        jDateChooser1.getJCalendar().setMinSelectableDate(minDate.getTime());
        
        //Limits the date the user can pick
        Calendar maxDate = Calendar.getInstance();
        maxDate.set(2034, Calendar.DECEMBER, 31);
        jDateChooser1.getJCalendar().setMaxSelectableDate(maxDate.getTime());
        ((com.toedter.calendar.JYearChooser) jDateChooser1.getJCalendar().getYearChooser()).setStartYear(2024);
        ((com.toedter.calendar.JYearChooser) jDateChooser1.getJCalendar().getYearChooser()).setEndYear(2034);
        
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1)); // Minimum, maximum, step
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1)); // Minimum, maximum, step
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        BackButton = new javax.swing.JButton();
        ReservationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        ReservationReport = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 60)); // NOI18N
        jLabel1.setText("MANG JOSE STEAK HOUSE");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Name:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Date:");

        jDateChooser1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jDateChooser1.setMaxSelectableDate(new java.util.Date(2051193540000L));
        jDateChooser1.setMinSelectableDate(new java.util.Date(1709744460000L));
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Time:");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM", "06:00 PM", "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM", "11:00 PM", "12:00 PM" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Adults:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Childrens:");

        jSpinner1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jSpinner2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        BackButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BackButton.setText("<< Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ReservationButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ReservationButton.setText("Reserve >>");
        ReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Date", "Time", "Name", "Adults", "Children"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        DeleteButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteButton.setText("Delete Reservation");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ReservationReport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ReservationReport.setText("Generate Reservation Report");
        ReservationReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(ReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 200, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(ReservationReport)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(ReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReservationReport, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to go back to the main app?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
        this.dispose();
        MainApp mainForm = new MainApp();
        mainForm.setVisible(true);
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationButtonActionPerformed
        String name = jTextField1.getText();
        Date date = jDateChooser1.getDate();
        String time = (String) jComboBox1.getSelectedItem();
        int adults = (int) jSpinner1.getValue();
        int children = (int) jSpinner2.getValue();
        
         if (!name.matches("[a-zA-Z\\s]+")) {
        JOptionPane.showMessageDialog(this, "Please enter letters only.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        return;
    }

        if (name.isEmpty() || date == null || time.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Incomplete Reservation", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Format date for display
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Calculate reservation subtotal
       int subtotal = adults * 500 + children * 300;

    // Add reservation data to table
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int reservationNumber = model.getRowCount() + 1;
    Object[] rowData = {reservationNumber, formattedDate, time, name, adults, children, subtotal};
    addReservationToTable(rowData);
    }//GEN-LAST:event_ReservationButtonActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Row Selected", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Decrease the reservation number if the user deletes one
    int deletedReservationNumber = (int) model.getValueAt(selectedRow, 0);
    for (int i = selectedRow + 1; i < model.getRowCount(); i++) {
        int currentReservationNumber = (int) model.getValueAt(i, 0);
        model.setValueAt(currentReservationNumber - 1, i, 0);
    }

    // Remove the selected row
    model.removeRow(selectedRow);        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ReservationReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationReportActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
    // if user clicks generate report with no reservation
    if (model.getRowCount() == 0) {
    JOptionPane.showMessageDialog(this, "There are no reservations to generate a report.", "Empty Reservation", JOptionPane.INFORMATION_MESSAGE);
    return;
    }
    
    int rowCount = model.getRowCount();
    Object[][] reportData = new Object[rowCount][7]; // 7 columns: #, Date, Time, Name, Adults, Children, Subtotal

    for (int i = 0; i < rowCount; i++) {
        for (int j = 0; j < 6; j++) {
            reportData[i][j] = model.getValueAt(i, j);
        }
        int adults = (int) model.getValueAt(i, 4);
        int children = (int) model.getValueAt(i, 5);
        int subtotal = adults * 500 + children * 300;
        reportData[i][6] = subtotal; // Subtotal
    }

    // Open ReportFrame and populate its table
    this.setVisible(false);
    ReportFrame reportFrame = new ReportFrame();
    reportFrame.setReportData(reportData);
    reportFrame.setVisible(true);
    }//GEN-LAST:event_ReservationReportActionPerformed
    public void addReservationToTable(Object[] rowData) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.addRow(rowData);
   }
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
            java.util.logging.Logger.getLogger(ReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ReservationButton;
    private javax.swing.JButton ReservationReport;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
