package presentation;

import DAO.Idao;
import Metier.Imetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres22 {
    public static void main(String[] args) throws Exception {
        //DaoImpl daoimp = new DaoImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner moi la classe de la couche DAO:");
        String daoClassName = scanner.nextLine();
        //instanciation dynamique
        Class cDao = Class.forName(daoClassName);
        Idao dao= (Idao) cDao.getConstructor().newInstance();// new DAOImpl

        //metierImpl metierimpl = new metierImpl();
        System.out.print("donner moi la classe de la couche Metier:");

        String metierClassname = scanner.nextLine();
        Class cMetier= Class.forName(metierClassname);
        Imetier metier = (Imetier) cMetier.getConstructor().newInstance();

        //metierimpl.setDao(daoimp); statique

        Method setDao = cMetier.getDeclaredMethod("setDao",Idao.class);
        setDao.invoke(metier,dao); //injection des dependances dynamiques

        System.out.println("RES="+metier.calcul());

    }
}
