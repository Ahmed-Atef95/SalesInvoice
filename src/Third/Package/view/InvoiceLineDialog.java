/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Third.Package.view;

import First.Package.udacity.InvoiceFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvoiceLineDialog extends JDialog{
    private JTextField productNameField;
    private JTextField productCountField;
    private JTextField productPriceField;
    private JLabel productNameLbl;
    private JLabel productCountLbl;
    private JLabel productPriceLbl;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public InvoiceLineDialog(InvoiceFrame frame) {
        productNameField = new JTextField(20);
        productNameLbl = new JLabel("Item Name");
        
        productCountField = new JTextField(20);
        productCountLbl = new JLabel("Item Count");
        
        productPriceField = new JTextField(20);
        productPriceLbl = new JLabel("Item Price");
        
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createLineOK");
        cancelBtn.setActionCommand("createLineCancel");
        
        okBtn.addActionListener(frame);
        cancelBtn.addActionListener(frame);
        setLayout(new GridLayout(4, 2));
        
        add(productNameLbl);
        add(productNameField);
        add(productCountLbl);
        add(productCountField);
        add(productPriceLbl);
        add(productPriceField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemNameField() {
        return productNameField;
    }

    public JTextField getItemCountField() {
        return productCountField;
    }

    public JTextField getItemPriceField() {
        return productPriceField;
    }
}
