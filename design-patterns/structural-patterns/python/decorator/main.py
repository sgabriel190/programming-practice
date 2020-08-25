"""
    DECORATOR PATTERN (WRAPPER)
    ->Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without
    breaking the code that uses these objects.
    ->Use the pattern when it's awkward or not possible to extend an object's behavior using inheritance.

"""
from CompressionDecorator import CompressionDecorator
from EncryptionDecorator import EncryptionDecorator
from FileDataSource import FileDataSource

if __name__ == "__main__":
    message = "Hello! This is an implementation of Decorator pattern!"
    source = FileDataSource("data.txt")
    source.writeData(message)
    print(source.readData())

    source = CompressionDecorator(source)
    source.writeData(message)
    print(source.readData())

    source = EncryptionDecorator(source)
    source.writeData(message)
    print(source.readData())
