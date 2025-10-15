package trabalho_builder;

public class Principal {
	
	public static void main(String[] args) {
		
		BuilderAluno alunoBuilder = new BuilderAluno();
		alunoBuilder.setAluno("Maria", "Silva", 9, 10, 1998, "12345678987", "maria@gmail.com");
		alunoBuilder.setEndereco("Rua Vista", 78, "Perto do terminal", "Paisagens", "Curitiba", "Paraná", "Brasil");
		alunoBuilder.setFone(41, 987542154, "Celular");
		alunoBuilder.setFone(41, 965321245, "Fixo");
		
		Aluno aluno = alunoBuilder.get();
		System.out.println(aluno.toString());
		
		alunoBuilder = new BuilderAluno();
		alunoBuilder.setAluno("Carlos", "Pereira", 5, 7, 2000, "98765432100", "carlos@gmail.com");
		alunoBuilder.setEndereco("Rua Central", 45, "Bloco B", "Centro", "São Paulo", "São Paulo", "Brasil");
		alunoBuilder.setFormacao(2022, "Universidade Federal", "São Paulo", "São Paulo", "Brasil");
		alunoBuilder.setFone(11, 988776655, "Celular");
		Aluno aluno2 = alunoBuilder.get();
		System.out.println(aluno2.toString());
		
		alunoBuilder = new BuilderAluno();
		alunoBuilder.setAluno("Ana", "Oliveira", 15, 3, 1997, "11223344556", "ana@gmail.com");
		alunoBuilder.setEndereco("Avenida das Árvores", 120, "Apto 303", "Jardins", "Belo Horizonte", "Minas Gerais", "Brasil");
		alunoBuilder.setFormacao(2019, "Universidade Estadual", "Belo Horizonte", "Minas Gerais", "Brasil");
		alunoBuilder.setTurma(102, 2024, "Turma de Engenharia de Software");
		alunoBuilder.setFone(31, 999887766, "Celular");
		alunoBuilder.setFone(31, 334455667, "Fixo");
		Aluno aluno3 = alunoBuilder.get();
		System.out.println(aluno3.toString());
		
	}

}
