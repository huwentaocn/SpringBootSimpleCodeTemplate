package com.wx.manage.pojo.req;

import com.wx.manage.pojo.page.PageParam;
import com.wx.manage.until.DateUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @Description 租户分页请求体
 * @Date 2023/11/10 10:38 星期五
 * @Author Hu Wentao
 */

@Data
@ApiModel(value = "TenantPageReq", description = "租户分页请求体")
public class TenantPageReq extends PageParam {

    @ApiModelProperty(value = "租户名", example = "租户")
    private String name;

    @ApiModelProperty(value = "联系人", example = "联系人")
    private String contactName;

    @ApiModelProperty(value = "联系手机", example = "15601691300")
    private String contactMobile;

    @ApiModelProperty(value = "租户状态（0正常 1停用）", example = "1")
    private Integer status;

    @DateTimeFormat(pattern = DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime[] createTime;
}