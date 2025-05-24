package ru.itis.inf403.lab2_10_test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestFileUtil {
    static FileUtil fileUtil;

    @BeforeAll
    static void init() {
        fileUtil = new FileUtil();
    }

    @Test
    void testMergeFiles() {
        File a = new File("file_util_a.txt");
        File b = new File("file_util_b.bin");
        File c = new File("file_util_c.bin");

        try (OutputStream fosa = new FileOutputStream(a);
             OutputStream fosb = new FileOutputStream(b);
             OutputStream fosc = new FileOutputStream(c)) {
            String text = "Hello, my dear friends!";
            fosa.write(text.getBytes());
            fosb.write(new byte[] {5, 24, 1, 17, 120, 49, 2, 89, 90, 103});
            fosc.write(text.getBytes());
            fosc.write(new byte[] {5, 24, 1, 17, 120, 49, 2, 89, 90, 103});

            InputStream fisc = new FileInputStream(c);
            InputStream fisd = new FileInputStream(FileUtil.mergeFiles(a, b));

            int r;
            int q = 0;
            while ((r = fisd.read()) > -1) {
                q = fisc.read();
                assertTrue(q > -1); //Пока r > -1, q тоже > -1
                assertEquals(r, q); //прочитали одинаково
            }
            q = fisc.read();
            assertTrue(q == -1); //Раз while закончился и r == -1, q тоже == -1

            fosa.flush();
            fosb.flush();
            fosc.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testCheck() throws FileNotFoundException {
        assertThrows(FileNotFoundException.class, () -> FileUtil.check("hehe.json"));
        assertThrows(NullPointerException.class, () -> FileUtil.check(""));

        assertEquals(0, FileUtil.check("bookings.json"));
        assertEquals(0, FileUtil.check("brookings.json"));
    }
}
