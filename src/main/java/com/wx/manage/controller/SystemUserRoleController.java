package com.wx.manage.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * <p>
 * 用户和角色关联表 前端控制器
 * </p>
 *
 * @author Hu Wentao
 * @since 2023-11-07
 */
@RestController
@CrossOrigin
@Api(tags = "前台 - 用户角色管理")
@ApiIgnore
@RequestMapping("/system/user/role")
public class SystemUserRoleController {

}
