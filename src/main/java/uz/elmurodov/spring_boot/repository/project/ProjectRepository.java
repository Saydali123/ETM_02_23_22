package uz.elmurodov.spring_boot.repository.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.project.Project;
import uz.elmurodov.spring_boot.repository.AbstractRepository;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>, AbstractRepository {
}
