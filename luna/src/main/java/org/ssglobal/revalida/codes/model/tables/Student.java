/*
 * This file is generated by jOOQ.
 */
package org.ssglobal.revalida.codes.model.tables;


import java.time.LocalDate;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.ssglobal.revalida.codes.model.Keys;
import org.ssglobal.revalida.codes.model.Public;
import org.ssglobal.revalida.codes.model.tables.records.StudentRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>public.student.student_id</code>.
     */
    public final TableField<StudentRecord, Integer> STUDENT_ID = createField(DSL.name("student_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.student.student_number</code>.
     */
    public final TableField<StudentRecord, Integer> STUDENT_NUMBER = createField(DSL.name("student_number"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.student.program</code>.
     */
    public final TableField<StudentRecord, String> PROGRAM = createField(DSL.name("program"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.password</code>.
     */
    public final TableField<StudentRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.firstname</code>.
     */
    public final TableField<StudentRecord, String> FIRSTNAME = createField(DSL.name("firstname"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.middlename</code>.
     */
    public final TableField<StudentRecord, String> MIDDLENAME = createField(DSL.name("middlename"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.lastname</code>.
     */
    public final TableField<StudentRecord, String> LASTNAME = createField(DSL.name("lastname"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.birthdate</code>.
     */
    public final TableField<StudentRecord, LocalDate> BIRTHDATE = createField(DSL.name("birthdate"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.student.semester</code>.
     */
    public final TableField<StudentRecord, String> SEMESTER = createField(DSL.name("semester"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.year_level</code>.
     */
    public final TableField<StudentRecord, Integer> YEAR_LEVEL = createField(DSL.name("year_level"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.student.academic_level</code>.
     */
    public final TableField<StudentRecord, Integer> ACADEMIC_LEVEL = createField(DSL.name("academic_level"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.student.status</code>.
     */
    public final TableField<StudentRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.active_deactive</code>.
     */
    public final TableField<StudentRecord, Boolean> ACTIVE_DEACTIVE = createField(DSL.name("active_deactive"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.student.subject</code>.
     */
    public final TableField<StudentRecord, String> SUBJECT = createField(DSL.name("subject"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.student.grades</code>.
     */
    public final TableField<StudentRecord, Integer> GRADES = createField(DSL.name("grades"), SQLDataType.INTEGER.nullable(false), this, "");

    private Student(Name alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(Name alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.student</code> table reference
     */
    public Student(String alias) {
        this(DSL.name(alias), STUDENT);
    }

    /**
     * Create an aliased <code>public.student</code> table reference
     */
    public Student(Name alias) {
        this(alias, STUDENT);
    }

    /**
     * Create a <code>public.student</code> table reference
     */
    public Student() {
        this(DSL.name("student"), null);
    }

    public <O extends Record> Student(Table<O> child, ForeignKey<O, StudentRecord> key) {
        super(child, key, STUDENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.STUDENT_PKEY;
    }

    @Override
    public Student as(String alias) {
        return new Student(DSL.name(alias), this);
    }

    @Override
    public Student as(Name alias) {
        return new Student(alias, this);
    }

    @Override
    public Student as(Table<?> alias) {
        return new Student(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Name name) {
        return new Student(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Table<?> name) {
        return new Student(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, Integer, String, String, String, String, String, LocalDate, String, Integer, Integer, String, Boolean, String, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super Integer, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super Integer, ? super Integer, ? super String, ? super Boolean, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super Integer, ? super Integer, ? super String, ? super String, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super Integer, ? super Integer, ? super String, ? super Boolean, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}