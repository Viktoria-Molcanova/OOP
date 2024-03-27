package service;
import java.util.List;
import model.User;
public interface DataService {
    User create(User user);
    List<User> read();
}
