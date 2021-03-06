
package ggauthority.v1.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ggauthority.v1.user.entity.User;
import ggauthority.v1.user.service.UserService;


/**
 * 
 * @author yaomy
 *
 */
@RestController
@RequestMapping(value="users")
public class UserController {

	@Autowired
	private UserService userService;
	
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public User list(@RequestParam Long userId) {
    		User user = new User();
    		user.setId(5L);
    		user.setPassword("123");
    		user.setUserName("yaomy");
    		this.userService.saveUser(user);
        return user;
    }
    @RequestMapping(value = "/get_user/{user_id}", method = {RequestMethod.GET, RequestMethod.POST})
    public Map<String, Object> getUser(@PathVariable Long userId) {
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("user_id", userId);
        return map;
    }
}