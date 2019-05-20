package pojo;

public class MenuInfo {
	private String id ;
	private String m_1 ;
	private String m_2 ;
	private String m_3 ;
	private String m_4 ;
	private String m_5 ;
	private String m_6 ;
	private String m_7 ;
	private String m_8 ;
	
	
	
	
	
	public MenuInfo(String id, String m_1, String m_2, String m_3, String m_4, String m_5, String m_6, String m_7) {
		super();
		this.id = id;
		this.m_1 = m_1;
		this.m_2 = m_2;
		this.m_3 = m_3;
		this.m_4 = m_4;
		this.m_5 = m_5;
		this.m_6 = m_6;
		this.m_7 = m_7;
	}

	public MenuInfo(String id, String m_1, String m_2, String m_3, String m_4, String m_5, String m_6) {
		super();
		this.id = id;
		this.m_1 = m_1;
		this.m_2 = m_2;
		this.m_3 = m_3;
		this.m_4 = m_4;
		this.m_5 = m_5;
		this.m_6 = m_6;
	}

	public MenuInfo(String id, String m_1, String m_2, String m_3, String m_4, String m_5) {
		super();
		this.id = id;
		this.m_1 = m_1;
		this.m_2 = m_2;
		this.m_3 = m_3;
		this.m_4 = m_4;
		this.m_5 = m_5;
	}

	public MenuInfo(String id, String m_1, String m_2, String m_3, String m_4) {
		super();
		this.id = id;
		this.m_1 = m_1;
		this.m_2 = m_2;
		this.m_3 = m_3;
		this.m_4 = m_4;
	}

	public MenuInfo(String id, String m_1, String m_2, String m_3) {
		super();
		this.id = id;
		this.m_1 = m_1;
		this.m_2 = m_2;
		this.m_3 = m_3;
	}

	public MenuInfo(String id, String m_1) {
		super();
		this.id = id;
		this.m_1 = m_1;
	}
	
	public MenuInfo(String id, String m_1, String m_2) {
		super();
		this.id = id;
		this.m_1 = m_1;
		this.m_2 = m_2;
	}

	@Override
	public String toString() {
		return "MenuInfo [id=" + id + ", m_1=" + m_1 + ", m_2=" + m_2 + ", m_3=" + m_3 + ", m_4=" + m_4 + ", m_5=" + m_5
				+ ", m_6=" + m_6 + ", m_7=" + m_7 + ", m_8=" + m_8 + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getM_1() {
		return m_1;
	}
	public void setM_1(String m_1) {
		this.m_1 = m_1;
	}
	public String getM_2() {
		return m_2;
	}
	public void setM_2(String m_2) {
		this.m_2 = m_2;
	}
	public String getM_3() {
		return m_3;
	}
	public void setM_3(String m_3) {
		this.m_3 = m_3;
	}
	public String getM_4() {
		return m_4;
	}
	public void setM_4(String m_4) {
		this.m_4 = m_4;
	}
	public String getM_5() {
		return m_5;
	}
	public void setM_5(String m_5) {
		this.m_5 = m_5;
	}
	public String getM_6() {
		return m_6;
	}
	public void setM_6(String m_6) {
		this.m_6 = m_6;
	}
	public String getM_7() {
		return m_7;
	}
	public void setM_7(String m_7) {
		this.m_7 = m_7;
	}
	public String getM_8() {
		return m_8;
	}
	public void setM_8(String m_8) {
		this.m_8 = m_8;
	}
	public MenuInfo(String id, String m_1, String m_2, String m_3, String m_4, String m_5, String m_6, String m_7,
			String m_8) {
		super();
		this.id = id;
		this.m_1 = m_1;
		this.m_2 = m_2;
		this.m_3 = m_3;
		this.m_4 = m_4;
		this.m_5 = m_5;
		this.m_6 = m_6;
		this.m_7 = m_7;
		this.m_8 = m_8;
	}
	public MenuInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((m_1 == null) ? 0 : m_1.hashCode());
		result = prime * result + ((m_2 == null) ? 0 : m_2.hashCode());
		result = prime * result + ((m_3 == null) ? 0 : m_3.hashCode());
		result = prime * result + ((m_4 == null) ? 0 : m_4.hashCode());
		result = prime * result + ((m_5 == null) ? 0 : m_5.hashCode());
		result = prime * result + ((m_6 == null) ? 0 : m_6.hashCode());
		result = prime * result + ((m_7 == null) ? 0 : m_7.hashCode());
		result = prime * result + ((m_8 == null) ? 0 : m_8.hashCode());
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
		MenuInfo other = (MenuInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (m_1 == null) {
			if (other.m_1 != null)
				return false;
		} else if (!m_1.equals(other.m_1))
			return false;
		if (m_2 == null) {
			if (other.m_2 != null)
				return false;
		} else if (!m_2.equals(other.m_2))
			return false;
		if (m_3 == null) {
			if (other.m_3 != null)
				return false;
		} else if (!m_3.equals(other.m_3))
			return false;
		if (m_4 == null) {
			if (other.m_4 != null)
				return false;
		} else if (!m_4.equals(other.m_4))
			return false;
		if (m_5 == null) {
			if (other.m_5 != null)
				return false;
		} else if (!m_5.equals(other.m_5))
			return false;
		if (m_6 == null) {
			if (other.m_6 != null)
				return false;
		} else if (!m_6.equals(other.m_6))
			return false;
		if (m_7 == null) {
			if (other.m_7 != null)
				return false;
		} else if (!m_7.equals(other.m_7))
			return false;
		if (m_8 == null) {
			if (other.m_8 != null)
				return false;
		} else if (!m_8.equals(other.m_8))
			return false;
		return true;
	}
	
	
	
}
