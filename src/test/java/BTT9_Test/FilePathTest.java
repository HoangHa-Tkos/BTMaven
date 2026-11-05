
package BTT9_Test;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilePathTest {

    @Test
    void testFilePath() {

        // Tạo đường dẫn độc lập với hệ điều hành
        Path path = Path.of("data", "input.txt");

        // Kiểm tra tên file
        assertEquals("input.txt",
                path.getFileName().toString());
    }
}
