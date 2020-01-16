package Product;

import java.util.Objects;

public class ProductPhone implements Comparable<ProductPhone>  {

        private String name;
        private String type;
        private String company;
        private int price;

    public ProductPhone() {
    }

    public ProductPhone(String name, String type, String company, int price) {
        this.name = name;
        this.type = type;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price + "₴" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPhone productPhone = (ProductPhone) o;
        return price == productPhone.price &&
                Objects.equals(name, productPhone.name) &&
                Objects.equals(type, productPhone.type) &&
                Objects.equals(company, productPhone.company);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, type, company, price);
    }
    @Override
    public int compareTo(ProductPhone o) {
        return this.price - o.price;
    }
}
