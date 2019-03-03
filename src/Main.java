import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	LoadData ld = new LoadData();
	Calculations c = new Calculations();
        List<Product> lista = ld.loadFile();
        System.out.println("Suma sprzedazy brutto: " + c.sumOfBrutto(lista));
        System.out.println("Suma sprzedazy netto: " + c.sumOfNetto(lista));
        System.out.println("Suma VAT: " + c.sumOfVat(lista));
    }
}
