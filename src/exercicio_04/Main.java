package exercicio_04;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * aça um programa que periodicamente monitore mudanças em um
 * conjunto de arquivos especificados. Se ocorreram mudanças, o programa
 * deve registrá-las em um arquivo de log.
 *
 * @author: Gabriel Choptian
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try {
            executor.submit(new Monitoramento("files"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
