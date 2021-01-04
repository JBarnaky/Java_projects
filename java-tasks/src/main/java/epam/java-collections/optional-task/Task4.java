import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class Task4 {
    private static final String SONNET =
            "Промчится, мыслью быстрою гоним,\n" +
            "Твой нежный лик, любимый и желанный…\n" +
            "О, краткий отдых в муке неустанной!..\n" +
            "Но ты со мной – и я неуязвим!\n" +
            "\n" +
            "У врат души твой образ, страстно жданный,\n" +
            "Предстал, и вновь страданием былым\n" +
            "Дрожит Любовь пред голосом твоим,\n" +
            "Пред нежным взором – крест судьбой мне данный!\n" +
            "\n" +
            "Как госпожа в свой дом, приходишь ты,\n" +
            "И в скорбном сердце светом красоты\n" +
            "Твой ясный взор сменяет ужас ночи,\n" +
            "\n" +
            "Душа потрясена, и слепнет глаз…\n" +
            "Вздыхаю я: «Благословен тот час,\n" +
            "Когда мне путь открыли эти очи!»\n";
 
    private static final Comparator<String> LINE_LENGTH_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String obj1, String obj2) {
            return obj1.length() - obj2.length();
        }
    };
 
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(SONNET.split("\n"));
        System.out.println(lines);
        Collections.sort(lines, LINE_LENGTH_COMPARATOR);
        System.out.println(lines);
    }
}