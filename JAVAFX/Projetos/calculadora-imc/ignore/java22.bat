@echo off

"C:\Java\openjdk-22+36_windows-x64_bin\jdk-22\bin\javac.exe" --module-path "C:\Java\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib" --add-modules javafx.controls,javafx.graphics ProjetoCalculadoraIMCAtualizado.java

if errorlevel 1 (
    pause
    exit
)

"C:\Java\openjdk-22+36_windows-x64_bin\jdk-22\bin\java.exe" --module-path "C:\Java\openjfx-22.0.1_windows-x64_bin-sdk\javafx-sdk-22.0.1\lib" --add-modules javafx.controls,javafx.graphics ProjetoCalculadoraIMCAtualizado

pause