package io.github.seebaware.springdatajpamysql.repo;

import io.github.seebaware.springdatajpamysql.entity.Course;
import io.github.seebaware.springdatajpamysql.entity.Lecturer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LecturerRepoTest {

    @Autowired
    private LecturerRepo lecturerRepo;

    @Test
    public void saveLecturer() {

        Course courseCsharp = Course.builder()
                .title("C#")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(9)
                .build();

        Lecturer lecturer = Lecturer.builder()
                .firstName("Jai")
                .lastName("Resham")
                .courses(List.of(courseJava, courseCsharp))
                .build();
    }

}