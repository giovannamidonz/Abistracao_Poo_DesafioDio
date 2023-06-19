import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}