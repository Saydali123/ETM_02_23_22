package uz.elmurodov.spring_boot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import uz.elmurodov.spring_boot.dto.column.PColumnCreateDto;
import uz.elmurodov.spring_boot.dto.column.PColumnDto;
import uz.elmurodov.spring_boot.dto.column.PColumnUpdateDto;
import uz.elmurodov.spring_boot.entity.column.PColumn;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ColumnMapper extends BaseMapper<PColumn, PColumnDto, PColumnCreateDto, PColumnUpdateDto> {
    @Override
    @Mapping(target = "listTasks", ignore = true)
    PColumnDto toDto(PColumn pColumn);

    @Override
    @Mapping(target = "listTasks", ignore = true)
    List<PColumnDto> toDto(List<PColumn> e);

    @Override
    PColumn fromCreateDto(PColumnCreateDto pColumnCreateDto);
}
