package Controller;

import Utils.Utils;
import Product.ProductPhone;
import View.PhoneView;

import java.util.Arrays;

public class ProductPController {

    public void list() {
        ProductPhone[] productPhones = Utils.getPhone();
        PhoneView phoneView = new PhoneView();
        phoneView.listAllP(productPhones);
    }

    public String[] getCommands() {
        String[] commands = {"listPhone", "listByPrice"};
        return commands;
    }
   /** public void listByPrice(String[] args){
        ProductPhone[] productPhones = Utils.getPhone();
        PhoneView phoneView = new PhoneView();
        phoneView.listByPriceP(productPhones);
        } **/
    }
