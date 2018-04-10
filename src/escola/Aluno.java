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
    	long matricula = Escola.scan.nextLong();
    	this.matricula = matricula;
    }
    
    /*public boolean save(){
    	Escola.listaAlunos.add(this);
    	return true;
    }
    
    public void updateAluno(){
    	super.updatePessoa();
    	long matricula = 0;
    	System.out.println("Nova matrícula: ");
    	matricula = Escola.scan.nextLong();
    	if(matricula != 0){
    		this.matricula = matricula;
    	}    	
    }
    
    public boolean update(){
    	Escola.listaAlunos.set(this.getIndice(), this);
    	return true;
    }*/
    
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Matrícula: " + this.matricula);
    }
}