package com.zhiteer.demo.demouser.controller;

import com.zhiteer.demo.demouser.ResponseData;
import com.zhiteer.demo.demouser.model.MyUser;
import com.zhiteer.demo.demouser.service.MyUserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/myuser3")
@RestController
public class MyUser3 {


    @Autowired
    private MyUserDaoService myUserService;


    @RequestMapping("/user")
    public ResponseData user(@RequestParam Integer id) throws Exception {

        ResponseData data = new ResponseData();

        MyUser result = myUserService.selectUserById(id);

        data.setResult(result);

        return data;
    }

    @RequestMapping("/list")
    public ResponseData list() throws Exception {

        ResponseData data = new ResponseData();

        List<MyUser> result = myUserService.selectAllUser();

        data.setResult(result);

        return data;
    }

    /**
     * Content-type 为 application/json
     * post raw 模式
     *
     * {
     *     "name": "elinx888888",
     *     "age": 29
     * }
     *
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/add")
    public ResponseData add(@RequestBody MyUser user ) throws Exception {

        ResponseData data = new ResponseData();

        System.out.println(user);

        int result = myUserService.addUser(user);

        data.setResult(result);

        return data;
    }

    /**
     * post raw 模式
     *
     * {
     *     "id": "3",
     *     "name": "elinx888888",
     *     "age": 29
     * }
     *
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/update")
    public ResponseData update(@RequestBody MyUser user ) throws Exception {

        // 由于没有设置底层update具体字段，而采用的是实体类 MyUser
        // 所以必须每个参数都传递值，否则将默认实体属性的类型的默认值，比如age没有，则默认int类型为 0

        ResponseData data = new ResponseData();

        System.out.println(user);

        int result = myUserService.updateUser(user);

        data.setResult(result);

        return data;
    }

    /**
     * post raw 模式
     *
     * {
     *     "id": "3",
     *     "name": "elinx888888",
     *     "age": 29
     * }
     *
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/updateDemo")
    public ResponseData updateDemo(@RequestBody MyUser user ) throws Exception {

        // 由于设置底层update具体可以更新的字段规则
        // 所以每个参数不是必须传递值，默认null为没有传递不进行更新
        // 注意，如果实体类内部有定义了默认值，如age=0，则使用实体类传递参数到mybatis就会被认为是有值！！

        ResponseData data = new ResponseData();

        System.out.println(user);

        int result = myUserService.updateUserDemo(user);

        data.setResult(result);

        return data;
    }

    /**
     * post raw 模式
     *
     * {
     *     "id": "3"
     * }
     *
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/delete")
    public ResponseData delete(@RequestBody MyUser user) throws Exception {

        ResponseData data = new ResponseData();

        System.out.println(user);

        int result = myUserService.deleteUser(user.getId());

        data.setResult(result);

        return data;
    }

}