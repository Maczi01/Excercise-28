import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Calculations {

    BigDecimal sumOfBrutto(List<Product> list){
        BigDecimal sum = BigDecimal.ZERO;
        for (Product p : list) {
            sum = sum.add(p.getPrice());
        }
        return sum.setScale(2, RoundingMode.HALF_UP);
    }

    BigDecimal sumOfNetto(List<Product> list){
        BigDecimal sum = BigDecimal.ZERO;
        for (Product p : list) {
            BigDecimal nettoPrice = p.getPrice().divide(BigDecimal.ONE.add(BigDecimal.valueOf(p.getTax())));
            sum = sum.add(nettoPrice);
        }
        return sum.setScale(2, RoundingMode.HALF_UP);
    }

    BigDecimal sumOfVat(List<Product> list){
        BigDecimal sum = BigDecimal.ZERO;
        for (Product p : list) {
            BigDecimal onlyVat = p.getPrice().multiply(BigDecimal.valueOf(p.getTax()));
            sum = sum.add(onlyVat);
        }
        return sum.setScale(2, RoundingMode.HALF_UP);
    }

}
