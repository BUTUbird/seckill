package org.butu.vo;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author BUTUbird
 */
@ToString
@AllArgsConstructor
@Getter
public enum RespBeanEnum {
    //通用状态码
    SUCCESS(200,"success"),
    ERROR(500,"服务端异常"),
    BIND_ERROR(500212, "参数校验异常"),
    MOBILE_NOT_EXIST(500213, "手机号码不存在"),
    PASSWORD_UPDATE_FAIL(500214, "更新密码失败"),
    //SESSION_ERROR(500215, "用户SESSION不存在"),
    //登录模块5002xx
    SESSION_ERROR(500210,"session不存在或者已经失效"),
    LOGINVO_ERROR(500211,"用户名或者密码错误"),
    MOBILE_ERROR(500212,"手机号码格式错误");
    private final Integer code;
    private final String message;
}
