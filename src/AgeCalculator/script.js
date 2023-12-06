const getMonth = (month, n = null) => {
  const months = {
    januari: 31,
    februari: 28,
    maret: 31,
    april: 30,
    mei: 31,
    juni: 30,
    juli: 31,
    agustus: 31,
    september: 30,
    oktober: 31,
    november: 30,
    desember: 31,
  };

  return month in months ? months[month - n] : "Nama bulan tidak ditemukan!";
};

function findAge(
  currentDate,
  currentMonthName,
  currentYear,
  birthDate,
  birthMonthName,
  birthYear
) {
  let birthMonth = getMonth(birthMonthName),
    currentMonth = getMonth(currentMonthName);

  if (birthDate > currentDate) {
    currentDate += getMonth(birthMonthName, 1);
    currentMonth -= 1;
  }

  if (birthMonth > currentMonth) {
    currentYear -= 1;
    currentMonth += 12;
  }

  let resulted_date = currentDate - birthDate;
  let resulted_month = currentMonth - birthMonth;
  let resulted_year = currentYear - birthYear;

  console.log(
    `${resulted_year} tahun ${resulted_month} bulan ${resulted_date} hari.`
  );
}

findAge(5, "desember", 2023, 25, "mei", 2004);
