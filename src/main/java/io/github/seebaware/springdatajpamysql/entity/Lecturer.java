package io.github.seebaware.springdatajpamysql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lecturer {

    @Id
    @SequenceGenerator(
            name = "lecturer_sequence",
            sequenceName = "lecturer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "lecturer_sequence"
    )
    private Long lecturerId;
    private String firstName;
    private String lastName;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "lecturer_id",
            referencedColumnName = "lecturerId"
    )
    private List<Course> courses;


}
