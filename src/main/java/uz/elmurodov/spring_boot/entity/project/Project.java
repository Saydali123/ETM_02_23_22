package uz.elmurodov.spring_boot.entity.project;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import uz.elmurodov.spring_boot.entity.BaseEntity;
import uz.elmurodov.spring_boot.entity.auth.AuthUser;
import uz.elmurodov.spring_boot.entity.organization.Organization;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Project implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String name;

    private String description;

    @ManyToMany
    private List<AuthUser> projectMember;

    @ManyToOne
    private Organization organization;

    @Column(name = "closed", columnDefinition = "NUMERIC default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean closed;

    @Column(name = "is_deleted", columnDefinition = "NUMERIC default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean deleted;

}