package uz.elmurodov.spring_boot.repository.column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.column.PColumn;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ColumnRepository extends JpaRepository<PColumn, Long>, AbstractRepository {

    Optional<List<PColumn>> findAllByProjectIdAndDeletedNot(Long id);
}
