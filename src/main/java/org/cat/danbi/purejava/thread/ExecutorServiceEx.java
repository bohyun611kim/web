package org.cat.danbi.purejava.thread;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {

    public static void main(String[] args) {

        RestRoom restRoom = new RestRoom();
        Runnable r = () -> restRoom.use();

        // 쓰레드 풀 생성한다.
        ExecutorService service = Executors.newFixedThreadPool(2);

        //
        for (int i = 0; i < 4; i++) {
            service.execute(r);
        }

        // 서비스 종료 시켜야 끝난다.
        service.shutdown();
    }
}
