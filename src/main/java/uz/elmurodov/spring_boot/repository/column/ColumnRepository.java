package uz.elmurodov.spring_boot.repository.column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.column.PColumn;
import uz.elmurodov.spring_boot.repository.AbstractRepository;
@Repository
public interface ColumnRepository extends JpaRepository<PColumn, Long>, AbstractRepository {

}
