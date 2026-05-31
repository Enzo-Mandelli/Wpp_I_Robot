package msgAuto;

import HorarioManager.ObterHorarios;

public class newTask implements Runnable {
    public String[] data;
    String nome, msg;
    int hour, minute;
    public static boolean flag = false;

    public newTask(String nome, String msg, int hour, int minute){
        this.nome = nome;
        this.msg = msg;
        this.hour = hour;
        this.minute = minute;

    }

    @Override
    public void run() {
        try {
            while (true) {
                if(hour == ObterHorarios.obterHoraAtual()){
                    if(minute == ObterHorarios.obterMinutosAtual()){
                        Message.mandaMensagem(nome, msg);
                        flag = true;
                        break;
                    }
                }else{
                    wait(30000);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
