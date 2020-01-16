import java.util.Scanner;

import Controller.ProductNController;
import View.GeneralView;
import Controller.ProductPController;
import View.PhoneView;

public class Main {

    public static void main(String[] args) {

        new Main();
    }

    public Main() {

        String cmd;
        Scanner scanner = new Scanner(System.in);
        boolean isEnd = true;

        GeneralView generalView = new GeneralView();

        ProductPController productPController = new ProductPController();
        String[] PhoneCommands = productPController.getCommands();

        ProductNController productNController = new ProductNController();
        String[] NotebookCommands = productNController.getCommands();

        String[] allCommands = {"exit", "list", "help"};

        while (isEnd) {
            System.out.println("Enter a command:");
            cmd = scanner.nextLine();
            switch (cmd) {
                case "exit":
                    generalView.bye();
                    isEnd = false;
                    break;
                case "help":
                    generalView.allCommands(allCommands);
                    generalView.allCommands(PhoneCommands);
                    generalView.allCommands(NotebookCommands);
                    break;
                case "listPhone":
                    productPController.list();
                    break;
                case "listNotebook":
                    productNController.list();
                    break;
                case "list":
                    System.out.println("Phones:");
                    productPController.list();
                    System.out.println();
                    System.out.println("Notebooks:");
                    productNController.list();
                    break;
                /**case "listByPrice:":
                    productPController.listByPrice();
                    break; **/
            }
        }
    }
}

