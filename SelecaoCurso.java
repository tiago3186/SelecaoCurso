import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SelecaoCurso {
    private List<Candidato> candidatos;

    public SelecaoCurso() {
        candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public List<Candidato> getTop3Classificados() {
        // Ordena a lista de candidatos com base na média das notas
        Collections.sort(candidatos, Comparator.comparingDouble(this::calcularMedia).reversed());

        // Retorna os três primeiros candidatos (classificados)
        return candidatos.subList(0, Math.min(3, candidatos.size()));
    }

    private double calcularMedia(Candidato candidato) {
        return (candidato.getNotaProva() + candidato.getNotaProjeto() + candidato.getNotaEntrevista()) / 3.0;
    }
}
