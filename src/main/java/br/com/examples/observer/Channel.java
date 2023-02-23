package br.com.examples.observer;

public class Channel implements Observer{

    private String content;

    public Channel(News news){
        news.addObserver(this);
    }

    @Override
    public void update(String content) {
        this.content=content;
    }

    @Override
    public void display() {
        System.out.println("Channel got news: "+content);
    }
}
