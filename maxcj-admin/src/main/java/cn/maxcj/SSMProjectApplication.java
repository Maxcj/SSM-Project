package cn.maxcj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SSMProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSMProjectApplication.class, args);
        log.info("\n ________  ___  ___  ________  ________  _______   ________   ________      \n" +
                "|\\   ____\\|\\  \\|\\  \\|\\   ____\\|\\   ____\\|\\  ___ \\ |\\   ____\\ |\\   ____\\     \n" +
                "\\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\___|\\ \\  \\___|\\ \\   __/|\\ \\  \\___|_\\ \\  \\___|_    \n" +
                " \\ \\_____  \\ \\  \\\\\\  \\ \\  \\    \\ \\  \\    \\ \\  \\_|/_\\ \\_____  \\\\ \\_____  \\   \n" +
                "  \\|____|\\  \\ \\  \\\\\\  \\ \\  \\____\\ \\  \\____\\ \\  \\_|\\ \\|____|\\  \\\\|____|\\  \\  \n" +
                "    ____\\_\\  \\ \\_______\\ \\_______\\ \\_______\\ \\_______\\____\\_\\  \\ ____\\_\\  \\ \n" +
                "   |\\_________\\|_______|\\|_______|\\|_______|\\|_______|\\_________\\\\_________\\\n" +
                "   \\|_________|                                      \\|_________\\|_________|\n");
    }

}