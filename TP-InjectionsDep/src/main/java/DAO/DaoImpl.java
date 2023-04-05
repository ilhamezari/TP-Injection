package DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao") //
public class DaoImpl implements Idao{

    @Override
    public double getData() {
        System.out.println("version base de donnée");
        double data=30;

        return data;
    }
}
