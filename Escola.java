import java.util.ArrayList;
public class Escola {
    public static void main (String args[]) {        
        /*Pessoa pes = new Pessoa(args[0], args[1]);
        pes.mostraDados();

        Aluno a = new Aluno(args[0], args[1], Long.parseLong(args[2]));
        a.mostraDados();

        Professor prof = new Professor(args[0], args[1], args[3], Integer.parseInt(args[4]));
        prof.mostraDados();*/
    alunoNota();
    }
    /*public void listaAlunos(){
        ArrayList<String> listaAlunos = new ArrayList<String>();
        Aluno aluno = new Aluno("Henrique", "henriquerc2015@gmail.com", 13100192);
        listaAlunos.add("Doug");
        System.out.println("Nome");
        System.out.println(Arrays.toString(listaAlunos.toArray()));
        
    }
    public void listaNotas(){
        ArrayList<int> listaNotas = new ArrayList<int>();
        listaNotas.add(7);
        System.out.println("Nota");
        System.out.println(Arrays.toint(listaNotas.toArray()));
    }*/
    public static void alunoNota(){
        ArrayList<String> listaAlunos = new ArrayList<String>();
        ArrayList<Integer> listaNotas = new ArrayList<Integer>();

        listaAlunos.add("Henrique");
        System.out.println(listaAlunos.get(0));

        listaNotas.add(9);
        System.out.println(listaNotas.get(0));

        listaAlunos.add("Douglas");
        System.out.println(listaAlunos.get(1));

        listaNotas.add(5);
        System.out.println(listaNotas.get(1));

        listaAlunos.add("Gabriel Suterio");
        System.out.println(listaAlunos.get(2));

        listaNotas.add(8);
        System.out.println(listaNotas.get(2));

        listaAlunos.add("Vítor Cazella");
        System.out.println(listaAlunos.get(3));

        listaNotas.add(7);
        System.out.println(listaNotas.get(3));

        listaAlunos.add("João");
        System.out.println(listaAlunos.get(4));

        listaNotas.add(6);
        System.out.println(listaNotas.get(4));

        listaAlunos.add("Arthur");
        System.out.println(listaAlunos.get(5));

        listaNotas.add(8);
        System.out.println(listaNotas.get(5));

        listaAlunos.add("Yuri");
        System.out.println(listaAlunos.get(6));

        listaNotas.add(9);
        System.out.println(listaNotas.get(6));

        listaAlunos.add("Leo");
        System.out.println(listaAlunos.get(7));

        listaNotas.add(5);
        System.out.println(listaNotas.get(7));

        listaAlunos.add("Samuel");
        System.out.println(listaAlunos.get(8));

        listaNotas.add(9);
        System.out.println(listaNotas.get(8));

        listaAlunos.add("Alexandre");
        System.out.println(listaAlunos.get(9));

        listaNotas.add(4);
        System.out.println(listaNotas.get(9));
        
        for(Integer nota: listaNotas){
            System.out.println(nota);
            if(nota >= 7){
                System.out.println("Os alunos" +listaAlunos "passaram.");
            }
        } 
    }        
}
