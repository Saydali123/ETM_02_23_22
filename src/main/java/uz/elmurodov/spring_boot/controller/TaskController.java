package uz.elmurodov.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.elmurodov.spring_boot.criteria.GenericCriteria;
import uz.elmurodov.spring_boot.dto.task.TaskCreateDto;
import uz.elmurodov.spring_boot.dto.task.TaskUpdateDto;
import uz.elmurodov.spring_boot.services.task.TaskService;

/**
 * @author Amonov Bunyod, чт 24.02.2022 15:40 .
 */
@Controller
@RequestMapping(value = "/task/*")
public class TaskController extends AbstractController<TaskService> {


    public TaskController(TaskService service) {
        super(service);
    }

    @RequestMapping(value = "details/{id}")
    public String detail(Model model, @PathVariable Long id) {
        model.addAttribute("task", service.get(id));
        return "task/detail";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listTask(Model model) {
        model.addAttribute("tasks", service.getAll(new GenericCriteria()));
        return "task/list";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String createPage() {
        return "task/create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@ModelAttribute TaskCreateDto createDto) {
        service.create(createDto);
        return "redirect:/";
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.GET)
    public String updatePage(@PathVariable Long id) {
        return "task/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.PATCH)
    public String update(@ModelAttribute TaskUpdateDto updateDto) {
        service.update(updateDto);
        return "redirect:/";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deletePage(Model model, @PathVariable Long id) {
        model.addAttribute("task", service.get(id));
        return "delete/task";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.PUT)
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }


}
