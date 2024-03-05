package com.dipika.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipika.library.entity.Student;


@Repository
public interface StudentDao  extends JpaRepository<Student, Integer>
{

}
