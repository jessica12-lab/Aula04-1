import java.util.Scanner;

public class EstruturadeMenu {

	public static void main(String[] args) {
int opcao = 0;
Scanner leitor = new Scanner(System.in);

while(opcao!= 4) {
	System.out.println("escolha 1 das opçoes a seguir");
	System.out.println("1 opção A");
	System.out.println("2 opção B");
	System.out.println("3 opção C");
	System.out.println("4 - Sair");
	System.out.println("Digite a opção desejada");
	opcao = leitor.nextInt();
	
	switch (opcao) {
	case 1:
		System.out.println("Voce escolheu a opção A");
		break;
	case 2:
	      System.out.println("Voce escolheu a opção B");
	break;
	case 3:
	       System.out.println("Voce escolheu a opção C");
	break;
		
	}
}
	}

}
