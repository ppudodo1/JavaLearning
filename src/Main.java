import noviPaket.Mod;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.file.DirectoryStream;
import static java.util.Arrays.asList;


public class Main {

    public static void main(String[] args) throws IOException {

        SimpleArray sharedSimpleArray = new SimpleArray(6);
        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(writer1);
        executorService.execute(writer2);
        executorService.shutdown();

        try {
// wait 1 minute for both writers to finish executing
            boolean tasksEnded =
                    executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (tasksEnded) {
                System.out.printf("%nContents of SimpleArray:%n");
                System.out.println(sharedSimpleArray); // print contents
            } else
                System.out.println(
                        "Timed out while waiting for tasks to finish.");
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }

    }

}



