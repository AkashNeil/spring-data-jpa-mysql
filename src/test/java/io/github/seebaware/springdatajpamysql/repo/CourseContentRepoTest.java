package io.github.seebaware.springdatajpamysql.repo;

import io.github.seebaware.springdatajpamysql.entity.Course;
import io.github.seebaware.springdatajpamysql.entity.CourseContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseContentRepoTest {

    @Autowired
    private CourseContentRepo courseContentRepo;

    @Test
    public void saveCourseContent() {

        Course course = Course.builder()
                .title("SE")
                .credit(9)
                .build();

        CourseContent courseContent = CourseContent.builder()
                .url("hello.com")
                .course(course)
                .build();

        courseContentRepo.save(courseContent);

    }

    @Test
    public void printAllCourses() {
        List<CourseContent> courseContentList = courseContentRepo.findAll();
        System.out.println(courseContentList);
    }

}