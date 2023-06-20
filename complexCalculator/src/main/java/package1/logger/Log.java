package package1.logger;

import java.time.LocalDateTime;

public class Log implements Logger{
    @Override
    public void log(String massage) {
        System.out.println(LocalDateTime.now() + ":" + massage);
    }
}
