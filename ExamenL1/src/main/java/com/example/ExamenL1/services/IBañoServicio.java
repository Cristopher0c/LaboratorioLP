package com.example.ExamenL1.services;

import java.util.List;
import com.example.ExamenL1.model.Baño;

public interface IBañoServicio {
	List<Baño> GetAllBaño();
	Baño saveBañ(Baño entity);
	Baño findBañById(int id);
	Baño updateBañ(int id, Baño entity);
	void deleteBañ(int id);
}
