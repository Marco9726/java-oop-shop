package jana60.bank;

import java.util.Scanner;

import java.util.Random;

public class Bank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
	
		System.out.println("Inserisci il tuo nome: ");
		String nome = sc.nextLine(); 
		
		int codiceConto = rnd.nextInt(1000);
		
		Conto c1 = new Conto (codiceConto, nome);
		
		System.out.println(c1.getSaldo());
		
		while(true) {
			
			System.out.println("Cosa vuoi fare:");
			System.out.println("1 - versamento");
			System.out.println("2 - prelievo");
			System.out.println("3 - uscire");
			System.out.println("-------------------");
			
			int choice = sc.nextInt();
			
			if (choice < 1 || choice > 3) {
				
				System.err.println("Scelta non trovata");
				
				continue;
			}
			
			switch (choice) {
				case 1: {
					System.out.println("Quanto vuoi versare?");
					int amount = sc.nextInt();
					c1.versamento(amount);
				}
				break;
				case 2: {
					System.out.println("Quanto vuoi prelevare?");
					int amount = sc.nextInt();
					boolean res = c1.prelievo(amount);
					System.out.println(res ? "Ok" : "Non ne hai abbastanza");
				}
				break;
				case 3:
					System.out.println("Good bye");
					return;
			}
		}
		
	}
}
