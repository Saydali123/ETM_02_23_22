package uz.elmurodov.spring_boot.entity.organization;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import uz.elmurodov.spring_boot.entity.BaseEntity;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Organization implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String name;

    private String logo;

    private Long owner;

    @Column(name = "is_deleted", columnDefinition = "NUMERIC default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean deleted;

    @Column(name = "is_blocked", columnDefinition = "NUMERIC default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean blocked;
}
