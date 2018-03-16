public class Professor extends Pessoa {
    private String disciplina;
    private int cargaHoraria;

    public Professor(String nome, String email, String disciplina, int cargaHoraria){
        super(nome, email);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public void mostraDados();
        super.mostraDados();
        System.out.println("Dados da disciplina: ");
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Carga Horária: " + this.cargaHoraria); 
    }
}    
        
