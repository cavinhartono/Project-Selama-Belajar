# Basic Programming

### Materi

1. [Variabel dan Tipe Data](#variable)
2. [Input dan Output](#input_output)
3. [Operator](#operators)
4. [Percabangan](#branching)
5. [Perulangan](#iteration)
6. [Array](#array)
7. [Fungsi](#function)

---

</br>

### Pengertian

---

### 1. Variabel dan Tipe Data

Variabel adalah tempat untuk menyimpan suatu nilai dengan gaya penamaan `camelCase` yang diawali dengan huruf kecil dan setiap 1 suku kata dipisah dengan huruf kapital. Contohnya, `lastName`.

Tipe Data adalah jenis data yang disimpan pada variabel. Berikut adalah jenis tipe data:

- `char`, suatu karakter

- `String`, suatu karakter yang membentuk teks.

- `int`, suatu bilangan bulat.

- `double` atau `float`, suatu bilangan desimal.

- `boolean`, suatu nilai hanya `true` dan `false`.

### Cara Membuat Variabel

Berikut format penulisan variabel

`tipeData namaVaribel;`

Untuk mendeklarasikan sebuah variabel, kita perlu menuliskan tipe, nama, dan diakhiri dengan titik koma(;).

Contoh:

1. Kita mendeklarasikan sebuah variabel.

   ```java
   int age;
   ```

2. Lebih dari 1 buah variabel.

   ```java
   int age;
   String name, address;
   ```

3. Kita bisa langsung isi variabel tersebut

   ```java
   String name = "John Doe"; // Teks
   char gender = "L"; // Karakter
   int age = 18; // Bilangan bulat
   double height = 174.9; // Bilangan desimal
   boolean isMarried = false; // Bilangan biner
   ```

---

### 2. Input dan Output

Input dan Output adalah perintah untuk meminta data dari user dan menampilkan ke layar. Untuk membuat program yang dinamis, kita perlu memanggilkan class untuk memasukan data pada suatu variabel.

```java
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    String name;
    int age;
    char gender;
    double height;
    boolean isMarried;

    Scanner input = new Scanner(System.in);

    System.out.print("Masukan nama Anda: ");
    name = input.nextLine();

    System.out.print("Masukan umur Anda: ");
    age = input.nextInt();

    System.out.print("Masukan jenis kelamin Anda: ");
    gender = input.next();

    System.out.print("Masukan tinggi badan Anda: ");
    height = input.nextDouble();

    System.out.print("Masukan status menikah Anda: ");
    isMarried = input.nextBoolean();

    // Output
    System.out.println("Nama            : " + name);
    System.out.println("Umur            : " + age);
    System.out.println("Jenis Kelamin   : " + gender);
    System.out.println("Tinggi Badan    : " + height);
    System.out.println("Status Menikah  : " + isMarried);
  }
}
```

```
// Input
Masukan nama Anda           : John Doe
Masukan umur Anda           : 18
Masukan jenis kelamin Anda  : L
Masukan tinggi badan Anda   : 174.9
Masukan status menikah Anda : false

// Output
Nama            : John Doe
Umur            : 18
Jenis Kelamin   : L
Tinggi Badan    : 174.9
Status Menikah  : false
```

---

### 3. Operator

Operator merupakan suatu simbol yang digunakan untuk aksi terhadap satu atau lebih operator. Contoh, kita ingin melakukan perjumlahan x dan y maka kita menggunakan operator "+".

Operator yang paling sering digunakan :

1. Arithmetic Operator
2. Assignment Operator
3. Relational Operator
4. Logical Operator

Penjelasan dari Masing-masing Operator

### Arithmetic Operator

Arithmetic Operator adalah operator yang biasa kita gunakan saat melakukan proses perhitungan matematika, berikut jenis jenis operator aritmatika.

1. Operator Perjumlahan (+)

   Contoh:

   ```java
   int hasil = 23 + 2; // 25
   ```

2. Operator Pengurangan (-)

   Contoh:

   ```java
   int hasil = 6 - 1; // 5
   ```

3. Operator Perkalian (\*)

   Contoh:

   ```java
   int hasil = 5 * 5; // 25
   ```

4. Operator Pembagian (/)

   Contoh:

   ```java
   int bilanganBulat = 6 / 2; // 3 (Jika bertipe Integer);
   float bilanganDesimal = 7.0 / 2.0; // 3.5 (Jika bertipe float/double)
   ```

5. Operator Modulus atau Sisa dari Pembagian (%)

   Contoh:

   ```java
   int contoh1 = 9 % 2; // 1
   int contoh2 = 8 % 2; // 0
   ```

### Assignment Operator

Assignment Operator atau Operator Penugasan ini memiliki fungsi untuk memberikan suatu tugas kepada variabel/data.

Contoh:

```java
int hasil = 29;
```

Pada kode diatas "=" berfungsi untuk memberikan nilai variabel "hasil". Berikut tabel informasi mengenai assignment operator yang paling sering digunakan.

| Operator | Deskripsi                                                                                                        | Contoh                                             |
| -------- | ---------------------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
| =        | Memberikan sebuah nilai (kanan) ke variabel (kiri)                                                               | A = 1 berarti memberikan nilai 1 kepada variabel A |
| +=       | Menambah nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri)    | A += 1 berarti A = A + 1                           |
| -=       | Mengurangi nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri)  | A -= 1 berarti A = A - 1                           |
| \*=      | Mengkalikan nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri) | A \*= 1 berarti A = A \* 1                         |
| /=       | Membagi nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri)     | A /= 1 berarti A = A / 1                           |