import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args){
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devJoel = new Dev();
        devJoel.setNome("Joel");
        devJoel.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Joel:" + devJoel.getConteudosInscritos());
        
        
        devJoel.progredir();
        devJoel.progredir();
        System.out.println("-");
        System.out.println("conteúdos inscritos Joel:" + devJoel.getConteudosInscritos());
        System.out.println("conteúdos concluidos Joel:" + devJoel.getConteudosConcluidos());
        System.out.println("XP:" + devJoel.calcularTotalXp());

        
        System.out.println("--------------------");
        
        
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos Camila:" + devCamila.getConteudosInscritos());
        
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteúdos inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("conteúdos concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());


    }
}
