package uz.elmurodov.spring_boot.dto.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.elmurodov.spring_boot.entity.task.enums.Level;

/**
 * @author Saydali Murodullayev, Thu 4:55 AM. 2/24/2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskCreateDto {
    private String title;
    private String description;
    private Level level;
}
