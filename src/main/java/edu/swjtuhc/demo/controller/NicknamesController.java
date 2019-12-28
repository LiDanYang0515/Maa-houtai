package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Nicknames;
import edu.swjtuhc.demo.model.Sign;
import edu.swjtuhc.demo.service.NicknamesService;
import edu.swjtuhc.demo.service.SignService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/nicknames")
public class NicknamesController {
	 @Autowired
	   NicknamesService nicknamesService;
	   @RequestMapping("/name")
	   public JSONObject name(@RequestBody Nicknames nicknames) {
		  JSONObject result = new JSONObject();
		  int i = nicknamesService.write(nicknames);
		  result.put("state",i);
		  return result;
	   }
}
