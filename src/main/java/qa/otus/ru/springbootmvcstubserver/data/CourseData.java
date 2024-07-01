package qa.otus.ru.springbootmvcstubserver.data;

import org.springframework.stereotype.Component;
import qa.otus.ru.springbootmvcstubserver.dto.CourseDTO;
import java.util.List;
import java.util.stream.Stream;

@Component
public class CourseData implements ITestData<CourseDTO> {

    private final List<CourseDTO> courseDTOList = Stream.of(
                    CourseDTO.builder()
                            .name("Jack")
                            .price(100L)
                            .build(),
                    CourseDTO.builder()
                            .name("Mike")
                            .price(200L)
                            .build(),
                    CourseDTO.builder()
                            .name("Alex")
                            .price(300L)
                            .build()
            )
            .toList();

    @Override
    public List<CourseDTO> getAll() {
        return courseDTOList;
    }

    @Override
    public CourseDTO getById(Integer id) throws NoSuchMethodException {
        throw new NoSuchMethodException("Метод getId не разработан");
    }
}