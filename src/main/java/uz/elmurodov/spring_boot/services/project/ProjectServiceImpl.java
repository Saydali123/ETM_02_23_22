package uz.elmurodov.spring_boot.services.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.project.ProjectCreateDto;
import uz.elmurodov.spring_boot.dto.project.ProjectDto;
import uz.elmurodov.spring_boot.dto.project.ProjectUpdateDto;
import uz.elmurodov.spring_boot.entity.project.Project;
import uz.elmurodov.spring_boot.mapper.ProjectMapper;
import uz.elmurodov.spring_boot.repository.project.ProjectRepository;
import uz.elmurodov.spring_boot.services.base.AbstractService;
import uz.elmurodov.spring_boot.services.column.ColumnServiceIml;
import uz.elmurodov.spring_boot.services.file.FileStorageService;
import uz.elmurodov.spring_boot.services.task.TaskIServiceImpl;
import uz.elmurodov.spring_boot.utils.BaseUtils;
import uz.elmurodov.spring_boot.utils.validators.project.ProjectValidator;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl extends AbstractService<ProjectRepository, ProjectMapper, ProjectValidator>
        implements ProjectService {
    //    private final ProjectMemberService projectMemberService;


    @Autowired
    protected ProjectServiceImpl(ProjectRepository repository, ProjectMapper mapper, ProjectValidator validator, BaseUtils baseUtils, FileStorageService fileStorageService, ColumnServiceIml columnService, TaskIServiceImpl taskService) {
        super(repository, mapper, validator, baseUtils);
    }

    @Override
    public Long create(ProjectCreateDto createDto) {
        Project project = mapper.fromCreateDto(createDto);
        repository.save(project);
        return project.getId();
    }

//    @SneakyThrows
//    public Project createPath(final ProjectCreateDto dto, @NonNull MultipartFile file) {
//        Project project = mapper.fromCreateDto(dto);
//        Uploads uploads = fileStorageService.store(file);
////        project.setTzPath(uploads.getPath());
////        project.setCreateby(1L);
//        return project;
//    }

    @Override
    public Void delete(Long id) {
        Optional<Project> byId = repository.findById(id);
        if (byId.isPresent()) {
            repository.deleteById(id);
        }
        return null;
    }

    @Override
    public Void update(ProjectUpdateDto updateDto) {
//        Optional<Project> byId = repository.findById(updateDto.getId());
//        if (byId.isPresent()) {
//            repository.save(mapper.fromUpdateDto(updateDto));
//        }
        return null;
    }

    @Override
    public List<ProjectDto> getAll(GenericCriteria criteria) {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public ProjectDto get(Long id) {
        ProjectDto projectDto = new ProjectDto();
        Project project = repository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Topilmadi");
        });
//        projectDto.setName(project.getName());
//        projectDto.setDescription(project.getDescription());
//        projectDto.setDeadline(project.getDeadline());
//        projectDto.setId(project.getId());
//
//        List<PColumnDto> columnDtosByProjectId = columnService.getColumnDtosByProjectId(id);
//
//        projectDto.setColumnList(columnDtosByProjectId);
        return projectDto;
    }

    @Override
    public Long totalCount(GenericCriteria criteria) {
        return null;
    }
}
