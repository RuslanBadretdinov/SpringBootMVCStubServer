package qa.otus.ru.springbootmvcstubserver.data;

import org.springframework.stereotype.Component;
import qa.otus.ru.springbootmvcstubserver.dto.UserDTO;
import java.util.List;
import java.util.stream.Stream;

@Component
public class UserData implements ITestData<UserDTO> {

    private final List<UserDTO> userDTOList = Stream.of(
                    UserDTO.builder()
                            .id(0)
                            .age(18L)
                            .course("Math")
                            .name("Jack")
                            .email("jack@mail.com")
                            .build(),
                    UserDTO.builder()
                            .id(1)
                            .age(20L)
                            .course("Physics")
                            .name("Mike")
                            .email("mike@mail.com")
                            .build(),
                    UserDTO.builder()
                            .id(2)
                            .age(22L)
                            .course("English")
                            .name("Alex")
                            .email("alex@mail.com")
                            .build()
            )
            .toList();

    @Override
    public List<UserDTO> getAll() {
        return userDTOList;
    }

    @Override
    public UserDTO getById(Integer id) {
        return userDTOList.stream().filter(u -> id.equals(u.getId())).findFirst().orElseThrow();
    }
}
