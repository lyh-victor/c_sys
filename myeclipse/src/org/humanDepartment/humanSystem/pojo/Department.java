
package org.humanDepartment.humanSystem.pojo;


/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable
{


	// Fields

	private Integer DId;
	private String DName;
	private Short DAmount;
	private String DDescription;


	// Constructors

	/** default constructor */
	public Department()
	{}

	/** minimal constructor */
	public Department(String DName, Short DAmount)
	{
		this.DName = DName;
		this.DAmount = DAmount;
	}

	/** full constructor */
	public Department(String DName, Short DAmount, String DDescription)
	{
		this.DName = DName;
		this.DAmount = DAmount;
		this.DDescription = DDescription;
	}


	// Property accessors

	public Integer getDId()
	{
		return this.DId;
	}

	public void setDId(Integer DId)
	{
		this.DId = DId;
	}

	public String getDName()
	{
		return this.DName;
	}

	public void setDName(String DName)
	{
		this.DName = DName;
	}

	public Short getDAmount()
	{
		return this.DAmount;
	}

	public void setDAmount(Short DAmount)
	{
		this.DAmount = DAmount;
	}

	public String getDDescription()
	{
		return this.DDescription;
	}

	public void setDDescription(String DDescription)
	{
		this.DDescription = DDescription;
	}


}
