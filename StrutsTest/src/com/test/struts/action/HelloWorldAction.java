package com.test.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.test.struts.form.HelloWorldForm;



public class HelloWorldAction extends Action {

	  private String name;
	  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HelloWorldForm hwForm = (HelloWorldForm) form;
		hwForm.setMessage("Hello World Sumeet....");
		return mapping.findForward("success");
		
		}
}
