package org.butu.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.butu.pojo.User;
import org.butu.vo.LoginVo;
import org.butu.vo.RespBean;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author BUTUbird
 * @since 2022-09-05
 */
public interface UserService extends IService<User> {

    RespBean login(LoginVo loginVo);
}
