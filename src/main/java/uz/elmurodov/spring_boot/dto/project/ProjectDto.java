package uz.elmurodov.spring_boot.dto.project;

import lombok.*;
import uz.elmurodov.spring_boot.dto.GenericDto;
import uz.elmurodov.spring_boot.dto.auth.AuthUserDto;
import uz.elmurodov.spring_boot.dto.column.ColumnDto;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "childbuilder")
public class ProjectDto extends GenericDto {
    private String name;
    private String description;
    private List<ColumnDto> columnList;
    private List<AuthUserDto> memberList;
    private boolean closed;


}
