package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class TV implements HDMI {
    @Override
    public void print(byte[] data) {
        String d=new String(data);
        System.out.println("TV : "+d);
    }
}
