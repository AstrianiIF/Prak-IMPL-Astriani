<?php
    $conn = mysqli_connect("localhost", "root", "", "dbPesan");

    if (!$conn) {
        die("Koneksi gagal: " . mysqli_connect_error());
    }

    $sql = "SELECT * FROM Pesan ORDER BY WktPesan DESC";
    $result = mysqli_query($conn, $sql);

    if (mysqli_num_rows($result) > 0) {
        echo "<h2>Daftar Pesan</h2>";
        echo "<table border='1' cellpadding='10'>
                <tr>
                    <th>ID Pesan</th>
                    <th>Pengirim</th>
                    <th>Penerima</th>
                    <th>Judul</th>
                    <th>Pesan</th>
                    <th>Tanggal</th>
                    <th>Aksi</th>
                </tr>";
        
        while ($row = mysqli_fetch_assoc($result)) {
            echo "<tr>
                    <td>" . $row['idPesan'] . "</td>
                    <td>" . $row['idPengirim'] . "</td>
                    <td>" . $row['idPenerima'] . "</td>
                    <td>" . $row['Judul'] . "</td>
                    <td>" . $row['TextPesan'] . "</td>
                    <td>" . $row['WktPesan'] . "</td>
                    <td><a href='hapusPesan.php?id=" . $row['idPesan'] . "'>Hapus</a></td>
                </tr>";
        }
        
        echo "</table>";
    } else {
        echo "Tidak ada pesan untuk ditampilkan.";
    }

    mysqli_close($conn);
?>
