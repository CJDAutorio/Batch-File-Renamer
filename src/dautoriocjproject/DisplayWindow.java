package dautoriocjproject;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.nio.*;
import javax.swing.table.*;
/**
 *
 * @author CJ D'Autorio
 */
public class DisplayWindow extends javax.swing.JFrame {
	private boolean canExecute = false;
	private String fileBrowserTitle = "Enter the root folder";
	private FileManager fileManager = new FileManager();
	private File directory;
	private File exportDirectory;
	private ArrayList<File> fileList = new ArrayList();
	private DefaultTableModel fileTableModel = new DefaultTableModel(new String[] { "New Name", "File Type", "File Size (kb)", "Location", "Old Name"},0);
	
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
        FileScrollPane = new javax.swing.JScrollPane();
        FileTable = new javax.swing.JTable();
        PrefixTextField = new javax.swing.JTextField();
        SuffixTextField = new javax.swing.JTextField();
        RecursiveLabel = new javax.swing.JLabel();
        RecursiveToggle = new javax.swing.JToggleButton();
        SetPrefixButton = new javax.swing.JButton();
        SetSuffixButton = new javax.swing.JButton();
        NumberFilesLabel = new javax.swing.JLabel();
        NumberFilesToggle = new javax.swing.JToggleButton();
        SortByComboBox = new javax.swing.JComboBox<>();
        SortByButton = new javax.swing.JButton();
        ExportLocationField = new javax.swing.JTextField();
        OpenFolderBrowserExport = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
        FileNumberLabel = new javax.swing.JLabel();
        NumberFilesNumberLabel = new javax.swing.JLabel();

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

        DirectoryLocationField.setText("Source Directory");

        OpenFolderBrowserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dautoriocjproject/images/001-open-folder.png"))); // NOI18N
        OpenFolderBrowserButton.setToolTipText("Open folder browser");
        OpenFolderBrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFolderBrowserButtonActionPerformed(evt);
            }
        });

        FileTable.setModel(fileTableModel);
        FileTable.getTableHeader().setReorderingAllowed(false);
        FileScrollPane.setViewportView(FileTable);

        PrefixTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrefixTextFieldActionPerformed(evt);
            }
        });

        RecursiveLabel.setText("Recursive?");

        RecursiveToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dautoriocjproject/images/004-shape.png"))); // NOI18N
        RecursiveToggle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RecursiveToggleItemStateChanged(evt);
            }
        });
        RecursiveToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecursiveToggleActionPerformed(evt);
            }
        });

        SetPrefixButton.setText("Set Prefix");
        SetPrefixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetPrefixButtonActionPerformed(evt);
            }
        });

        SetSuffixButton.setText("Set Suffix");
        SetSuffixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetSuffixButtonActionPerformed(evt);
            }
        });

        NumberFilesLabel.setText("Number Files?");

        NumberFilesToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dautoriocjproject/images/004-shape.png"))); // NOI18N
        NumberFilesToggle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NumberFilesToggleItemStateChanged(evt);
            }
        });
        NumberFilesToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberFilesToggleActionPerformed(evt);
            }
        });

        SortByComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABC", "ZYX", "Size (Inc)", "Size (Dec)" }));

        SortByButton.setText("Sort By");
        SortByButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortByButtonActionPerformed(evt);
            }
        });

        ExportLocationField.setText("Export Directory");

        OpenFolderBrowserExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dautoriocjproject/images/001-open-folder.png"))); // NOI18N
        OpenFolderBrowserExport.setToolTipText("Open folder browser");
        OpenFolderBrowserExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFolderBrowserExportActionPerformed(evt);
            }
        });

        ExportButton.setText("Rename Files");
        ExportButton.setEnabled(false);

        FileNumberLabel.setText("Number of Files:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FileNumberLabel)
                            .addComponent(ConfirmDirectoryButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DirectoryLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberFilesNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpenFolderBrowserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExportLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpenFolderBrowserExport, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExportButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FileScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PrefixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(SetPrefixButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SuffixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(SetSuffixButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(RecursiveLabel))
                                        .addComponent(NumberFilesLabel))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RecursiveToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NumberFilesToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SortByButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SortByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrefixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetPrefixButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SuffixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetSuffixButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecursiveToggle)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(RecursiveLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(NumberFilesToggle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(NumberFilesLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SortByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SortByButton)))
                    .addComponent(FileScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileNumberLabel)
                    .addComponent(NumberFilesNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OpenFolderBrowserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ConfirmDirectoryButton)
                        .addComponent(DirectoryLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OpenFolderBrowserExport, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmDirectoryButtonActionPerformed
		if (fileManager.isRecursive()) {
			fileList = fileManager.listFilesRecursive(directory);
		} else {
			fileList = fileManager.listFiles(directory);
		}
		
		System.out.println("Directory: " + directory.getAbsolutePath());
		System.out.println(fileList.size());
		
		populateFileTable();
    }//GEN-LAST:event_ConfirmDirectoryButtonActionPerformed

    private void OpenFolderBrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFolderBrowserButtonActionPerformed
		FileBrowserFrame.setVisible(true);
		FileBrowser.setDialogTitle(fileBrowserTitle);
		FileBrowser.setCurrentDirectory(new java.io.File("."));
		FileBrowser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		FileBrowser.setAcceptAllFileFilterUsed(false);
		int option = FileBrowser.showOpenDialog(FileBrowserFrame);
		if (option == JFileChooser.APPROVE_OPTION) {
			directory = FileBrowser.getSelectedFile();
			DirectoryLocationField.setText(directory.getAbsolutePath());
			ExportLocationField.setText(directory.getAbsolutePath());
			ConfirmDirectoryButton.setEnabled(true);
			ExportButton.setEnabled(true);
			FileBrowserFrame.setVisible(false);
			FileBrowserFrame.dispose();
		} else if (option == JFileChooser.CANCEL_OPTION) {
			FileBrowserFrame.setVisible(false);
			FileBrowserFrame.dispose();
		}
    }//GEN-LAST:event_OpenFolderBrowserButtonActionPerformed

    private void FileBrowserFrameWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FileBrowserFrameWindowOpened
		
    }//GEN-LAST:event_FileBrowserFrameWindowOpened

    private void PrefixTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrefixTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrefixTextFieldActionPerformed

    private void RecursiveToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecursiveToggleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecursiveToggleActionPerformed

    private void RecursiveToggleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RecursiveToggleItemStateChanged
		if (fileManager.isRecursive()) {
			fileManager.setRecursive(false);
			RecursiveToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAutorioCJProject/images/004-shape.png")));
		} else {
			fileManager.setRecursive(true);
			RecursiveToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAutorioCJProject/images/003-accept.png")));
		}
    }//GEN-LAST:event_RecursiveToggleItemStateChanged

	/**
	 * Adds a prefix to the file names in the New Name list
	 * @param evt 
	 */
    private void SetPrefixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetPrefixButtonActionPerformed
		for (int i = 0; i < FileTable.getModel().getRowCount(); i++) {
			if (!fileList.get(i).isDirectory()) {
				FileTable.getModel().setValueAt(PrefixTextField.getText() + fileManager.getFileName(fileList.get(i)) + fileManager.getFileExtension(fileList.get(i)), i, 0);
			}
		}
    }//GEN-LAST:event_SetPrefixButtonActionPerformed

	/**
	 * Adds a suffix to the file names in the New Name list
	 * @param evt 
	 */
    private void SetSuffixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetSuffixButtonActionPerformed
		for (int i = 0; i < FileTable.getModel().getRowCount(); i++) {
			if (!fileList.get(i).isDirectory()) {
				FileTable.getModel().setValueAt(fileManager.getFileName(fileList.get(i)) + SuffixTextField.getText() + fileManager.getFileExtension(fileList.get(i)), i, 0);
			}
		}
    }//GEN-LAST:event_SetSuffixButtonActionPerformed

    private void NumberFilesToggleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NumberFilesToggleItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberFilesToggleItemStateChanged

    private void NumberFilesToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberFilesToggleActionPerformed
		if (fileManager.isNumberFiles()) {
			fileManager.setNumberFiles(false);
			NumberFilesToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAutorioCJProject/images/004-shape.png")));
		} else {
			int startNum = 0;
			fileManager.setNumberFiles(true);
			NumberFilesToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAutorioCJProject/images/003-accept.png")));
			for (int i = 0; i < fileList.size(); i++) {
				if (!fileList.get(i).isDirectory()) {
					FileTable.getModel().setValueAt(FileTable.getModel().getValueAt(i, 0) + "-" + i, i, 0);
				}
			}
		}
    }//GEN-LAST:event_NumberFilesToggleActionPerformed

    private void SortByButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortByButtonActionPerformed
		switch (SortByComboBox.getSelectedIndex()) {
			case 0:
				fileList = fileManager.sortAlphabet();
				populateFileTable();
				System.out.println("Sorting Alphabetically");
				break;
			case 1:
				fileList = fileManager.sortRevAlphabet();
				populateFileTable();
				System.out.println("Sorting Reverse Alphabetically");
				break;
			case 2:
				fileList = fileManager.sortSizeIncreasing();
				populateFileTable();
				System.out.println("Sorting by Size (Increasing)");
				break;
			case 3:
				fileList = fileManager.sortSizeDecreasing();
				populateFileTable();
				System.out.println("Sorting by Size (Decreasing)");
				break;
			default:
				System.out.println("Could not sort.");
		}
    }//GEN-LAST:event_SortByButtonActionPerformed

    private void OpenFolderBrowserExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFolderBrowserExportActionPerformed
		FileBrowserFrame.setVisible(true);
		FileBrowser.setDialogTitle(fileBrowserTitle);
		FileBrowser.setCurrentDirectory(directory);
		FileBrowser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		FileBrowser.setAcceptAllFileFilterUsed(false);
		int option = FileBrowser.showOpenDialog(FileBrowserFrame);
		if (option == JFileChooser.APPROVE_OPTION) {
			exportDirectory = FileBrowser.getSelectedFile();
			ExportLocationField.setText(exportDirectory.getAbsolutePath());
			FileBrowserFrame.setVisible(false);
			FileBrowserFrame.dispose();
		} else if (option == JFileChooser.CANCEL_OPTION) {
			FileBrowserFrame.setVisible(false);
			FileBrowserFrame.dispose();
		}
    }//GEN-LAST:event_OpenFolderBrowserExportActionPerformed

	private void populateFileTable() {
		int numberOfFiles = 0;
		for (int i = 0; i < fileList.size(); i++) {
				Vector<?> rowData = null;
				if (fileTableModel.getRowCount() < fileList.size()) {
					fileTableModel.addRow(rowData);
				}
			// If file is not a directory
			if (!fileList.get(i).isDirectory()) {
				// New Names
				FileTable.getModel().setValueAt(fileList.get(i).getName(), i, 0);
				// File Types
				FileTable.getModel().setValueAt(fileManager.getFileExtension(fileList.get(i)), i, 1);
				// Size
				FileTable.getModel().setValueAt(fileList.get(i).length() / 1000.00f, i, 2);
				// Locations
				FileTable.getModel().setValueAt(fileList.get(i).getAbsolutePath(), i, 3);
				// Old Names
				FileTable.getModel().setValueAt(fileList.get(i).getName(), i, 4);
				System.out.println("File listed: " + fileList.get(i).getName());
				numberOfFiles++;
			}
		}
		
		NumberFilesNumberLabel.setText(Integer.toString(numberOfFiles));
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmDirectoryButton;
    private javax.swing.JTextField DirectoryLocationField;
    private javax.swing.JButton ExportButton;
    private javax.swing.JTextField ExportLocationField;
    private javax.swing.JFileChooser FileBrowser;
    private javax.swing.JFrame FileBrowserFrame;
    private javax.swing.JLabel FileNumberLabel;
    private javax.swing.JScrollPane FileScrollPane;
    private javax.swing.JTable FileTable;
    private javax.swing.JLabel NumberFilesLabel;
    private javax.swing.JLabel NumberFilesNumberLabel;
    private javax.swing.JToggleButton NumberFilesToggle;
    private javax.swing.JButton OpenFolderBrowserButton;
    private javax.swing.JButton OpenFolderBrowserExport;
    private javax.swing.JTextField PrefixTextField;
    private javax.swing.JLabel RecursiveLabel;
    private javax.swing.JToggleButton RecursiveToggle;
    private javax.swing.JButton SetPrefixButton;
    private javax.swing.JButton SetSuffixButton;
    private javax.swing.JButton SortByButton;
    private javax.swing.JComboBox<String> SortByComboBox;
    private javax.swing.JTextField SuffixTextField;
    // End of variables declaration//GEN-END:variables
}
