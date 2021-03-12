package br.com.alura.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		Curso java = new Curso("Java", 100);
		Curso angular = new Curso("Angular", 50);
		Curso javascript = new Curso("JavaScript", 50);
		Curso html = new Curso("HTML", 20);
		Curso css = new Curso("CSS", 10);

		cursos.add(java);
		cursos.add(javascript);
		cursos.add(angular);
		cursos.add(html);
		cursos.add(css);

		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(curso -> System.out.println(curso));

		cursos.stream()
		.filter(c -> c.getAlunos() >= 40);
//		.forEach(curso -> System.out.println(curso));
		
//		cursos.stream()
//		.filter(c -> c.getAlunos() >= 40)
//		.map(Curso::getAlunos)
//		.forEach(c -> System.out.println(c));;
		
//		int sum = cursos.stream()
//		.filter(c -> c.getAlunos() >= 40)
//		.mapToInt(Curso::getAlunos)
//		.sum();
//		
//		System.out.println(sum);

//		OptionalDouble media = cursos.stream()
//		.mapToInt(c -> c.getAlunos())
//		.average();
//		
//		System.out.println(media.getAsDouble());
		
		List<Curso> lista = cursos.stream()
		.filter(c -> c.getAlunos() >= 50)
		.collect(Collectors.toList());
		
		System.out.println(lista);
		
	}

}
