package uz.elmurodov.spring_boot.services.task;

import uz.elmurodov.spring_boot.services.base.GenericCrudService;

/**
 * @author Saydali Murodullayev, Wed 5:53 PM. 2/23/2022
 */
public interface TaskService extends GenericCrudService<
        TaskEntity,
        TaskDto,
        TaskCreateDto,
        TaskUpdateDto,
        TaskCriteria,
        Long
        > {
}
