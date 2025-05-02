package observable;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class GrinderObservable implements Observable{
    int stockCount = 0;
    List<Observer> listOfGrinderObservers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        listOfGrinderObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfGrinderObservers.remove(observer);
    }

    @Override
    public void notifyUsers() {
        for(Observer observer : listOfGrinderObservers) {
            observer.notifyTheObserver();
        }
    }

    @Override
    public void updateStock(int quantity) {
        if (stockCount == 0) {
            stockCount += quantity;
            notifyUsers();
        } else
            stockCount += quantity;
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
