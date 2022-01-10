package org.t3.g11.proj2.peer.ui.swing.panels;

import net.miginfocom.swing.MigLayout;
import org.t3.g11.proj2.peer.ui.swing.SwingInterface;

import javax.swing.*;
import java.awt.*;

public class DiscoveryPanel extends JPanel {

    SwingInterface swi;

    public DiscoveryPanel(SwingInterface swi) {
        super(new MigLayout("inset 20, fill"));

        this.swi = swi;

        JLabel header = new JLabel("Discovery");
        header.setFont(UIManager.getFont("h0.font"));
        add(header);

        JLabel userLabel = new JLabel(swi.peer.getPeerData().getSelfUsername());
        userLabel.setHorizontalAlignment(JLabel.RIGHT);
        userLabel.setFont(UIManager.getFont("large.font"));
        add(userLabel, "align right, wrap");

        JSeparator sep = new JSeparator(JSeparator.HORIZONTAL);
        add(sep, "span, growx, hmin 2px, wrap");

        JPanel searchBox = new JPanel(new MigLayout("fillx", "[24]10[100:400:]push"));
        add(searchBox, "span, wrap, growx");

        ImageIcon icon = swi.createImageIcon("search_24.png",
                "a pretty but meaningless splat");
        JButton searchButton = new JButton(icon);
        searchButton.setBorder(BorderFactory.createEmptyBorder());
        searchButton.setBackground(null);
        searchBox.add(searchButton);

        JTextField queryField = new JTextField();
        searchBox.add(queryField, "growx");


        add(new JLabel("Not yet implemented", JLabel.CENTER), "span, grow, pushy, wrap");
    }
}