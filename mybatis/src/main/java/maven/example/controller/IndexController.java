package maven.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import maven.example.service.UserService;
import net.sf.json.JSONArray;

@RestController
@RequestMapping(value = "/index")
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String home() {
		return "Hello world";
	}
	
	@RequestMapping("/userInfo")
	public JSONArray userInfo(@RequestParam("id") String id) {
		return userService.getUserInfo(Integer.valueOf(id));
	}
}
