package Utils;

import Product.ProductNotebook;
import Product.ProductPhone;


public class Utils {

        public static ProductPhone[] getPhone() {

        ProductPhone[] productPhones = {
                new ProductPhone("Xiaomi Mi 9 SE", "Phone", "Xiaomi", 8000),
                new ProductPhone("Xiaomi Redmi Note 7", "Phone", "Xiaomi", 4400),
                new ProductPhone("Samsung Galaxy S10e", "Phone", "Samsung", 15000),
                new ProductPhone("Samsung Galaxy A50", "Phone", "Samsung", 6800),
                new ProductPhone("Xiaomi Redmi 7a", "Phone", "Xiaomi", 2700),
                new ProductPhone("Samsung Galaxy M20", "Phone", "Samsung", 5500),
                new ProductPhone("Huawei P Smart Z Mi 9 SE", "Phone", "Huawei", 6000),
                new ProductPhone("Google Pixel 3a", "Phone", "Google", 12000),
                new ProductPhone("Huawei P30 Pro", "Phone", "Huawei", 22000),
                new ProductPhone("Apple iPhone XR", "Phone", "Apple", 18000)
        };
        return productPhones;
    }

    public static ProductNotebook[] getNotebook() {

        ProductNotebook[] productNotebook = {
                new ProductNotebook("Dell XPS 13", "Notebook", "Dell", 38000),
                new ProductNotebook("HP Spectre x360", "Notebook", "HP", 35000),
                new ProductNotebook("MacBook Pro (16-inch, 2019)", "Notebook", "Apple", 35000),
                new ProductNotebook("Huawei MateBook 13", "Notebook", "Huawei", 35000),
                new ProductNotebook("Alienware Area-51m", "Notebook", "Dell", 42000),
                new ProductNotebook("Google Pixelbook Go", "Notebook", "Google", 22000),
                new ProductNotebook("Microsoft Surface Laptop 3", "Notebook", "Microsoft", 26000),
                new ProductNotebook("Dell XPS 15 2-in-1", "Notebook", "Dell", 44500),
                new ProductNotebook("Dell G5 15 5590", "Notebook", "Dell", 32000),
                new ProductNotebook("Asus Chromebook Flip", "Notebook", "Asus", 15000)
        };
        return productNotebook;
    }
}

