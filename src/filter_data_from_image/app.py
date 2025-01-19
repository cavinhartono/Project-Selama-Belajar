from PIL import Image, ImageDraw
import pytesseract
import re

pytesseract.pytesseract.tesseract_cmd = r'C:\Program Files\Tesseract-OCR\tesseract.exe'
Pattern_Colors = {
    r"TI\|4": "blue",       # |
    r"TI\/4": "blue",       # | Teknik Informatika - Semester 4 doang 
    r"TII4": "blue",        # |
    r"TI\/SI\|4": "green"   # satu kelas sama Sistem Informasi - Semester 4
}
margin = 20

image = Image.open('filter_data_from_image/JADWAL-KULIAH-REGULER-TA.2024-2025-GENAP.png')
data = pytesseract.image_to_data(image, output_type = pytesseract.Output.DICT)
output_image = image.copy()
draw = ImageDraw.Draw(output_image)

for i, text in enumerate(data['text']):
    for pattern, color in Pattern_Colors.items():
        if re.search(pattern, text, re.IGNORECASE):
            x, y, w, h = data['left'][i], data['top'][i], data['width'][i], data['height'][i]

            x0 = x - margin
            y0 = y - margin
            x1 = x + w + margin
            y1 = y + h + margin

            draw.rectangle([x0, y0, x1, y1], outline = color, width = 10)

output_path = "filter_data_from_image/Test_Filtered_Jadwal_Kuliah_TI_dan_TI_SI.png"
output_image.save(output_path)
