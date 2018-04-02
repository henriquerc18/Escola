package escola;

public class Aluno extends Pessoa {
    private long matricula = 0;
   
    public long getMatricula(){
        return matricula;
    } 
              
    public void setMatricula(long matricula){
        this.matricula = matricula;
    }

    public Aluno(String nome, String email, long matricula){
        super(nome, email);
        this.matricula = matricula;
    }
    
    public Aluno() {
    	super();
    	System.out.println("Matrícula: ");
    	this.matricula = (int)Escola.nextInt();
    	Escola.scan.nextLine();
    }
    
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Matrícula: " + this.matricula);
    }
}
