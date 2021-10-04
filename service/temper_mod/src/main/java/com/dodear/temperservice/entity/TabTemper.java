package com.dodear.temperservice.entity;

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
 * @since 2021-10-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TabTemper对象", description="")
public class TabTemper implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tid", type = IdType.AUTO)
    private Integer tid;

    private String t1;

    private String t2;

    private String t3;

    private String t4;

    private String t5;

    private String t6;

    private String t7;

    private String t8;

    private Integer uid;


}
