package com.shang.test.day02;

import java.util.*;
import java.util.stream.IntStream;

public class Exam {
    /*
    *   1，写一个单列
    *   2，按id查询创建时间最新的数据
    *   3，输入字符串，例如aaaabbbcc输出为a43c2
    * */
    public static void main(String[] args) {

        int []arr = {1,2,3,4,0};
//        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.size());
        System.out.println(list.get(0));

        String a = "123";
        String b = "123";

        System.out.println(a==b);
        System.out.println(a.equals(b));

        Map<String, String> map = new HashMap<>();
        map.put("123","abc");
        System.out.println(map.put("123", "efgl"));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //1,测试单列
        Singleton lazyInstance = Singleton.getLazyInstance();
        Singleton hungerInstance = Singleton.getHungerInstance();
        Singleton innerClassInstance = Singleton.getInnerClassInstance();

        System.out.println(lazyInstance);
        System.out.println(hungerInstance);
        System.out.println(innerClassInstance);

        //2,按id查询创建时间最短的数据  SQL语句：select *(?,?,?,?) from table_name where id = ? ordery by increate_time limit 1

        //3,输入字符串，按规则打印字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入测试字符串：");
        String str = scanner.nextLine();
        String pressStr = pressStr(str);

        System.out.println("规则校验后的字符为：");
        System.out.println(pressStr);
    }

    private static String pressStr(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++ ){
            if(i + 1 < chars.length && chars[i] == chars[i + 1]){
                count ++;
            } else if (count == 1) {
                sb.append(chars[i]);
            }else {
                sb.append(chars[i]);
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
