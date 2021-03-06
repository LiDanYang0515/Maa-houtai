package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Sign;
import edu.swjtuhc.demo.service.SignService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/sign")
public class SignController {
   @Autowired
   SignService signService;
   @RequestMapping("/write")
   public JSONObject write(@RequestBody Sign sign) {
	  JSONObject result = new JSONObject();
	  int i = signService.write(sign);
	  result.put("state",i);
	  return result;
   }
}
