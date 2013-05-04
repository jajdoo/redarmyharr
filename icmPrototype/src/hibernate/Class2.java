/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Ort Braude College
 * License Type: Academic
 */
package hibernate;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

import java.io.Serializable;
public class Class2 implements Serializable {
	public Class2() {
	}
	
	public static Class2 loadClass2ByORMID(int id2) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass2ByORMID(session, id2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 getClass2ByORMID(int id2) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return getClass2ByORMID(session, id2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 loadClass2ByORMID(int id2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass2ByORMID(session, id2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 getClass2ByORMID(int id2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return getClass2ByORMID(session, id2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 loadClass2ByORMID(PersistentSession session, int id2) throws PersistentException {
		try {
			return (Class2) session.load(hibernate.Class2.class, new Integer(id2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 getClass2ByORMID(PersistentSession session, int id2) throws PersistentException {
		try {
			return (Class2) session.get(hibernate.Class2.class, new Integer(id2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 loadClass2ByORMID(PersistentSession session, int id2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Class2) session.load(hibernate.Class2.class, new Integer(id2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 getClass2ByORMID(PersistentSession session, int id2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Class2) session.get(hibernate.Class2.class, new Integer(id2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClass2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return queryClass2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClass2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return queryClass2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2[] listClass2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return listClass2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2[] listClass2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return listClass2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClass2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class2 as Class2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClass2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class2 as Class2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2[] listClass2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClass2(session, condition, orderBy);
			return (Class2[]) list.toArray(new Class2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2[] listClass2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClass2(session, condition, orderBy, lockMode);
			return (Class2[]) list.toArray(new Class2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 loadClass2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 loadClass2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 loadClass2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Class2[] class2s = listClass2ByQuery(session, condition, orderBy);
		if (class2s != null && class2s.length > 0)
			return class2s[0];
		else
			return null;
	}
	
	public static Class2 loadClass2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Class2[] class2s = listClass2ByQuery(session, condition, orderBy, lockMode);
		if (class2s != null && class2s.length > 0)
			return class2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClass2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return iterateClass2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClass2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return iterateClass2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClass2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class2 as Class2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClass2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class2 as Class2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class2 loadClass2ByCriteria(Class2Criteria class2Criteria) {
		Class2[] class2s = listClass2ByCriteria(class2Criteria);
		if(class2s == null || class2s.length == 0) {
			return null;
		}
		return class2s[0];
	}
	
	public static Class2[] listClass2ByCriteria(Class2Criteria class2Criteria) {
		return class2Criteria.listClass2();
	}
	
	public static Class2 createClass2() {
		return new hibernate.Class2();
	}
	
	public boolean save() throws PersistentException {
		try {
			hibernate.ProtoPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			hibernate.ProtoPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			hibernate.ProtoPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			hibernate.ProtoPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getParent() != null) {
				getParent().children.remove(this);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getParent() != null) {
				getParent().children.remove(this);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == hibernate.ORMConstants.KEY_CLASS2_PARENT) {
			this.parent = (hibernate.Class1) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id2;
	
	private hibernate.Class1 parent;
	
	private float someNum;
	
	private void setId2(int value) {
		this.id2 = value;
	}
	
	public int getId2() {
		return id2;
	}
	
	public int getORMID() {
		return getId2();
	}
	
	public void setSomeNum(float value) {
		this.someNum = value;
	}
	
	public float getSomeNum() {
		return someNum;
	}
	
	public void setParent(hibernate.Class1 value) {
		if (parent != null) {
			parent.children.remove(this);
		}
		if (value != null) {
			value.children.add(this);
		}
	}
	
	public hibernate.Class1 getParent() {
		return parent;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Parent(hibernate.Class1 value) {
		this.parent = value;
	}
	
	private hibernate.Class1 getORM_Parent() {
		return parent;
	}
	
	public String toString() {
		return String.valueOf(getId2());
	}
	
}
