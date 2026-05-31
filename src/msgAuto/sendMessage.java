/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package msgAuto;
import java.awt.*;

/**
 *
 * @author Mandelli
 */
public class sendMessage extends Writer {
    public static void abreWpp(){
        try {
            Robot robot = new Robot();
            windowsKey();
            Writer.write("whatsapp");
            enter();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void abreWppDefault(){
        try {
            Robot robot = new Robot();
            windowsKey();
            Writer.write("whatsapp");
            enter();
            altF4();
            windowsKey();
            Writer.write("whatsapp");
            enter();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    public static void reconnect(){
        for(int i = 0; i < 6; i++){
            tab();
        }
        enter();
        enter();
    }
    
    public static void mandaMensagemReconnect(String pessoa, String mensagem){
        abreWppDefault();
        delay(5000);
        reconnect();
        tab();
        write(pessoa);
        tab();
        enter();
        write(mensagem);
        enter();
    }
    
    public static void mandaMensagem(String pessoa, String mensagem){
        abreWppDefault();
        tab();
        tab();
        tab();
        write(pessoa);
        tab();
        tab();
        enter();
        write(mensagem);
        enter();
    }
    
    
    
}
