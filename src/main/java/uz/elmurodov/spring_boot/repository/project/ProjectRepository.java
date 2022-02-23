package uz.elmurodov.spring_boot.repository.project;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.project.Project;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {
}
