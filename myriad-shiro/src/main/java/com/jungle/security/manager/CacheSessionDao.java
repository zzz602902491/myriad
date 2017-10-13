package com.jungle.security.manager;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author jungle
 * @created 2017/10/13 0013 上午 11:26
 */
public class CacheSessionDao extends AbstractSessionDAO{

	private CacheTemplate cacheTemplate;

	@Override protected Serializable doCreate(Session session) {
		return null;
	}

	@Override protected Session doReadSession(Serializable serializable) {
		return null;
	}

	@Override public void update(Session session) throws UnknownSessionException {

	}

	@Override public void delete(Session session) {

	}

	@Override public Collection<Session> getActiveSessions() {
		return null;
	}
}
