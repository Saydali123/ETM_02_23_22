package uz.elmurodov.spring_boot.repository.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.task.Comment;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>, AbstractRepository {

}
