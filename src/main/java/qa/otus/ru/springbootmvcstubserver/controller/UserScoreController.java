package qa.otus.ru.springbootmvcstubserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.otus.ru.springbootmvcstubserver.data.ITestData;
import qa.otus.ru.springbootmvcstubserver.dto.UserScoreDTO;
import java.util.List;

@RestController()
@RequestMapping(value = "score")
public class UserScoreController {

    @Autowired
    ITestData<UserScoreDTO> testData;

    @RequestMapping(value = "get/all", method = RequestMethod.GET)
    public List<UserScoreDTO> getUserAll() {
        return testData.getAll();
    }
}
