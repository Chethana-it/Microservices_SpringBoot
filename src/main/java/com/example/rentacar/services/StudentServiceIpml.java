package com.example.rentacar.services;

import com.example.rentacar.model.Student;
import com.example.rentacar.StudentRepository; // Make sure to import the correct repository interface

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> a22f6e3 (get element from id)
@Service
 class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student){
        // Add your implementation here, for example:
        // You can save the student using the studentRepository
        return studentRepository.save(student);
    }
<<<<<<< HEAD
=======

    public Student fetchStudentById(int id){
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()){
              return student.get();
        }
        return null;
    }

//    public Student fetchStudentById(int id){
//        Optional<Student> student = studentRepository.findById(id);
//        return student.orElse(null);
//    }

>>>>>>> a22f6e3 (get element from id)
}

