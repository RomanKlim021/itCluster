package Product;


import java.util.Objects;

public class ProductNotebook implements Comparable<Product.ProductNotebook> {

        private String name;
        private String type;
        private String company;
        private int price;

        public ProductNotebook() {
        }

        public ProductNotebook(String name, String type, String company, int price) {
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

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "ProductNotebook{" +
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
        ProductNotebook that = (ProductNotebook) o;
        return price == that.price &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type) &&
                Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, company, price);
    }

    @Override
        public int compareTo(ProductNotebook o) {
            return Integer.compare(getPrice(), o.getPrice());
        }
    }
