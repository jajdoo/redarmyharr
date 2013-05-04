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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Class2Criteria extends AbstractORMCriteria {
	public final IntegerExpression id2;
	public final FloatExpression someNum;
	
	public Class2Criteria(Criteria criteria) {
		super(criteria);
		id2 = new IntegerExpression("id2", this);
		someNum = new FloatExpression("someNum", this);
	}
	
	public Class2Criteria(PersistentSession session) {
		this(session.createCriteria(Class2.class));
	}
	
	public Class2Criteria() throws PersistentException {
		this(hibernate.ProtoPersistentManager.instance().getSession());
	}
	
	public Class1Criteria createParentCriteria() {
		return new Class1Criteria(createCriteria("parent"));
	}
	
	public Class2 uniqueClass2() {
		return (Class2) super.uniqueResult();
	}
	
	public Class2[] listClass2() {
		java.util.List list = super.list();
		return (Class2[]) list.toArray(new Class2[list.size()]);
	}
}

