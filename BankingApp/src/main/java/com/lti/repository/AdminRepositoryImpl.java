package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Admin;

@Repository
public class AdminRepositoryImpl implements AdminRepository {

	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public long save(Admin admin) {
		Admin a = em.merge(admin);
		return a.getAdminId();
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findByIdAndPassword(long adminId, String password) {
		return (Long) em
                .createQuery("select a.adminId from Admin a  where a.adminId = :aid and a.adminPassword = :pw")
                .setParameter("aid", adminId)
                .setParameter("pw", password)
                .getSingleResult();
	}

	@Override
	public boolean isAdminPresent(long adminId) {
		String jpql="select a from Admin a where a.adminId=:aid";
		TypedQuery<Admin> query =em.createQuery(jpql,Admin.class);
		query.setParameter("aid", adminId);
		Admin a=(Admin)query.getResultList().stream().findFirst().orElse(null);
		System.out.println(a);
		if(a==null)
			return false;
		return true;
		
		
	}

	@Override
	public Admin findById(long id) {
		return em.find(Admin.class, id);

	}

//	@Override
//	public List<Admin> findAll() {
//		return em.createQuery("select)
//		return null;
//	}

}
