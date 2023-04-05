package presentation;
import DAO.DaoImpl;
import Metier.metierImpl;
import ext.DaoImpl2;

import javax.xml.transform.stream.StreamSource;
import java.net.StandardSocketOptions;

public class pres {
    public static void main(String[] args) {
        DaoImpl daoimp = new DaoImpl();// instanciation static
        metierImpl  metierimpl = new metierImpl(daoimp); //injection via constructeur
        metierimpl.setDao(daoimp);//injection des dependances
        System.out.println("RES ="+metierimpl.calcul());

    }
}
