import java.util.Scanner;
public class LoopWhile2 {

			public static void main(String[] args) {
				/*
				 * Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
				 * Sabendo de antem�o que existem 5 e sem a necessidade de armazenar
				 * permanentemente a idade de cada um desses alunos, qual � a melhor forma de
				 * calcular essa m�dia?
				 */
				int idade = 0;
				double media = 0;
				int quantidadeAlunos = 0;
				String continuar = "sim";
				Scanner leitor = new Scanner(System.in);
				
								
				while (continuar.equals("sim")) {
					System.out.println("informe a idade do " + (quantidadeAlunos + 1) + "� aluno");
					idade = leitor.nextInt();
					media = media + idade;
					quantidadeAlunos = quantidadeAlunos +1;
					System.out.println(" digite sim para informar outro aluno ou n�o  para realizar a media com os dados ja informados");
						continuar = leitor.next();
						
				}
				media = media/ (double) quantidadeAlunos;
		System.out.println("A media das idade � " + media);
					//quantidadeAlunos +=1;
					//qantidadeAluno++;
				leitor.close();

	} 				 


}
