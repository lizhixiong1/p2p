package com.jinlong.model;

public class T1Fun {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t1_fun.id
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t1_fun.name
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t1_fun.url
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t1_fun.id
     *
     * @return the value of t1_fun.id
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    
    
    
    private Boolean isChecked;
    
    
    
    
    public Boolean getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(Boolean isChecked) {
		this.isChecked = isChecked;
	}

	public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t1_fun.id
     *
     * @param id the value for t1_fun.id
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t1_fun.name
     *
     * @return the value of t1_fun.name
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t1_fun.name
     *
     * @param name the value for t1_fun.name
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t1_fun.url
     *
     * @return the value of t1_fun.url
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t1_fun.url
     *
     * @param url the value for t1_fun.url
     *
     * @mbg.generated Tue Jan 30 21:27:03 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }

	@Override
	public String toString() {
		return "T1Fun [id=" + id + ", name=" + name + ", url=" + url + ", isChecked=" + isChecked + "]";
	}
    
    
}