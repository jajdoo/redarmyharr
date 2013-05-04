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

public class Class2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id2;
	public final FloatExpression someNum;
	
	public Class2DetachedCriteria() {
		super(hibernate.Class2.class, hibernate.Class2Criteria.class);
		id2 = new IntegerExpression("id2", this.getDetachedCriteria());
		someNum = new FloatExpression("someNum", this.getDetachedCriteria());
	}
	
	public Class2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, hibernate.Class2Criteria.class);
		id2 = new IntegerExpression("id2", this.getDetachedCriteria());
		someNum = new FloatExpression("someNum", this.getDetachedCriteria());
	}
	
	public Class1DetachedCriteria createParentCriteria() {
		return new Class1DetachedCriteria(createCriteria("parent"));
	}
	
	public Class2 uniqueClass2(PersistentSession session) {
		return (Class2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Class2[] listClass2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Class2[]) list.toArray(new Class2[list.size()]);
	}
}

