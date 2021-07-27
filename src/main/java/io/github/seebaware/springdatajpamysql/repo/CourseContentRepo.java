package io.github.seebaware.springdatajpamysql.repo;

import io.github.seebaware.springdatajpamysql.entity.CourseContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepo extends JpaRepository<CourseContent, Long> {
}
