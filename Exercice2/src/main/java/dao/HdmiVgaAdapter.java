package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Primary
public class HdmiVgaAdapter implements VGA{
    @Override
    public void print(String d) {
     byte[] b = d.getBytes();
     hdmi.print(b);
    }
    private HDMI hdmi;

    public HdmiVgaAdapter(HDMI hdmi){
        this.hdmi=hdmi;
    }

}
