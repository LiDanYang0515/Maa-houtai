package edu.swjtuhc.demo.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AvatarMapper;
import edu.swjtuhc.demo.model.Avatar;
import edu.swjtuhc.demo.service.AvatarService;


@Service
public class AvatarServiceImpl implements AvatarService {
@Autowired
AvatarMapper avatarMapper;
public List<Avatar> getAvatarList(){
	
	return avatarMapper.selectAllAvatars();
}
@Override
public int avatar( Avatar avatar, InputStream fileStream) {
	// TODO Auto-generated method stub
	String path = "E:\\localfiles\\";
	int i = -1;
	byte[] bs = new byte[1024];
	//读取到的数据长度
	int len;
	//输出的文件流保存到本地文件
	try {
		File tempFile = new File(path);
		if(!tempFile.exists()) {
			tempFile.mkdirs();	
		}
		
		Date today = new  Date();
		String fileName = today.getTime()+avatar.getAvatar();
		avatar.setAvatar("/posters/"+ fileName);
		OutputStream os = new FileOutputStream(tempFile.getPath() + File.separator + fileName);
	    //开始读取
		while ((len = fileStream.read(bs))!= -1) {
			os.write(bs,0,len);	
		}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		i = -2;
	}
	if(avatar.getAvatar().equals("")) {
		i = -3;
	}else {
		//调用mapper，将avatar信息存入数据库
		i = avatarMapper.insertAvatar(avatar);
	}
	return i;
}

}
