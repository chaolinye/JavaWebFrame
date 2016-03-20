package scut.inventor.dao;

import java.io.Serializable;
import java.util.List;


public interface BaseDao<T> {


	public Serializable save(T o);


	public void delete(T o);


	public void update(T o);


	public void saveOrUpdate(T o);


	public List<T> find(String hql);


	public List<T> find(String hql, Object[] param);


	public List<T> find(String hql, List<Object> param);


	public List<T> find(String hql, Object[] param, Integer page, Integer rows);


	public List<T> find(String hql, List<Object> param, Integer page, Integer rows);


	public T get(Class<T> c, Serializable id);


	public T get(String hql, Object[] param);


	public T get(String hql, List<Object> param);


	public Long count(String hql);


	public Long count(String hql, Object[] param);


	public Long count(String hql, List<Object> param);


	public Integer executeHql(String hql);


	public Integer executeHql(String hql, Object[] param);


	public Integer executeHql(String hql, List<Object> param);

}
