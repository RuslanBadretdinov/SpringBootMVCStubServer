package qa.otus.ru.springbootmvcstubserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qa.otus.ru.springbootmvcstubserver.data.ITestData;
import qa.otus.ru.springbootmvcstubserver.dto.CourseDTO;
import java.util.List;

@RestController()
@RequestMapping(value = "course")
public class CourseController {

    @Autowired
    ITestData<CourseDTO> testData;

    @GetMapping(value = "get/all")
    public List<CourseDTO> getUserAll() {
        return testData.getAll();
    }
}
