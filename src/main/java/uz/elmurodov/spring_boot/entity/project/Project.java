package uz.elmurodov.spring_boot.entity.project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.elmurodov.spring_boot.entity.Auditable;
import uz.elmurodov.spring_boot.entity.BaseEntity;
import uz.elmurodov.spring_boot.entity.organization.Organization;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "project", schema = "etm_b4")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Project extends Auditable implements BaseEntity {

    @Column(nullable = false)
    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @Column(name = "closed")
    private Boolean closed;

    @Column(name = "deadline")
    private LocalDateTime deadline;



}