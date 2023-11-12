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

<div id="variable">

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

</div>

---

<div id="input_output">

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

</div>

---

<div id="operators">
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

<table>
   <thead>
      <tr>
         <th>Operator<th>
         <th>Deskripsi<th>
         <th>Contoh<th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>=<td>
         <td>Memberikan sebuah nilai (kanan) ke variabel (kiri)<td>
         <td>a = 1<td>
      </tr>
      <tr>
         <td>+=<td>
         <td>Menambah nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri)	<td>
         <td>a += 1, berarti a = a + 1<td>
      </tr>
      <tr>
         <td>-=<td>
         <td>Mengurang nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri)	<td>
         <td>a -= 1, berarti a = a - 1<td>
      </tr>
      <tr>
         <td>*=<td>
         <td>Mengkalikan nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri)	<td>
         <td>a *= 1, berarti a = a * 1<td>
      </tr>
      <tr>
         <td>/=<td>
         <td>Membagi nilai dari variabel (kiri) lama dengan nilai (kanan) kemudian menetapkan hasilnya ke variabel (kiri)	<td>
         <td>a /= 1, berarti a = a / 1<td>
      </tr>
   </tbody>
   <tfooter>
      <tr>
         <th>Operator<th>
         <th>Deskripsi<th>
         <th>Contoh<th>
      </tr>
   </tfooter>
</table>

### Relational Operator

Relational Operator merupakan operator untuk membandingkan antara dua buah data dan menghasilkan true dan false.

<table>
   <thead>
      <tr>
         <th>Operator<th>
         <th>Deskripsi<th>
         <th>Contoh<th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>><td>
         <td>Pengecekan nilai kiri lebih besar dari nilai kanan, jika iya berarti nilai true jika tidak maka false<td>
         <td>6 > 5<td>
      </tr>
      <tr>
         <td><<td>
         <td>Pengecekan nilai kiri lebih kecil dari nilai kanan, jika iya berarti nilai true jika tidak maka false<td>
         <td>5 < 6<td>
      </tr>
      <tr>
         <td>>=<td>
         <td>Pengecekan nilai kiri lebih besar sama dengan nilai kanan, jika iya berarti nilai true jika tidak maka false<td>
         <td>5 >= 5<td>
      </tr>
      <tr>
         <td>>=<td>
         <td>Pengecekan nilai kiri lebih kecil sama dengan nilai kanan, jika iya berarti nilai true jika tidak maka false<td>
         <td>5 <= 5<td>
      </tr>
      <tr>
         <td>==<td>
         <td>Pengecekan nilai kiri sama dengan nilai kanan, jika iya berarti nilai true jika tidak maka false<td>
         <td>5 == 5<td>
      </tr>
      <tr>
         <td>!=<td>
         <td>Pengecekan nilai kiri tidak sama dengan nilai kanan, jika iya berarti nilai true jika tidak maka false<td>
         <td>1 != 5<td>
      </tr>
   </tbody>
   <tfooter>
      <tr>
         <th>Operator<th>
         <th>Deskripsi<th>
         <th>Contoh<th>
      </tr>
   </tfooter>
</table>

### Logical Operator

Logical Operator menghasilkan nilai true and false.

1. `&&`, menghasilkan nilai `true` maka semuanya bernilai benar
2. `||`, jika bernilai salah satu benar, maka menghasilkan nilai `true`.
3. `!`, menghasilkan nilai kebalikan dari nilai yang dioperasikan.

</div>

---

<div id="branching">

### 4. Percabangan

Percabangan digunakan untuk menentukan suatu keputusan atau kondisi tertentu, di dalam sebuah kondisi biasanya terdapat ada operator yang digunakan sebagai syarat untuk memenuhi kondisi tersebut.

Percabangan terdapat 2 macam, yaitu:

- If Else

```java
int num = 3;

if (num > 0) {
   System.out.println("Positif");
} else if (num < 0) {
   System.out.println("Negatif");
} else {
   System.out.println("Nol");
}
```

- Switch Case

```java
int choice = 2;

switch (choice) {
   case 1:
      System.out.println("Teh Manis");
      break;

   case 2:
      System.out.println("Kopi");
      break;

   default:
      System.out.println("Air Putih");
      break;
}
```

Perbedaan `switch()` dengan `if()` yaitu, `switch()` digunakan untuk memiliki satu nilai yang pasti dan `if()` digunakan untuk memberikan syarat pada suatu statement.

</div>

---

<div id="iteration">

### 5. Perulangan

Perulangan adalah perintah untuk mengulang satu atau lebih statement tanpa terhenti, selama kondisi terpenuhi.

Ada 3 macam perintah perulangan, yaitu:

- `for`, digunakan untuk menjalankan perintah dengan jumlah perulangan yang telah diketahui.

  ```java
  for(int i = 0; i < 5; i++) {
     // int i = 0;, inisialisasi nilai
     // i < 5, syarat pengulangan
     // i++, perubahan nilai
     System.out.println(i);
  }
  ```

  ```
     Output
     0
     1
     2
     3
     4
  ```

- `while`, digunakan untuk mengulang satu atau beberapa perintah hingga syarat yang tertentukan terpenuhi.

  ```java
  int i = 0; // Inisialisasi nilai
  while(i < 5) {
     // i < 5, syarat pengulangan
     System.out.println(i);
     i++; // Perubahan nilai
  }
  ```

  ```
     Output
     0
     1
     2
     3
     4
  ```

- `do while()`, digunakan untuk mengulang suatu perintah selama kondisi pada while masih terpenuhi.

  ```java
  int i = 0; // Inisialisasi nilai
  do {
     System.out.println(i);
     i++; // Perubahan nilai
  } while (i < 5); // Syarat pengulangan
  ```

  ```
    Output
    0
    1
    2
    3
    4
  ```

</div>

---

<div id="array">

### 6. Array

Array adalah sekumpulan tempat secara berurutan yang digunakan untuk menyimpan data.

```
tipeData namaArray[] = new tipeData[kapasitas];
```

Contoh:

```java
int numbers[] = new int[4];

numbers[0] = 7;
numbers[1] = 12;
numbers[2] = 15;
numbers[3] = 17;
```

Ada juga Array Multi Dimensi yang merupakan menyimpan data lebih dari satu dimensi.

`tipeData[][] namaArray = new tipeData[kapasitas][kapasitas];`

```java
String[][] contacts = {
   {"John", "1627"},
   {"Maria", "6421"}
};

System.out.println(contacts[1][0]); // Maria, 1627;
```

</div>

---

<div id="function">

### 7. Fungsi

Function adalah blok program yang akan berjalan saat kita panggil. Untuk mendeklarasikan function dengan cara `tipeFungsi tipeData namaFungsi(parameter)`. `tipeFungsi` yang dimaksud adalah instansiasi object yang akan dibahas di Object Oriented Programming.

Contoh:

```java

public class App {
   // void, merupakan tidak memerlukan nilai balik atau return.
   public void greeting(String name) {
      System.out.println("Hello, " + name);
   }

   public static void main(String[] args) {
      greeting("John"); // Hello, John
   }

}

```

</div>

---
