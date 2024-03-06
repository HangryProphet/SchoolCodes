import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class ReportFrame extends javax.swing.JFrame {
   
    public ReportFrame() {
        initComponents();
        setTitle("Restaurant Reservation System");
        
        // limits the user from modifying the gui
        setResizable(false);
        setLocationRelativeTo(null);
        ReportTable.getTableHeader().setReorderingAllowed(false);
        totalsTable.getTableHeader().setReorderingAllowed(false);
        ReportTable.getTableHeader().setResizingAllowed(false);
        totalsTable.getTableHeader().setResizingAllowed(false);
        ReportTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        totalsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ImageIcon image = new ImageIcon(getClass().getResource("icon.png"));
        setIconImage(image.getImage());
        
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        totalsTable = new javax.swing.JTable();
        exitApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReportTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Date", "Time", "Name", "Adults", "Childrens", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReportTable);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 60)); // NOI18N
        jLabel1.setText("MANG JOSE STEAK HOUSE");

        totalsTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Total ", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(totalsTable);

        exitApp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exitApp.setText("Exit Application >>");
        exitApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(267, 267, 267))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(exitApp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void exitAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAppActionPerformed
         int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the program? Your Reservation will be finalised.", "Restaurant Reservation System", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(
            null, 
            "Jeremiah C. Jose \n ITE231", 
            "Restaurant Reservation System", 
            JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0); // Exit the application
       }
    }//GEN-LAST:event_exitAppActionPerformed
    public void setReportData(Object[][] data) {
    DefaultTableModel reportModel = (DefaultTableModel) ReportTable.getModel();
        DefaultTableModel totalsModel = (DefaultTableModel) totalsTable.getModel();
        reportModel.setRowCount(0);

        // Initialize total variables
        int grandTotal = 0;
        int totalAdults = 0;
        int totalChildren = 0;

        // Add rows from data and calculate subtotals
        for (Object[] row : data) {
            int adults = (int) row[4]; // Assuming "Adults" is at index 4
            int children = (int) row[5]; // Assuming "Children" is at index 5
            int subtotalAmount = adults * 500 + children * 300;

            // Add a new row with calculated subtotal
            Object[] rowWithSubtotal = new Object[row.length + 1]; // Add space for subtotal
            System.arraycopy(row, 0, rowWithSubtotal, 0, row.length); // Copy existing data
            rowWithSubtotal[row.length] = subtotalAmount; // Add the calculated subtotal

            reportModel.addRow(rowWithSubtotal);

            // Update total variables
            grandTotal += subtotalAmount;
            totalAdults += adults;
            totalChildren += children;
        }

        // Add totals to the totals table
        totalsModel.insertRow(0, new Object[]{"Grand Total","PHP" + " " + grandTotal});
        totalsModel.insertRow(1, new Object[]{"Total Adults", totalAdults});
        totalsModel.insertRow(2, new Object[]{"Total Children", totalChildren});
    
    }
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
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReportTable;
    private javax.swing.JButton exitApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable totalsTable;
    // End of variables declaration//GEN-END:variables
}
