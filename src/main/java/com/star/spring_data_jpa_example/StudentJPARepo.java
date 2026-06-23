package com.star.spring_data_jpa_example;

import com.star.spring_data_jpa_example.model.StudentJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJPARepo extends JpaRepository<StudentJPA, Integer> {

}
