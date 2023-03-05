
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ExampleMap {

    public static void main(String[] args) {
        List<Map<String,Object>> a1 = new ArrayList<>();
        Map<String, Object> a1_1 = new HashMap<>();
        a1_1.put("user_no", 1);
        a1_1.put("name", "name1");
        a1.add(a1_1);

        Map<String, Object> a1_2 = new HashMap<>();
        a1_2.put("user_no", 2);
        a1_2.put("name", "namename");
        a1.add(a1_2);

        List<Map<String,Object>> b1 = new ArrayList<>();
        Map<String, Object> b1_1 = new HashMap<>();
        b1_1.put("user_no", 1);
        b1_1.put("name", "name1");
        b1.add(b1_1);

        Map<String, Object> b1_2 = new HashMap<>();
        b1_2.put("user_no", 2);
        b1_2.put("name", "dd");
        b1.add(b1_2);

        Map<String, Object> b1_3 = new HashMap<>();
        b1_3.put("user_no", 3);
        b1_3.put("name", "hajin");
        b1.add(b1_3);

        List<Map<String,Object>> insertList = new ArrayList<>();
        List<Map<String,Object>> updateList = new ArrayList<>();

        List<Integer> bUserNoList = new ArrayList<>();
        for (Map<String, Object> bMap : b1) {
            int bUserNo = (int) bMap.get("user_no");
            bUserNoList.add(bUserNo);
        }

        for (Map<String, Object> aMap : a1) {
            int aUserNo = (int) aMap.get("user_no");
            if (!bUserNoList.contains(aUserNo)) {
                for (Map<String, Object> bMap : b1) {
                    if ((int) bMap.get("user_no") == aUserNo) {
                        insertList.add(bMap);
                    }
                }
            } else {
                updateList.add(aMap);
            }
        }

        System.out.println(insertList);
        System.out.println(updateList);

//        for (Map<String, Object> aMap : a1) {
//            int aUserNo = (int) aMap.get("user_no");
//            List<Integer> bUserNoList = new ArrayList<>();
//            for (Map<String, Object> bMap : b1) {
//                int bUserNo = (int) bMap.get("user_no");
//                bUserNoList.add(bUserNo);
//            }
//            if (bUserNoList.contains(aUserNo)) {
//                for (Map<String, Object> bMap : b1) {
//                    if ((int) bMap.get("user_no") == aUserNo) {
//                        updateList.add(bMap);
//                        break;
//                    }
//                }
//               continue;
//            }else {
//                for (Map<String, Object> a1Map : a1) {
//                    if ((int) a1Map.get("user_no") == aUserNo) {
//                        insertList.add(a1Map);
//                        break;
//                    }
//                }
//            }
//        }
//
//        System.out.println(insertList);
//        System.out.println(updateList);
    }
}
