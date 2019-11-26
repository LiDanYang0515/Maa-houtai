package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Sysuser;

public interface UserService {
 public int register(Sysuser user);

public  List<Sysuser> findByusernameAndpassword(String username, String password);
}
