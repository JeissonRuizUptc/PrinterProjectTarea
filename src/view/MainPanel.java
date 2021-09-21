package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {

    private GridBagConstraints gbc;
    private DocSpacePanel docSpace;
    private FooterPanel footer;
    public MainPanel(ActionListener ls){
        gbc = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        initComponents(ls);
    }

    public void initComponents(ActionListener ls){
        docSpace = new DocSpacePanel();

        footer = new FooterPanel(ls);
    }
}
