package org.butu.service.Impl;


import org.butu.exception.GlobalException;
import org.butu.mapper.UserMapper;
import org.butu.pojo.User;
import org.butu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.butu.util.MD5Util;
import org.butu.util.ValidatorUtil;
import org.butu.vo.LoginVo;
import org.butu.vo.RespBean;
import org.butu.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author BUTUbird
 * @since 2022-09-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private UserMapper userMapper;
    @Autowired
    public void getUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public RespBean login(LoginVo loginVo) {
        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();
        //根据手机号获取用户
        User user = userMapper.selectById(mobile);
        if (null==user){
           throw new GlobalException(RespBeanEnum.LOGINVO_ERROR);
        }
        //校验密码
        if
        (!MD5Util.formPassToDBPass(password,user.getSalt()).equals(user.getPassword())){
            throw new GlobalException(RespBeanEnum.LOGINVO_ERROR);
        }
        return RespBean.success();
    }

}
