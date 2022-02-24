package uz.elmurodov.spring_boot.dto.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import uz.elmurodov.spring_boot.dto.GenericDto;

/**
 * @author Saydali Murodullayev, Thu 4:55 AM. 2/24/2022
 */
@Data
@Builder(builderMethodName = "childBuilder")
@AllArgsConstructor
public class TaskDto extends GenericDto {
    private String name;

    private String status;

    private String priority;
}
