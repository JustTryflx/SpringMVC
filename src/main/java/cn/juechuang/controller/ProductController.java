package cn.juechuang.controller;

import cn.juechuang.model.Product;
import cn.juechuang.model.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/list")
    @ResponseBody
    public ResultMap list (Model model){
        ResultMap resultMap = new ResultMap();
        resultMap.setcode(200);
        resultMap.setMsg("获取数据成功");
        Product product = new Product(1, "商品1", 100, "第一个商品", new Date());
        Product product2 = new Product(2, "商品2", 200, "第二个商品", new Date());
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(product);
        list.add(product2);
        return ResultMap.ok(list);
    }
//    public ResultMap list (){
//        ResultMap resultMap = new ResultMap();
//        resultMap.setcode(200);
//        resultMap.setMsg("获取数据成功");
//        Product product = new Product(1, "商品1", 100, "第一个商品", new Date());
//        Product product2 = new Product(2, "商品2", 200, "第二个商品", new Date());
//        ArrayList<Product> list = new ArrayList<Product>();
//        list.add(product);
//        list.add(product2);
//        return ResultMap.ok(list);
//    }

    @RequestMapping("/add")
    @ResponseBody
    public ResultMap add(Product p){

        return ResultMap.ok(p);
    }
}
