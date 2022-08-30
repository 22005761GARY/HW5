package listtest;

import java.util.*;

public class list {

    public static void main(String args[]){
        List<Map<String, String>> animalList = new ArrayList<>();
        Map<String, String> animalMap = new HashMap<>();
        animalMap.put("shark", "ocean");
        animalMap.put("bear", "land");
        animalMap.put("moose", "land");
        animalMap.put("frog", "swamp");
        animalMap.put("jelly fish", "ocean");
        animalMap.put("heron", "swamp");
        animalMap.put("whale", "ocean");
        animalList.add(animalMap);

        Map<String, List<String>> habitat = new HashMap<>();

        animalList.forEach(m -> {//m: animalMap
            m.forEach((key, value) -> {
                if (habitat.containsKey(value)==false) {
                    //若habitat中的Key不包含(value),則put一筆資料進habitat
                    //放入一個key為value, value為新建一個初始化的ArrayList
                    habitat.put(value, new ArrayList<>());
                }
                habitat.get(value).add(key);
            });
        });

//
        for(Map.Entry e : habitat.entrySet()) {
            System.out.println(e.getKey() + " : "+ e.getValue());
        }

            System.out.println();

            Map <String, String> capitalMap = new HashMap<>();
            capitalMap.put("USA","Washington");
            capitalMap.put("Japan","Tokyo");
            capitalMap.put("Thailand","Bangkok");
            capitalMap.put("UK","London");
            capitalMap.put("Australia","Canberra");
            capitalMap.put("Denmark","Copenhagen");
            capitalMap.put("Egypt","Cairo");
            capitalMap.put("Vietnam","Hanoi");
            capitalMap.put("Italy","Rome");
            capitalMap.put("Brazil","Brasilia");

            for(Map.Entry<String,String> e : capitalMap.entrySet()){
                System.out.println(e.getKey()+" : "+ e.getValue());
            }
        }
    }



