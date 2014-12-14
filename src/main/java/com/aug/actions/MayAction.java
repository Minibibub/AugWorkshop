package com.aug.actions;

import java.util.List;

import com.aug.entities.may.May;
import com.aug.services.may.MayService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

@ResultPath(value = "/")
public class MayAction extends ActionSupport implements BaseAction {

	@Autowired
	private MayService mayservice;
	private May may;
	private List<May> mays;
	public int id;
	private String name;

	public MayService getMayservice() {
		return mayservice;
	}

	public void setMayservice(MayService mayservice) {
		this.mayservice = mayservice;
	}

	public May getMay() {
		return may;
	}

	public void setMay(May may) {
		this.may = may;
	}

	public List<May> getMays() {
		return mays;
	}

	public void setMays(List<May> mays) {
		this.mays = mays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	@Action(value = "initAddMay", results = { @Result(name = "input", location = "pages/may/addmay.jsp") })
	public String initCreate() {
		return INPUT;
	}

	@Override
	@Action(value = "initlistMay", results = { @Result(name = "input", location = "pages/may/lisallmay.jsp") })
	public String initList() {
		mays = mayservice.findAllMay();
		return INPUT;
	}

	@Override
	@Action(value = "initUpdateMay", results = { @Result(name = "input", location = "pages/may/updatemay.jsp") })
	public String initUpdate() {
		may = mayservice.findById(id);
		return INPUT;
	}

	@Override
	public String initDelete() {
		return null;
	}

	@Override
	@Action(value = "addmay", results = { @Result(name = "success", location = "ListAllMay", type = "redirect") })
	public String create() {
		mayservice.save(may);
		return SUCCESS;
	}

	@Override
	@Action(value = "ListAllMay", results = { @Result(name = "success", location = "pages/may/listallmay.jsp") })
	public String list() {
		mays = mayservice.findAllMay();
		return SUCCESS;
	}

	@Override
	@Action(value = "updatemay", results = { @Result(name = "success", location = "ListAllMay", type = "redirect") })
	public String update() {
		mayservice.update(may);
		return SUCCESS;
	}

	@Override
	@Action(value = "deleteMay", results = {
			@Result(name = "input", location = "ListAllMay", type = "redirect"),
			@Result(name = "success", location = "ListAllMay", type = "redirect") })
	public String delete() {
		if (mayservice.deleteMayById(id))
			return SUCCESS;
		return INPUT;
	}

	@Override
	@Action(value = "findmay", results = { @Result(name = "success", location = "pages/may/findbynamemay.jsp") })
	public String search() {
		if (mayservice.search(name) != null) {
			mays = mayservice.search(name);
			return "success";
		}
		return null;
	}

}
