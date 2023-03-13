package org.ssglobal.revalida.codes.repository;

import org.jooq.DSLContext;
import org.ssglobal.revalida.codes.model.tables.Admin;
import org.ssglobal.revalida.codes.model.tables.records.AdminRecord;

public class AdminRepository {
	
	private DSLContext context;

	public AdminRepository(DSLContext context) {
		this.context = context;
	}
	
	public boolean registerAdmin(Integer adminId, String firstName, String LastName, String username, String password, String type) {
		try {
			AdminRecord rec  = context.newRecord(Admin.ADMIN);
			rec.setAdminId(adminId);
			rec.setFirstname(LastName);
			rec.setLastname(LastName);
			rec.setUsername(username);
			rec.setPassword(password);
			rec.setType(type);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
