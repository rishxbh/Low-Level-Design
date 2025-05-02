package observer;

import observable.Observable;

public class EmailObserver implements Observer{
    String email;
    Observable observable;

    public EmailObserver(Observable observable, String email) {
        this.observable = observable;
        this.email = email;
    }
    @Override
    public void notifyTheObserver() {
        sendEmail(email, "Product is available now", observable.getStock());
    }
    private void sendEmail(String email, String message, int stockCount) {
        System.out.println("Email to :" + email);
        System.out.println(message);
        if (stockCount < 5) {
            System.out.println("Hurry Up, limited stock, " + stockCount + " left!");
        }
    }
}
