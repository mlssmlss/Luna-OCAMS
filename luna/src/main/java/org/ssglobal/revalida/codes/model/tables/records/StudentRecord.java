/*
 * This file is generated by jOOQ.
 */
package org.ssglobal.revalida.codes.model.tables.records;


import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;
import org.ssglobal.revalida.codes.model.tables.Student;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record15<Integer, Integer, String, String, String, String, String, LocalDate, String, Integer, Integer, String, Boolean, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.student.student_id</code>.
     */
    public StudentRecord setStudentId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.student.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.student.student_number</code>.
     */
    public StudentRecord setStudentNumber(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.student.student_number</code>.
     */
    public Integer getStudentNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.student.program</code>.
     */
    public StudentRecord setProgram(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.student.program</code>.
     */
    public String getProgram() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.student.password</code>.
     */
    public StudentRecord setPassword(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.student.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.student.firstname</code>.
     */
    public StudentRecord setFirstname(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.student.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.student.middlename</code>.
     */
    public StudentRecord setMiddlename(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.student.middlename</code>.
     */
    public String getMiddlename() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.student.lastname</code>.
     */
    public StudentRecord setLastname(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.student.lastname</code>.
     */
    public String getLastname() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.student.birthdate</code>.
     */
    public StudentRecord setBirthdate(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.student.birthdate</code>.
     */
    public LocalDate getBirthdate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>public.student.semester</code>.
     */
    public StudentRecord setSemester(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.student.semester</code>.
     */
    public String getSemester() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.student.year_level</code>.
     */
    public StudentRecord setYearLevel(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.student.year_level</code>.
     */
    public Integer getYearLevel() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.student.academic_level</code>.
     */
    public StudentRecord setAcademicLevel(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.student.academic_level</code>.
     */
    public Integer getAcademicLevel() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.student.status</code>.
     */
    public StudentRecord setStatus(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.student.status</code>.
     */
    public String getStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.student.active_deactive</code>.
     */
    public StudentRecord setActiveDeactive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.student.active_deactive</code>.
     */
    public Boolean getActiveDeactive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.student.subject</code>.
     */
    public StudentRecord setSubject(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.student.subject</code>.
     */
    public String getSubject() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.student.grades</code>.
     */
    public StudentRecord setGrades(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.student.grades</code>.
     */
    public Integer getGrades() {
        return (Integer) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, Integer, String, String, String, String, String, LocalDate, String, Integer, Integer, String, Boolean, String, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Integer, Integer, String, String, String, String, String, LocalDate, String, Integer, Integer, String, Boolean, String, Integer> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Student.STUDENT.STUDENT_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Student.STUDENT.STUDENT_NUMBER;
    }

    @Override
    public Field<String> field3() {
        return Student.STUDENT.PROGRAM;
    }

    @Override
    public Field<String> field4() {
        return Student.STUDENT.PASSWORD;
    }

    @Override
    public Field<String> field5() {
        return Student.STUDENT.FIRSTNAME;
    }

    @Override
    public Field<String> field6() {
        return Student.STUDENT.MIDDLENAME;
    }

    @Override
    public Field<String> field7() {
        return Student.STUDENT.LASTNAME;
    }

    @Override
    public Field<LocalDate> field8() {
        return Student.STUDENT.BIRTHDATE;
    }

    @Override
    public Field<String> field9() {
        return Student.STUDENT.SEMESTER;
    }

    @Override
    public Field<Integer> field10() {
        return Student.STUDENT.YEAR_LEVEL;
    }

    @Override
    public Field<Integer> field11() {
        return Student.STUDENT.ACADEMIC_LEVEL;
    }

    @Override
    public Field<String> field12() {
        return Student.STUDENT.STATUS;
    }

    @Override
    public Field<Boolean> field13() {
        return Student.STUDENT.ACTIVE_DEACTIVE;
    }

    @Override
    public Field<String> field14() {
        return Student.STUDENT.SUBJECT;
    }

    @Override
    public Field<Integer> field15() {
        return Student.STUDENT.GRADES;
    }

    @Override
    public Integer component1() {
        return getStudentId();
    }

    @Override
    public Integer component2() {
        return getStudentNumber();
    }

    @Override
    public String component3() {
        return getProgram();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public String component5() {
        return getFirstname();
    }

    @Override
    public String component6() {
        return getMiddlename();
    }

    @Override
    public String component7() {
        return getLastname();
    }

    @Override
    public LocalDate component8() {
        return getBirthdate();
    }

    @Override
    public String component9() {
        return getSemester();
    }

    @Override
    public Integer component10() {
        return getYearLevel();
    }

    @Override
    public Integer component11() {
        return getAcademicLevel();
    }

    @Override
    public String component12() {
        return getStatus();
    }

    @Override
    public Boolean component13() {
        return getActiveDeactive();
    }

    @Override
    public String component14() {
        return getSubject();
    }

    @Override
    public Integer component15() {
        return getGrades();
    }

    @Override
    public Integer value1() {
        return getStudentId();
    }

    @Override
    public Integer value2() {
        return getStudentNumber();
    }

    @Override
    public String value3() {
        return getProgram();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public String value5() {
        return getFirstname();
    }

    @Override
    public String value6() {
        return getMiddlename();
    }

    @Override
    public String value7() {
        return getLastname();
    }

    @Override
    public LocalDate value8() {
        return getBirthdate();
    }

    @Override
    public String value9() {
        return getSemester();
    }

    @Override
    public Integer value10() {
        return getYearLevel();
    }

    @Override
    public Integer value11() {
        return getAcademicLevel();
    }

    @Override
    public String value12() {
        return getStatus();
    }

    @Override
    public Boolean value13() {
        return getActiveDeactive();
    }

    @Override
    public String value14() {
        return getSubject();
    }

    @Override
    public Integer value15() {
        return getGrades();
    }

    @Override
    public StudentRecord value1(Integer value) {
        setStudentId(value);
        return this;
    }

    @Override
    public StudentRecord value2(Integer value) {
        setStudentNumber(value);
        return this;
    }

    @Override
    public StudentRecord value3(String value) {
        setProgram(value);
        return this;
    }

    @Override
    public StudentRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public StudentRecord value5(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public StudentRecord value6(String value) {
        setMiddlename(value);
        return this;
    }

    @Override
    public StudentRecord value7(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public StudentRecord value8(LocalDate value) {
        setBirthdate(value);
        return this;
    }

    @Override
    public StudentRecord value9(String value) {
        setSemester(value);
        return this;
    }

    @Override
    public StudentRecord value10(Integer value) {
        setYearLevel(value);
        return this;
    }

    @Override
    public StudentRecord value11(Integer value) {
        setAcademicLevel(value);
        return this;
    }

    @Override
    public StudentRecord value12(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public StudentRecord value13(Boolean value) {
        setActiveDeactive(value);
        return this;
    }

    @Override
    public StudentRecord value14(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public StudentRecord value15(Integer value) {
        setGrades(value);
        return this;
    }

    @Override
    public StudentRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, LocalDate value8, String value9, Integer value10, Integer value11, String value12, Boolean value13, String value14, Integer value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Integer studentId, Integer studentNumber, String program, String password, String firstname, String middlename, String lastname, LocalDate birthdate, String semester, Integer yearLevel, Integer academicLevel, String status, Boolean activeDeactive, String subject, Integer grades) {
        super(Student.STUDENT);

        setStudentId(studentId);
        setStudentNumber(studentNumber);
        setProgram(program);
        setPassword(password);
        setFirstname(firstname);
        setMiddlename(middlename);
        setLastname(lastname);
        setBirthdate(birthdate);
        setSemester(semester);
        setYearLevel(yearLevel);
        setAcademicLevel(academicLevel);
        setStatus(status);
        setActiveDeactive(activeDeactive);
        setSubject(subject);
        setGrades(grades);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(org.ssglobal.revalida.codes.model.tables.pojos.Student value) {
        super(Student.STUDENT);

        if (value != null) {
            setStudentId(value.getStudentId());
            setStudentNumber(value.getStudentNumber());
            setProgram(value.getProgram());
            setPassword(value.getPassword());
            setFirstname(value.getFirstname());
            setMiddlename(value.getMiddlename());
            setLastname(value.getLastname());
            setBirthdate(value.getBirthdate());
            setSemester(value.getSemester());
            setYearLevel(value.getYearLevel());
            setAcademicLevel(value.getAcademicLevel());
            setStatus(value.getStatus());
            setActiveDeactive(value.getActiveDeactive());
            setSubject(value.getSubject());
            setGrades(value.getGrades());
        }
    }
}