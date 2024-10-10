import tkinter as tk
from tkinter import messagebox
import pyautogui, pygame, threading, random

def minimize():
  for i in range(5):
    root = tk.Tk()
    root.withdraw()
    h = random.randint(0, 1080)
    w = random.randint(0, 1920)
    for j in range(5):
      pyautogui.hotkey("winleft", "m")
      pyautogui.click(h, w, duration=0.3)
      pyautogui.hotkey("winleft", "2")

def music():
  pygame.mixer.init()
  pygame.mixer.music.load("src/Annoying_Popup/musik.mp3")
  pygame.mixer.music.play(-1)

def main():
  music_thread = threading.Thread(target=music)
  music_thread.daemon = True
  music_thread.start()
  messagebox.showwarning("Selamat Anda kena prank", "MAMPOS")
  minimize()

if __name__ == "__main__":
  main()