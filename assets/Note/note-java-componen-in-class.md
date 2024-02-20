# Ini merupakan catatan yang sekiranya dapat membantu dalam pembelajaran yang terkait dengan Java.

## Catatan utama komponen-komponen yang mendasari sebuah `class` dalam javas

1. `Public` dalam suatu `class` atau Modifer Akses

`public` dalam Java merupakan <b>Modifer Akses</b> secara umum public terdiri dari 4 macam, public secara sederhana mendefinisikan suatu `object`,`variable`, atau `konstruktor`([Constructor](https://github.com/mahesri/ABC-bsml-jpkw/blob/main/src/constructor/User.java) adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance)). agar dapat diakses di class atau bahkan diluar package. Modifer akses yang umum ditemukan dalam java diantaranya :

- `Public` : Anggota kelas dapat diakses dari mana saja dalam program, baik dari kelas yang sama maupun dari kelas lain.
- `Private` : Anggota kelas hanya dapat diakses dari dalam kelas yang mendefinisikannya.
- `protected` : Anggota kelas hanya dapat diakses dari dalam kelas yang mendefinisikannya dan kelas turunyanya.
- `default`: <b>(package-private)</b> Anggota kelas dapat diakses dari kelas lain yang berada dalam package yang sama.

2. `Static`  
