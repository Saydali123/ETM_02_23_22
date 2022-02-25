package uz.elmurodov.spring_boot.dto.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.elmurodov.spring_boot.dto.GenericDto;
import uz.elmurodov.spring_boot.dto.auth.MemberDto;
import uz.elmurodov.spring_boot.entity.task.enums.Level;

import java.util.List;

/**
 * @author Saydali Murodullayev, Thu 4:55 AM. 2/24/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDto extends GenericDto {
    private Long id;
    private String title;
    private String description;
    private Integer order;
    private Level level;
    private List<MemberDto> listMemberDto;
}
