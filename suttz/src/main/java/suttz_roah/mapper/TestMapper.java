package suttz_roah.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import suttz_roah.pojo.User;

/**
 * Created by asrh0 on 2017/7/9.
 */
@Mapper
public interface TestMapper {
    @Select("select * from user")
    public User test();
}
