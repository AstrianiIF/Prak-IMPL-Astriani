<?php
    $conn = mysqli_connect("localhost", "root", "", "dbPesan");

    if (!$conn) {
        die("Koneksi gagal: " . mysqli_connect_error());
    }

    $idPesan = $_GET['id'];

    $sql = "DELETE FROM Pesan WHERE idPesan = $idPesan";

    if (mysqli_query($conn, $sql)) {
        echo "Pesan berhasil dihapus.";
        echo "<br><a href='tampilPesan.php'>Kembali ke daftar pesan</a>";
    } else {
        echo "Gagal menghapus pesan: " . mysqli_error($conn);
    }

    mysqli_close($conn);
?>
