package qa.otus.ru.springbootmvcstubserver.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@EqualsAndHashCode
public class UserDTO {
    @JsonIgnore
    private Integer id;
    private Long age;
    private String course;
    private String email;
    private String name;
}
