package cn.enjoy.service;

/**
 *  on 2018/9/13.
 */

public interface UserService {
     String sayHello();

     boolean register(String username, String passwd);

     boolean login(String username, String passwd);


}
