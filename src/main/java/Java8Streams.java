import javafx.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Streams {
    private static final Logger LOG = LoggerFactory.getLogger(Java8Streams.class);

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");

        LOG.info("*******MapToMapTransformation*******");
        map.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()))
                .forEach((k, v) -> System.out.println(k + " = " + v));
        LOG.info("*******ListToMapTransformation*******");
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .map(i -> new Pair(i, i.length()))
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()))
                .forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
