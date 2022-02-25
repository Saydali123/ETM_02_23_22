package uz.elmurodov.spring_boot.services.column;

import org.springframework.stereotype.Service;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.column.ColumnCreateDto;
import uz.elmurodov.spring_boot.dto.column.PColumnDto;
import uz.elmurodov.spring_boot.dto.column.ColumnUpdateDto;
import uz.elmurodov.spring_boot.services.base.GenericCrudService;

@Service
public interface ColumnService extends GenericCrudService<
        PColumnDto,
        ColumnCreateDto,
        ColumnUpdateDto,
        GenericCriteria,
        Long> {
}
