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
        String[] commands = {"listPhone", "listByPriceP"};
        return commands;
    }
    public void listByPrice(){
        ProductPhone[] productPhones = Utils.getPhone();
        PhoneView phoneView = new PhoneView();
        Arrays.sort(productPhones);
        phoneView.listByPriceP(productPhones);
        }
    }
