package uz.elmurodov.spring_boot.repository.task;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.task.TaskMember;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface TaskMemberRepository extends JpaRepository<TaskMember,Long>, AbstractRepository {


}
