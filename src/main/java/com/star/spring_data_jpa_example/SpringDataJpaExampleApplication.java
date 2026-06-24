package com.star.spring_data_jpa_example;

import com.star.spring_data_jpa_example.model.StudentJPA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		StudentJPARepo repo = context.getBean(StudentJPARepo.class);

		StudentJPA s1 = context.getBean(StudentJPA.class);
		StudentJPA s2 = context.getBean(StudentJPA.class);
		StudentJPA s3 = context.getBean(StudentJPA.class);

//		s1.setRollNo(101);
//		s1.setName("Hardi");
//		s1.setMarks(75);
//
//		s2.setRollNo(102);
//		s2.setName("star");
//		s2.setMarks(80);
//
//		s3.setRollNo(103);
//		s3.setName("Mann");
//		s3.setMarks(70);
//
//		repo.save(s1); //Well this save() method is coming from JPA repository which we have extended in StudentJPARepo interface.
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll()); //findall is also one of the JPA methods. You see how JPA is helping us without writing so much of code. Otherwise we would have to make the methods and then run our applicaation.

		//The reason to do this, because optinal helps us handle null expection. Like if this 104 doesn't exist, then instead of use saying null directly this will give use the data.
//		Optional<StudentJPA> s = repo.findById(103);
//		System.out.println(s.orElse(new StudentJPA()));

		System.out.println(repo.findbyName("Mann"));
	}

}
