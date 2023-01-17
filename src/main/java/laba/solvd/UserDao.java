package laba.solvd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDao implements IBaseDao<User> {
    private List<User> users = new ArrayList<>();

    public UserDao() {
        users.add(new User());
        users.add(new User());
    }

    @Override
    public Optional<User> getEntityById(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        // user.setName(Objects.requireNonNull(
         //       params[0], "Name cannot be null"));
     //   user.setEmail(Objects.requireNonNull(
             //   params[1], "Email cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

}
