# QA Automation - Pengujian Kalkulator Google

## Deskripsi
Proyek ini bertujuan untuk mengotomatisasi pengujian fitur penjumlahan pada Kalkulator Google menggunakan Data-Driven Testing (DDT). Pengujian ini memastikan bahwa kalkulator dapat memberikan hasil yang benar untuk berbagai kombinasi angka yang diuji.

## Teknologi yang Digunakan
- Selenium WebDriver
- Cucumber
- Gherkin
- Java/Python (sesuai kebutuhan proyek)
- TestNG/JUnit

## Instalasi
1. Clone repositori:
   ```sh
   git clone https://github.com/username/repo.git
   ```
2. Instal dependensi yang diperlukan:
   ```sh
   npm install # Jika menggunakan WebdriverIO
   pip install -r requirements.txt # Jika menggunakan Python
   mvn clean install # Jika menggunakan Java dan Maven
   ```
3. Jalankan pengujian:
   ```sh
   mvn test
   # atau
   pytest
   ```

## Test Case

### Feature: Penjumlahan pada Kalkulator Google

#### Scenario Outline: Menjumlahkan dua angka dengan Data-Driven Test
1. **Given** saya menekan tombol clear
2. **And** saya menekan tombol nilai "<angka1>"
3. **And** saya menekan tombol plus
4. **And** saya menekan tombol nilai "<angka2>"
5. **When** saya menekan tombol sama dengan
6. **Then** saya mendapatkan hasil "<hasil>"

| angka1 | angka2 | hasil |
|--------|--------|-------|
| 10     | 20     | 30    |
| 200    | 30     | 230   |

## Cara Menjalankan Pengujian
1. Pastikan semua dependensi telah terinstal.
2. Jalankan pengujian sesuai dengan teknologi yang digunakan:
   ```sh
   mvn test  # Jika menggunakan Java
   pytest  # Jika menggunakan Python
   npm test  # Jika menggunakan WebdriverIO
   ```

## Hasil Pengujian
Setelah menjalankan pengujian, laporan hasil dapat ditemukan di folder `target/reports/` untuk Java atau di terminal jika menggunakan Python atau WebdriverIO.

## Kontribusi
1. Fork repositori ini.
2. Buat branch baru (`feature/nama_fitur`).
3. Commit perubahan (`git commit -m 'Menambahkan fitur X'`).
4. Push ke branch baru (`git push origin feature/nama_fitur`).
5. Ajukan pull request.



