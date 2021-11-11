package gui_codebehind;

import gui_fields.*;

import java.awt.Color;

public final class FieldFactory {
    private FieldFactory() {
    }

    public static Field[] makeFields() {
        Field[] fields = new Field[24];
        int i = 0;
        int var2 = i + 1;
        fields[i] = new Start("Start", "Modtag: 200", "Modtag kr. 200,-\nnår de passerer start", Color.RED, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Gatekjøkkenet.JPG","Gatekjøkkenet", "Price: 1M", "BurgerBAran","", new Color(155,103,60), Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Pizzahuset.JPG","Pizzahuset", "Price: 1M", "BurgerBAran","", new Color(155,103,60), Color.BLACK);
        fields[var2++] = new Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Godtebuttikken.JPG","Godtebuttikken", "Price: 1M", "BurgerBAran","", Color.GRAY, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Iskiosken.JPG","Iskiosken", "Price: 1M", "BurgerBAran","", Color.GRAY, Color.BLACK);
        fields[var2++] = new Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Museet.JPG","Museet", "Price: 1M", "BurgerBAran","", Color.PINK, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Biblioteket.JPG","Biblioteket", "Price: 1M", "BurgerBAran","", Color.PINK, Color.BLACK);
        fields[var2++] = new Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Rullebrettrparken.JPG","Rullebrettrparken", "Price: 1M", "BurgerBAran","", Color.YELLOW, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Svømmebasesengetl.JPG","Svømmebasesengetl", "Price: 1M", "BurgerBAran","", Color.YELLOW, Color.BLACK);
        fields[var2++] = new AmusementField("../MonopolyProject/src/main/java/resources/","GratisParkering", "Pris:  -", "Hvidovrevej", "Leje:  20", Color.WHITE, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Spillehallen.JPG","Spillehallen", "Price: 1M", "BurgerBAran","", Color.RED, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Kinoen.JPG","Kinoen", "Price: 1M", "BurgerBAran","", Color.RED, Color.BLACK);
        fields[var2++] = new Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Legetøysbuttiken.JPG","Legetøysbuttiken", "Price: 1M", "BurgerBAran","", Color.YELLOW, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Dyrebuttikken.JPG","Dyrebuttikken", "Price: 1M", "BurgerBAran","", Color.YELLOW, Color.BLACK);
        fields[var2++] = new Jail("default", "Gå i fængsel", "Gå i fængsel", "De fængsles\nSlå to ens for at komme ud", new Color(125, 125, 125), Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Bowlinghallen.JPG","Bowlinghallen", "Price: 1M", "BurgerBAran","", Color.GREEN, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Zoologiskhage.JPG","Zoologiskhage", "Price: 1M", "BurgerBAran","", Color.GREEN, Color.BLACK);
        fields[var2++] = new Chance("?", "Prøv lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Vanndlandet.JPG","Vanndlandet", "Price: 1M", "BurgerBAran","", Color.ORANGE, Color.BLACK);
        fields[var2++]= new AmusementField("../MonopolyProject/src/main/java/resources/Strandpromenaden.JPG","Strandpromenaden", "Price: 1M", "BurgerBAran","", Color.ORANGE, Color.BLACK);

        return fields;
    }
}
