package escola;

public class Pessoa {
    private String nome = "";
    private String email = "";

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
        
        public Pessoa() {
        	System.out.println("Nome: ");
        	String nome = scan.nextLine();
        	System.out.println("Email: ");
        	String email = scan.next();
        	this.nome = nome;
        	this.email = email;
        }

        public void mostraDados(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Email: " + this.email); 
        }
}    
    
    
