package GetFinalExam;

class Student {
  String nim, name, studyProgram;
  char grade;
  double attendance, project, quiz, halfTerm, finalTerm;
  double finalResult;
  String information;

  public Student(String nim, String name, double attendance, double project, double quiz, double halfTerm,
      double finalTerm) {
    this.nim = nim;
    this.name = name;
    this.studyProgram = getStudyProgram();
    this.attendance = attendance;
    this.project = project;
    this.quiz = quiz;
    this.halfTerm = halfTerm;
    this.finalTerm = finalTerm;
  }

  public String getStudyProgram() {
    return nim.startsWith("35") ? "Sistem Informasi"
        : nim.startsWith("36") ? "Teknik Informatika"
            : nim.startsWith("37") ? "Akuntansi"
                : nim.startsWith("38") ? "Manajemen"
                    : "Prodi tidak ditemukan.";
  }

  public char getGrade() {
    if (finalResult >= 90) {
      return 'A';
    } else if (finalResult >= 70) {
      return 'B';
    } else if (finalResult >= 65) {
      return 'C';
    } else if (finalResult >= 55) {
      return 'D';
    } else {
      return 'E';
    }
  }

  public String getInformation() {
    switch (grade) {
      case 'A':
        return "Memuaskan";
      case 'B':
        return "Baik";
      case 'C':
        return "Cukup Baik";
      case 'D':
        return "Cukup";
      default:
        return "Tidak Lulus";
    }
  }

  public void getFinalResult() {
    finalResult = (attendance * 0.1) + (((project + quiz) / 2) * 0.2) + (halfTerm * 0.3) + (finalTerm * 0.4);
    grade = getGrade();
    information = getInformation();
  }

  String toInputString() {
    return String.format("| %-6s | %-30s | %-7.0f | %-5.0f | %-4.0f | %-3.0f | %-3.0f |", nim, name, attendance,
        project,
        quiz, halfTerm, finalTerm);
  }

  String toFinalResultString(int no) {
    return String.format("| %-2d | %-30s | %-21s | %-11.2f | %-5s | %-13s |", no, name, studyProgram, finalResult,
        grade, information);
  }

  String toCSVInput() {
    return String.format("%s,%s,%.0f,%.0f,%.0f,%.0f,%.0f", nim, name, attendance, project, quiz, halfTerm, finalTerm);
  }

  String toCSVOfFinalResult() {
    return String.format("%s,%s,%s,%.2f,%s,%s", nim, name, studyProgram, finalResult, grade, information);
  }
}