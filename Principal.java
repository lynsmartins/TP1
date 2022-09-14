package aula01092022;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		System.out.println("nome = " + aluno1.getNome() + "\n" + "matrícula = " + aluno1.getMatricula() + "\n" + "cpf = " + aluno1.getCpf());
		
		System.out.println("--------------------");
		
		Aluno aluno2 = new Aluno("Vicente");
		System.out.println("nome = " + aluno2.getNome());
		
		System.out.println("--------------------");

		Aluno aluno3 = new Aluno("Murillo", 2021);
		System.out.println("nome = " + aluno3.getNome() + "\n" + "matrícula = " + aluno3.getMatricula());
		
		System.out.println("--------------------");

		Aluno aluno4 = new Aluno(500);
		System.out.println("cpf = " + aluno4.getCpf());
	}

}
