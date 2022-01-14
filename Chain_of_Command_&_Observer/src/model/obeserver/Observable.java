package model.obeserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void notifyObservers(Object... args) {
        for (Observer observer : observers) {
            observer.update(args);
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
}
