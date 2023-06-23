package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo>conteundosInscritos = new LinkedHashSet();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteundosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public String progredir(){
        Optional<Conteudo> contConteudo = this.conteundosInscritos.stream().findFirst();
        if(contConteudo.isPresent()){
            this.conteudosConcluidos.add(contConteudo.get());
            this.conteundosInscritos.remove(contConteudo.get());
        }else{
            return "Não está inscrito !";
        }
        return null;
    }
    public void calcularTotalXp(){
    this.getConteudosConcluidos().stream().
            mapToDouble(conteudo -> conteudo.calcularXP())
            .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteundosInscritos, dev.conteundosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteundosInscritos, conteudosConcluidos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteundosInscritos() {
        return conteundosInscritos;
    }

    public void setConteundosInscritos(Set<Conteudo> conteundosInscritos) {
        this.conteundosInscritos = conteundosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
