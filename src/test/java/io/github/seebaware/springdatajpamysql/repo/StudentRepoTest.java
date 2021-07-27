package io.github.seebaware.springdatajpamysql.repo;

import io.github.seebaware.springdatajpamysql.entity.Parent;
import io.github.seebaware.springdatajpamysql.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("arjun.raj@email.com")
                .firstName("Arjun")
                .lastName("Raj")
                .build();

        studentRepo.save(student);

    }

    @Test
    public void saveStudentWithParent() {

        Parent parent = Parent.builder()
                .name("Ramesh")
                .email("r.raj@email.com")
                .mobile("1245854")
                .build();

        Student student = Student.builder()
                .emailId("arjun.raj@email.com")
                .firstName("Arjun")
                .lastName("Raj")
                .parent(parent)
                .build();

        studentRepo.save(student);
    }

    @Test
    public void printAllStudents() {
        List<Student> studentList = studentRepo.findAll();
        System.out.println(studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List<Student> studentList = studentRepo.findByFirstName("Arjun");
        System.out.println(studentList);
    }

    @Test
    public void printStudentByFirstNameContaining() {
        List<Student> studentList = studentRepo.findByFirstNameContaining("jun");
        System.out.println(studentList);
    }

    @Test
    public void printStudentBasedOnParentName() {
        List<Student> studentList = studentRepo.findByParentName("Ramesh");
        System.out.println(studentList);
    }

    @Test
    public void printStudentByEmailAddress() {
        Student student = studentRepo.getStudentByEmailAddress("arjun.raj@email.com");
        System.out.println(student);
    }

    @Test
    public void printStudentFirstNameByEmailAddress() {
        String studentFirstName = studentRepo.getStudentFirstNameByEmailAddress("arjun.raj@email.com");
        System.out.println(studentFirstName);
    }

    @Test
    public void printStudentByEmailAddressNative() {
        Student student = studentRepo.getStudentByEmailAddressNative("arjun.raj@email.com");
        System.out.println(student);
    }

    @Test
    public void printStudentByEmailAddressNativeNamedParam() {
        Student student = studentRepo.getStudentByEmailAddressNativeNamedParam("arjun.raj@email.com");
        System.out.println(student);
    }

    @Test
    public void updateStudentNameByEmailId() {
        studentRepo.updateStudentNameByEmailId("Anil","arjun.raj@email.com");
    }

}