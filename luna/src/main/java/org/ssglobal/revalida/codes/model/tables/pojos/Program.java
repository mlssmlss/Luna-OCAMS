/*
 * This file is generated by jOOQ.
 */
package org.ssglobal.revalida.codes.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Program implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer programId;
    private Integer programCode;
    private String programTitle;
    private String major;

    public Program() {}

    public Program(Program value) {
        this.programId = value.programId;
        this.programCode = value.programCode;
        this.programTitle = value.programTitle;
        this.major = value.major;
    }

    public Program(
        Integer programId,
        Integer programCode,
        String programTitle,
        String major
    ) {
        this.programId = programId;
        this.programCode = programCode;
        this.programTitle = programTitle;
        this.major = major;
    }

    /**
     * Getter for <code>public.program.program_id</code>.
     */
    public Integer getProgramId() {
        return this.programId;
    }

    /**
     * Setter for <code>public.program.program_id</code>.
     */
    public Program setProgramId(Integer programId) {
        this.programId = programId;
        return this;
    }

    /**
     * Getter for <code>public.program.program_code</code>.
     */
    public Integer getProgramCode() {
        return this.programCode;
    }

    /**
     * Setter for <code>public.program.program_code</code>.
     */
    public Program setProgramCode(Integer programCode) {
        this.programCode = programCode;
        return this;
    }

    /**
     * Getter for <code>public.program.program_title</code>.
     */
    public String getProgramTitle() {
        return this.programTitle;
    }

    /**
     * Setter for <code>public.program.program_title</code>.
     */
    public Program setProgramTitle(String programTitle) {
        this.programTitle = programTitle;
        return this;
    }

    /**
     * Getter for <code>public.program.major</code>.
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * Setter for <code>public.program.major</code>.
     */
    public Program setMajor(String major) {
        this.major = major;
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
        final Program other = (Program) obj;
        if (this.programId == null) {
            if (other.programId != null)
                return false;
        }
        else if (!this.programId.equals(other.programId))
            return false;
        if (this.programCode == null) {
            if (other.programCode != null)
                return false;
        }
        else if (!this.programCode.equals(other.programCode))
            return false;
        if (this.programTitle == null) {
            if (other.programTitle != null)
                return false;
        }
        else if (!this.programTitle.equals(other.programTitle))
            return false;
        if (this.major == null) {
            if (other.major != null)
                return false;
        }
        else if (!this.major.equals(other.major))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.programId == null) ? 0 : this.programId.hashCode());
        result = prime * result + ((this.programCode == null) ? 0 : this.programCode.hashCode());
        result = prime * result + ((this.programTitle == null) ? 0 : this.programTitle.hashCode());
        result = prime * result + ((this.major == null) ? 0 : this.major.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Program (");

        sb.append(programId);
        sb.append(", ").append(programCode);
        sb.append(", ").append(programTitle);
        sb.append(", ").append(major);

        sb.append(")");
        return sb.toString();
    }
}