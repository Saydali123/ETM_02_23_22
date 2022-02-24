package uz.elmurodov.spring_boot.utils.validators.task;

import uz.elmurodov.spring_boot.dto.task.TaskCreateDto;
import uz.elmurodov.spring_boot.dto.task.TaskUpdateDto;
import uz.elmurodov.spring_boot.exceptions.ValidationException;
import uz.elmurodov.spring_boot.utils.BaseUtils;
import uz.elmurodov.spring_boot.utils.validators.AbstractValidator;

/**
 * @author Saydali Murodullayev, Thu 4:51 AM. 2/24/2022
 */
public class TaskValidator extends AbstractValidator<TaskCreateDto, TaskUpdateDto, Long> {
    protected TaskValidator(BaseUtils baseUtils) {
        super(baseUtils);
    }

    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validOnCreate(TaskCreateDto taskCreateDto) throws ValidationException {

    }

    @Override
    public void validOnUpdate(TaskUpdateDto cd) throws ValidationException {

    }
}
