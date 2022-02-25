package uz.elmurodov.spring_boot.dto.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.elmurodov.spring_boot.dto.GenericDto;

/**
 * @author Saydali Murodullayev, Thu 4:55 AM. 2/24/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskUpdateDto extends GenericDto {

    private String name;
    private String priority;

}
