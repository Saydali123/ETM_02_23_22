package uz.elmurodov.spring_boot.repository.file;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.file.Uploads;
import uz.elmurodov.spring_boot.entity.project.Project;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

@Repository
public interface FileRepository extends JpaRepository<Project, Long>, AbstractRepository {

}
