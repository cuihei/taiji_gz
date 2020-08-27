package com.taiji.gz.service.impl;



import com.taiji.gz.dao.userLoginMapper;
import com.taiji.gz.entity.userLogin;
import com.taiji.gz.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class userServiceImpl implements userService {

    @Autowired
    private userLoginMapper userLoginMapper;



    @Override
    public userLogin login(String userloginname, String password) {
        userLogin user = new userLogin();
      user.setLoginname(userloginname);
      /*  user.setPassword(password);*/
        user=userLoginMapper.login(userloginname);
        if(user!=null) {


            boolean result = password.equals(user.getPassword());

            if (result) {
                return user;
            } else {
                return null;
            }

        }

        return null;


    }


}
