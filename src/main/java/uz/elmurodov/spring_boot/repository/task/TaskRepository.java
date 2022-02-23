package uz.elmurodov.spring_boot.repository.task;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.task.Task;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface TaskRepository extends JpaRepository<Task, Long>, AbstractRepository {

}
