package uz.elmurodov.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.column.PColumn;

public interface ColumnRepository extends JpaRepository<PColumn,Long>,AbstractRepository {
}
