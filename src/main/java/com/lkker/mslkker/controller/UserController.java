package com.lkker.mslkker.controller;

import com.lkker.mslkker.model.po.User;
import com.lkker.mslkker.model.vo.ResultMsgVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(description = "用户服务", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation("新增用户信息")
    @PostMapping("/user")
    public ResultMsgVO user(@RequestBody User user){
        logger.info("--------------user:"+user.toString());
        ResultMsgVO resultMsgVO = new ResultMsgVO();
        try {
            // 业务处理
            resultMsgVO.setCode(30000);
            resultMsgVO.setData(user);
            resultMsgVO.setMsg("success");
        }catch (Exception e){
            resultMsgVO.setCode(30001);
            resultMsgVO.setData("ERROR:"+e.getMessage());
            resultMsgVO.setMsg("fail");
        }
        return resultMsgVO;
    }

    @ApiOperation("根据用户名查询用户信息")
    @ApiImplicitParam(name = "name", value = "用户名", required = true, paramType = "query", dataType = "String")
    @GetMapping("/users")
    public ResultMsgVO users(@RequestParam String name){
        logger.info("--------------name:"+name);
        ResultMsgVO resultMsgVO = new ResultMsgVO();
        try {
            // 业务处理
            List<User> userList = new ArrayList<>();
            User user = new User();
            user.setId("001");
            user.setName("test001");
            user.setGender("male");
            user.setAge(18);
            user.setHobby("basketball");

            userList.add(user);

            resultMsgVO.setCode(30000);
            resultMsgVO.setData(userList);
            resultMsgVO.setMsg("success");
        }catch (Exception e){
            resultMsgVO.setCode(30001);
            resultMsgVO.setData("ERROR:"+e.getMessage());
            resultMsgVO.setMsg("fail");
        }
        return resultMsgVO;
    }

    @ApiOperation("根据用户id修改用户信息")
    @PutMapping("/user/{id}")
    public ResultMsgVO user(@PathVariable String id,@RequestBody User user){
        logger.info("----id:"+id+"----user:"+user);
        ResultMsgVO resultMsgVO = new ResultMsgVO();
        try {
            // 业务处理
            resultMsgVO.setCode(30000);
            resultMsgVO.setData(null);
            resultMsgVO.setMsg("success");
        }catch (Exception e){
            resultMsgVO.setCode(30001);
            resultMsgVO.setData("ERROR:"+e.getMessage());
            resultMsgVO.setMsg("fail");
        }
        return resultMsgVO;
    }

    @ApiOperation("根据用户id删除用户信息")
    @DeleteMapping("/user/{id}")
    public ResultMsgVO user(@PathVariable String id){
        logger.info("-----------id:"+id);
        ResultMsgVO resultMsgVO = new ResultMsgVO();
        try {
            // 业务处理
            resultMsgVO.setCode(30000);
            resultMsgVO.setData(null);
            resultMsgVO.setMsg("success");
        }catch (Exception e){
            resultMsgVO.setCode(30001);
            resultMsgVO.setData("ERROR:"+e.getMessage());
            resultMsgVO.setMsg("fail");
        }
        return resultMsgVO;
    }




}
