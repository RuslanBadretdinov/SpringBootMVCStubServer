package qa.otus.ru.SpringBootMVCStubServer.data;

import java.util.List;

public interface ITestData <T>{
    List<T> getAll();
    T getById(Integer id) throws NoSuchMethodException;
}
