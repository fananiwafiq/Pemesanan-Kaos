#### Pemesanan-Kaos

Layout description

Pemesanan Kaos adalah sebuah projek dari tugas 001 yang terdiri dari linearLayout untuk layoutnya,imageView digunakan untuk menampilkan logo yang berada di atas sendiri dari layout 
kemudian ada Text view yang properti Textnya berisi Nama : , lalu ada editText untuk menginputkan nama, lalu ada Text view dengan properti text yang berisi Negara : ,
kemudian ada juga Spinner yang berisi array yang array tersebut berisikan oleh list negara2 dengan kondisi awal yaitu indonesia
kemudian ada Text view dengan properti text Jenis Kaos : , lalu ada 5 buah checkBox yang berisi Jenis-jenis kaos ,
kemudian ada Text view dengan properti text Ukuran :, lalu ada radioGroup yang di dalamnya ada 4 buah radioButton yang berisikan ukuran kaos,
lalu setelah radioGroup ada button dengan properti text View Order yang digunakan untuk menampilkan seluruh proses.

Validasi description
Validasi dimulai dari nama dari editText jika nama belum diisi maka akan keluar setError Nama belum diisi
lalu jika nama sudah diisi namun isi kurang dari 3 huruf makan akan ada setError Nama minimal 3 karakter
lalu di return sehingga akan ada looping sampai ketemu nilai dari nama

kemudian validasi dari RadioGroup yang jika salah satu radio button belum diisi maka akan keluar setText Belum mengisi Ukuran 
lalu jika sudah terisi maka akan menampilkan Kaos Anda Ukuran : + hasil dari getText().toString() yang berisi ukuran dari kaos tsb yang di pilih

lalu Validasi untuk Jenis kaos apa saja yang dipilih yaitu jika salah satu atau lebih dari satu checkBox sudah dipilih maka akan keluar hasil dari Jenis kaos yang dipilih
jika belum ada yang di cheked maka akan keluar setText  jenis kaos belum dipilih

lalu jika semua sudah divalidasi maka akan keluar di viewText dibawah button

###Nama     : Moh. Wafiq Fanani
###Kelas    : XIRPL2
###No.Absen : 015


![whatsapp image 2016-09-19 at 2 04 58 pm 1](https://cloud.githubusercontent.com/assets/22256041/18633046/9c8f503c-7ea4-11e6-9b97-d55371f6dd1f.jpeg)
![whatsapp image 2016-09-19 at 2 04 58 pm 2](https://cloud.githubusercontent.com/assets/22256041/18633047/9c980f42-7ea4-11e6-98cc-57737ed69a65.jpeg)
![whatsapp image 2016-09-19 at 2 04 58 pm](https://cloud.githubusercontent.com/assets/22256041/18633048/9cab363a-7ea4-11e6-94a6-3ca2b613fec0.jpeg)
