package org.butu.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.butu.pojo.User;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author BUTUbird
 * @since 2022-09-05
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
