package edu.swjtuhc.demo.controller;

import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.swjtuhc.demo.model.BuyerMess;
import edu.swjtuhc.demo.service.buyerMessService;

@RequestMapping("/updateUserMess")
public class UploadController {
	public String updatePhotoUrl(
			BuyerMess buyerMess, 
			String text,
			Model model,
			HttpServletRequest request) throws Exception{
			//输出base64 数据,截取","之后的值进行转换
			String str = text.substring(text.indexOf(",")+1);
			//System.currentTimeMillis()意思是获取当前系统的时间戳给图片命名
			//实例化Base64转换类  调用里面的GenerateImage方法（把base64数据转为图片）
			//第一个参数base64转图片的必须的base64数据，第二个是转换后生成的图片存放路径
//			Base64.GenerateImage(str, "D:/images/user_head/"+System.currentTimeMillis()+".jpg");
			//数据库存入绝对路径下的图片名称（上传图片即是修改操作）
			buyerMess.setPhotourl("D:/images/user_head/"+System.currentTimeMillis()+".jpg");
			buyerMess.setId("zhangsan");
			//根据用户Id修改头像图片存的路径
			Integer ret = buyerMessService.updatePhotoUrl(buyerMess);
			if(ret>0){
				System.out.println("存入成功");
			}else{
				System.out.println("存入失败");
			}
		//调用查询方法，返回到页面
		return "redirect:/first.htm";
	}
	
}
