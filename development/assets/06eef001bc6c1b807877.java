package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapBasic {
	/*
	 * Map - Key와 Value가 한 쌍(Entry)으로 존재하는 자료구조
	 * 즉, Key와 Value가 대응(mapping)되어 있는 구조
	 * 주로 메뉴판의 메뉴와 가격 또는 수량과 같이 대응되는 구조가 필요할때 사용
	 */

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("권범석", "늦잠");
		hashMap.put("유용수", "늦잠");
		hashMap.put("주영민", "늦잠");
		
		System.out.println(hashMap);
		
		// 동일한 Key사용시 이전 값 삭제되는 현상 발생.
		// 논리적 오류
		hashMap.put("주영민", "개인사정");
		
		// 기존의 Key에 대응되는 Value 변경시 replace() 사용.
		hashMap.replace("유용수", "교통체증");
		System.out.println(hashMap);
		
		// Map에 존재하지 않는 Key의 경우 아무일도 발생하지 않는다.
		hashMap.replace("이하민", "나이이슈");
		System.out.println(hashMap);
		
		if(hashMap.containsKey("권범석")) {
			hashMap.remove("권범석");
		}else {
			System.out.println("지각 목록에 존재하지 않습니다.");
		}
		
		// Map은 Set(컬렉션) 자료형으로 변경하여 주로 사용
		for (String key : hashMap.keySet()) {
			System.out.println(key + " : " + hashMap.get(key));
		}
		
		Set<Entry<String,String>> s = hashMap.entrySet();
		for (Entry<String, String> entry : s) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
