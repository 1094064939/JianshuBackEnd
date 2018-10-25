package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.dao.SysUserRepositry;
import com.soft1611.jianshu.entity.LoginUser;
import com.soft1611.jianshu.entity.SysUser;
import com.soft1611.jianshu.service.SysUserService;
import com.soft1611.jianshu.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepositry sysUserRepositry;

    @Override
    public ResponseUtil userLogin(LoginUser loginUser) {
        SysUser sysUser = sysUserRepositry.findSysUserByEmail(loginUser.getEmail());
        //邮箱有效
        if (sysUser != null) {
            //判断密码是否正确
            if (loginUser.getPassword().equals(sysUser.getPassword())) {
                return new ResponseUtil(0, "登陆成功", sysUser);
            } else {
                return new ResponseUtil(0, "密码错误");
            }
        } else {
            return new ResponseUtil(0, "账号错误");
        }
    }

    @Override
    public List<SysUser> getHotUsers() {
        return sysUserRepositry.findHotUsers();
    }
}
