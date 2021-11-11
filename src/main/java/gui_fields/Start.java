//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package gui_fields;

import gui_codebehind.GUI_Center;
import gui_codebehind.SwingComponentFactory;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public final class Start extends Field {
    private static final int TITLEHEIGHT = 47;
    private static final int SUBTEXTHEIGHT = 14;
    private SwingComponentFactory factory;

    public Start() {
        this(TITLE, SUBTEXT, DESCRIPTION, BG_COLOR, FG_COLOR);
    }

    public Start(String title, String subText, String description, Color bgColor, Color fgColor) {
        super(bgColor, fgColor, title, subText, description);
        this.factory = new SwingComponentFactory();
        this.titleLabel = this.makeTitleLabel(this.title);
        this.subTextLabel = this.makeSubTextLabel(this.subText);
        this.layered.add(this.titleLabel, this.factory.createGridBagConstraints(0, 0));
        this.layered.add(this.subTextLabel, this.factory.createGridBagConstraints(0, 1));
    }

    private JLabel makeTitleLabel(String titleStart) {
        JLabel l = this.makeLabel(47);
        l.setText(titleStart);
        l.setFont(new Font(l.getFont().getName(), 1, 18));
        return l;
    }

    private JLabel makeSubTextLabel(String subTextStart) {
        JLabel l = this.makeLabel(14);
        l.setText(subTextStart);
        return l;
    }

    protected void displayOnCenter(GUI_Player[] playerList) {
        super.displayOnCenter(playerList);
        GUI_Center.label[1].setText(this.title.replace("<html><center>", ""));
        GUI_Center.label[2].setText("__________________________");
        GUI_Center.label[3].setText(this.description);
        super.displayCarOnCenter(playerList);
    }

    public String toString() {
        return "GUI_Start [bgColor=" + this.bgColor + ", fgColor=" + this.fgColor + ", title=" + this.title + ", subText=" + this.subText + ", description=" + this.description + "]";
    }
}
