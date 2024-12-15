<?php
   // Koneksi ke database
   $conn = mysqli_connect("localhost", "root", "", "dbPesan");

   if (!$conn) {
      die("Koneksi gagal: " . mysqli_connect_error());
   }

   // Ambil data dari form
   $idPengirim = $_POST['idPengirim']; // ID Pengirim
   $idPenerima = $_POST['Penerima']; // ID Penerima
   $judul = $_POST['judul']; // Judul pesan
   $TextPesan = $_POST['TextPesan']; // Isi pesan
   $date = date('Y-m-d H:i:s'); // Waktu pesan dikirim

   // Query untuk menyimpan pesan
   $sql = "INSERT INTO Pesan (idPengirim, idPenerima, Judul, TextPesan, WktPesan) 
         VALUES ('$idPengirim', '$idPenerima', '$judul', '$TextPesan', '$date')";

   // Eksekusi query
   if (mysqli_query($conn, $sql)) {
      echo "Pesan berhasil ditambahkan.";
   } else {
      echo "Pesan gagal ditambahkan: " . mysqli_error($conn);
   }

   // Tutup koneksi database
   mysqli_close($conn);
?>
