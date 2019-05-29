package cn.juechuang.controller;


import cn.juechuang.model.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping("/load")
    public String upload(){

        return "upload";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public ResultMap upload(MultipartFile uploadFile){

        try {
            System.out.println(uploadFile.getName());//表单中的name名
            System.out.println(uploadFile.getSize());//文件大小
            System.out.println(uploadFile.getOriginalFilename());//获取文件名
            //创建文件存储路径
            File file = new File("D:/" + uploadFile.getOriginalFilename());
            //保存文件到磁盘
            uploadFile.transferTo(file);
            return ResultMap.ok("上传文件成功");
        } catch (IOException e) {
            e.printStackTrace();
            return ResultMap.fail("上传文件失败！");
        }
    }

    @RequestMapping("/upload2")
    @ResponseBody
    public ResultMap upload(MultipartFile[] uploadFile){

        try {
            for (MultipartFile multipartFile : uploadFile) {
                //保存文件
                File file = new File("D:/" + multipartFile.getOriginalFilename());
                multipartFile.transferTo(file);
            }
            return ResultMap.ok("上传文件成功");
        } catch (IOException e) {
            e.printStackTrace();
            return ResultMap.fail("上传文件失败！");
        }
    }


}
