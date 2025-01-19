import shutil

def monitor_disk_usage(path="/"):
  total, used, free = shutil.disk_usage(path)
  print(f"Disk Usage Information for '{path}':")
  print(f"Total Space: {total / (1024 ** 3):.2f} GB")
  print(f"Used Space: {used / (1024 ** 3):.2f} GB")
  print(f"Available Space: {free / (1024 ** 3):.2f} GB")

monitor_disk_usage()