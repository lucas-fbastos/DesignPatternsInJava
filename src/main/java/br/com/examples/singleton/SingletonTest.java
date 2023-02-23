package br.com.examples.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {



	/* [EN]
	 *
	 * This method test the Dog class, in which the singleton pattern is applied.
	 * When we call the Dog.getInstance for dog2 it already has an instance (which is in dog1), so originally it's
	 * just one dog object instantiated in both variables. And because of that the value is changed in both variables when
	 * the setName method is called.
	 *
	 * [PT]
	 *
	 * Neste método testamos a classe Dog, na qual o padrão singleton foi aplicado.
	 * Quando nós invocamos o método Dog.getInstance para a variável dog2 o método já possui uma instância (que está
	 * em dog1), portanto existe apenas um objeto dog instanciado nas duas variáveis. Por isso o valor é alterado nas
	 * duas variáveis ao invocarmos o método setName.
	 *
	 *
	 */

	public static void main(String[] args) {
		Dog dog1 = Dog.getInstance();
		dog1.setName("rex");

		Dog dog2 = Dog.getInstance();
		dog2.setName("carl");

		System.out.println("the first dog is called: "+dog1.getName()+", and the second one is called: "+dog2.getName());
	}
}
