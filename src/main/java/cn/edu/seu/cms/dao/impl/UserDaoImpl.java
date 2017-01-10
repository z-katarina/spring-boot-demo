package cn.edu.seu.cms.dao.impl;

import cn.edu.seu.cms.dao.UserDao;
import cn.edu.seu.cms.meta.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/10
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static Map<Long, User> userMap = new HashMap<Long, User>();

    static {
        userMap.put(1001L, new User(1001L, "AA", 21, "1996-01-01", "aa@163.com"));
        userMap.put(1002L, new User(1002L, "BB", 22, "1995-01-02", "bb@163.com"));
        userMap.put(1003L, new User(1003L, "CC", 23, "1994-01-03", "cc@163.com"));
        userMap.put(1004L, new User(1004L, "DD", 24, "1993-01-04", "dd@163.com"));
        userMap.put(1005L, new User(1005L, "EE", 25, "1992-01-05", "ee@163.com"));
    }

    @Override
    public List<User> queryUserList() {
        List<User> list = new ArrayList<>();
        for (User user : userMap.values()) {
            list.add(user);
        }
        return list;
    }

    @Override
    public User queryUserById(Long id) {
        return userMap.get(id);
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public void updateUser(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public void deleteUser(Long id) {
        userMap.remove(id);
    }
}
