package uz.elmurodov.spring_boot.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.auth.AuthUser;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

import java.util.Optional;
@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser, Long>, AbstractRepository {


}
