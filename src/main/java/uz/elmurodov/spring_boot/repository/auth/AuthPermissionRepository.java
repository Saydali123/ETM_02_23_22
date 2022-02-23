package uz.elmurodov.spring_boot.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.elmurodov.spring_boot.entity.auth.AuthPermission;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

public interface AuthPermissionRepository extends JpaRepository<AuthPermission, Long>, AbstractRepository {

}
