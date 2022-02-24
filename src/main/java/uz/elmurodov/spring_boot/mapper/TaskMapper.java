package uz.elmurodov.spring_boot.mapper;

import uz.elmurodov.spring_boot.dto.task.TaskCreateDto;
import uz.elmurodov.spring_boot.dto.task.TaskDto;
import uz.elmurodov.spring_boot.dto.task.TaskUpdateDto;
import uz.elmurodov.spring_boot.entity.task.Task;

/**
 * @author Saydali Murodullayev, Thu 4:53 AM. 2/24/2022
 */
public interface TaskMapper extends BaseMapper<Task, TaskDto, TaskCreateDto, TaskUpdateDto> {
}
