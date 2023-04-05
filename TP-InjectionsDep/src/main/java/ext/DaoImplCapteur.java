package ext;

import DAO.Idao;
import org.springframework.stereotype.Component;

@Component("vc")

public class DaoImplCapteur implements Idao {

    @Override
    public double getData() {
        System.out.println("Version capteur");
        double data=77;
        return data;
    }
}
