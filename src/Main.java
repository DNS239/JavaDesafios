import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescriçao("Drescrição um curso de Java");
        curso1.setCargaHoraria(9);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescriçao("Drescrição um curso de Python");
        curso2.setCargaHoraria(8);

        Curso curso3= new Curso();
        curso3.setTitulo("Curso de Javascript");
        curso3.setDescriçao("Drescrição um curso de Javascript");
        curso3.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescriçao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Javascript");
        mentoria2.setDescriçao("Mentoria sobre Javascript");
        mentoria2.setData(LocalDate.now());



        //System.out.println(curso1);
        //System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer.");
        bootCamp.setDescriçao("Descrição BootCamp Java Developer.");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(curso3);
        bootCamp.getConteudos().add(mentoria2);
        bootCamp.getConteudos().add(mentoria);

        Dev devDns = new Dev();
        devDns.setNome("Denis");
        devDns.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos inscritos Denis:" + devDns.getConteudosInscritos());
        devDns.progredir();
        devDns.progredir();
        devDns.progredir();
        devDns.progredir();
        devDns.progredir();
        System.out.println("------------------------------------------------------");
        System.out.println("Conteúdos inscritos Denis:" + devDns.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Denis:" + devDns.getConteudosConcluidos());

        System.out.println("------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("------------------------------------------------------");
        System.out.println("Conteúdos inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("------------------------------------------------------");
        System.out.println("XP João:" + devJoao.calcaularTotalXp());
        System.out.println("XP Denis:" + devDns.calcaularTotalXp());
        System.out.println("------------------------------------------------------");
    }
}
