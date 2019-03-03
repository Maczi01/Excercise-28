import java.math.BigDecimal;

public class Product {

    String name;
    BigDecimal price;
    double tax;

    public Product(String name, BigDecimal price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Produkt " +
                " o nazwie " + name +
                " ma cene " + price +
                " ma stawkę podatku " + (int)(tax*100) + "%\n";
    }
}
