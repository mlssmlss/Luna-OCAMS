/*
 * This file is generated by jOOQ.
 */
package org.ssglobal.revalida.codes.model.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.ssglobal.revalida.codes.model.tables.AdminUser;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminUserRecord extends UpdatableRecordImpl<AdminUserRecord> implements Record6<String, String, Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.admin_user.lastname</code>.
     */
    public AdminUserRecord setLastname(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.admin_user.lastname</code>.
     */
    public String getLastname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.admin_user.firstname</code>.
     */
    public AdminUserRecord setFirstname(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.admin_user.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.admin_user.admin_id</code>.
     */
    public AdminUserRecord setAdminId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.admin_user.admin_id</code>.
     */
    public Integer getAdminId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.admin_user.username</code>.
     */
    public AdminUserRecord setUsername(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.admin_user.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.admin_user.password</code>.
     */
    public AdminUserRecord setPassword(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.admin_user.password</code>.
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.admin_user.type</code>.
     */
    public AdminUserRecord setType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.admin_user.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, Integer, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, Integer, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AdminUser.ADMIN_USER.LASTNAME;
    }

    @Override
    public Field<String> field2() {
        return AdminUser.ADMIN_USER.FIRSTNAME;
    }

    @Override
    public Field<Integer> field3() {
        return AdminUser.ADMIN_USER.ADMIN_ID;
    }

    @Override
    public Field<String> field4() {
        return AdminUser.ADMIN_USER.USERNAME;
    }

    @Override
    public Field<String> field5() {
        return AdminUser.ADMIN_USER.PASSWORD;
    }

    @Override
    public Field<String> field6() {
        return AdminUser.ADMIN_USER.TYPE;
    }

    @Override
    public String component1() {
        return getLastname();
    }

    @Override
    public String component2() {
        return getFirstname();
    }

    @Override
    public Integer component3() {
        return getAdminId();
    }

    @Override
    public String component4() {
        return getUsername();
    }

    @Override
    public String component5() {
        return getPassword();
    }

    @Override
    public String component6() {
        return getType();
    }

    @Override
    public String value1() {
        return getLastname();
    }

    @Override
    public String value2() {
        return getFirstname();
    }

    @Override
    public Integer value3() {
        return getAdminId();
    }

    @Override
    public String value4() {
        return getUsername();
    }

    @Override
    public String value5() {
        return getPassword();
    }

    @Override
    public String value6() {
        return getType();
    }

    @Override
    public AdminUserRecord value1(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public AdminUserRecord value2(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public AdminUserRecord value3(Integer value) {
        setAdminId(value);
        return this;
    }

    @Override
    public AdminUserRecord value4(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public AdminUserRecord value5(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public AdminUserRecord value6(String value) {
        setType(value);
        return this;
    }

    @Override
    public AdminUserRecord values(String value1, String value2, Integer value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminUserRecord
     */
    public AdminUserRecord() {
        super(AdminUser.ADMIN_USER);
    }

    /**
     * Create a detached, initialised AdminUserRecord
     */
    public AdminUserRecord(String lastname, String firstname, Integer adminId, String username, String password, String type) {
        super(AdminUser.ADMIN_USER);

        setLastname(lastname);
        setFirstname(firstname);
        setAdminId(adminId);
        setUsername(username);
        setPassword(password);
        setType(type);
    }

    /**
     * Create a detached, initialised AdminUserRecord
     */
    public AdminUserRecord(org.ssglobal.revalida.codes.model.tables.pojos.AdminUser value) {
        super(AdminUser.ADMIN_USER);

        if (value != null) {
            setLastname(value.getLastname());
            setFirstname(value.getFirstname());
            setAdminId(value.getAdminId());
            setUsername(value.getUsername());
            setPassword(value.getPassword());
            setType(value.getType());
        }
    }
}
