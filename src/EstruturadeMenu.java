import java.util.Scanner;

public class EstruturadeMenu {

	public static void main(String[] args) {
int opcao = 0;
Scanner leitor = new Scanner(System.in);

while(opcao!= 4) {
	System.out.println("escolha 1 das op�oes a seguir");
	System.out.println("1 op��o A");
	System.out.println("2 op��o B");
	System.out.println("3 op��o C");
	System.out.println("4 - Sair");
	System.out.println("Digite a op��o desejada");
	opcao = leitor.nextInt();
	
	switch (opcao) {
	case 1:
		System.out.println("Voce escolheu a op��o A");
		break;
	case 2:
	      System.out.println("Voce escolheu a op��o B");
	break;
	case 3:
	       System.out.println("Voce escolheu a op��o C");
	break;
		
	}
}
	}

}
