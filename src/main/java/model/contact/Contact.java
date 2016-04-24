package model.contact;

import java.io.Serializable;

/**
 * Main contact model
 * @author Alexandre Guyon
 *
 */
public class Contact implements Serializable{

	private static final long serialVersionUID = -1428400318163108843L;

	private String name;
	
	private String surname;
	
	private String nickname;
	
	private String email;
	
	private String mobileNumber;

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return this.nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
		result = prime * result + ((this.mobileNumber == null) ? 0 : this.mobileNumber.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.nickname == null) ? 0 : this.nickname.hashCode());
		result = prime * result + ((this.surname == null) ? 0 : this.surname.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (this.email == null) {
			if (other.email != null)
				return false;
		} else if (!this.email.equals(other.email))
			return false;
		if (this.mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!this.mobileNumber.equals(other.mobileNumber))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!this.nickname.equals(other.nickname))
			return false;
		if (this.surname == null) {
			if (other.surname != null)
				return false;
		} else if (!this.surname.equals(other.surname))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [name=" + this.name + ", surname=" + this.surname + ", nickname=" + this.nickname + ", email=" + this.email
				+ ", mobileNumber=" + this.mobileNumber + "]";
	}
	

}
