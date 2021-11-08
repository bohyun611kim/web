package org.cat.danbi.purejava.thread;

public class ShredRestRoomEx {

    public static void main(String[] args) {

        RestRoom restRoom = new RestRoom();

        // Runnable task
        Runnable r = () -> restRoom.use();

        for (int i = 0; i < 5; i++) {
            new Thread(r).start();
        }
    }
}
