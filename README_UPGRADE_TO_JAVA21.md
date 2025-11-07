# Upgrade to Java 21 (manual fallback)

This repository's automated Java upgrade tools (Copilot appmod upgrade) are unavailable in the current environment (requires Copilot Pro/Business/Enterprise). This file provides step-by-step manual instructions to upgrade the project runtime to Java 21 and verify the build.

Quick summary
- Install JDK 21 on your machine.
- Set `JAVA_HOME` to the JDK 21 installation and add its `bin` to `PATH`.
- Compile the project with `javac --release 21` (or use Maven/Gradle with `release` set to 21).
- Run and test your applications.

1) Install JDK 21

Download and install a JDK 21 distribution (Adoptium/Eclipse Temurin, Azul Zulu, Oracle JDK) for Windows. Example sources:
- https://adoptium.net
- https://www.azul.com/downloads

2) Verify installation

Open a bash terminal and run:

```bash
java -version
javac -version
```

You should see `java version "21"` and `javac 21` (or similar vendor output). If another Java is shown, set `JAVA_HOME` to the JDK 21 path and update `PATH`.

Setting environment variables (for Git Bash / bash on Windows):

```bash
export JAVA_HOME="/c/Program Files/Java/jdk-21"
export PATH="$JAVA_HOME/bin:$PATH"
```

Adjust the path to your actual JDK installation.

3) Compile the project (no build tool)

This repository contains several small Java programs under `g3_Poliretos` and `PruebaGIT`. To compile all `.java` files in place:

```bash
# move to repo root
cd "C:/Users/jhana/Desktop/2DO SEMESTRE/PROGRAMACION II/Proyectos g3/Proyectos_Programacion_II"

# compile all java files to a 'bin' directory using Java 21 target
mkdir -p bin
javac --release 21 -d bin $(find . -name "*.java")

# Run a main class, example (replace with the class you want):
java -cp bin App
```

Notes:
- On Windows `find` may not be available in all shells; if it isn't, use `javac --release 21 -d bin $(git ls-files '*.java')` or compile per-package with wildcard paths.
- If the code uses features removed or changed in newer Java versions (rare for such simple exercises), fix compile errors as they appear.

4) Convert to a build tool (recommended)

If you plan to maintain this project long-term, add a build tool (Maven or Gradle). Example benefits:
- Specify Java toolchain (enforce JDK 21 for all contributors).
- Easier dependency management and CI.

I can create a sample `pom.xml` (Maven) or `build.gradle` (Gradle) that sets `<release>21</release>` and moves sources into a standard layout; tell me which you prefer and I'll add it.

5) Run tests and static checks

After compilation, run any unit tests or exercise each main class. Fix API changes or deprecations reported by the compiler.

6) Next steps I can help with
- Create a Maven/Gradle build with Java 21 toolchain (I can add files and a sample `pom.xml`).
- Run automated refactoring tools (OpenRewrite) if you can enable Copilot appmod upgrade or share access to a runner.
- Help fix compile errors after switching to Java 21.

If you want, tell me which of the project's classes you want compiled and run (for example `PruebaGIT/src/App.java` or `g3_Poliretos/main.java`) and I can prepare a small wrapper script or a Maven skeleton automatically.
