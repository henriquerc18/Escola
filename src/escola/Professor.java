package escola;

import java.util.InputMismatchException;

public class Professor extends Pessoa {
    private String disciplina = "";
    private int cargaHoraria = 0;

    public String getDisciplina(){
        return disciplina;
    } 
              
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
     
    public int getCargaHoraria(){
        return cargaHoraria;
    } 
      
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public Professor(String nome, String email, String disciplina, int cargaHoraria){
        super(nome, email);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }
    
    public Professor(){
    	super();
    	System.out.println("Disciplina: ");
    	String disciplina = Escola.scan.nextLine();
    	this.disciplina = disciplina;
    	try{
    		System.out.println("Carga Hor�ria: ");
        	this.cargaHoraria = Escola.scan.nextInt();
    		Escola.scan.nextLine();
    	} catch(InputMismatchException err){
    		System.out.println("ERRO: O valor deve ser um n�mero!");
			Escola.scan.nextLine(); 
    	}
    }
    
    public boolean save(){
    	Escola.listaProfessores.add(this);
    	return true;
    }
    
    public void updateProfessor(){
    	super.updatePes();
    	String disciplina = "";
    	int cargaHoraria = 0;
    	System.out.println("Nova disciplina: ");
    	disciplina = Escola.scan.nextLine();
    	if(!disciplina.isEmpty()){
    		this.disciplina = disciplina;
    	}
    	System.out.println("Nova carga hor�ria: ");
    	cargaHoraria = Escola.scan.nextInt();
    	Escola.scan.nextLine();
    	if(cargaHoraria != 0){
    		this.cargaHoraria = cargaHoraria;
    	}
    }
    
    public void update(){
    	Escola.listaProfessores.set(this.getIndice(), this);
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Carga Hor�ria: " + this.cargaHoraria); 
    }
}