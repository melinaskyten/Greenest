import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class Main {

    public Main() {

        /*Polymorfism - Skapar objekt av subklasser som sparas i en
        lista med objekt av typen Plant som är superklass. Arvshierarkin
        gör detta möjligt.
         */
        Plant Igge = new Succulent("Igge");
        Plant Laura = new Palm("Laura", 5);
        Plant Meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Plant Olof = new Palm("Olof", 1);

        List<Plant> plants = Arrays.asList(Igge, Laura, Meatloaf, Olof);

        while (true) {
            String quit = "q";
            String plantChoice = JOptionPane.showInputDialog("Vilken växt ska få vätska?\n\nQ - Avsluta!");

            if (plantChoice == null || plantChoice.equalsIgnoreCase(quit)) {
                break;
            }

            boolean plantLoop = true;
            while (plantLoop) {
                boolean matchFound = false;
                for (Plant plant : plants) {
                    if (plantChoice.trim().equalsIgnoreCase(plant.getName())) {
                        plant.printNeed();
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