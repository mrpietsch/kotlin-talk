import java.time.Instant

class FileServiceK {
    data class File(
            val name: String,
            val hashSum: String,
            val lastModification: Instant
    )

    fun touchFile(file: File): File {
        return file.copy(lastModification = Instant.now())
    }
}