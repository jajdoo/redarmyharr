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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Class1DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id1;
	public final StringExpression text;
	
	public Class1DetachedCriteria() {
		super(hibernate.Class1.class, hibernate.Class1Criteria.class);
		id1 = new IntegerExpression("id1", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public Class1DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, hibernate.Class1Criteria.class);
		id1 = new IntegerExpression("id1", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
	}
	
	public Class2DetachedCriteria createChildrenCriteria() {
		return new Class2DetachedCriteria(createCriteria("ORM_Children"));
	}
	
	public Class1 uniqueClass1(PersistentSession session) {
		return (Class1) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Class1[] listClass1(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Class1[]) list.toArray(new Class1[list.size()]);
	}
}

