public class Welcome extends javax.swing.JFrame {

	public Welcome() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome = new javax.swing.JLabel();
        homeAboutUsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        homeAboutUsTextArea = new javax.swing.JTextArea();
        loginBtn = new javax.swing.JButton();
        userBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        setResizable(false);

        welcome.setBackground(new java.awt.Color(204, 204, 204));
        welcome.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        welcome.setText("Welcome to our prediction system");

        homeAboutUsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "About Us", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Utsaah", 3, 24))); // NOI18N

        homeAboutUsTextArea.setEditable(false);
        homeAboutUsTextArea.setBackground(new java.awt.Color(204, 204, 204));
        homeAboutUsTextArea.setColumns(20);
        homeAboutUsTextArea.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        homeAboutUsTextArea.setLineWrap(true);
        homeAboutUsTextArea.setRows(5);
        homeAboutUsTextArea.setText("Hi, hope you are great.\n\nOur Prediction system predict the price based on previously recorded price\n\nMy team:-\n\t1). Arjun Kumar\n\t2). Suhana Jain\n\t3). Nitish Poonia\nContact us:-\n\t1800-123-108\n\thelpdesk.ps@gmail.com");
        jScrollPane1.setViewportView(homeAboutUsTextArea);

        javax.swing.GroupLayout homeAboutUsPanelLayout = new javax.swing.GroupLayout(homeAboutUsPanel);
        homeAboutUsPanel.setLayout(homeAboutUsPanelLayout);
        homeAboutUsPanelLayout.setHorizontalGroup(
            homeAboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeAboutUsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        homeAboutUsPanelLayout.setVerticalGroup(
            homeAboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeAboutUsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        loginBtn.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        loginBtn.setText("Admin Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        userBtn.setFont(new java.awt.Font("Utsaah", 3, 24)); // NOI18N
        userBtn.setText("User");
        userBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginBtn)
                        .addGap(30, 30, 30)
                        .addComponent(userBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeAboutUsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(homeAboutUsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
		dispose();
		User u = new User();
		u.setVisible(true);
        }//GEN-LAST:event_userBtnActionPerformed

        private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
		dispose();
		Admin a = new Admin();
		a.setVisible(true);
        }//GEN-LAST:event_loginBtnActionPerformed

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
				new Welcome().setVisible(true);
			}
		});
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeAboutUsPanel;
    private javax.swing.JTextArea homeAboutUsTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton userBtn;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
