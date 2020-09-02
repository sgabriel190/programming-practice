from commands.CommandHistory import CommandHistory
from commands.CopyCommand import CopyCommand
from commands.CutCommand import CutCommand
from commands.PasteCommand import PasteCommand
from commands.UndoCommand import UndoCommand
from gui.Editor import Editor


class Invoker:
    clipboard: str = None
    activeEditor: Editor = None
    history: CommandHistory = None

    def __init__(self, editor, cmdHistory, clipboard):
        self.history = cmdHistory
        self.clipboard = clipboard
        self.activeEditor = editor

    def copy(self):
        cmd = CopyCommand(self, self.activeEditor)
        if cmd.execute():
            self.history.push(cmd)

    def undo(self):
        cmd = UndoCommand(self, self.activeEditor)
        if cmd.execute():
            self.history.push(cmd)

    def paste(self):
        cmd = PasteCommand(self, self.activeEditor)
        if cmd.execute():
            self.history.push(cmd)

    def cut(self):
        cmd = CutCommand(self, self.activeEditor)
        if cmd.execute():
            self.history.push(cmd)
