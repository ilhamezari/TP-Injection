package ext;

import DAO.Idao;
import org.springframework.stereotype.Component;

@Component("vws")
public class DaoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("Vesrion web service");
        double data = 55;
        return data;
    }
}
