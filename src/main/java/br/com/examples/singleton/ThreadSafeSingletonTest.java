package br.com.examples.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeSingletonTest {

    /* [EN]
     *
     * This method tests if Singleton Implementation of the Dog class is threadSafe.
     *
     * [PT]
     *
     * Esse método testa se a implementação Singleton da classe Dog é threadSafe.
     *
     */

    public static void main (String... args){

        Dog dog1 = Dog.getInstance();
        dog1.setName("suzi");

        Runnable setDogName = () -> {
            Dog dog2 = Dog.getInstance();
            dog2.setName("peter");
            System.out.println("the first dog is called: "+ dog1.getName());
        };

        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(setDogName);

        es.shutdown();
    }
}
