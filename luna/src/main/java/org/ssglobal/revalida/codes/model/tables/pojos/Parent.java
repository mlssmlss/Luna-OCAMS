/*
 * This file is generated by jOOQ.
 */
package org.ssglobal.revalida.codes.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer parentId;
    private Integer studentId;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String type;

    public Parent() {}

    public Parent(Parent value) {
        this.parentId = value.parentId;
        this.studentId = value.studentId;
        this.username = value.username;
        this.password = value.password;
        this.firstname = value.firstname;
        this.lastname = value.lastname;
        this.type = value.type;
    }

    public Parent(
        Integer parentId,
        Integer studentId,
        String username,
        String password,
        String firstname,
        String lastname,
        String type
    ) {
        this.parentId = parentId;
        this.studentId = studentId;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.type = type;
    }

    /**
     * Getter for <code>public.parent.parent_id</code>.
     */
    public Integer getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>public.parent.parent_id</code>.
     */
    public Parent setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>public.parent.student_id</code>.
     */
    public Integer getStudentId() {
        return this.studentId;
    }

    /**
     * Setter for <code>public.parent.student_id</code>.
     */
    public Parent setStudentId(Integer studentId) {
        this.studentId = studentId;
        return this;
    }

    /**
     * Getter for <code>public.parent.username</code>.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>public.parent.username</code>.
     */
    public Parent setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Getter for <code>public.parent.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>public.parent.password</code>.
     */
    public Parent setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>public.parent.firstname</code>.
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Setter for <code>public.parent.firstname</code>.
     */
    public Parent setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * Getter for <code>public.parent.lastname</code>.
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * Setter for <code>public.parent.lastname</code>.
     */
    public Parent setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * Getter for <code>public.parent.type</code>.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>public.parent.type</code>.
     */
    public Parent setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Parent other = (Parent) obj;
        if (this.parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!this.parentId.equals(other.parentId))
            return false;
        if (this.studentId == null) {
            if (other.studentId != null)
                return false;
        }
        else if (!this.studentId.equals(other.studentId))
            return false;
        if (this.username == null) {
            if (other.username != null)
                return false;
        }
        else if (!this.username.equals(other.username))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        if (this.firstname == null) {
            if (other.firstname != null)
                return false;
        }
        else if (!this.firstname.equals(other.firstname))
            return false;
        if (this.lastname == null) {
            if (other.lastname != null)
                return false;
        }
        else if (!this.lastname.equals(other.lastname))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
        result = prime * result + ((this.studentId == null) ? 0 : this.studentId.hashCode());
        result = prime * result + ((this.username == null) ? 0 : this.username.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.firstname == null) ? 0 : this.firstname.hashCode());
        result = prime * result + ((this.lastname == null) ? 0 : this.lastname.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Parent (");

        sb.append(parentId);
        sb.append(", ").append(studentId);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(firstname);
        sb.append(", ").append(lastname);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
