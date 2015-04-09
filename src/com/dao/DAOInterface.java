package com.dao;

import com.model.Model;

public interface DAOInterface {
	public Model get(int id);
	public boolean update(Model model);
	public boolean delete(Model model);
	public boolean create(Model model);
}
