package qa.otus.ru.springbootmvcstubserver.data;

import java.util.List;

public interface ITestData<T> {
    List<T> getAll();

    T getById(Integer id) throws NoSuchMethodException;
}