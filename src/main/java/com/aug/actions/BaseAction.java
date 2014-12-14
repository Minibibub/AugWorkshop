package com.aug.actions;

public interface BaseAction {
    public String initCreate();
    public String initList();
    public String initUpdate();
    public String initDelete();
    public String create();
    public String list();
    public String update();
    public String delete();
    public String search();
}