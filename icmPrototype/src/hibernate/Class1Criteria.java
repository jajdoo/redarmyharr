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

public class Class1Criteria extends AbstractORMCriteria {
	public final IntegerExpression id1;
	public final StringExpression text;
	
	public Class1Criteria(Criteria criteria) {
		super(criteria);
		id1 = new IntegerExpression("id1", this);
		text = new StringExpression("text", this);
	}
	
	public Class1Criteria(PersistentSession session) {
		this(session.createCriteria(Class1.class));
	}
	
	public Class1Criteria() throws PersistentException {
		this(hibernate.ProtoPersistentManager.instance().getSession());
	}
	
	public Class1 uniqueClass1() {
		return (Class1) super.uniqueResult();
	}
	
	public Class1[] listClass1() {
		java.util.List list = super.list();
		return (Class1[]) list.toArray(new Class1[list.size()]);
	}
}

