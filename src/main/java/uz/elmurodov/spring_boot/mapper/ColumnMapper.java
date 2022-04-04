package uz.elmurodov.spring_boot.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.elmurodov.spring_boot.dto.column.PColumnCreateDto;
import uz.elmurodov.spring_boot.dto.column.PColumnDto;
import uz.elmurodov.spring_boot.dto.column.PColumnUpdateDto;
import uz.elmurodov.spring_boot.entity.column.PColumn;

@Component
@Mapper(componentModel = "spring")
public interface ColumnMapper extends BaseMapper<PColumn, PColumnDto, PColumnCreateDto, PColumnUpdateDto> {

    @Override
    PColumn fromCreateDto(PColumnCreateDto pColumnCreateDto);
}
