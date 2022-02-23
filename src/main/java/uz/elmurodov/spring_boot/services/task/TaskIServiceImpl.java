package uz.elmurodov.spring_boot.services.task;

import uz.elmurodov.spring_boot.services.base.AbstractService;
import uz.elmurodov.spring_boot.utils.BaseUtils;

import java.util.List;

/**
 * @author Saydali Murodullayev, Wed 5:54 PM. 2/23/2022
 */
public class TaskIServiceImpl extends AbstractService<TaskRepository, TaskMapper, TaskValidator>
        implements TaskService {



    @Override
    public Long create(TaskCreateDto createDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(TaskUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<TaskDto> getAll(TaskCriteria criteria) {
        return null;
    }

    @Override
    public TaskDto get(Long id) {
        return null;
    }

    @Override
    public Long totalCount(TaskCriteria criteria) {
        return null;
    }
}
