### Tugas Kelompok - Data Struktur

---

Code pada `for`:

```java
int[][] x = new int[4][4];

for (int i = 0; i < x.length; i++) {
  for (int j = 0; j < x.length; j++) {
    // Algoritma pada setiap soal
  }
}
```

Soal 1:

Algoritma setelah `for`

```java
if (i >= j) {
  x[i][j] = 1;
} else {
  x[i][j] = 0;
}
```

Output:

```
1 0 0 0
1 1 0 0
1 1 1 0
1 1 1 1
```

Soal 2:

Algoritma setelah `for`

```java
if (i == j) {
  x[i][j] = 1;
} else {
  x[i][j] = 0;
}
```

Output:

```
1 0 0 0
0 1 0 0
0 0 1 0
0 0 0 1
```

Soal 3:

Algoritma full

```java
for (int i = 0; i < x.length; i++) { // loop baris dimulai dari 0 hingga ukuran `x` tersebut
  for (int j = i; j < x.length; j++) { // loop kolom dimulai dari nilai i hingga ukuran `x` tersebut
    if (i <= j) { // jika `i` kurang sama dengan `j`, maka j bertambah 1 dan disimpan ke `x`
      x[i][j] = j + 1;
    } else { // jika tidak, maka bernilai 0 dan disimpan ke `x`
      x[i][j] = 0;
    }
  }
}
```

Ilustrasi:

```
[
  [1, 1] = 1 [1, 2] = 2 [1, 3] = 3 [1, 4] = 4
  [2, 1] = 0 [2, 2] = 2 [2, 3] = 3 [2, 4] = 4
  [3, 1] = 0 [3, 2] = 0 [2, 3] = 3 [2, 4] = 4
  [4, 1] = 0 [4, 2] = 0 [2, 3] = 0 [2, 4] = 4
]
```

Output:

```
1 2 3 4
0 2 3 3
0 0 3 4
0 0 0 4
```

Soal 4:

Algoritma setelah `for`

```java
if (i == j) {
  x[i][j] = 0;
} else {
  x[i][j] = 1;
}
```

```
0 1 1 1
1 0 1 1
1 1 0 1
1 1 1 0
```

Soal 5:

Algoritma setelah `for`

```java
if (i >= j) {
  x[i][j] = i + 1;
} else {
  x[i][j] = 0;
}
```

```
0 1 1 1
1 0 1 1
1 1 0 1
1 1 1 0
```

Soal 6:

Algoritma setelah `for`

```java
if (i == j) {
  x[i][j] = i + 1;
} else {
  x[i][j] = 0;
}
```

```
1 0 0 0
0 2 0 0
0 0 3 0
0 0 0 4
```
