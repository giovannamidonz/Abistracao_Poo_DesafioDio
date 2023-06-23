import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("programação");
        curso1.setDescricao("curso para quem deseja desenvolver software");
        curso1.setCargaHoraria(224);

        Curso curso2 = new Curso();
        curso2.setTitulo("Ondotondologia");
        curso2.setDescricao("Se torne um dentista de primeira ");
        curso2.setCargaHoraria(445);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria para programacao");
        mentoria.setDescricao("para dar suporte as suas duvidas");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Para iniciantes");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev_01 = new Dev();
        dev_01.setNome("Giovanna Midonz");
        dev_01.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev_01.getConteundosInscritos());
        dev_01.progredir();
        System.out.println("Conteudos Concluidos " + dev_01.getConteudosConcluidos());

        Dev dev_02 = new Dev();
        dev_02.setNome("Camila Basto");
        dev_02.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev_02.getConteundosInscritos());
        dev_02.progredir();
        System.out.println("Conteudos Concluidos " + dev_02.getConteudosConcluidos());
    }
}