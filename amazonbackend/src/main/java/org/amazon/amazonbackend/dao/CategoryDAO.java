package org.amazon.amazonbackend.dao;

import java.util.List;

import org.amazon.amazonbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);
}
