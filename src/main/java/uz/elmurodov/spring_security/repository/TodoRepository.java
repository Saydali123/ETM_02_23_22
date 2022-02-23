package uz.elmurodov.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.elmurodov.spring_security.entity.Todo;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    //    List<Todo> findAllByUser_IdAndCompletedNot(Long id);
//
//    @Query("from Todo t where t.user.id = :id and not t.completed")
//    List<Todo> findAllByUserId(@Param("id") Long id);
//

    @Query(value = "select t.* from todo t where t.user_id = :id order by completed, id", nativeQuery = true)
    List<Todo> findAllByUserId(Long id);

}
