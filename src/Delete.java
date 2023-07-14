/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kumar
 */
public class Delete extends javax.swing.JFrame {

	/**
	 * Creates new form Delete
	 */
	public Delete() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deleteTable = new javax.swing.JTable();
        choices = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        idlabel = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        jLabel2.setText("Stock removing");

        deleteTable.setFont(new java.awt.Font("Utsaah", 3, 18)); // NOI18N
        deleteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price 2021", "Price 2022"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deleteTable.setColumnSelectionAllowed(true);
        deleteTable.setShowGrid(true);
        jScrollPane1.setViewportView(deleteTable);
        deleteTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        choices.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        choices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select to view", "Processors", "RAMs", "GPUs" }));
        choices.setName(""); // NOI18N
        choices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choicesActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        idlabel.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        idlabel.setText("Enter the ID to delete:- ");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(deleteBtn)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(choices, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(choices, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlabel)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn)
                    .addComponent(jButton1))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void choicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choicesActionPerformed
		if (evt.getSource() == choices) {
			if (choices.getSelectedItem() != null) {
				String so = choices.getSelectedItem().toString();

				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/predictionsystem", "root", "Database_Password@2023");
					Statement st = con.createStatement();
					String sql = "";
					switch (so) {
						case "Select to view": {
							DefaultTableModel table = (DefaultTableModel) deleteTable.getModel();
							table.setRowCount(0);
							break;
						}
						case "Processors": {
							sql = "select * from processordata";
							ResultSet rs = st.executeQuery(sql);
							DefaultTableModel table = (DefaultTableModel) deleteTable.getModel();
							table.setRowCount(0);
							while (rs.next()) {
								String id = rs.getString("ID");
								String name = rs.getString("Name");
								String price1 = rs.getString("Price_Two");
								String price2 = rs.getString("Price_One");
								String tbData[] = {id, name, price1, price2};
								table.addRow(tbData);
							}
							break;
						}
						case "RAMs": {
							sql = "select * from ramdata";
							ResultSet rs = st.executeQuery(sql);
							DefaultTableModel table = (DefaultTableModel) deleteTable.getModel();
							table.setRowCount(0);
							while (rs.next()) {
								String id = rs.getString("ID");
								String name = rs.getString("Name");
								String price1 = rs.getString("Price_Two");
								String price2 = rs.getString("Price_One");

								String tbData[] = {id, name, price1, price2};
								table.addRow(tbData);
							}
							break;
						}
						case "GPUs": {
							sql = "select * from gpudata";
							ResultSet rs = st.executeQuery(sql);
							DefaultTableModel table = (DefaultTableModel) deleteTable.getModel();
							table.setRowCount(0);
							while (rs.next()) {
								String id = rs.getString("ID");
								String name = rs.getString("Name");
								String price1 = rs.getString("Price_Two");
								String price2 = rs.getString("Price_One");

								String tbData[] = {id, name, price1, price2};
								table.addRow(tbData);
							}
							break;
						}
						default:
							break;
					}

				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}
		
        }//GEN-LAST:event_choicesActionPerformed

        private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

		String so = choices.getSelectedItem().toString();
		String i = id.getText();
		if (i.equals("")) {
			JOptionPane.showMessageDialog(this, "Maybe following things occured an error\n• Input might be empty", "Can't Delete !!!", JOptionPane.ERROR_MESSAGE);
                }
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/predictionsystem", "root", "Database_Password@2023");
			Statement st = con.createStatement();
			String sql = "";

			switch (so) {
				case "Processors":
					{
						sql = "DELETE FROM processordata WHERE ID ='" + i + "'";
						st.executeUpdate(sql);
						JOptionPane.showMessageDialog(this, "Selected item deleted.");
						dispose();
						Delete d = new Delete();
						d.setVisible(true);
						break;
					}
				case "RAMs":
					{
						sql = "DELETE FROM ramdata WHERE ID ='" + i + "'";
						st.executeUpdate(sql);
						JOptionPane.showMessageDialog(this, "Selected item deleted.");
						dispose();
						Delete d = new Delete();
						d.setVisible(true);
						break;
					}
				case "GPUs":
					{
						sql = "DELETE FROM gpudata WHERE ID ='" + i + "'";
						st.executeUpdate(sql);
						JOptionPane.showMessageDialog(this, "Selected item deleted.");
						dispose();
						Delete d = new Delete();
						d.setVisible(true);
						break;
					}
				default:
					break;
			}

		} catch (Throwable e) {
			e.printStackTrace();
		}
		// TODO add your handling code here:
        }//GEN-LAST:event_deleteBtnActionPerformed

        private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_idActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		dispose();
		AdminTable at = new AdminTable();
		at.setVisible(true);
		// TODO add your handling code here:
        }//GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Delete().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choices;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable deleteTable;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
