package org.ssglobal.revalida.codes.config.services;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssglobal.revalida.codes.model.Tables;
import org.ssglobal.revalida.codes.model.tables.pojos.Admin;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  DSLContext dslContext;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Admin admin = dslContext.selectFrom(Tables.ADMIN).where(Tables.ADMIN.USERNAME.eq(username))
        .fetchOneInto(Admin.class);
    return UserDetailsImpl.build(admin);
  }

}
