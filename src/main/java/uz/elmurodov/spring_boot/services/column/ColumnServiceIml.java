package uz.elmurodov.spring_boot.services.column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.column.ColumnCreateDto;
import uz.elmurodov.spring_boot.dto.column.ColumnDto;
import uz.elmurodov.spring_boot.dto.column.ColumnUpdateDto;
import uz.elmurodov.spring_boot.entity.column.PColumn;
import uz.elmurodov.spring_boot.entity.organization.Organization;
import uz.elmurodov.spring_boot.mapper.ColumnMapper;
import uz.elmurodov.spring_boot.repository.column.ColumnRepository;
import uz.elmurodov.spring_boot.services.base.AbstractService;
import uz.elmurodov.spring_boot.utils.BaseUtils;
import uz.elmurodov.spring_boot.utils.validators.column.ColumnValidator;

import java.util.List;
import java.util.Optional;

@Service
public class ColumnServiceIml extends AbstractService<ColumnRepository,
        ColumnMapper, ColumnValidator> implements ColumnService {
@Autowired
    protected ColumnServiceIml(ColumnRepository repository, ColumnMapper mapper, ColumnValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ColumnCreateDto createDto) {
        PColumn pColumn = mapper.fromCreateDto(createDto);
        repository.save(pColumn);
        return pColumn.getId();
    }

    @Override
    public Void delete(Long id) {
        Optional<PColumn> byId = repository.findById(id);
        if(byId.isPresent()){
            repository.deleteById(id);
        }
        return null;
    }

    @Override
    public Void update(ColumnUpdateDto updateDto) {
        Optional<PColumn> byId = repository.findById(updateDto.getId());
        if (byId.isPresent()){
            repository.save(mapper.fromUpdateDto(updateDto));
        }
        return null;
    }

    @Override
    public List<ColumnDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public ColumnDto get(Long id) {
        PColumn column = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Topilmadi");
        });
        return mapper.toDto(column);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }

    public void getColumnDtosByProjectId(Long id) {

    }
}
