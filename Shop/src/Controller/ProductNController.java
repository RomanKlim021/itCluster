package Controller;

import Product.ProductNotebook;
import Utils.Utils;
import View.NotebookView;


public class ProductNController {

    public void list() {
        ProductNotebook[] productNotebooks = Utils.getNotebook();
        NotebookView notebookView = new NotebookView();
        notebookView.listAllN(productNotebooks);
    }

    public String[] getCommands() {
        String[] commands = {"listNotebook"};
        return commands;
    }
}
