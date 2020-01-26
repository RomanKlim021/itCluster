package View;

import Product.ProductPhone;

import java.util.Arrays;

public class PhoneView {

    public void listAllP(ProductPhone[] productPhones) {
        for (ProductPhone productPhone : productPhones) {
            if (productPhone == null) {
                continue;
            }
            System.out.println(productPhone);
        }
    }

    public void listByPriceP(ProductPhone[] productPhones) {
        for (ProductPhone productPhone : productPhones) {
                        System.out.println(productPhone);
        }
    }

}

