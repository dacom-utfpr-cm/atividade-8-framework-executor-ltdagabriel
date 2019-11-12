package exercicio_05;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.*;

class Agenda {

    Agenda(Calendar date, Runnable task) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        long seconds = (date.getTime().getTime() - new Date().getTime()) / 1000;
        System.out.println(seconds);
        ScheduledFuture future = executor.schedule(task, seconds, TimeUnit.SECONDS);

        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
