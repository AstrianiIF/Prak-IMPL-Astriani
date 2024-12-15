<!DOCTYPE html>
    <html lang="id">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Form Tambah Pesan</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    background-color: #f2f2f2;
                    margin: 0;
                    padding: 0;
                }
                .container {
                    width: 50%;
                    margin: 50px auto;
                    background-color: #fff;
                    padding: 20px;
                    border-radius: 8px;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                }
                h2 {
                    text-align: center;
                    color: #333;
                }
                label {
                    font-weight: bold;
                }
                input, textarea {
                    width: 95%;
                    padding: 10px;
                    margin: 8px 0 20px 0;
                    border: 1px solid #ccc;
                    border-radius: 4px;
                }
                input[type="submit"] {
                    background-color: #4CAF50;
                    color: white;
                    border: none;
                    cursor: pointer;
                    padding: 12px;
                }
                input[type="submit"]:hover {
                    background-color: #45a049;
                }
            </style>
        </head>
        <body>
            <div class="container">
                <h2>Form Tambah Pesan</h2>
                <form action="simpanPesan2.php" method="POST">
                    <!-- ID Pengirim Hardcoded sebagai 1 untuk contoh -->
                    <input type="hidden" name="idPengirim" value="1"> 

                    <!-- Input untuk penerima, judul, dan pesan -->
                    <label for="Penerima">Penerima:</label>
                    <input type="text" name="Penerima" placeholder="Masukkan ID Penerima" required>

                    <label for="judul">Judul:</label>
                    <input type="text" name="judul" placeholder="Masukkan Judul" required>

                    <label for="TextPesan">Pesan:</label>
                    <textarea name="TextPesan" placeholder="Tulis pesan Anda..." required></textarea>

                    <input type="submit" value="Kirim Pesan">
                </form>
            </div>
        </body>
</html>
