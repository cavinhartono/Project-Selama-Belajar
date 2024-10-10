import tkinter as tk
from tkinter import messagebox
import random

def move_no_button(event):
  mouse_x = event.x_root
  mouse_y = event.y_root

  button_x = no_button.winfo_rootx()
  button_y = no_button.winfo_rooty()

  distace_x = abs(mouse_x - button_x)
  distace_y = abs(mouse_y - button_y)

  if distace_x < 100 and distace_y < 100:
    x = random.randint(0, window.winfo_width() - no_button.winfo_width())
    y = random.randint(0, window.winfo_height() - no_button.winfo_height())
    no_button.place(x=x, y=y)

def disable_window():
  pass

window = tk.Tk()
window.title("Afakh km mw jd pcr aq?")
window.geometry("400x300")

title = window.label("")

window.protocol("WM_DELETE_WINDOW", disable_window)

yes_button = tk.Button(window, text="Mw", font={"Arial", 16}, command=lambda: messagebox.showinfo("I love U"))
yes_button.place(x=150, y=100)

no_button = tk.Button(window, text="G", font={"Arial", 16})
no_button.place(x=200, y=100)
no_button.bind("<Enter>", move_no_button)

window.mainloop()