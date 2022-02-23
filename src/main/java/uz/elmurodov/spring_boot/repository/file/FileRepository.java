package uz.elmurodov.spring_boot.repository.file;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.file.Uploads;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface FileRepository extends JpaRepository<Uploads, Long>, AbstractRepository {

}
