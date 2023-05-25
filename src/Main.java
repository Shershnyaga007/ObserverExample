public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();

        Listener listener1 = new Listeners.Listener1();
        Listener listener2 = new Listeners.Listener2();
        manager.registerListener(listener1, listener2);

        manager.startExecutor();
        System.out.println("Executor Started!");

    }
}