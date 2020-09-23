package pers.fzm.studentevaluation.controller;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pers.fzm.studentevaluation.domain.UserInfo;
import pers.fzm.studentevaluation.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/allUsers")
    public ModelAndView findAllUsers(@RequestParam(name = "page",defaultValue = "1")int pageNum, @RequestParam(name = "size",defaultValue = "4")int pageSize){
        ModelAndView mv = new ModelAndView();
        List<UserInfo> users = userService.findAll(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(users);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("users");
        return mv;
    }

    @RequestMapping("/addUser")
    public @ResponseBody
    Map<String,String> addUser(@RequestBody UserInfo user){
        Map<String,String> data = new HashMap<>();
        if (userService.findUser(user.getUser_id()) != null){
            data.put("flag","fail");
        }else {
            userService.addUser(user);
            data.put("flag","success");
        }
        return data;
    }

    @RequestMapping("/userDetails")
    public ModelAndView userDetails(@RequestParam(name = "id") String userId){
        ModelAndView mv = new ModelAndView();
        UserInfo user = userService.findUser(userId);
        mv.addObject("user",user);
        mv.setViewName("user_details");
        return mv;
    }

    @RequestMapping("/removeUsers")
    public String removeUsers(String tag){
        String[] userIds = tag.split(",");
        userService.removeUsers(userIds);
        return "redirect:allUsers";
    }

    @RequestMapping("/removeUser")
    public String removeUser(String userId){
        userService.removeUser(userId);
        return "redirect:allUsers";
    }

    @RequestMapping("/updatePassword")
    public @ResponseBody Map<String,String> updatePassword(@RequestParam(name = "oldPassword")String oldPassword, @RequestParam(name = "newPassword")String newPassword){
        Map<String,String> data = new HashMap<>();
        if (userService.confirmPassword(oldPassword)){
            userService.updatePassword(newPassword);
            data.put("flag","success");
        }else {
            data.put("flag","fail");
        }
        return data;
    }

    @RequestMapping("/editUser")
    public ModelAndView editUser(@RequestParam(name = "id") String userId){
        ModelAndView mv = new ModelAndView();
        UserInfo user = userService.findUser(userId);
        mv.addObject("user",user);
        mv.setViewName("user_edit");
        return mv;
    }

    @RequestMapping("/userSearch")
    public ModelAndView userSearch(@RequestParam(name = "page",defaultValue = "1")int pageNum,
                                      @RequestParam(name = "size",defaultValue = "4")int pageSize,
                                      @RequestParam(name = "val") String val){
        ModelAndView mv = new ModelAndView();
        List<UserInfo> user = userService.userSearch(pageNum, pageSize, val);
        PageInfo pageInfo = new PageInfo(user);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("users");
        return mv;
    }
}
