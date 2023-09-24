package com.example.btvnn3.repository;

import com.example.btvnn3.model.Filter;
import com.example.btvnn3.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Long> {
    @Query(value="select * from student where name like %?%", nativeQuery = true)
    Page<Student> searchByName(String name, Pageable pageable);
    @Query(value="select * from student where idStatus=?",nativeQuery = true)
    Page<Student> searchByStatus(Long id, Pageable pageable);
    @Query(value="select * from student where address like %?%", nativeQuery = true)
    Page<Student> searchByAddress(String name, Pageable pageable);
    @Query(value="select * from student join inforegiter on student.idStudent=inforegiter.idStudent where idSubject=?", nativeQuery = true)
    Page<Student> searchBySubject(Long id, Pageable pageable);
    @Query(value="SELECT * FROM student JOIN inforegiter ON student.idStudent = inforegiter.idStudent WHERE idSubject = ? AND sex = ? AND idStatus = ? AND name LIKE '%' || ? || '%';", nativeQuery = true)
    Page<Student> searchByFilter(Long idStudent , Long idStatus , String sex ,String name , Pageable pageable);


}
