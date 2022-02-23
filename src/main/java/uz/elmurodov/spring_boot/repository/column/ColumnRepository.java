package uz.elmurodov.spring_boot.repository.column;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.column.PColumn;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface ColumnRepository extends JpaRepository<PColumn, Long>, AbstractRepository {

}
