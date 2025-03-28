import pyautogui as pg 
import numpy as np
import time

grid = [
    [5, 0, 0,   6, 0, 0,   0, 0, 0],
    [8, 0, 0,   0, 0, 0,   0, 9, 0],
    [0, 3, 0,   0, 5, 2,   0, 0, 4],

    [0, 0, 0,   7, 0, 0,   0, 0, 1],
    [3, 0, 0,   0, 6, 1,   8, 0, 0],
    [0, 6, 0,   4, 0, 0,   0, 0, 0],
    
    [0, 5, 0,   0, 1, 3,   0, 0, 2],
    [0, 0, 0,   0, 0, 7,   0, 0, 0],
    [0, 0, 2,   0, 0, 0,   4, 0, 0]
] 

#  while True:
#     row = list(input('Row: '))
#     ints = []

#     for n in row:
#         ints.append(int(n))
#     grid.append(ints)

#     if len(grid) == 9:
#         break
#     print('Row ' + str(len(grid)) + ' Complete')

time.sleep(1)

def possible(x, y, n):
    for i in range(0, 9):
        if grid[i][x] == n and i != y: # Checks for number (n) in X columns
            return False

    for i in range(0, 9):
        if grid[y][i] == n and i != x: # Checks for number (n) in X columns
            return False

    x0 = (x // 3) * 3
    y0 = (y // 3) * 3
    for X in range(x0, x0 + 3):
        for Y in range(y0, y0 + 3):  # Checks for numbers in box(no matter the position, it finds the corner)
            if grid[Y][X] == n:
                return False    
    return True

def Print(matrix):
    final = []
    str_fin = []
    for i in range(9):
        final.append(matrix[i])

    for lists in final:
        for num in lists:
            str_fin.append(str(num))

    counter = []

    for num in str_fin:
        pg.press(num)
        pg.hotkey('right')
        counter.append(num)
        if len(counter)%9 == 0:
            pg.hotkey('down')
            pg.hotkey('left')
            pg.hotkey('left')
            pg.hotkey('left')
            pg.hotkey('left')
            pg.hotkey('left')
            pg.hotkey('left')
            pg.hotkey('left')
            pg.hotkey('left')


def solve():
    global grid
    for y in range(9):
        for x in range(9):
            if grid[y][x] == 0:
                for n in range(1, 10):
                    if possible(x, y, n):
                        grid[y][x] = n
                        solve()
                        grid[y][x] = 0
                return
    Print(grid)
    input("More?")

solve()