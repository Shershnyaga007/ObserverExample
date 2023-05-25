public class Listeners {

    public static class Listener1 extends Listener {

        private int counter = 0;

        @Override
        public void execute() {
            System.out.println("Listener 1: " + counter);
            counter = counter + 1;
        }
    }

    public static class Listener2 extends Listener {
        @Override
        public void execute() {
            System.out.println("Listener 2: Still working!");
        }
    }

}
