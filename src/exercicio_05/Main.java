package exercicio_05;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.*;

/**
 * Faça um programa que possibilite agendar uma tarefa para ser executada
 * em um horário especı́fico.
 *
 * @autor: Gabriel Choptian
 */
public class Main {
    public static void main(String[] args) {
        Calendar time_event = Calendar.getInstance();
        time_event.set(Calendar.HOUR, 4);
        time_event.set(Calendar.MINUTE, 32);

        new Agenda(time_event, new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });
    }

}

