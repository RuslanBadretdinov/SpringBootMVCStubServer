package qa.otus.ru.SpringBootMVCStubServer.data;

import org.springframework.stereotype.Component;
import qa.otus.ru.SpringBootMVCStubServer.dto.UserScoreDTO;

import java.util.List;
import java.util.stream.Stream;

@Component
public class UserScoreData implements ITestData<UserScoreDTO>{

    private final List<UserScoreDTO> userScoreDTOList = Stream.of(
                    UserScoreDTO.builder()
                            .name("Jack")
                            .score(10L)
                            .build(),
                    UserScoreDTO.builder()
                            .name("Mike")
                            .score(10L)
                            .build(),
                    UserScoreDTO.builder()
                            .name("Alex")
                            .score(12L)
                            .build()
            )
            .toList();

    @Override
    public List<UserScoreDTO> getAll() {
        return userScoreDTOList;
    }

    @Override
    public UserScoreDTO getById(Integer id) throws NoSuchMethodException{
        throw new NoSuchMethodException("Метод getId не разработан");
    }
}
