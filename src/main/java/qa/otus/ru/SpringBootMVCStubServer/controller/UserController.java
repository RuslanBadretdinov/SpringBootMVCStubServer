package qa.otus.ru.SpringBootMVCStubServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qa.otus.ru.SpringBootMVCStubServer.data.ITestData;
import qa.otus.ru.SpringBootMVCStubServer.dto.UserDTO;

import java.util.List;

@RestController()
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    ITestData<UserDTO> iTestData;

    @GetMapping(value = "get/all")
    public List<UserDTO> getUserAll() {
        return iTestData.getAll();
    }

    @GetMapping(value = "/get/{id}")
    public UserDTO getUser(@PathVariable Integer id) throws NoSuchMethodException{
        return iTestData.getById(id);
    }
}
