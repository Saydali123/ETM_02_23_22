package uz.elmurodov.spring_boot.dto.task;

import lombok.Data;
import uz.elmurodov.spring_boot.dto.Dto;

/**
 * @author Saydali Murodullayev, Thu 4:55 AM. 2/24/2022
 */
@Data
public class TaskCreateDto implements Dto {

    private String name;

    private String priority;
}
