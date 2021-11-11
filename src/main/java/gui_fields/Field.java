package gui_fields;

import gui_codebehind.Center;
import gui_codebehind.SwingComponentFactory;
import gui_resources.Attrs;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.Border;

public abstract class Field {
    public static final int FIELDWIDTH = 65;
    public static final int FIELDHEIGHT = 65;
    protected JLayeredPane layered;
    protected JLabel titleLabel;
    protected JLabel subTextLabel;
    protected Color bgColor;
    protected Color fgColor;
    protected String title;
    protected String subText;
    protected String description;
    private SwingComponentFactory factory;
    private HashMap<Integer, JLabel> cars;
    private JLabel[] carLabels;
    protected static final String TITLE = Attrs.getString("GUI_Field.Default_title", new Object[0]);
    protected static final String SUBTEXT = Attrs.getString("GUI_Field.Default_SubText", new Object[0]);
    protected static final String DESCRIPTION = Attrs.getString("GUI_Field.Default_Description", new Object[0]);
    protected static final String PICTURE = Attrs.getString("GUI_Field.Default_Picture", new Object[0]);
    protected static final String RENT = Attrs.getString("GUI_Field.Default_Rent", new Object[0]);
    protected static final Color BG_COLOR;
    protected static final Color FG_COLOR;

    protected Field(Color bgColor, Color fgColor, String title, String subText, String description) {
        this(bgColor, fgColor, title, subText, description, BorderFactory.createLineBorder(Color.BLACK));
    }

    protected Field(Color bgColor, Color fgColor, String title, String subText, String description, Border border) {
        this.layered = new JLayeredPane();
        this.factory = new SwingComponentFactory();
        this.cars = new HashMap();
        title = title.replace("\n", "<BR>");
        subText = subText.replace("\n", "<BR>");
        description = description.replace("\n", "<BR>");
        this.bgColor = bgColor;
        this.fgColor = fgColor;
        this.makeLabels();
        this.setTitle(title);
        this.setSubText(subText);
        this.setDescription(description);
        this.layered.setBackground(bgColor);
        this.layered.setForeground(fgColor);
        this.layered.setOpaque(true);
        this.layered.setBorder(border);
        this.factory.setSize(this.layered, 65, 65);
        this.layered.setLayout(new GridBagLayout());
    }

    private void makeLabels() {
        this.titleLabel = this.makeLabel(24);
        this.titleLabel.setHorizontalTextPosition(0);
        this.titleLabel.setText(this.title);
        this.subTextLabel = this.makeLabel(10);
        this.subTextLabel.setHorizontalTextPosition(0);
        this.subTextLabel.setText(this.subText);
    }

    public boolean hasCar(GUI_Player player) {
        return this.cars.get(player.getId()) != null && ((JLabel)this.cars.get(player.getId())).isVisible();
    }

    public void setCar(GUI_Player player, boolean display) {
        JLabel l = (JLabel)this.cars.get(player.getId());
        if (l != null) {
            l.setIcon(new ImageIcon(player.getImage()));
            l.setVisible(display);
        } else {
            JLabel[] var4 = this.carLabels;
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                JLabel lbl = var4[var6];
                if (lbl.getIcon() == null) {
                    lbl.setIcon(new ImageIcon(player.getImage()));
                    lbl.setVisible(display);
                    this.cars.put(player.getId(), lbl);
                    return;
                }
            }
        }

    }

    public void removeAllCars() {
        Iterator var1 = this.cars.keySet().iterator();

        while(var1.hasNext()) {
            Integer key = (Integer)var1.next();
            ((JLabel)this.cars.get(key)).setVisible(false);
        }

    }

    protected JLabel makeLabel(int height) {
        JLabel label = new JLabel();
        this.factory.setSize(label, 61, height);
        label.setFont(new Font("Tahoma", 0, 10));
        label.setHorizontalAlignment(0);
        label.setBackground(this.bgColor);
        label.setForeground(this.fgColor);
        return label;
    }

    protected JLayeredPane getPanel() {
        return this.layered;
    }

    public void setTitle(String title) {
        this.title = "<html><center>" + title.replace("\\n", "<br>");
        this.titleLabel.setText(this.title);
    }

    public void setSubText(String subText) {
        this.subText = subText;
        this.subTextLabel.setText(subText);
    }

    public void setDescription(String description) {
        if (description.length() > 20) {
            this.description = "<html><table><tr><td>" + description.replace("\\n", "<br>");
        } else {
            this.description = description;
        }

    }

    public String getTitle() {
        return this.title.replace("<html><center>", "").replace("<br>", "").replace("<BR>", "");
    }

    public String getSubText() {
        return this.subText.replace("<br>", "").replace("<BR>", "");
    }

    public String getDescription() {
        return this.description.replace("<html><table><tr><td>", "").replace("<br>", "\n");
    }

    public void setBackGroundColor(Color color) {
        this.bgColor = color;
        this.layered.setBackground(this.bgColor);
    }

    public void setForeGroundColor(Color color) {
        this.fgColor = color;
        this.layered.setForeground(this.fgColor);
        this.titleLabel.setForeground(this.fgColor);
        this.subTextLabel.setForeground(this.fgColor);
    }

    protected void setCarIcons(JLabel[] cars) {
        this.carLabels = cars;
    }

    protected void addMouseListener(FieldMouseListener listener) {
        this.layered.addMouseListener(listener);
    }

    protected void displayOnCenter(GUI_Player[] playerList) {
        Center.getInstance().clearLabels();
        Center.getInstance().setBGColor(this.bgColor);
        Center.getInstance().setFGColor(this.fgColor);
        JLabel[] var2 = Center.label;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            JLabel l = var2[var4];
            l.setBackground(this.bgColor);
            l.setForeground(this.fgColor);
        }

        Center.label[0].setText("");
    }

    protected void displayCarOnCenter(GUI_Player[] playerList) {
        for(int i = 0; i < 6; ++i) {
            GUI_Player p = playerList[i];
            if (p != null && this.hasCar(p)) {
                Center.cars[i].setIcon(new ImageIcon(p.getImage()));
                Center.cars[i].setVisible(true);
            } else {
                Center.cars[i].setIcon((Icon)null);
                Center.cars[i].setVisible(false);
            }
        }

    }

    static {
        BG_COLOR = Color.LIGHT_GRAY;
        FG_COLOR = Color.BLACK;
    }
}

