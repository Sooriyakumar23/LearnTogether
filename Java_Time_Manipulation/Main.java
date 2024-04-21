import java.util.List;
import java.util.stream.Collectors;

import Utils.Time;

public class Main {
    public static void main(String[] args) {
        
        Time time = new Time();
        // String generatedTimeByUser = time.generateTimeByUser();
        // System.out.println(generatedTimeByUser);

        List<String> randomTime = time.generateTimesBySystem("1");
        System.out.println(randomTime.get(0));

        List<String> twoRandomTimes = time.generateTimesBySystem("2");
        List<Time> twoTimes = twoRandomTimes.stream().map(Time::new).collect(Collectors.toList());
        String addedTwoTimes = time.addTimes(twoTimes);
        System.out.println(addedTwoTimes);

        List<String> randomTimes = time.generateTimesBySystem(null);
        List<Time> times = randomTimes.stream().map(Time::new).collect(Collectors.toList());
        String addedTimes = time.addTimes(times);
        System.out.println(addedTimes);

        List<String> convertedTimes = time.convertSecondsToTimes(100000);
        convertedTimes.stream().forEach(convertedTime -> System.out.println(convertedTime));

    }
}
