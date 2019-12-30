package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Nnames;
import edu.swjtuhc.demo.model.Sign;
import edu.swjtuhc.demo.service.NnamesService;
import edu.swjtuhc.demo.service.SignService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/nnames")
public class NnamesController {
	@Autowired
	   NnamesService nnamesService;
	@RequestMapping("/writing")
	   public JSONObject write(@RequestBody Nnames nnames) {
		  JSONObject result = new JSONObject();
		  int i = nnamesService.write(nnames);
		  result.put("state",i);
		  return result;
	   }
}
