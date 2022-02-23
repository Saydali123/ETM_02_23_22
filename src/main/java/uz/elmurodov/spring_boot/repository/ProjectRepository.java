package uz.elmurodov.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.project.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository{
}
