package br.com.examples.observer;

import java.util.ArrayList;

public class News {
    private String content;
    private final ArrayList<Observer> observers;

    public News (){
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setContent(String content){
        this.content = content;
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(this.content);
        }
    }
}
