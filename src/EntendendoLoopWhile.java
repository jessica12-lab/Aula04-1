import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o que existem 5 e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual � a melhor forma de
		 * calcular essa m�dia?
		 */
		int idade;
		double media = 0;
		int quantidadeAlunos = 0;
		int totalAlunos;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor, informa a quantidade de alunos que voc� pretende inserir: ");
		totalAlunos = leitor.nextInt();

		
		while (quantidadeAlunos < totalAlunos) {
			System.out.println("informe a idade do " + (quantidadeAlunos + 1) + "� aluno");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAlunos = quantidadeAlunos +1;
			//quantidadeAlunos +=1;
			//qantidadeAluno++;
		}
		 media = media/ (double) totalAlunos;
		 System.out.println(" A media das idade � " + media);
		leitor.close();

	}

}
