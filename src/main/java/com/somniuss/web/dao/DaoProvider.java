package com.somniuss.web.dao;

import com.somniuss.web.dao.impl.SQLSoundeffectsDao;
import com.somniuss.web.dao.impl.SQLUserDao;

public class DaoProvider {
	private static DaoProvider instance = new DaoProvider();

	private DaoProvider() {
	}

	private final UserDao userDao = new SQLUserDao();
	private final SoundeffectsDao soundeffectsDao = new SQLSoundeffectsDao();

	public UserDao getUserDao() {
		return userDao;
	}

	public SoundeffectsDao getNewsDao() {
		return soundeffectsDao;
	}

	public static DaoProvider getInstance() {
		return instance;
	}

}
