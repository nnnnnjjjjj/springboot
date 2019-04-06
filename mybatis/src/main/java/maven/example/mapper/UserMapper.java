package maven.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import maven.example.entity.UserEntity;

@Mapper
public interface UserMapper {

	@Select("SELECT * FROM USER_INFO WHERE ID=#{id}")
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "name", column = "name")
	})
	List<UserEntity>getUserInfo(@Param("id") Integer id);
}
