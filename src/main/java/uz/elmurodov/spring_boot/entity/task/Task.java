package uz.elmurodov.spring_boot.entity.task;

import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.spring_boot.entity.BaseEntity;
import uz.elmurodov.spring_boot.entity.auth.AuthUser;
import uz.elmurodov.spring_boot.entity.column.PColumn;
import uz.elmurodov.spring_boot.entity.task.enums.Level;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Task implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String title;

    private String description;

    private Integer taskOrder;

    private Level level;

    @ManyToMany
    private List<AuthUser> taskMember;

    @ManyToOne
    private PColumn pColumn;

    private Boolean deleted;

}
