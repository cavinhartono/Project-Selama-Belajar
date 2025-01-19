import tkinter as tk
import random

def generate_question():
    global num1, num2, answer
    num1 = random.randint(1, 10)
    num2 = random.randint(1, 10)
    answer = num1 + num2
    question_label.config(text=f"Apa hasil dari {num1} + {num2}?")

def check_answer():
    try:
        user_answer = int(entry.get())
        if user_answer == answer:
            result_label.config(text="Benar!", fg="green")
        else:
            result_label.config(text="Coba lagi...", fg="red")
    except ValueError:
        result_label.config(text="Masukkan angka valid!", fg="red")

def reset_game():
    entry.delete(0, tk.END)
    result_label.config(text="")
    generate_question()

# Main window
window = tk.Tk()
window.title("Hitung Cepat")

num1, num2, answer = 0, 0, 0

question_label = tk.Label(window, text="", font=("Arial", 16))
question_label.pack()

entry = tk.Entry(window, font=("Arial", 16))
entry.pack()

check_button = tk.Button(window, text="Cek Jawaban", command=check_answer)
check_button.pack()

result_label = tk.Label(window, text="", font=("Arial", 14))
result_label.pack()

reset_button = tk.Button(window, text="Soal Baru", command=reset_game)
reset_button.pack()

generate_question()

window.mainloop()
