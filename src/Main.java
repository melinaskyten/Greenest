import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {

        //Polymorfism genom att skapa objekt av subklasser som sparas i
        //en lista med objekt av typen Plant som är superklass
        Plant Igge = new Succulent("Igge");
        Plant Laura = new Palm("Laura", 5);
        Plant Meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Plant Olof = new Palm("Olof", 1);

        List<Plant> plants = Arrays.asList(Igge, Laura, Meatloaf, Olof);

        while (true) {
            String plantChoice = JOptionPane.showInputDialog("Vilken växt ska få vätska?" + "\n\nQ - Avsluta!");

            if (plantChoice == null || plantChoice.equalsIgnoreCase("q")) {
                break;
            }

            boolean plantLoop = true;
            while (plantLoop) {
                boolean matchFound = false;
                for (Plant plant : plants) {
                    if (plantChoice.trim().equalsIgnoreCase(plant.getName())) {
                        //Polymorfism - Beroende på vilken klass plantan
                        //är av kommer den klassens metoder appliceras
                        JOptionPane.showMessageDialog(null, plant.getName() + ": " +
                                plant.getLiquidAmount() + "L " + plant.getLiquidType().lowercase);
                        matchFound = true;
                        plantLoop = false;
                        break;
                    }
                }
                if (!matchFound) {
                    plantChoice = JOptionPane.showInputDialog("Kunde ej hitta växten. Försök igen:");
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}