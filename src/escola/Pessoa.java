package escola;

public class Pessoa {
    private String nome = "";
    private String email = "";
    private int indice;

        public String getNome(){
            return nome;
        } 
                  
        public void setNome(String nome){
            this.nome = nome;
        }
         
        public String getEmail(){
            return email;
        } 
          
        public void setEmail(String email){
            this.email = email;
        }

        public Pessoa(String nome, String email){
        	this.nome = nome;
            this.email = email;
        }
        
        public int getIndice(){
        	return indice;
        }
        
        public void setIndice(int indice) {
        	this.indice = indice;
        }
        
        public Pessoa(){
        	System.out.println("Nome: ");
        	String nome = Escola.scan.nextLine();
        	System.out.println("Email: ");
        	String email = Escola.scan.nextLine();
        	this.nome = nome;
        	this.email = email;
        }
        
       /* public void updatePessoa(){
        	String nome = "";
        	String email = "";
        	System.out.println("Novo nome: ");
        	nome = Escola.scan.nextLine();
        	if(!nome.isEmpty()){
        		this.nome = nome;
        	}
        	System.out.println("Novo email: ");
        	email = Escola.scan.nextLine();
        	if(!email.isEmpty()){
        		this.email = email;
        	}        	
        }*/

        public void mostraDados(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Email: " + this.email); 
        }
}