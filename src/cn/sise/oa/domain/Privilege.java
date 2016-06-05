package cn.sise.oa.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 系统权限详细
 * @author yzh
 *
 */
public class Privilege implements java.io.Serializable {
	private Integer id;
	private String url;
	private String name; // 权限名称
	
	private Set<Role> roles = new HashSet<Role>();
	private Privilege parent; // 上级权限
	private Set<Privilege> children = new HashSet<Privilege>(); // 下级权限

	public Privilege() {
	}

	public Privilege(String name, String url, Privilege parent) {
		this.name = name;
		this.url = url;
		this.parent = parent;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Privilege getParent() {
		return parent;
	}

	public void setParent(Privilege parent) {
		this.parent = parent;
	}

	public Set<Privilege> getChildren() {
		return children;
	}

	public void setChildren(Set<Privilege> children) {
		this.children = children;
	}

}
