package uz.elmurodov.spring_boot.services.column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.column.PColumnCreateDto;
import uz.elmurodov.spring_boot.dto.column.PColumnDto;
import uz.elmurodov.spring_boot.dto.column.PColumnUpdateDto;
import uz.elmurodov.spring_boot.entity.column.PColumn;
import uz.elmurodov.spring_boot.mapper.ColumnMapper;
import uz.elmurodov.spring_boot.mapper.TaskMapper;
import uz.elmurodov.spring_boot.repository.column.ColumnRepository;
import uz.elmurodov.spring_boot.services.base.AbstractService;
import uz.elmurodov.spring_boot.utils.BaseUtils;
import uz.elmurodov.spring_boot.utils.validators.column.ColumnValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ColumnServiceIml extends AbstractService<ColumnRepository,
        ColumnMapper, ColumnValidator> implements ColumnService {
    final TaskMapper taskMapper;

    @Autowired
    protected ColumnServiceIml(ColumnRepository repository, ColumnMapper mapper, ColumnValidator validator, BaseUtils baseUtils, TaskMapper taskMapper) {
        super(repository, mapper, validator, baseUtils);
        this.taskMapper = taskMapper;
    }

    @Override
    public Long create(PColumnCreateDto createDto) {
        PColumn pColumn = mapper.fromCreateDto(createDto);
        repository.save(pColumn);
        return pColumn.getId();
    }

    @Override
    public Void delete(Long id) {
        Optional<PColumn> byId = repository.findById(id);
        if (byId.isPresent()) {
            repository.deleteById(id);
        }
        return null;
    }

    @Override
    public Void update(PColumnUpdateDto updateDto) {
//
        return null;
    }

    @Override
    public List<PColumnDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public PColumnDto get(Long id) {
        PColumn column = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Topilmadi");
        });
        return mapper.toDto(column);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }


}
