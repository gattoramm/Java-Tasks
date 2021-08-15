package Collection.Set;

public class Employee
{
	private Integer id;
	private String firstname;
	private String lastName;
	private String department;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/*@Override
	public boolean equals(Object o) {
		if(o == null)
		{
			return false;
		}
		if (o == this)
		{
           return true;
        }
		if (getClass() != o.getClass())
		{
	        return false;
		}
		Employee e = (Employee) o;
		return (this.getId() == e.getId());
	}
	
	@Override
	public int hashCode() 
	{
		final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + getId();
	    return result;
	}*/
	
	
	/*@Override
	public int hashCode() 
	{
		final int PRIME = 31;
        return new HashCodeBuilder(getId()%2==0?getId()+1:getId(), PRIME).
            toHashCode();
    }

	@Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (o.getClass() != getClass())
            return false;
        Employee e = (Employee) o;
        return new EqualsBuilder().
            append(getId(), e.getId()).
            isEquals();
    }*/
	
	
}
