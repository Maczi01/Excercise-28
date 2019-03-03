import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadData {

    List<Product> loadFile() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Plik.csv"));
        List<Product> lista = new ArrayList<>();
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] split =   line.split(";");
            Product product = new Product(split[0], new BigDecimal(split[1]), Double.valueOf(split[2]));
            lista.add(product);
        }
        return lista;
    }

}
