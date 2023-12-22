package com.jam.timeline.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jam.timeline.biz.user.UserService;
import com.jam.timeline.biz.user.UserVO;

@Service("userServiceImplement")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;

	@Override
	public void createAccount(UserVO userVO) {
		userDAO.createAccount(userVO); 
	}

	@Override
	public void login(UserVO userVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout(UserVO userVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void submitProfpic(UserVO userVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(UserVO userVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount(UserVO userVO) {
		// TODO Auto-generated method stub
		
	}
	


}
