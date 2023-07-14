import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

	public Admin() {
		initComponents();
	}
	
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                adminTitleLabel = new javax.swing.JLabel();
                Name = new javax.swing.JLabel();
                Password = new javax.swing.JLabel();
                adminName = new javax.swing.JTextField();
                adminSubmit = new javax.swing.JButton();
                adminBack = new javax.swing.JButton();
                adminPassword = new javax.swing.JPasswordField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                adminTitleLabel.setBackground(new java.awt.Color(204, 255, 255));
                adminTitleLabel.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                adminTitleLabel.setText("Admin Login");

                Name.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                Name.setText("Name :-");

                Password.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                Password.setText("Password :-");

                adminName.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N

                adminSubmit.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                adminSubmit.setText("Submit");
                adminSubmit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                adminSubmitActionPerformed(evt);
                        }
                });

                adminBack.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
                adminBack.setText("Go back");
                adminBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                adminBackActionPerformed(evt);
                        }
                });

                adminPassword.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adminTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(adminSubmit)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(adminBack))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Name))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(30, 30, 30)
                                                                        .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(30, 30, 30)
                                                                        .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(30, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(adminTitleLabel)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(adminPassword)
                                        .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(adminSubmit)
                                        .addComponent(adminBack))
                                .addContainerGap(30, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void adminBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackActionPerformed
		dispose();
		Welcome w = new Welcome();
		w.setVisible(true);
        }//GEN-LAST:event_adminBackActionPerformed

        private void adminSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubmitActionPerformed
		try {
			String name = adminName.getText();
			String password = adminPassword.getText();
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/predictionsystem", "root", "Database_Password@2023");
			Statement st = con.createStatement();
			String str = "select * from admindata where Admin_Name ='" + name + "' and Admin_Password = '" + password + "'";
			ResultSet rs = st.executeQuery(str);
			if (rs.next()) {
				JOptionPane.showMessageDialog(this, "Successfully Logged In press OK to continue", "Welcome Admin", JOptionPane.INFORMATION_MESSAGE);
				dispose();
				AdminTable at = new AdminTable();
				at.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(this, "Maybe following things occured an error\n• Input might be empty\n• Incorrect Credentials", "Can't Log In !!!", JOptionPane.ERROR_MESSAGE);
				adminName.setText("");
				adminPassword.setText("");
			}

		} catch (Throwable e) {
			e.printStackTrace();
		}


        }//GEN-LAST:event_adminSubmitActionPerformed

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
			java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Admin().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel Name;
        private javax.swing.JLabel Password;
        private javax.swing.JButton adminBack;
        private javax.swing.JTextField adminName;
        private javax.swing.JPasswordField adminPassword;
        private javax.swing.JButton adminSubmit;
        private javax.swing.JLabel adminTitleLabel;
        // End of variables declaration//GEN-END:variables
}
