package jsftest;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;

	public String jsfOutcome() {
		return "jsfOutcome?faces-redirect=true";
	}

	public String managedBean() {
		return "managedBean?faces-redirect=true";
	}

	public String moveToHome() {
		return "home?faces-redirect=true";
	}
	
	public String moveToNavigation(){
		return "navigation?faces-redirect=true";
	}
	
	public String moveToTags(){
		return "tags?faces-redirect=true";
	}

	public String showPage() {
		if (pageId == null) {
			return "home?faces-redirect=true";
		}
		if (pageId.equals("1")) {
			return "page1?faces-redirect=true";
		} else if (pageId.equals("2")) {
			return "page2?faces-redirect=true";
		} else {
			return "home?faces-redirect=true";
		}
	}

	public String processPage1() {
		return "page";
	}

	public String processPage2() {
		return "page";
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
}
