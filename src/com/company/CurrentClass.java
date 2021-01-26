package com.company;

import java.io.IOException;
import java.util.logging.*;

public class CurrentClass {
    private static final Logger logger = Logger.getLogger("");

    public static void main(String[] args) throws IOException {
        logger.setLevel(Level.ALL);//все уровни
        logger.getHandlers()[0].setLevel(Level.OFF);
        logger.getHandlers()[0].setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + "\t" + record.getMessage() + "\t" + record.getMillis() + "\n";
            }
        });

        logger.getHandlers()[0].setFilter(record -> record.getMessage().startsWith("Checkpont"));

        try {
            Handler handler = new FileHandler("src/logs/mylog.log", true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);

        } catch (IOException e) {
            e.printStackTrace();
        }


        logger.log(Level.SEVERE, "S");
        logger.log(Level.INFO, "Checkpont I");
        logger.warning("W");
        logger.config("Checkpont C");
    }
}
