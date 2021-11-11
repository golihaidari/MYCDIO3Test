import gui_fields.GUI_Field;
import gui_fields.GUI_Player;


public class Main {
    public static void main(String[] args) {
        //Monopoly window = new Monopoly();

        GUI gui = new GUI();
        gui.setDie(1);

        GUI_Player p1= new GUI_Player("Baran");
        gui.addPlayer(p1);
        gui.getFields()[0].setCar(p1, true);


        String chosenButton = gui.getUserButtonPressed(
                "Click a button",
                "Button 1", "Button 2"
        );

        String chosenElement = gui.getUserSelection(
                "Choose an element",
                "Element 1", "Element 2"
        );


        gui.setDie(4);
        gui.getFields()[0].removeAllCars();
        gui.getFields()[4].setCar(p1, true);

    }

}
