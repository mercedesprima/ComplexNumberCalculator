package Log;

import java.time.LocalDateTime;

public class Logger implements Loggable {
        @Override
            public void log(String msg) {
                LocalDateTime now = LocalDateTime.now();
                System.out.printf("Log [%s]: %s \n", now, msg);
            }
        }
