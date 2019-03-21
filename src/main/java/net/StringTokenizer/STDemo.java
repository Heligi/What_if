package net.StringTokenizer;

import java.util.*;

public class STDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());

        long start = System.currentTimeMillis();
        System.out.println("Start = " + start);

        t1.start();
        t2.start();

        long end = System.currentTimeMillis();
        System.out.println("Finish main = " + end);
    }

    public static class T1 implements Runnable {
        @Override
        public void run() {
//            int count = 1;
//            for (int i = 0; i < 1000000000; i++) {
//                count = count * (count + 1);
//            }
            StringTokenizer stringTokenizer = new StringTokenizer(getStr());
            Set<String> setT = new HashSet<>();
            while (stringTokenizer.hasMoreTokens()) {
                setT.add(stringTokenizer.nextToken());
            }
            System.out.println("Set " + setT.size());
            long end = System.currentTimeMillis();
            System.out.println("Finish Set = " + end);
        }
    }

    public static class T2 implements Runnable {
        @Override
        public void run() {
            StringTokenizer stringTokenizer = new StringTokenizer(getStr());
            Map<String, Integer> mapT = new HashMap<>();
            while (stringTokenizer.hasMoreTokens()) {
                mapT.put(stringTokenizer.nextToken(), 1);
            }
            System.out.println("Map " + mapT.size());
            long end = System.currentTimeMillis();
            System.out.println("Finish Map = " + end);
        }
    }

    static String getStr() {
        return "Ты меня не любишь, не жалеешь," +
                "Разве я немного не красив?" +
                "Не смотря в лицо, от страсти млеешь," +
                "Мне на плечи руки опустив." +

                "Молодая, с чувственным оскалом," +
                "Я с тобой не нежен и не груб." +
                "Расскажи мне, скольких ты ласкала?" +
                "Сколько рук ты помнишь? Сколько губ?" +

                "Знаю я - они прошли, как тени," +
                "Не коснувшись твоего огня," +
                "Многим ты садилась на колени," +
                "А теперь сидишь вот у меня." +

                "Пусть твои полузакрыты очи" +
                "И ты думаешь о ком-нибудь другом," +
                "Я ведь сам люблю тебя не очень," +
                "Утопая в дальнем дорогом." +

                "Этот пыл не называй судьбою," +
                "Легкодумна вспыльчивая связь, -" +
                "Как случайно встретился с тобою," +
                "Улыбнусь, спокойно разойдясь." +

                "Да и ты пойдешь своей дорогой" +
                "Распылять безрадостные дни," +
                "Только нецелованных не трогай," +
                "Только негоревших не мани." +

                "И когда с другим по переулку" +
                "Ты пройдешь, болтая про любовь," +
                "Может быть, я выйду на прогулку," +
                "И с тобою встретимся мы вновь." +

                "Отвернув к другому ближе плечи" +
                "И немного наклонившись вниз," +
                "Ты мне скажешь тихо: Добрый вечер!" +
                "Я отвечу: Добры вечер, miss." +

                "И ничто души не потревожит," +
                "И ничто ее не бросит в дрожь, -" +
                "Кто любил, уж тот любить не может," +
                "Кто сгорел, того не подожжешь.";
    }
}
