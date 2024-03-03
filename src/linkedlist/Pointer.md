# Pointer 

- Pointer atau (penunjuk) adalah sebuah variable bertipe khusus yang dapat (menyimpan alamat) menunjuk suatu heap/variable/obyek.

- Tipe data dari variable pointer (selanjutnya disebut pointer) tidak bertipe data primitif seperti int ataupun string, melainkan sebuah <b>class</b> yang beranggotakan "umumnya" berbagai tipe data.

[Lebih lengkapnya baca tentang pointer](https://github.com/mahesri/ABC-bsml-jpkw/blob/main/assets/Modul/MODUL%207%20(75-89).pdf)

- Pointer dapat menunjuk ke sebuah heap baru. Heap adalah sebuah variabel tidak bernama yang dapat menyimpan sebuah nilai sebagaimana sebuah variabel pada umumnya. Dalam konsep OOP heap dikenal dengan nama obyek. Heap juga sering disebut <b>Node /Simpul/ List/ Senarai/ Record.</b> Agar pointer dapat menunjuk ke sebuah heap, heap harus diciptakan terlebih dahulu menggunakan perintah new() baru kemudian sebuah pointer dapat diarahkan untuk menunjuk ke heap tersebut. Perintah yang digunakan agar pointer P menunjuk ke
heap yang baru tersebut adalah “P =”.