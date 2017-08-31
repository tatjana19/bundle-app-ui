/*
 * Copyright 2017 Alpha Ro Group UG (haftungsbeschrängt).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.alpharogroup.bundle.app.panels.newuser;

/**
 *
 * @author astrapi69
 */
public class NewBundleAppFormPanel extends javax.swing.JPanel
{

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel lblBundleAppName;

	private javax.swing.JLabel lblHeaderNewUser;

	private javax.swing.JLabel lblHeaderSetAppName;

	private javax.swing.JLabel lblPw;


	private javax.swing.JLabel lblRepeatPw;
	private javax.swing.JLabel lblUsername;
	private javax.swing.JTextField txtBundleAppName;
	private javax.swing.JTextField txtPw;
	private javax.swing.JTextField txtRepeatPw;
	private javax.swing.JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
	/**
	 * Creates new form NewBundleAppJPanel
	 */
	public NewBundleAppFormPanel()
	{
		initComponents();
	}
	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		lblUsername = new javax.swing.JLabel();
		txtUsername = new javax.swing.JTextField();
		lblRepeatPw = new javax.swing.JLabel();
		txtRepeatPw = new javax.swing.JTextField();
		lblPw = new javax.swing.JLabel();
		txtPw = new javax.swing.JTextField();
		lblBundleAppName = new javax.swing.JLabel();
		txtBundleAppName = new javax.swing.JTextField();
		lblHeaderNewUser = new javax.swing.JLabel();
		lblHeaderSetAppName = new javax.swing.JLabel();

		lblUsername.setText("User name");

		txtUsername.setText("bundle-admin");

		lblRepeatPw.setText("Repeat Password");

		txtRepeatPw.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				txtRepeatPwActionPerformed(evt);
			}
		});

		lblPw.setText("Password");

		txtPw.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				txtPwActionPerformed(evt);
			}
		});

		lblBundleAppName.setText("Bundle application name");

		lblHeaderNewUser
			.setText("Create new root account (default name of bundle admin is bundle-admin)");

		lblHeaderSetAppName.setText("Set the name of your new bundle application");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
					layout
						.createSequentialGroup().addGap(40, 40, 40)
						.addGroup(layout.createParallelGroup(
							javax.swing.GroupLayout.Alignment.TRAILING)
							.addComponent(lblHeaderSetAppName, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblHeaderNewUser,
								javax.swing.GroupLayout.Alignment.LEADING,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(layout.createSequentialGroup()
								.addComponent(lblBundleAppName,
									javax.swing.GroupLayout.PREFERRED_SIZE, 200,
									javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
									javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtBundleAppName,
									javax.swing.GroupLayout.PREFERRED_SIZE, 300,
									javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(layout.createSequentialGroup()
								.addGroup(layout
									.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										false)
									.addComponent(lblPw, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblUsername,
										javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblRepeatPw, javax.swing.GroupLayout.DEFAULT_SIZE,
										200, Short.MAX_VALUE))
								.addGap(18, 40, Short.MAX_VALUE)
								.addGroup(layout
									.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
										false)
									.addComponent(txtUsername,
										javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
									.addComponent(txtPw, javax.swing.GroupLayout.Alignment.TRAILING)
									.addComponent(txtRepeatPw))))
						.addGap(40, 40, 40)));
		layout
			.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(40, 40, 40)
					.addComponent(lblHeaderSetAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblBundleAppName).addComponent(txtBundleAppName,
							javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblHeaderNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblUsername).addComponent(txtUsername,
							javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPw).addComponent(txtPw,
							javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblRepeatPw).addComponent(txtRepeatPw,
							javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(40, 40, 40)));
	}// </editor-fold>//GEN-END:initComponents
	private void txtPwActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_txtPwActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtPwActionPerformed
	private void txtRepeatPwActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_txtRepeatPwActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtRepeatPwActionPerformed
}
