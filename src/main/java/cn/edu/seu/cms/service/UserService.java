package cn.edu.seu.cms.service;

import cn.edu.seu.cms.meta.User;

import java.util.List;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/10
 */
public interface UserService {

    List<User> queryUserList();

    User queryUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
