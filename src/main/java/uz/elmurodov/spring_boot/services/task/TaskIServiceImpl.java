package uz.elmurodov.spring_boot.services.task;

import org.springframework.stereotype.Service;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.task.TaskCreateDto;
import uz.elmurodov.spring_boot.dto.task.TaskDto;
import uz.elmurodov.spring_boot.dto.task.TaskUpdateDto;
import uz.elmurodov.spring_boot.entity.task.Task;
import uz.elmurodov.spring_boot.mapper.TaskMapper;
import uz.elmurodov.spring_boot.repository.task.TaskRepository;
import uz.elmurodov.spring_boot.services.base.AbstractService;
import uz.elmurodov.spring_boot.utils.BaseUtils;
import uz.elmurodov.spring_boot.utils.validators.task.TaskValidator;

import java.util.List;
import java.util.Optional;

/**
 * @author Saydali Murodullayev, Wed 5:54 PM. 2/23/2022
 */
@Service
public class TaskIServiceImpl extends AbstractService<TaskRepository, TaskMapper, TaskValidator>
        implements TaskService {


    protected TaskIServiceImpl(TaskRepository repository, TaskMapper mapper, TaskValidator validator, BaseUtils baseUtils) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(TaskCreateDto createDto) {
        Task task = mapper.fromCreateDto(createDto);
        repository.save(task);
        return task.getId();
    }

    @Override
    public Void delete(Long id) {
        Optional<Task> byId = repository.findById(id);
        if (byId.isEmpty()){
            return null;
        }
        repository.deleteById(id);
        return null;
    }

    @Override
    public Void update(TaskUpdateDto updateDto) {
//        Optional<Task> byId = repository.findById(updateDto.getId());
//        if (byId.isPresent()){
//            Task task = mapper.fromUpdateDto(updateDto);
//            repository.save(task);
//        }
        return null;
    }

    @Override
    public List<TaskDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public TaskDto get(Long id) {
        Task task = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Topilmadi");
        });
        return mapper.toDto(task);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}