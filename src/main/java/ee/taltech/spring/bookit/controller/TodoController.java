package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.service.TodoService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("todos")
public class TodoController {
    @Resource
    TodoService service;

    @GetMapping(value = "/{id}")
    public String todo(Model model, @PathVariable Long id) {
        Todo todo = service.getTodoById(id);
        model.addAttribute("example_todo", todo);
        return "todo";
    }

}
