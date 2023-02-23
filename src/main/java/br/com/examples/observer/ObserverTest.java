package br.com.examples.observer;

public class ObserverTest {

    public static void main(String... args){
        News news = new News();
        Channel sportsChannel = new Channel(news);
        news.setContent("Brazil won world cup!");
        news.notifyObservers();
        sportsChannel.display();
    }
}
