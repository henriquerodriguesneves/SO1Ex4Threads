package controller;

import java.util.Random;

public class CorridaSapos extends Thread{
	
	private int sapo;
	private int maxiDist;
	private int maxiPulo;
	static int posicao;
	
	public CorridaSapos (int sapo, int maxiDist, int maxiPulo) {
		this.sapo = sapo;
		this.maxiDist = maxiDist;
		this.maxiPulo = maxiPulo;
	}
	@Override
	public void run() {
		Random random = new Random();
		int dist = 0;
		int pulo = 0;
		String result = "";
		while (dist < maxiDist) {
		    pulo = random.nextInt(maxiPulo);
		    dist = dist + pulo;
		    System.out.println("O sapo " + sapo+ " pulou " +pulo+ " metros, e agora percorreu "+dist+" metros");
	}
	posicao++;
	result += ("\nO sapo "+sapo+" chegou em "+ posicao+ "º lugar");
	try {
		sleep (sapo * 100);
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(result);
	
}
}