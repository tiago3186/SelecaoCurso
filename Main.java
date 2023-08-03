public class Main {
    public static void main(String[] args) {
        SelecaoCurso selecaoCurso = new SelecaoCurso();

        // Adiciona os candidatos à lista
        selecaoCurso.adicionarCandidato(new Candidato("Candidato 1", 8.5, 9.0, 7.5));
        selecaoCurso.adicionarCandidato(new Candidato("Candidato 2", 9.0, 7.0, 8.0));
        // Adicione mais candidatos aqui...

        // Obtém e mostra os três primeiros classificados
        List<Candidato> classificados = selecaoCurso.getTop3Classificados();
        for (int i = 0; i < classificados.size(); i++) {
            System.out.println("Classificado " + (i + 1) + ": " + classificados.get(i).getNome());
        }
    }
}
