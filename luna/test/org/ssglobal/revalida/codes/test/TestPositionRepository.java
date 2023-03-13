//package org.ssglobal.revalida.codes.test;
//
//import org.jooq.DSLContext;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.ssglobal.revalida.codes.repository.AdminRepository;
//import org.ssglobal.training.codes.MyConfiguration;
//
//public class TestPositionRepository {
//
//	private MyConfiguration config;
//	
//	@BeforeEach
//	public void setip() {
//		config = new MyConfiguration();
//	}
//	
//	@AfterEach
//	public void teardown() {
//		config = null;
//	}
//	
//	@Test
//	public void testInsert() {
//		String uri = "jdbc:postgresql://localhost:5432/employee";
//		config.openConnect(uri, "postgres", "admin2255");
//		DSLContext context = config.buildDSLContex();
//		AdminRepository pos = new AdminRepository(context);
//		pos.insertPosition(20, "Supervisor", "Team Lead");
//		config.closeConnect();
//	}
//	
//	
//	
//}
