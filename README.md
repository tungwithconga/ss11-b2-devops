# SS11 - Bài 1: GitHub Actions CI cho Spring Boot Gradle

## Mục tiêu
Tự động chạy JUnit Test mỗi khi push lên nhánh `main` bằng GitHub Actions, Java 17 (Temurin), Gradle Wrapper.

## Công nghệ
- Java 17
- Spring Boot 3.5.6
- Gradle 8.14.3
- JUnit 5
- GitHub Actions

## Cấu trúc chính
- `.github/workflows/ci.yml`: Workflow CI
- `src/main/java/com/example/ss11b1/`: ứng dụng và API `/hello`
- `src/test/java/com/example/ss11b1/HelloControllerTest.java`: Unit Test
- `gradlew`, `gradlew.bat`, `gradle/wrapper/`: Gradle Wrapper

## Chạy Unit Test
Windows PowerShell:
```powershell
.\gradlew.bat test
```
Linux/macOS:
```bash
chmod +x gradlew
./gradlew test
```
Kết quả mong đợi: `BUILD SUCCESSFUL`.

## Chạy ứng dụng
```powershell
.\gradlew.bat bootRun
```
Mở http://localhost:8080/hello

## Push lên GitHub
```bash
git init
git branch -M main
git add .
git commit -m "ci: add Spring Boot Gradle unit test workflow"
git remote add origin https://github.com/USERNAME/ss11-b1.git
git push -u origin main
```
Thay `USERNAME` bằng tài khoản GitHub của bạn; tạo repo trống trước khi push.

## Minh chứng nộp bài
1. `.github/workflows/ci.yml`
2. Ảnh chụp tab **Actions** → **Java Spring Boot CI (Gradle)** → job **Run Unit Tests** tích xanh.

> Lưu ý: Dự án có một Gradle Wrapper bootstrap tương thích do môi trường tạo file không tải được wrapper chính thức. Khi có Gradle được cài trên máy, nên chạy `gradle wrapper --gradle-version 8.14.3` để thay bằng Gradle Wrapper chính thức trước khi nộp. Cần Internet trong lần chạy đầu để tải Gradle và dependencies.

## Session 11 - Exercise 2

Workflow builds a bootable JAR with `./gradlew bootJar` and uploads `build/libs/*.jar` as the `app-jar` artifact after tests pass.
