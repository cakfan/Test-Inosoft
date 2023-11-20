import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
open class Kendaraan(
    @PrimaryKey(autoGenerate = true) open val id: Long = 0,
    open val tahunKeluaran: Int,
    open val warna: String,
    open val harga: Double
)