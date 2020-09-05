"""
    MEMENTO PATTERN (Snapshot)
    -> Is a behavioral design pattern that lets you save and restore the previous state of an object without revealing
    the details of its implementation.
    -> Use the Memento pattern when you want to produce snapshots of the object's state to be able to restore a
    previous state of the object.
    -> Use the pattern when direct access to the object's fields/getters/setters violates its encapsulation.
"""
from Command import Command
from Editor import Editor

if __name__ == "__main__":
    editor = Editor("dummy message", 50, 50)
    command = Command()
    command.makeBackup(editor.createSnapshot())
    print(editor.__dict__)
    editor.setText("abcabcabc")
    print(editor.__dict__)
    command.undo()
    print(editor.__dict__)
