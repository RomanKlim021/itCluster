package Controller;

import Product.ProductNotebook;
import Product.ProductPhone;
import Utils.Utils;
import View.NotebookView;
import View.PhoneView;

public class ProductController {
    public void basket(){

        ProductNotebook[] productNotebooks = Utils.getNotebook();
        NotebookView notebookView = new NotebookView();

        ProductPhone[] productPhones = Utils.getPhone();
        PhoneView phoneView = new PhoneView();

        String[] Basket = new String[20];
    }
}
