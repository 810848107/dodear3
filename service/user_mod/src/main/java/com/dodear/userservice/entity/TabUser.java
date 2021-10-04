package com.dodear.userservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiXiaohan
 * @since 2021-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TabUser对象", description="")
public class TabUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String uname;

    private String upassword;

    private String utel;

    private String uimg;


}
