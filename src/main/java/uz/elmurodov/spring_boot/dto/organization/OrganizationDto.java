package uz.elmurodov.spring_boot.dto.organization;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.spring_boot.dto.GenericDto;

@Getter
@Setter
public class OrganizationDto extends GenericDto {

    private String name;
    private String logo;
    private Long owner;


    @Builder(builderMethodName = "childBuilder")
    public OrganizationDto(Long id, String name, String logo, Long owner) {
        super(id);
        this.name = name;
        this.logo = logo;
        this.owner = owner;
    }
}

