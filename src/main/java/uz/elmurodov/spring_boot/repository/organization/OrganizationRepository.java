package uz.elmurodov.spring_boot.repository.organization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.elmurodov.spring_boot.entity.organization.Organization;
import uz.elmurodov.spring_boot.repository.AbstractRepository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>, AbstractRepository {

}
