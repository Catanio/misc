import java.util.Scanner;

class ritmo_de_festa{
	public static void main(String[] args){
		int idade;
		String nome;
		boolean ownersFriend;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Nome: ");
		nome = entrada.nextLine();
		entrada.nextLine(); 

		System.out.print("idade :");
		idade = entrada.nextInt();

		if (idade > 17){
			System.out.println("The show must go on");
		}
		else{
			System.out.println("Mas é amigo do dono? (s/n)");
			ownersFriend = entrada.equals ("s");
			if (ownersFriend){
				System.out.println("vai filhão");
			}else System.out.println("Não vai dar");
		}
			
	}
}
