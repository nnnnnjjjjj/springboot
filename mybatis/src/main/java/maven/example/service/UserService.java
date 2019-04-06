package maven.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import maven.example.entity.UserEntity;
import maven.example.mapper.UserMapper;
import net.sf.json.JSONArray;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public JSONArray getUserInfo(Integer id){
		List<UserEntity>li = userMapper.getUserInfo(id);
		JSONArray listArray = JSONArray.fromObject(li);
		return listArray;
	}
}
