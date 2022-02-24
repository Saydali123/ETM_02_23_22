package uz.elmurodov.spring_boot.services.task;

import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.task.TaskCreateDto;
import uz.elmurodov.spring_boot.dto.task.TaskDto;
import uz.elmurodov.spring_boot.dto.task.TaskUpdateDto;
import uz.elmurodov.spring_boot.entity.task.Task;
import uz.elmurodov.spring_boot.services.base.GenericCrudService;

/**
 * @author Saydali Murodullayev, Wed 5:53 PM. 2/23/2022
 */
public interface TaskService extends GenericCrudService<
        Task,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        GenericCriteria,
        Long
        > {
}
