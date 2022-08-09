import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição do curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLais = new Dev();
        devLais.setNome("Laís");
        devLais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Laís " + devLais.getConteudosInscrito());
        devLais.progredir();
        devLais.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Laís " + devLais.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Laís " + devLais.getConteudosConcluidos());
        System.out.println("XP: " +devLais.calcularTotalXP());


        System.out.println("----------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gustavo " + devGustavo.getConteudosInscrito());
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gustavo " + devGustavo.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Gustavo " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXP());



    }
}
