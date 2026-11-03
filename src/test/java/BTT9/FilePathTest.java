
package BTT9;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilePathTest {

    @Test
    void testFilePath() {
        // Cố tình sử dụng đường dẫn Windows
        Path path = Paths.get("data\\input.txt");

        // Mong muốn lấy được tên file
        assertEquals("input.txt",
                path.getFileName().toString());
    }
}
