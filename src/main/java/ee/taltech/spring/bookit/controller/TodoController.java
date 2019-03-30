package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.service.TodoService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @PostMapping("/form")
    public @ResponseBody Todo addTodo(@ModelAttribute Todo todo) {
        Todo result = service.addTodo(todo);
        return result;
    }

    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "form";
    }

    @GetMapping()
    public String getAllTodos(Model model) {
        List<Todo> allTodos = service.getAllTodos();
        model.addAttribute("todos", allTodos);
        return "todoList";
    }
}
