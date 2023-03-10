/*
 * This file is generated by jOOQ.
 */
package org.ssglobal.revalida.codes.model.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.ssglobal.revalida.codes.model.Keys;
import org.ssglobal.revalida.codes.model.Public;
import org.ssglobal.revalida.codes.model.tables.records.ProfessorLoadRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfessorLoad extends TableImpl<ProfessorLoadRecord> {

    private static final long serialVersionUID = -912831155;

    /**
     * The reference instance of <code>public.professor_load</code>
     */
    public static final ProfessorLoad PROFESSOR_LOAD = new ProfessorLoad();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProfessorLoadRecord> getRecordType() {
        return ProfessorLoadRecord.class;
    }

    /**
     * The column <code>public.professor_load.load_id</code>.
     */
    public final TableField<ProfessorLoadRecord, Integer> LOAD_ID = createField(DSL.name("load_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.professor_load.professor_id</code>.
     */
    public final TableField<ProfessorLoadRecord, Integer> PROFESSOR_ID = createField(DSL.name("professor_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.professor_load.course_title</code>.
     */
    public final TableField<ProfessorLoadRecord, String> COURSE_TITLE = createField(DSL.name("course_title"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.professor_load.section</code>.
     */
    public final TableField<ProfessorLoadRecord, Integer> SECTION = createField(DSL.name("section"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.professor_load.year_level</code>.
     */
    public final TableField<ProfessorLoadRecord, Integer> YEAR_LEVEL = createField(DSL.name("year_level"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.professor_load</code> table reference
     */
    public ProfessorLoad() {
        this(DSL.name("professor_load"), null);
    }

    /**
     * Create an aliased <code>public.professor_load</code> table reference
     */
    public ProfessorLoad(String alias) {
        this(DSL.name(alias), PROFESSOR_LOAD);
    }

    /**
     * Create an aliased <code>public.professor_load</code> table reference
     */
    public ProfessorLoad(Name alias) {
        this(alias, PROFESSOR_LOAD);
    }

    private ProfessorLoad(Name alias, Table<ProfessorLoadRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProfessorLoad(Name alias, Table<ProfessorLoadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ProfessorLoad(Table<O> child, ForeignKey<O, ProfessorLoadRecord> key) {
        super(child, key, PROFESSOR_LOAD);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<ProfessorLoadRecord> getPrimaryKey() {
        return Keys.PROFESSOR_LOAD_PKEY;
    }

    @Override
    public List<UniqueKey<ProfessorLoadRecord>> getKeys() {
        return Arrays.<UniqueKey<ProfessorLoadRecord>>asList(Keys.PROFESSOR_LOAD_PKEY);
    }

    @Override
    public List<ForeignKey<ProfessorLoadRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProfessorLoadRecord, ?>>asList(Keys.PROFESSOR_LOAD__PROFESSOR_LOAD_PROFESSOR_ID_FKEY);
    }

    public Professor professor() {
        return new Professor(this, Keys.PROFESSOR_LOAD__PROFESSOR_LOAD_PROFESSOR_ID_FKEY);
    }

    @Override
    public ProfessorLoad as(String alias) {
        return new ProfessorLoad(DSL.name(alias), this);
    }

    @Override
    public ProfessorLoad as(Name alias) {
        return new ProfessorLoad(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProfessorLoad rename(String name) {
        return new ProfessorLoad(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProfessorLoad rename(Name name) {
        return new ProfessorLoad(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
