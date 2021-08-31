package view;

import java.util.Random;
import controller.CorridaSapos;

public class Principal {

	public static void main(String[] args) {
		
		Random random = new Random();
		//Gerando de forma aleatoria a distancia da corrida entre 50 a 70 metros
		int Dist = random.nextInt((20) + 1)+ 50;
		//GERANDO DE FORMA ALEATORIA A DISTANCIA MAXIMA DO PULO ENTRE 5 E 10 METROS
		int pulo = random.nextInt((5) + 1)+ 5;
		
		System.out.println("Cada sapo terá de percorrer " +Dist+ " metros "
				+"\nCada sapo consegue dar um pulo de até "+ pulo+" metros\n");
		
		for (int sapo = 0; sapo < 5; sapo++) {
			Thread corrida = new CorridaSapos (sapo +1, Dist, pulo);
			corrida.start();
		}
	}

}