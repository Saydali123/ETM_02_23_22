package uz.elmurodov.spring_boot.services.project;

import lombok.NonNull;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.project.ProjectCreateDto;
import uz.elmurodov.spring_boot.dto.project.ProjectDto;
import uz.elmurodov.spring_boot.dto.project.ProjectUpdateDto;
import uz.elmurodov.spring_boot.entity.file.Uploads;
import uz.elmurodov.spring_boot.entity.organization.Organization;
import uz.elmurodov.spring_boot.entity.project.Project;
import uz.elmurodov.spring_boot.mapper.ProjectMapper;
import uz.elmurodov.spring_boot.repository.project.ProjectRepository;
import uz.elmurodov.spring_boot.services.base.AbstractService;
import uz.elmurodov.spring_boot.services.file.FileStorageService;
import uz.elmurodov.spring_boot.utils.BaseUtils;
import uz.elmurodov.spring_boot.utils.validators.project.ProjectValidator;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl extends AbstractService<ProjectRepository, ProjectMapper, ProjectValidator>
        implements ProjectService {
    private final FileStorageService fileStorageService;

    @Autowired
    protected ProjectServiceImpl(ProjectRepository repository, ProjectMapper mapper, ProjectValidator validator, BaseUtils baseUtils, FileStorageService fileStorageService) {
        super(repository, mapper, validator, baseUtils);
        this.fileStorageService = fileStorageService;
    }

    @Override
    public Long create(ProjectCreateDto createDto) {
        Project project = createPath(createDto, createDto.getTzPath());
        repository.save(project);
        return project.getId();
    }

    @SneakyThrows
    public Project createPath(final ProjectCreateDto dto, @NonNull MultipartFile file) {
        Project project = mapper.fromCreateDto(dto);
        Uploads uploads = fileStorageService.store(file);
//        project.setTzPath(uploads.getPath());
//        project.setCreateby(1L);
        return project;
    }

    @Override
    public Void delete(Long id) {
        Optional<Project> byId = repository.findById(id);
        if (byId.isPresent()){
            repository.deleteById(id);
        }
        return null;
    }

    @Override
    public Void update(ProjectUpdateDto updateDto) {
        Optional<Project> byId = repository.findById(updateDto.getId());
        if(byId.isPresent()){
            repository.save(mapper.fromUpdateDto(updateDto));
        }
        return null;
    }

    @Override
    public List<ProjectDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public ProjectDto get(Long id) {
        Project project = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Topilmadi");
        });
        return mapper.toDto(project);
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
