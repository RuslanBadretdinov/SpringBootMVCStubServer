package qa.otus.ru.springbootmvcstubserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qa.otus.ru.springbootmvcstubserver.data.ITestData;
import qa.otus.ru.springbootmvcstubserver.dto.UserDTO;
import java.util.List;

@RestController()
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    ITestData<UserDTO> testData;

    @GetMapping(value = "get/all")
    public List<UserDTO> getUserAll() {
        return testData.getAll();
    }

    @GetMapping(value = "/get/{id}")
    public UserDTO getUser(@PathVariable Integer id) throws NoSuchMethodException {
        return testData.getById(id);
    }
}
