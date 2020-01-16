package View;

import Product.ProductNotebook;

public class NotebookView {

    public void listAllN(ProductNotebook[] productNotebooks) {
        for(ProductNotebook productNotebook : productNotebooks) {
            if (productNotebook == null) {
                continue;
            }
            System.out.println(productNotebook);
        }
    }
}

