package edu.swjtuhc.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.swjtuhc.demo.model.Avatar;
import edu.swjtuhc.demo.service.AvatarService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/avatar")
public class AvatarController {
	@Autowired
	AvatarService avatarService;
	@RequestMapping("/file")
	public JSONObject avatar(Avatar avatar, MultipartFile file) {
		JSONObject result = new JSONObject();
		avatar.setAvatar(file.getOriginalFilename());
		int i = 0;
		try {
			i = avatarService.avatar(avatar, file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.put("state", i);
		return result;
	}

}
