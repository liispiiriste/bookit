package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.repository.TodoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TodoService {
    @Resource
    TodoRepository repo;

    public Todo getTodoById(long id) {
        return repo.getOne(id);

    }
    public List<Todo> getAllTodos() {
        return repo.findAll();
    }

    public Todo addTodo(Todo todo) {
        return repo.save(todo);
    }
    public void saveAll(List<Todo> todos) {
        repo.saveAll(todos);
    }
}
