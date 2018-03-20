public class Escola {
    public static void main (String args[]) {
        Pessoa pes = new Pessoa(args[0], args[1]);
        pes.mostraDados();

        Aluno a = new Aluno(args[0], args[1], Long.parseLong(args[2]));
        a.mostraDados();

        Professor prof = new Professor(args[0], args[1], args[2], Integer.parseInt(args[3]));
        prof.mostraDados();
    }
}
