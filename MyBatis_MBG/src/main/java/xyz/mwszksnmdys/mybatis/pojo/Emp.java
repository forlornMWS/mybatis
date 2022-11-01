package xyz.mwszksnmdys.mybatis.pojo;

public class Emp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.eid
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.emp_name
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.age
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.sex
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.email
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_emp.did
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    private Integer did;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.eid
     *
     * @return the value of t_emp.eid
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.eid
     *
     * @param eid the value for t_emp.eid
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.emp_name
     *
     * @return the value of t_emp.emp_name
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.emp_name
     *
     * @param empName the value for t_emp.emp_name
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.age
     *
     * @return the value of t_emp.age
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.age
     *
     * @param age the value for t_emp.age
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.sex
     *
     * @return the value of t_emp.sex
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.sex
     *
     * @param sex the value for t_emp.sex
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.email
     *
     * @return the value of t_emp.email
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.email
     *
     * @param email the value for t_emp.email
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_emp.did
     *
     * @return the value of t_emp.did
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_emp.did
     *
     * @param did the value for t_emp.did
     *
     * @mbggenerated Fri Oct 07 13:13:52 CST 2022
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    public Emp() {
    }

    public Emp(Integer eid, String empName, Integer age, String sex, String email, Integer did) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", did=" + did +
                '}';
    }
}