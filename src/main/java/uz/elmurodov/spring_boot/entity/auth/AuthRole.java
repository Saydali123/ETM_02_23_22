package uz.elmurodov.spring_boot.entity.auth;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class AuthRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<AuthPermission> permissions;
}
