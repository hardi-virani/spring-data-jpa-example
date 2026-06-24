package com.star.spring_data_jpa_example;

import com.star.spring_data_jpa_example.model.StudentJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentJPARepo extends JpaRepository<StudentJPA, Integer> {

    @Query("select s from StudentJPA s where s.name = ?1") // ? will be replaced by name and 1 is for the first parameter and further more.
    List<StudentJPA> findbyName(String name);

    List<StudentJPA> findByMarksGreaterThan(int marks);



}
