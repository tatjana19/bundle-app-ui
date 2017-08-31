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
package de.alpharogroup.bundle.app.panels.dashboard;

/**
 *
 * @author astrapi69
 */
public class DashboardFormJPanel extends javax.swing.JPanel
{

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCreateCustomLocale;

	private javax.swing.JButton btnCreateRb;

	private javax.swing.JButton btnEditBundleAppName;


	private javax.swing.JButton btnOverview;
	// End of variables declaration//GEN-END:variables
	/**
	 * Creates new form DashboardFormJPanel
	 */
	public DashboardFormJPanel()
	{
		initComponents();
	}
	private void btnCreateCustomLocaleActionPerformed(java.awt.event.ActionEvent evt)
	{// GEN-FIRST:event_btnCreateCustomLocaleActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnCreateCustomLocaleActionPerformed
	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents()
	{

		btnEditBundleAppName = new javax.swing.JButton();
		btnOverview = new javax.swing.JButton();
		btnCreateRb = new javax.swing.JButton();
		btnCreateCustomLocale = new javax.swing.JButton();

		btnEditBundleAppName.setText("Edit Bundle-Application name");

		btnOverview.setText("Overview of resource-bundles");

		btnCreateRb.setText("Create new resource-bundle");

		btnCreateCustomLocale.setText("Create new custom locale");
		btnCreateCustomLocale.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				btnCreateCustomLocaleActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout
			.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup().addGap(27, 27, 27).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(btnCreateRb, javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnOverview, javax.swing.GroupLayout.DEFAULT_SIZE, 740,
							Short.MAX_VALUE)
						.addComponent(btnEditBundleAppName, javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCreateCustomLocale, javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(33, Short.MAX_VALUE)));
		layout
			.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(34, 34, 34)
					.addComponent(btnEditBundleAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(btnOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(btnCreateRb, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(btnCreateCustomLocale, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents
}
