package org.butu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author BUTUbird
 * @since 2022-09-05
 */
@Getter
@Setter
@TableName("t_user")
//@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

//    @ApiModelProperty("用户ID,手机号码")
    @TableId("id")
    private Long id;

    @TableField("nickname")
    private String nickname;

//    @ApiModelProperty("MD5(MD5(pass明文+固定salt)+salt)")
    @TableField("password")
    private String password;

    @TableField("salt")
    private String salt;

//    @ApiModelProperty("头像")
    @TableField("head")
    private String head;

//    @ApiModelProperty("注册时间")
    @TableField("register_date")
    private LocalDateTime registerDate;

//    @ApiModelProperty("最后一次登录事件")
    @TableField("last_login_date")
    private LocalDateTime lastLoginDate;

//    @ApiModelProperty("登录次数")
    @TableField("login_count")
    private Integer loginCount;


}
