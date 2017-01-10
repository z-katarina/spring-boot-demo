package cn.edu.seu.cms.service.impl;

import cn.edu.seu.cms.dao.UserDao;
import cn.edu.seu.cms.meta.User;
import cn.edu.seu.cms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> queryUserList() {
        return userDao.queryUserList();
    }

    @Override
    public User queryUserById(Long id) {
        return userDao.queryUserById(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
