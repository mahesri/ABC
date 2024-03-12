# Collection

Collections secara umum adalah <b><i>kumpulan.</i></b> Dalam OOP collection dikenal sebagai suatu tempat atau wadah atau object yang dapat menyimpan object lainnya baik yang memiliki tipe data yang sama maupun tidak. Adapun beberapa contoh implementasi dari Collection adalah Vector, Arraylist dan List.


## Implementasi Interface Collection

```
<root interface> Collection
a. <interface> Set
    <implementing classes>
            i. HashSet
            ii. LinkedHashSet
            iii. TreeSet

b. <interface> List
            i. ArrayList
            ii. LinkedList
            iii. Vector          
```

Dalam konteks pemrograman Java, "collection" (koleksi) merujuk pada struktur data yang digunakan untuk menyimpan dan mengelola kumpulan objek. Koleksi dalam Java adalah kelas yang menyediakan implementasi berbagai jenis struktur data, seperti array, daftar (list), himpunan (set), dan peta (map). Tujuan utama dari koleksi adalah untuk menyediakan cara yang efisien untuk menyimpan dan mengakses sekumpulan objek.

Beberapa poin penting tentang koleksi dalam Java:

- <b>Dinamis</b>: Koleksi dalam Java bersifat dinamis, yang berarti ukuran mereka dapat berubah saat program berjalan. Ini memungkinkan kita untuk menambahkan atau menghapus objek dari koleksi tanpa perlu memperhatikan alokasi memori yang khusus atau batasan ukuran tertentu.

- <b>Objek Beragam</b>: Koleksi dalam Java dapat menyimpan objek dari berbagai jenis dan tipe data. Kita bisa menyimpan objek-objek primitif seperti integer dan double, serta objek-objek yang lebih kompleks seperti string, objek pengguna yang ditentukan, atau bahkan koleksi lainnya.

- <b>Manipulasi Data</b>: Koleksi menyediakan beragam metode untuk memanipulasi data, seperti menambahkan elemen baru, menghapus elemen yang ada, mengambil elemen tertentu berdasarkan indeks atau kunci, mencari elemen, dan banyak lagi. Ini membuatnya sangat fleksibel untuk digunakan dalam pengembangan perangkat lunak.

- <b>Iterasi:</b> Koleksi menyediakan cara yang nyaman untuk melakukan iterasi atau traversal melalui semua elemen yang disimpan di dalamnya. Anda dapat menggunakan iterator, forEach loop, atau indeks untuk mengakses dan memproses setiap elemen secara berurutan.

Contoh koleksi dalam Java termasuk ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, dan banyak lagi. Setiap jenis koleksi memiliki karakteristik dan kegunaannya sendiri, yang membuatnya cocok untuk berbagai situasi penggunaan.

Secara umum, koleksi dalam Java memainkan peran yang sangat penting dalam pengembangan perangkat lunak karena menyediakan cara yang efisien untuk mengelola data secara dinamis dan efektif.