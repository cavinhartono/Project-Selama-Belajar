import cv2
import numpy as np
import requests

# Membaca citra berwarna
resp = requests.get("https://images.unsplash.com/photo-1737304697097-62a820f71964?q=80&w=1469&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", stream=True).raw
image = np.asarray(bytearray(resp.read()), dtype=np.uint8)
image = cv2.imdecode(image, cv2.IMREAD_COLOR)

if image is None:
    print("Error: Tidak dapat membaca file gambar.")
else:
    image = cv2.resize(image, (200, 200))
    
    red = image.copy()
    green = image.copy()
    blue = image.copy()

    # Proses perubahan warna
    red[:, :, 2] = np.clip(red[:, :, 2] + 50, 0, 255) # merah
    green[:, :, 1] = np.clip(green[:, :, 1] + 50, 0, 255) # hijau
    blue[:, :, 0] = np.clip(blue[:, :, 0] + 50, 0, 255) # biru
    
    # Gabungkan gambar dari `asli`, `merah`, `hijau`, dan `biru`
    Photos = np.hstack((image, red, green, blue))
    
    # Menampilkan citra hasil perubahan
    cv2.imshow('Gambar dari asli, merah, hijau, dan biru', Photos)
    cv2.waitKey(0)
    cv2.destroyAllWindows()