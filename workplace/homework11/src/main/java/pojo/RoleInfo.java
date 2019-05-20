package pojo;

public class RoleInfo {
	private int rid ;
	private String rolename ;
	private String level_1 ;
	private int uid ;
	
	public RoleInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleInfo(int rid, String rolename, String level_1, int uid) {
		super();
		this.rid = rid;
		this.rolename = rolename;
		this.level_1 = level_1;
		this.uid = uid;
	}
	public RoleInfo( String rolename, String level_1) {
		super();
		this.rolename = rolename;
		this.level_1 = level_1;
	}
	public RoleInfo(int rid, String rolename, String level_1) {
		super();
		this.rid = rid;
		this.rolename = rolename;
		this.level_1 = level_1;
	}
	public RoleInfo( String rolename, String level_1, int uid) {
		super();	
		this.rolename = rolename;
		this.level_1 = level_1;
		this.uid = uid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getLevel_1() {
		return level_1;
	}
	public void setLevel_1(String level_1) {
		this.level_1 = level_1;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "RoleInfo [rid=" + rid + ", rolename=" + rolename + ", level_1=" + level_1 + ", uid=" + uid + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((level_1 == null) ? 0 : level_1.hashCode());
		result = prime * result + rid;
		result = prime * result + ((rolename == null) ? 0 : rolename.hashCode());
		result = prime * result + uid;
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
		RoleInfo other = (RoleInfo) obj;
		if (level_1 == null) {
			if (other.level_1 != null)
				return false;
		} else if (!level_1.equals(other.level_1))
			return false;
		if (rid != other.rid)
			return false;
		if (rolename == null) {
			if (other.rolename != null)
				return false;
		} else if (!rolename.equals(other.rolename))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	
}
