# Bazel Implementation Sample

A simple implementation of Bazel as a build and test automation tool for a monorepo project. This project contains 2 java packages managed by Maven and a python number guess game managed by gazelle.

## How to run locally
1. You can update the python manifest using gazelle: `bazel run gazelle_python_manifest.update`
2. Build python related files using gazelle: `bazel run gazelle`
3. Build all targets: `bazel build //...`
3. You can build and run the python game with `bazel run //src/app:numberGuesser`
4. You can build and run the analyze code with `bazel run //src/app:analyze`
5. You can build and run the java projects:
    1. `bazel run //src/main/java/com/example1:random_text_generator`
    2. `bazel run //src/main/java/com/example2:hello_world`
5. You can execute the python unit test using: `bazel test //tests/py_app:number_guesser_test`