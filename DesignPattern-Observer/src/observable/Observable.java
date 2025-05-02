package observable;

import observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyUsers();
    void updateStock(int quantity);
    int getStock();
}
