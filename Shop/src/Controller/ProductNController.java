package Controller;

import Product.ProductNotebook;
import Product.ProductPhone;
import Utils.Utils;
import View.NotebookView;
import View.PhoneView;

import java.util.Arrays;


public class ProductNController {

    public void list() {
        ProductNotebook[] productNotebooks = Utils.getNotebook();
        NotebookView notebookView = new NotebookView();
        notebookView.listAllN(productNotebooks);
    }

    public String[] getCommands() {
        String[] commands = {"listNotebook", "listByPriceN"};
        return commands;
    }

    public void listByPrice(){
        ProductNotebook[] productNotebooks = Utils.getNotebook();
        NotebookView notebookView = new NotebookView();
        Arrays.sort(productNotebooks);
        notebookView.listByPriceN(productNotebooks);
    }
}
