import random, pyautogui

for i in range(10):
  h = random.randint(0, 1080)
  w = random.randint(0, 1920)
  for j in range(3):
    pyautogui.click(h, w, duration=0.3)
    continue
  pyautogui.hotkey("winleft", 'm')
