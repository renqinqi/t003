package com.example.controller;

import com.example.pojo.User;
import com.example.returnjsondata.UserJsonData;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
   public UserJsonData add(@RequestBody User user){
        String info="添加失败";
        String data="false";
        boolean isOk=userService.add(user);
        if(isOk==false){
            info="添加成功";
            data="ture";
        };
        UserJsonData userJsonData=new UserJsonData();
        userJsonData.setStatue(200);
        userJsonData.setInfo(info);
        userJsonData.setData(data);
        return userJsonData;
   }

}
