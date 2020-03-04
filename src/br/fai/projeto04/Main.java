package br.fai.projeto04;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		
		usandoWhile();
		usandoDoWhile();
		usandoFor();
		
	}

	
	private void usandoWhile() {
		System.out.println("UsandoWhile");
		
		int i = 0;
		while (i < 20) {
			System.out.println("i: " + i);
			i++;
		}
		
	}
	
	private void usandoDoWhile() {
		System.out.println("UsandoDoWhile");
		int i = 0;
		do {
			System.out.println("k: " + i);
			i += 1;
		} while (i <20);
	}
	
	private void usandoFor() {
		System.out.println("UsandoFor");
		for (int i = 0; i < 20; i++) {
			System.out.println("j: " + i);
			
		}
		
	}
}
