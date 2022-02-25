package uz.elmurodov.spring_boot.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.elmurodov.spring_boot.dto.task.TaskCreateDto;
import uz.elmurodov.spring_boot.dto.task.TaskDto;
import uz.elmurodov.spring_boot.dto.task.TaskUpdateDto;
import uz.elmurodov.spring_boot.entity.task.Task;

import java.util.List;

/**
 * @author Saydali Murodullayev, Thu 4:53 AM. 2/24/2022
 */
@Component
@Mapper(componentModel = "spring")
public interface TaskMapper extends BaseMapper<Task, TaskDto, TaskCreateDto, TaskUpdateDto> {
    @Override
    TaskDto toDto(Task task);

    @Override
    List<TaskDto> toDto(List<Task> e);

    @Override
    Task fromCreateDto(TaskCreateDto taskCreateDto);
}
