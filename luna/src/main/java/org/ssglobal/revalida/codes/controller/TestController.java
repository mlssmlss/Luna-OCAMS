package org.ssglobal.revalida.codes.controller;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ssglobal.revalida.codes.model.Tables;
import org.ssglobal.revalida.codes.model.tables.pojos.Admin;
import org.ssglobal.revalida.codes.model.tables.records.AdminRecord;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @Autowired
    DSLContext dslContext;

    @GetMapping("/insert")
    public boolean insertAdmin() {
        AdminRecord rec = new AdminRecord();
        rec.setAdminId(1000);
        rec.setFirstname("Bob");
        rec.setLastname("Marley");
        rec.setUsername("boy");
        rec.setPassword("123");
        rec.setType("admin");
        boolean res = dslContext.insertInto(Tables.ADMIN).set(rec).execute() != 0;
        return res;

    }

    @GetMapping
    public Admin hello() {
        Admin admin = dslContext.selectFrom(Tables.ADMIN).fetchOneInto(Admin.class);
        return admin;
    }

}
