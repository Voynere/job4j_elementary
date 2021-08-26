package ru.job4j.condition;

public class DummyBot {

    @SuppressWarnings("checkstyle:NeedBraces")
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) { /* заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить. */
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Это ставит меня в тупик. Задайте другой вопрос.");
        System.out.println(rsl);
    }
}
