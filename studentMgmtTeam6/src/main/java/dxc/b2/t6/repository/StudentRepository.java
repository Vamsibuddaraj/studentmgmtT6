package dxc.b2.t6.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import dxc.b2.t6.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}