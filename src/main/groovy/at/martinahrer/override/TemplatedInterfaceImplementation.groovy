package at.martinahrer.override

class TemplatedInterfaceImplementation implements TemplatedInterface<String>{
    @Override
    String execute(Map argument = [:]) {
        return null
    }
}
