file_path = "buildSrc/src/main/kotlin/Versions.kt"

with open(file_path, 'r') as f:
    text = f.readlines()
    versions = [int(text[i].split("=")[1].strip()) for i in range(3)]
    print("%d.%d.%d" % tuple(versions))
