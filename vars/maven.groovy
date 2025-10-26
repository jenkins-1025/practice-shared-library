def call(String command) {
    sh("./mvnw ${command}")
}

def list(List commands) {
    for (command in commands) {
        sh("./mvnw ${command}")
    }
}