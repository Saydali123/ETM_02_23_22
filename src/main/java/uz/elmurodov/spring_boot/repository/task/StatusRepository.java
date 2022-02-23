package uz.elmurodov.spring_boot.repository.task;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.task.Status;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface StatusRepository extends JpaRepository<Status, Long>, AbstractRepository {

}
