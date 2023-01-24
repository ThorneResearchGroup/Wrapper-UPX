package tech.tresearchgroup.upx;

import picocli.CommandLine;
import tech.tresearchgroup.upx.controller.UPXController;
import tech.tresearchgroup.upx.model.UPXOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class UPX  implements Callable<Integer> {
    @CommandLine.Parameters(index = "0")
    private String file;

    @CommandLine.ArgGroup
    private UPXOptions upxOptions;

    @Override
    public Integer call() {
        List<String> options = new ArrayList<>();
        options.add("upx");
        options.addAll(UPXController.getOptions(upxOptions));
        options.add(file);
        return execute(options);
    }

    public static int execute(List<String> options) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(options);
        System.out.println(options);
        try {
            Process process = processBuilder.start();
            String line;
            /*
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
             */
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errorReader.readLine()) != null) {
                System.out.println(line);
            }
            errorReader.close();
            return process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
