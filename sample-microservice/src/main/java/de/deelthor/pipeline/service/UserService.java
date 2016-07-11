package de.deelthor.pipeline.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserService {

    public String getUser(String userName){
        if (StringUtils.isEmpty(userName)){
            throw new IllegalArgumentException("userName must not be empty!");
        }
        return userName;
    }
}
