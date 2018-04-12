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
    	System.out.println("Matr�cula: ");
    	long matricula = (long)Escola.scan.nextLong();
    	Escola.scan.nextLine();
    	this.matricula = matricula;
    }
    
    public boolean save(){
    	Escola.listaAlunos.add(this);
    	return true;
    }
    
    public void updatePessoa(){
    	super.updatePessoa();
    	long matricula = 0;
    	System.out.println("Nova matr�cula: ");
    	matricula = Escola.scan.nextLong();
    	if(matricula != 0){
    		this.matricula = matricula;
    	}    	
    }
    
    public boolean update(){
    	Escola.listaAlunos.set(this.getIndice(), this);
    	return true;
    }
    
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Matr�cula: " + this.matricula);
    }
}