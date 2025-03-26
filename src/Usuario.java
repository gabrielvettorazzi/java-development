public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        Usuario outro = (Usuario) objeto; //Convertendo Object para Usuario
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);

        return nomeIgual && emailIgual;


        /// hashcode sera abordade em outra aula
    }
}
