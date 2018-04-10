package escola;

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
    	System.out.println("Carga Horária: ");
    	int cargaHoraria = Escola.scan.nextInt();
    	Escola.scan.nextLine();
    	this.disciplina = disciplina;
    	this.cargaHoraria = cargaHoraria;
    }
    
    /*public boolean save(){
    	Escola.listaProfessores.add(this);
    	return true;
    }
    
    public void updateProfessor(){
    	super.updatePessoa();
    	String disciplina = "";
    	System.out.println("Nova disciplina: ");
    	disciplina = Escola.scan.nextLine();
    	if(!disciplina.isEmpty()){
    		this.disciplina = disciplina;
    	}
    	int cargaHoraria = 0;
    	System.out.println("Nova carga horária: ");
    	cargaHoraria = Escola.scan.nextInt();
    	if(cargaHoraria != 0){
    		this.cargaHoraria = cargaHoraria;
    	}
    }
    
    public boolean update(){
    	Escola.listaProfessores.set(this.getIndice(), this);
    	return true;
    }*/

    public void mostraDados(){
        super.mostraDados();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Carga Horária: " + this.cargaHoraria); 
    }
}