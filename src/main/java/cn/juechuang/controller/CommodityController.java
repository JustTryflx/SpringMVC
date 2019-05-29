package cn.juechuang.controller;

import cn.juechuang.model.Commodity;
import cn.juechuang.service.CommodityService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    CommodityService service;

    //查询全部
    @RequestMapping("/list" )
    public String findAll(Model model){
        List<Commodity> list = service.findAll();
        model.addAttribute("comList", list);
        String lxy = "水木年华！";
        System.out.println("水木年华");
        return "com_list";
    }

    //删除
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public String delete(@RequestParam("sid") Integer id){
        Map<String,Object> map = new HashMap<String, Object>();
        int rs = service.DeleteCommodity(id);
        if(rs>0){
            map.put("code", 200);
        }
        String s = JSON.toJSONString(map);
        return s;
    }
    //增加
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){

        return "com_add";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Commodity commodity){
        service.addCommodity(commodity);
        return "redirect:/commodity/list";
    }

    //修改
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(Integer id, Model model){
        //通过id获取相关的学生信息 返回到页面中
        Commodity commodity = service.findById(id);
        //将用户信息设置到请求中
        model.addAttribute("com", commodity);
        //请求转发到页面
        return "com_update";
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update2(Commodity commodity, Model model){
        int commodity1 = service.UpdateCommodity(commodity);
        System.out.println(commodity1);
        //请求转发到页面
        return "redirect:/commodity/list";
    }

}
