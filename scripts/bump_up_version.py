file_path = "buildSrc/src/main/kotlin/Versions.kt"

with open(file_path, 'r') as f:
    text = f.readlines()
    versions = [int(text[i].split("=")[1].strip()) for i in range(3)]

with open(file_path, "w") as f:
    f.write(
        "\n".join(
            [
                "const val MAJOR_VERSION = %d",
                "const val MINOR_VERSION = %d",
                "const val PATCH_VERSION = 0"
            ]
        ) %(versions[0], versions[1] + 1)
    )
