import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 예시로 a1과 b1 List<Map<String,Object>> 객체를 생성합니다.
        List<Map<String,Object>> a1 = new ArrayList<>();
        Map<String, Object> a1_1 = new HashMap<>();
        a1_1.put("user_no", 1);
        a1_1.put("value1", "value1_1");
        a1_1.put("value2", "value2_1");
        a1_1.put("value3", "value3_1");
        a1.add(a1_1);

        Map<String, Object> a1_2 = new HashMap<>();
        a1_2.put("user_no", 2);
        a1_2.put("value1", "value1_2");
        a1_2.put("value3", "value3_2");
        a1_2.put("value4", "value4_2");
        a1.add(a1_2);

        List<Map<String,Object>> b1 = new ArrayList<>();
        Map<String, Object> b1_1 = new HashMap<>();
        b1_1.put("user_no", 1);
        b1_1.put("value1", "value1_1");
        b1_1.put("value2", "value2_1");
        b1_1.put("value3", "value3_1");
        b1.add(b1_1);

        Map<String, Object> b1_2 = new HashMap<>();
        b1_2.put("user_no", 2);
        b1_2.put("value1", "value1_2");
        b1_2.put("value3", "value3_2");
        b1_2.put("value4", "value4_2");
        b1.add(b1_2);

        Map<String, Object> b1_3 = new HashMap<>();
        b1_3.put("user_no", 3);
        b1_3.put("value1", "value1_2");
        b1_3.put("value3", "value3_2");
        b1_3.put("value4", "value4_2");
        b1.add(b1_3);

        List<Map<String, Object>> insertList = new ArrayList<>();
        for (Map<String, Object> aMap : a1) {
            int aUserNo = (int) aMap.get("user_no");
            boolean isNewData = true;
            for (Map<String, Object> bMap : b1) {
                int bUserNo = (int) bMap.get("user_no");
                if (aUserNo == bUserNo) {
                    isNewData = false;
                    break;
                }
            }
            if (isNewData) {
                insertList.add(aMap);
            }
        }

        System.out.println("insert List:");
        for (Map<String, Object> map : insertList) {
            System.out.println(map);
        }

//        // a1의 각 HashMap을 순회하면서 b1 내부의 HashMap들과 비교합니다.
//        List<Map<String, Object>> insertList = new ArrayList<>();
//        List<Map<String, Object>> updateList = new ArrayList<>();
//
//        for (Map<String, Object> a1Map : a1) {
//            boolean isFound = false;
//
//            for (Map<String, Object> b1Map : b1) {
//                boolean isMatch = true;
//
//                for (Map.Entry<String, Object> a1Entry : a1Map.entrySet()) {
//                    String key = a1Entry.getKey();
//                    Object a1Value = a1Entry.getValue();
//                    Object b1Value = b1Map.get(key);
//
//                    if (b1Value == null || !a1Value.equals(b1Value)) {
//                        // a1과 b1의 key가 다르거나, 값이 다른 경우
//                        isMatch = false;
//                        break;
//                    }
//                }
//
//                if (isMatch) {
//                    // a1Map과 b1Map이 같은 경우
//                    isFound = true;
//                    updateList.add(a1Map);
//                    break;
//                }
//            }
//
//            if (!isFound) {
//                // a1Map이 b1 내부의 HashMap들과 모두 일치하지 않는 경우
//                insertList.add(a1Map);
//            }
//        }
//
//        // 결과 출력
//        System.out.println("Insert List:");
//        for (Map<String, Object> map : insertList) {
//            System.out.println(map);
//        }
//
//        System.out.println("Update List:");
//        for (Map<String, Object> map : updateList) {
//            System.out.println(map);
//        }



    }

}