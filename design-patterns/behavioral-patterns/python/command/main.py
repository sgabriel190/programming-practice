"""
    COMMAND PATTERN (Action, Transaction)
    -> Is a behavioral design pattern that turns a request into a stand-alone object that contains all
    information about the request. This transformation lets you parameterize methods with different requests, delay
    or queue a request's execution, and support undoable operations.
    -> Use the Command pattern when you want to parametrize objects with operations.
    -> Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
    -> Use the Command pattern when you want to implement reversible operation.
"""
from Invoker import Invoker
from commands.CommandHistory import CommandHistory
from gui.Editor import Editor

if __name__ == "__main__":
    invoker = Invoker(Editor("abc"), CommandHistory(), "123")
    invoker.copy()
    invoker.paste()
    invoker.undo()
    invoker.cut()
    invoker.paste()
