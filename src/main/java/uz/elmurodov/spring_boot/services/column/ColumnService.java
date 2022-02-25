package uz.elmurodov.spring_boot.services.column;

import org.springframework.stereotype.Service;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.column.PColumnCreateDto;
import uz.elmurodov.spring_boot.dto.column.PColumnDto;
import uz.elmurodov.spring_boot.dto.column.PColumnUpdateDto;
import uz.elmurodov.spring_boot.entity.column.PColumn;
import uz.elmurodov.spring_boot.services.base.GenericCrudService;

@Service
public interface ColumnService extends GenericCrudService<
        PColumn,
        PColumnDto,
        PColumnCreateDto,
        PColumnUpdateDto,
        GenericCriteria,
        Long> {
}
