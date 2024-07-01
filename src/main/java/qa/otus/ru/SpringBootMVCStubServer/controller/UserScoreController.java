package qa.otus.ru.SpringBootMVCStubServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qa.otus.ru.SpringBootMVCStubServer.data.ITestData;
import qa.otus.ru.SpringBootMVCStubServer.dto.UserScoreDTO;

import java.util.List;

@RestController()
@RequestMapping(value = "score")
public class UserScoreController {

    @Autowired
    ITestData<UserScoreDTO> iTestData;

    @RequestMapping(value = "get/all", method = RequestMethod.GET)
    public List<UserScoreDTO> getUserAll() {
        return iTestData.getAll();
    }
}
