package micky;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

public class CollectionsTest {

	@Test
	public void testCollectionSingleton() {
		MyClass a = MyClass.newInstanceWithAAndB(1, 2);
		// 기본 Collections클래스에선 getType보다 그냥 리턴하는 객체 자체를 메서드 명으로 삼았다.
		List<MyClass> singleton = Collections.singletonList(a);
		
		assertEquals(a, singleton.get(0));
	}
	
}
