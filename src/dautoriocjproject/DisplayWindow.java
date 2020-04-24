package dautoriocjproject;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
/**
 *
 * @author CJ D'Autorio
 */
public class DisplayWindow extends javax.swing.JFrame {
	private boolean canExecute = false;
	private String fileBrowserTitle = "Enter the root folder";
	private FileManager fileManager = new FileManager();
	
	/**
	 * Creates new form DisplayWindow
	 */
	public DisplayWindow() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileBrowserFrame = new javax.swing.JFrame();
        FileBrowser = new javax.swing.JFileChooser();
        ConfirmDirectoryButton = new javax.swing.JButton();
        DirectoryLocationField = new javax.swing.JTextField();
        OpenFolderBrowserButton = new javax.swing.JButton();

        FileBrowserFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                FileBrowserFrameWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout FileBrowserFrameLayout = new javax.swing.GroupLayout(FileBrowserFrame.getContentPane());
        FileBrowserFrame.getContentPane().setLayout(FileBrowserFrameLayout);
        FileBrowserFrameLayout.setHorizontalGroup(
            FileBrowserFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FileBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FileBrowserFrameLayout.setVerticalGroup(
            FileBrowserFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FileBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ConfirmDirectoryButton.setText("Choose Directory");
        ConfirmDirectoryButton.setEnabled(false);
        ConfirmDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmDirectoryButtonActionPerformed(evt);
            }
        });

        OpenFolderBrowserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dautoriocjproject/images/001-open-folder.png"))); // NOI18N
        OpenFolderBrowserButton.setToolTipText("Open folder browser");
        OpenFolderBrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFolderBrowserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmDirectoryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirectoryLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpenFolderBrowserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OpenFolderBrowserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ConfirmDirectoryButton)
                        .addComponent(DirectoryLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmDirectoryButtonActionPerformed
		
		
    }//GEN-LAST:event_ConfirmDirectoryButtonActionPerformed

    private void OpenFolderBrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFolderBrowserButtonActionPerformed
		FileBrowserFrame.setVisible(true);
		FileBrowser.setDialogTitle(fileBrowserTitle);
		FileBrowser.setCurrentDirectory(new java.io.File("."));
		FileBrowser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		FileBrowser.setAcceptAllFileFilterUsed(false);
		int option = FileBrowser.showOpenDialog(FileBrowserFrame);
		if (option == JFileChooser.APPROVE_OPTION) {
			File directory = FileBrowser.getSelectedFile();
			DirectoryLocationField.setText(directory.getPath());
			ConfirmDirectoryButton.setEnabled(true);
		}
    }//GEN-LAST:event_OpenFolderBrowserButtonActionPerformed

    private void FileBrowserFrameWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FileBrowserFrameWindowOpened
		
    }//GEN-LAST:event_FileBrowserFrameWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmDirectoryButton;
    private javax.swing.JTextField DirectoryLocationField;
    private javax.swing.JFileChooser FileBrowser;
    private javax.swing.JFrame FileBrowserFrame;
    private javax.swing.JButton OpenFolderBrowserButton;
    // End of variables declaration//GEN-END:variables
}
