package com.dodear.recordingservice.entity;

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
 * @since 2021-10-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TabRecord对象", description="")
public class TabRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rid", type = IdType.AUTO)
    private Integer rid;

    private String rurl;

    private Integer uid;


}
