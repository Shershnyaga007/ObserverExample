import java.util.*;

public class EventManager {
    private final List<Listener> listeners = new ArrayList<>();

    public void registerListener(Listener... listener) {
        listeners.addAll(List.of(listener));
    }

    public void unregisterListener(Listener... listener) {
        listeners.removeAll(List.of(listener));
    }

    public void startExecutor() {
        Thread thread = new Thread(new Task());
        thread.start();
    }

    private class Task implements Runnable {

        @Override
        public void run() {

            try {

                while (true) {
                    Thread.sleep(1000);

                    listeners.forEach(Listener::execute);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
