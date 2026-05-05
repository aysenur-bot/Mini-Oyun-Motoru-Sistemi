public class ConsoleObserver implements GameObserver {

    @Override
    public void onEvent(String event) {
        System.out.println("EVENT: " + event);
    }
}