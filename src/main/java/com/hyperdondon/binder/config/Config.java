package com.hyperdondon.binder.config;

import com.hyperdondon.binder.Main;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Map;

public class Config {
    public static void Initilize() throws Exception {
        File configFile = new File(Main.WorkDir, "config.yml");

        InputStream resourceStream = Main.class.getClassLoader().getResourceAsStream("config.yml");

        if (resourceStream == null) {
            System.out.println("config.yml not found in resources.");
            return;
        }

        if (!configFile.exists()) {
            Config.copyResourceToFile(resourceStream, configFile);
            System.out.println("config.yml copied to " + configFile.getAbsolutePath());
        }

        Yaml yaml = new Yaml();
        try (InputStream fileInputStream = new FileInputStream(configFile)) {
            Map<String, Object> data = yaml.load(fileInputStream);
            System.out.println("YAML content: " + data);
        }
    }
    public static void copyResourceToFile(InputStream resourceStream, File targetFile) throws Exception {
        try (OutputStream outputStream = Files.newOutputStream(targetFile.toPath())) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = resourceStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}
