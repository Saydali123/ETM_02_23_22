package uz.elmurodov.spring_security.service;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import uz.elmurodov.spring_security.config.security.UserDetails;
import uz.elmurodov.spring_security.dto.TodoCreateDto;
import uz.elmurodov.spring_security.dto.TodoDto;
import uz.elmurodov.spring_security.entity.Todo;
import uz.elmurodov.spring_security.mappers.TodoMapper;
import uz.elmurodov.spring_security.repository.TodoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository todoRepository;
    private final TodoMapper mapper;

    public TodoService(TodoRepository todoRepository, TodoMapper mapper) {
        this.todoRepository = todoRepository;
        this.mapper = mapper;
    }

    public List<TodoDto> getAll() {
        Long id = ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        List<Todo> todoList = todoRepository.findAllByUserId(id);
        return mapper.toDto(todoList);
    }

    public void create(TodoCreateDto dto) {
        Todo todo = mapper.fromCreateDto(dto);
        Long id = ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        todo.setUserId(id);
        todoRepository.save(todo);
    }

    public void complete(Long todoId) {
        Optional<Todo> todoOptional = todoRepository.findById(todoId);
        if (todoOptional.isEmpty()) return;
        Todo todo = todoOptional.get();
        Long UserId = ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        if (!todo.getUserId().equals(UserId)) return;
        todo.setCompleted(!todo.isCompleted());
        todoRepository.save(todo);
    }

    public TodoDto get(Long id) {
        Optional<Todo> byId = todoRepository.findById(id);
        return mapper.toDto(byId.orElse(null));
    }

    public void delete(Long id) {


    }
}
