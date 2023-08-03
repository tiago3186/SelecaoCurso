## SelecaoCurso
- aplicação java que seleciona candidatos aprovados para um curso
- Execute a classe Main para executar a aplicação.

### Como adicionar candidatos
Para adicionar candidatos ao processo de seleção, abra a classe Main e adicione os candidatos desejados usando o método adicionarCandidato da classe SelecaoCurso. Insira o nome do candidato, bem como suas notas de prova, projeto e entrevista.

> SelecaoCurso selecaoCurso = new SelecaoCurso();

### Exemplo de adição de candidatos
> selecaoCurso.adicionarCandidato(new Candidato("Candidato 1", 8.5, 9.0, 7.5));
> selecaoCurso.adicionarCandidato(new Candidato("Candidato 2", 9.0, 7.0, 8.0));

- Após executar o programa, os três primeiros candidatos classificados serão exibidos no console.

### Observações
- As notas de prova, projeto e entrevista são consideradas com peso igual na média final.
- Caso a quantidade de candidatos seja inferior a três, apenas os candidatos disponíveis serão exibidos como classificados.
- Esse é um projeto simples para ilustrar a seleção de candidatos em Java. Você pode aprimorá-lo adicionando funcionalidades, como ler candidatos de um arquivo, permitir a entrada de notas do usuário, entre outras melhorias. Sinta-se à vontade para explorar e adaptar o código conforme suas necessidades.
