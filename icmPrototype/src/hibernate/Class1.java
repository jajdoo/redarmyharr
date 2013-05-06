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
public class Class1 implements Serializable {
	public Class1() {
	}
	
	public static Class1 loadClass1ByORMID(int id1) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass1ByORMID(session, id1);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 getClass1ByORMID(int id1) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return getClass1ByORMID(session, id1);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 loadClass1ByORMID(int id1, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass1ByORMID(session, id1, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 getClass1ByORMID(int id1, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return getClass1ByORMID(session, id1, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 loadClass1ByORMID(PersistentSession session, int id1) throws PersistentException {
		try {
			return (Class1) session.load(hibernate.Class1.class, new Integer(id1));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 getClass1ByORMID(PersistentSession session, int id1) throws PersistentException {
		try {
			return (Class1) session.get(hibernate.Class1.class, new Integer(id1));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 loadClass1ByORMID(PersistentSession session, int id1, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Class1) session.load(hibernate.Class1.class, new Integer(id1), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 getClass1ByORMID(PersistentSession session, int id1, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Class1) session.get(hibernate.Class1.class, new Integer(id1), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClass1(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return queryClass1(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClass1(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return queryClass1(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1[] listClass1ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return listClass1ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1[] listClass1ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return listClass1ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClass1(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class1 as Class1");
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
	
	public static List queryClass1(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class1 as Class1");
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
	
	public static Class1[] listClass1ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClass1(session, condition, orderBy);
			return (Class1[]) list.toArray(new Class1[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1[] listClass1ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClass1(session, condition, orderBy, lockMode);
			return (Class1[]) list.toArray(new Class1[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 loadClass1ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass1ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 loadClass1ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return loadClass1ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Class1 loadClass1ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Class1[] class1s = listClass1ByQuery(session, condition, orderBy);
		if (class1s != null && class1s.length > 0)
			return class1s[0];
		else
			return null;
	}
	
	public static Class1 loadClass1ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Class1[] class1s = listClass1ByQuery(session, condition, orderBy, lockMode);
		if (class1s != null && class1s.length > 0)
			return class1s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClass1ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return iterateClass1ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClass1ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.ProtoPersistentManager.instance().getSession();
			return iterateClass1ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClass1ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class1 as Class1");
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
	
	public static java.util.Iterator iterateClass1ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hibernate.Class1 as Class1");
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
	
	public static Class1 loadClass1ByCriteria(Class1Criteria class1Criteria) {
		Class1[] class1s = listClass1ByCriteria(class1Criteria);
		if(class1s == null || class1s.length == 0) {
			return null;
		}
		return class1s[0];
	}
	
	public static Class1[] listClass1ByCriteria(Class1Criteria class1Criteria) {
		return class1Criteria.listClass1();
	}
	
	public static Class1 createClass1() {
		return new hibernate.Class1();
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
	
	private int id1;
	
	private String text;
	
	private void setId1(int value) {
		this.id1 = value;
	}
	
	public int getId1() {
		return id1;
	}
	
	public int getORMID() {
		return getId1();
	}
	
	public void setText(String value) {
		this.text = value;
	}
	
	public String getText() {
		return text;
	}
	
	public String toString() {
		return String.valueOf(getId1());
	}
	
}
