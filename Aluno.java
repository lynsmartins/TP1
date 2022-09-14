package aula01092022;

public class Aluno {
	private String nome;
	private int matricula, cpf;
	
	// método construtor 1
	public Aluno() {
		this.nome = "Evelyn";
		this.matricula = 2022;
		this.cpf = 703;
	}
	
	// método construtor 2
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	// método construtor 3
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	// método construtor 4
	public Aluno(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}