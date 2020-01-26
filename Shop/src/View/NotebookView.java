package View;

import Product.ProductNotebook;

import java.util.Arrays;

public class NotebookView {

    public void listAllN(ProductNotebook[] productNotebooks) {
        for(ProductNotebook productNotebook : productNotebooks) {
            if (productNotebook == null) {
                continue;
            }
            System.out.println(productNotebook);
        }
    }
    public void listByPriceN(ProductNotebook[] productNotebooks) {
        for (ProductNotebook productNotebook : productNotebooks) {
            System.out.println(productNotebook);
        }
    }
}

