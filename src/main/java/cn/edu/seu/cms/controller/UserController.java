package cn.edu.seu.cms.controller;

import cn.edu.seu.cms.meta.BaseJsonVO;
import cn.edu.seu.cms.meta.User;
import cn.edu.seu.cms.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by hzzhouxiaotian
 * Data: 2017/1/10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public BaseJsonVO list() {
        List<User> list = userService.queryUserList();
        return BaseJsonVO.newSuccess(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseJsonVO find (@PathVariable Long id) {
        User user = userService.queryUserById(id);
        return BaseJsonVO.newSuccess(user);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseJsonVO add(@Valid User user) {
        userService.addUser(user);
        return BaseJsonVO.newSuccess();
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public BaseJsonVO update(@Valid User user) {
        userService.updateUser(user);
        return BaseJsonVO.newSuccess();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public BaseJsonVO delete(@PathVariable Long id) {
        userService.deleteUser(id);
        return BaseJsonVO.newSuccess();
    }
}
