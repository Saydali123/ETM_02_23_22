package uz.elmurodov.spring_boot.entity.column;

import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.spring_boot.entity.BaseEntity;
import uz.elmurodov.spring_boot.entity.project.Project;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class PColumn implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Project project;


    private Integer columnOrder;
}
