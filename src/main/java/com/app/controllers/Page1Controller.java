package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.webstack.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.Page1;

@ManagedBean(name = "mbPage1")
@ViewScoped
public class Page1Controller extends JKManagedBeanWithOrmSupport<Page1> {

}