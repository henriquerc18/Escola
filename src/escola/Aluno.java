package escola;

import java.util.InputMismatchException;

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
    	try{
    		System.out.println("Matr�cula: ");
        	this.matricula = Escola.scan.nextLong();
    		Escola.scan.nextLine();
    	} catch(InputMismatchException err){
    		System.out.println("ERRO: O valor deve ser um n�mero!");
			Escola.scan.nextLine(); 
    	}
    }
    
    public boolean save(){
    	Escola.listaAlunos.add(this);
    	return true;
    }
    
    public void updateAluno(){
    	super.updatePes();
    	long matricula = 0;
    	System.out.println("Nova matr�cula: ");
    	matricula = Escola.scan.nextLong();
    	if(matricula != 0){
    		this.matricula = matricula;
    	}    	
    }
    
    public void update(){
    	Escola.listaAlunos.set(this.getIndice(), this);
    }
    
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Matr�cula: " + this.matricula);
    }
}