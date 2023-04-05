package presentation;

import DAO.DaoImpl;
import DAO.Idao;
import Metier.Imetier;
import Metier.metierImpl;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl daoimp = new DaoImpl();
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        //instanciation dynamique
        Class cDao = Class.forName(daoClassName);
        Idao dao= (Idao) cDao.getConstructor().newInstance();// new DAOImpl

        //metierImpl metierimpl = new metierImpl();

        String metierClassname = scanner.nextLine();
        Class cMetier= Class.forName(metierClassname);
        Imetier metier = (Imetier) cMetier.getConstructor(Idao.class).newInstance(dao);

        //metierimpl.setDao(daoimp); statique

       /* Method setDao = cMetier.getDeclaredMethod("setDao",Idao.class);
        setDao.invoke(metier,dao); injection des dependances dynamiques*/
        System.out.println("RES="+metier.calcul());

    }
}
