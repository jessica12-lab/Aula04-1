import java.util.Scanner;
public class LoopWhile2 {

			public static void main(String[] args) {
				/*
				 * Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
				 * Sabendo de antemão que existem 5 e sem a necessidade de armazenar
				 * permanentemente a idade de cada um desses alunos, qual é a melhor forma de
				 * calcular essa média?
				 */
				int idade = 0;
				double media = 0;
				int quantidadeAlunos = 0;
				String continuar = "sim";
				Scanner leitor = new Scanner(System.in);
				
								
				while (continuar.equals("sim")) {
					System.out.println("informe a idade do " + (quantidadeAlunos + 1) + "° aluno");
					idade = leitor.nextInt();
					media = media + idade;
					quantidadeAlunos = quantidadeAlunos +1;
					System.out.println(" digite sim para informar outro aluno ou não  para realizar a media com os dados ja informados");
						continuar = leitor.next();
						
				}
				media = media/ (double) quantidadeAlunos;
		System.out.println("A media das idade é " + media);
					//quantidadeAlunos +=1;
					//qantidadeAluno++;
				leitor.close();

	} 				 


}
