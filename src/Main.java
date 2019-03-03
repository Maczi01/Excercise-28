import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	LoadData ld = new LoadData();
	Calculations c = new Calculations();
        List<Product> lista = ld.loadFile();
        System.out.println(c.sumOfBrutto(lista));
        System.out.println(c.sumOfNetto(lista));
        System.out.println(c.sumOfVat(lista));
    }
}
