import observable.GrinderObservable;
import observable.Observable;
import observer.EmailObserver;
import observer.Observer;

public class Main {
    public static void main(String[] args) {
        Observable grinderObservable = new GrinderObservable();
        Observer emailObserverRishabh = new EmailObserver(grinderObservable, "rishabh@gmail.com");
        grinderObservable.addObserver(emailObserverRishabh);
        grinderObservable.updateStock(10);
        grinderObservable.updateStock(-10);
        grinderObservable.updateStock(4);
        grinderObservable.updateStock(-4);
        grinderObservable.removeObserver(emailObserverRishabh);
        grinderObservable.updateStock(10);
        grinderObservable.addObserver(emailObserverRishabh);
        grinderObservable.updateStock(10);
        grinderObservable.updateStock(-20);
        grinderObservable.updateStock(1);
    }
}