//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import msgAuto.newTask;

import java.util.Scanner;
public class Main {

    public static int hour = 0;
    public static int minute = 0;
    public static String resp = "bort";
    public static void main(String[] args) {

        String name;
        String msg;
        String time;
        newTask task;
        while(!resp.equalsIgnoreCase("abort")) {
            Scanner input = new Scanner(System.in);

            do {
                System.out.println("digite o name da pessoa");
                name = input.nextLine();
            }while(name.equals(""));

            do{
                System.out.println("a mensagem");
                msg = input.nextLine();
            }while(msg.equals(""));

            do {
                System.out.println("digite o horario no formato HH:MM");
                time = input.nextLine();
            }while(!checkHour(time));
            System.out.println("você quer enviar " + msg + " para " + name + " as " + hour + "?(s/n)");
            task = new newTask(name, msg, hour, minute);
            if(input.nextLine().equalsIgnoreCase("n")){
                continue;
            }else{
                task.run();
            }
            System.out.println("digite \"abort\" para abortar");
            resp = input.nextLine();
            if(task.flag)resp = "abort";
        }
    }

    public static boolean checkHour(String time){
        if (time.length() != 5) return false;
        String[] aux = time.split(":");
        hour = Integer.parseInt(aux[0]);
        minute = Integer.parseInt(aux[1]);
        if(hour < 0 || hour > 23) return false;
        if(minute < 0 || minute > 59) return false;
        return true;
    }
}