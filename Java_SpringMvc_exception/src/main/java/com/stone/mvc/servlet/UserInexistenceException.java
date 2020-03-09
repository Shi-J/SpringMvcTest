package com.stone.mvc.servlet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason="没有找到此用户",value = HttpStatus.NOT_ACCEPTABLE)
public class UserInexistenceException extends RuntimeException
{
    static final long serialVersionUID = 7034897190745769354L;


}
