import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class AdminTable extends javax.swing.JFrame {
	public AdminTable() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                adminTable = new javax.swing.JTable();
                addbtn = new javax.swing.JButton();
                deletebtn = new javax.swing.JButton();
                updatebtn = new javax.swing.JButton();
                backbtn = new javax.swing.JButton();
                choices = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel2.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                jLabel2.setText("Current Stocks");

                adminTable.setFont(new java.awt.Font("Utsaah", 3, 18)); // NOI18N
                adminTable.setModel(new javax.swing.table.DefaultTableModel(
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
                adminTable.setColumnSelectionAllowed(true);
                adminTable.setShowGrid(true);
                jScrollPane1.setViewportView(adminTable);
                adminTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

                addbtn.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                addbtn.setText("Add");
                addbtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addbtnActionPerformed(evt);
                        }
                });

                deletebtn.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                deletebtn.setText("Delete");
                deletebtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deletebtnActionPerformed(evt);
                        }
                });

                updatebtn.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                updatebtn.setText("Update");
                updatebtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                updatebtnActionPerformed(evt);
                        }
                });

                backbtn.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                backbtn.setText("Back");
                backbtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backbtnActionPerformed(evt);
                        }
                });

                choices.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                choices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select to view", "Processors", "RAMs", "GPUs" }));
                choices.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                choicesActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(addbtn)
                                                .addGap(30, 30, 30)
                                                .addComponent(deletebtn)
                                                .addGap(30, 30, 30)
                                                .addComponent(choices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(updatebtn)
                                                .addGap(30, 30, 30)
                                                .addComponent(backbtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(281, 281, 281)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(30, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addbtn)
                                        .addComponent(deletebtn)
                                        .addComponent(backbtn)
                                        .addComponent(updatebtn)
                                        .addComponent(choices, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
		dispose();
		Add a = new Add();
		a.setVisible(true);

		// TODO add your handling code here:
        }//GEN-LAST:event_addbtnActionPerformed

        private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
		dispose();
		Welcome w = new Welcome();
		w.setVisible(true);
        }//GEN-LAST:event_backbtnActionPerformed


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
							DefaultTableModel table = (DefaultTableModel) adminTable.getModel();
							table.setRowCount(0);
							break;
						}
						case "Processors": {
							sql = "select * from processordata";
							ResultSet rs = st.executeQuery(sql);
							DefaultTableModel table = (DefaultTableModel) adminTable.getModel();
							table.setRowCount(0);
							while (rs.next()) {
								String id = rs.getString("ID");
								String name = rs.getString("Name");
								String price2 = rs.getString("Price_Two");
								String price1 = rs.getString("Price_One");
								String tbData[] = {id, name, price1, price2};
								table.addRow(tbData);
							}
							break;
						}
						case "RAMs": {
							sql = "select * from ramdata";
							ResultSet rs = st.executeQuery(sql);
							DefaultTableModel table = (DefaultTableModel) adminTable.getModel();
							table.setRowCount(0);
							while (rs.next()) {
								String id = rs.getString("ID");
								String name = rs.getString("Name");
								String price2 = rs.getString("Price_Two");
								String price1 = rs.getString("Price_One");
								String tbData[] = {id, name, price1, price2};
								table.addRow(tbData);
							}
							break;
						}
						case "GPUs": {
							sql = "select * from gpudata";
							ResultSet rs = st.executeQuery(sql);
							DefaultTableModel table = (DefaultTableModel) adminTable.getModel();
							table.setRowCount(0);
							while (rs.next()) {
								String id = rs.getString("ID");
								String name = rs.getString("Name");
								String price2 = rs.getString("Price_Two");
								String price1 = rs.getString("Price_One");
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

        private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
		dispose();
		Delete d = new Delete();
		d.setVisible(true);// TODO add your handling code here:
        }//GEN-LAST:event_deletebtnActionPerformed

        private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
		dispose();
		Update u = new Update();
		u.setVisible(true);
		// TODO add your handling code here:
        }//GEN-LAST:event_updatebtnActionPerformed

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
			java.util.logging.Logger.getLogger(AdminTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminTable().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addbtn;
        private javax.swing.JTable adminTable;
        private javax.swing.JButton backbtn;
        private javax.swing.JComboBox<String> choices;
        private javax.swing.JButton deletebtn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton updatebtn;
        // End of variables declaration//GEN-END:variables
}
