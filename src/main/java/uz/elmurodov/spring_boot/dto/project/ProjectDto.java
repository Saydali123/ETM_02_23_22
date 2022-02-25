package uz.elmurodov.spring_boot.dto.project;

import lombok.*;
import uz.elmurodov.spring_boot.dto.GenericDto;
import uz.elmurodov.spring_boot.dto.auth.MemberDto;
import uz.elmurodov.spring_boot.dto.column.PColumnDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectDto extends GenericDto {
    private Long id;
    private String name;
    private String description;
    private List<PColumnDto> listColumns;
    private List<MemberDto> listMembers;
    private boolean blocked;


}
