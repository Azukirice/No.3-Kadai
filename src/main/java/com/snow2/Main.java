package com.snow2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SkiSlope skiSlope1 = new SkiSlope(4000, 11, 11, 20);
        SkiSlope skiSlope2 = new SkiSlope(3700, 5, 5, 15);
        SkiSlope skiSlope3 = new SkiSlope(2800, 13, 5, 8);
        SkiSlope skiSlope4 = new SkiSlope(2500, 7, 6, 12);

        Map<String, SkiSlope> skiResort = new HashMap<>();
        skiResort.put("ハチ高原", skiSlope1);
        skiResort.put("瑞穂ハイランド", skiSlope2);
        skiResort.put("芸北国際スキー場", skiSlope3);
        skiResort.put("恐羅漢スキー場", skiSlope4);

//      入力したスキー場の詳細を表示する
        System.out.println("ハチ高原 瑞穂ハイランド 芸北国際スキー場 恐羅漢スキー場");
        System.out.println("スキー場の名前を入力してください");

        String resortName = new java.util.Scanner(System.in).nextLine();
        for (String key : skiResort.keySet()) {
            if (key.equals(resortName)) {
                SkiSlope s = skiResort.get(key);
                System.out.print("最長滑走距離" + s.getFullLength() + "m、" + s.getCourse() + "コース、");
                System.out.println("リフト数" + s.getLift() + "基、" + "パークアイテム数" + s.getParkItem());
                System.out.println("");
            }
        }

//      利用人数をintで入力する例外処理
        System.out.println("ゲストハウスの利用人数を入力してください");
        try {
            int guest = new java.util.Scanner(System.in).nextInt();
            System.out.println(guest + "人で登録します");
        } catch (Exception e) {
            System.out.println("数字で入力してください");
        } finally {
            System.out.println("終了します");
        }
    }
}