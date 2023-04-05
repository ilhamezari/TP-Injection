package Metier;

import DAO.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class metierImpl implements Imetier {
   // @Autowired  injection automatique
  //@Qualifier ("vc")
    private Idao dao; //couplage faible

    public metierImpl(Idao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double d = dao.getData();
        double rs=d * 11.4;
        return rs;
    }

    /*public Idao getDao() {
        return dao;
    }*/

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
