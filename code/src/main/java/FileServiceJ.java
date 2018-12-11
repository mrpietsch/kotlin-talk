import java.time.Instant;
import java.util.Objects;

public class FileServiceJ {

    public class File {
        final String name;
        final String hashSum;
        final Instant lastModification;

        public File(String name, String hashSum, Instant lastModification) {
            this.name = name;
            this.hashSum = hashSum;
            this.lastModification = lastModification;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            File file = (File) o;
            return Objects.equals(name, file.name) &&
                    Objects.equals(hashSum, file.hashSum) &&
                    Objects.equals(lastModification, file.lastModification);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, hashSum, lastModification);
        }

        @Override
        public String toString() {
            return "File{" +
                    "name='" + name + '\'' +
                    ", hashSum=" + hashSum +
                    ", lastModification=" + lastModification +
                    '}';
        }
    }

    public File touchFile(File file) {
        return new File(file.hashSum, file.name, Instant.now());
    }

}
