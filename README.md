# Spring Data JPA MySQL

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

--- 

Concepts covered :

- Connecting Springboot App with DB 
- Mapping Entities with DB 
- Different JPA Annotations 
- Understanding Repositories and their methods 
- @Embeddable and @Embedded 
- Creating JPA Repositories & methods 
- @Query Annotation 
- Native Queries 
- Query Named Params 
- @Transactional and @Modifying Annotation 
- JPA One-To-One Relationship 
- Fetch Types 
- Uni & Bi directional relationship 
- Cascading / Cascade Types 
- JPA One-To-Many Relationship 
- JPA Many-To-One Relationship 
- Paging and Sorting 
- JPA Many-To-Many Relationship

- `@Entity`
- `@Id`
- `@Table()`
- `@Column`
- `@SequenceGenerator()`
- `@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")`
- `@Repository`
- 

- `@Modifying` (e.g. to update records)
- `@Transactional`
- `@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)` (cascade, fetch)
- `@JoinColumn(name = "", referencedColumnName = "")` (to which foreign key it will be joined)
- `@ToString(exclude = "")` (lombok)
- `@OneToOne(mappedBy = "")`
- `Pageable` / `PageRequest`



Spring Data JPA query methods reference : https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods

