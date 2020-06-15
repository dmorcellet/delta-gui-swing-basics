package windowbuilder.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JTable;

/**
 * Test dialog.
 * @author DAM
 */
public class TestDialog extends JDialog
{

  private final JPanel _contentPanel=new JPanel();
  private JTextField _textField;
  private JTable _table;

  /**
   * Launch the application.
   * @param args Not used.
   */
  public static void main(String[] args)
  {
    try
    {
      TestDialog dialog=new TestDialog();
      dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      dialog.setVisible(true);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  /**
   * Create the dialog.
   */
  public TestDialog()
  {
    setBounds(100,100,656,402);
    getContentPane().setLayout(new BorderLayout());
    _contentPanel.setBorder(new EmptyBorder(5,5,5,5));
    getContentPane().add(_contentPanel,BorderLayout.CENTER);
    GridBagLayout gbl_contentPanel = new GridBagLayout();
    gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
    gbl_contentPanel.rowHeights = new int[]{0, 0, 0};
    gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
    gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
    _contentPanel.setLayout(gbl_contentPanel);
    {
      JLabel lblNewLabel = new JLabel("Texte");
      GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
      gbc_lblNewLabel.insets = new Insets(5, 5, 5, 5);
      gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
      gbc_lblNewLabel.gridx = 0;
      gbc_lblNewLabel.gridy = 0;
      _contentPanel.add(lblNewLabel, gbc_lblNewLabel);
    }
    {
      _textField = new JTextField();
      GridBagConstraints gbc_textField = new GridBagConstraints();
      gbc_textField.anchor = GridBagConstraints.WEST;
      gbc_textField.insets = new Insets(5, 5, 5, 5);
      gbc_textField.gridx = 1;
      gbc_textField.gridy = 0;
      _contentPanel.add(_textField, gbc_textField);
      _textField.setColumns(10);
    }
    {
      JLabel lblNewLabel_1 = new JLabel("Table");
      GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
      gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHWEST;
      gbc_lblNewLabel_1.insets = new Insets(5, 5, 5, 5);
      gbc_lblNewLabel_1.gridx = 0;
      gbc_lblNewLabel_1.gridy = 1;
      _contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
    }
    {
      _table = new JTable();
      GridBagConstraints gbc_table = new GridBagConstraints();
      gbc_table.fill = GridBagConstraints.BOTH;
      gbc_table.gridx = 1;
      gbc_table.gridy = 1;
      _contentPanel.add(_table, gbc_table);
    }
    {
      JPanel buttonPane=new JPanel();
      buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
      getContentPane().add(buttonPane,BorderLayout.SOUTH);
      {
        JButton okButton=new JButton("OK");
        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);
      }
      {
        JButton cancelButton=new JButton("Cancel");
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
      }
    }
  }

}
